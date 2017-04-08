/* FileName:       XmlImportExport.java
* Purpose:         This Class is used to XML Management operations (Import and Export XML)
* Features covered : SQLXML
* Author:           Vincent
* Created Date:    20-Nov-2013
* Version:         1.1 (Initial Version)
* Last Modified:   05-Dec-2013*/
package com.sample.sqlxml;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.sax.SAXResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ContentHandler;
import com.sample.xml.data.EmployeeRecords;
public class XmlImportExport {
    private Connection con = null;
   
    private ArrayList<EmployeeRecords> employeeRecordsList = new ArrayList<EmployeeRecords>();
    
    private ContentHandler myHandler;
    
    // Parse xml and Set the values in the bean class. Insert the xml data into table.
    public int importXML(String filepath)throws Exception
    {
        javax.xml.parsers.DocumentBuilderFactory factory =
        javax.xml.parsers.DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(filepath);
        NodeList nl = doc.getElementsByTagName("employee");
        for(int i=0;i<nl.getLength();i++)
        {
            Node node = nl.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element childElement = (Element) node;    
                EmployeeRecords employeeRecords = new EmployeeRecords();
                employeeRecords.setName(childElement.getElementsByTagName("name").item(0).getTextContent());
                           employeeRecords.setEmail( childElement.getElementsByTagName("email").item(0).getTextContent());
                employeeRecords.setDepartment( childElement.getElementsByTagName("department")
                .item(0).getTextContent());
                employeeRecords.setDegree( childElement.getElementsByTagName("degree").item(0).getTextContent());
                employeeRecords.setCollege( childElement.getElementsByTagName("college").item(0).getTextContent());
                employeeRecords.setAggregate( Float.parseFloat(childElement.getElementsByTagName("aggregate")
                .item(0).getTextContent()));
                employeeRecordsList.add(employeeRecords);                
            }
        }    
        //Use the values fetched from XML and generate XML and add to TABLE
        String SQL = "SELECT * FROM tbl_emp_xml;";
        //get MYSQL Connection
        con = getSQLServerConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(SQL);  
        SQLXML sqlxml = con.createSQLXML();
        SAXResult sxResult = sqlxml.setResult(SAXResult.class);
        myHandler = sxResult.getHandler();
        myHandler.startDocument();
        myHandler.startElement(null,"root","root",null);
        for(int i=0;i<employeeRecordsList.size();i++)
        {
            myHandler.startElement(null, "employee", "employee", null);
            myHandler.startElement(null, "personal", "personal", null);
            myHandler.startElement(null, "name", "name",null);
            myHandler.characters(employeeRecordsList.get(i).getName().toCharArray(),0,
                     employeeRecordsList.get(i).getName().length());
                    myHandler.endElement(null, "name", "name");
            myHandler.startElement(null, "email", "email",null);
            myHandler.characters(employeeRecordsList.get(i).getEmail().toCharArray(), 0,
                    employeeRecordsList.get(i).getEmail().length());
            myHandler.endElement(null, "email", "email");
            myHandler.startElement(null, "department", "department",null);
            myHandler.characters(employeeRecordsList.get(i).getDepartment().toCharArray(), 0,
                    employeeRecordsList.get(i).getDepartment().length());
            myHandler.endElement(null, "department", "department");
            myHandler.endElement(null, "personal", "personal");
            myHandler.startElement(null, "education", "education", null);
            myHandler.startElement(null, "degree", "degree",null);
            myHandler.characters(employeeRecordsList.get(i).getDegree().toCharArray(), 0,
                    employeeRecordsList.get(i).getDegree().length());
            myHandler.endElement(null, "degree", "degree");
            myHandler.startElement(null, "college", "college",null);
            myHandler.characters(employeeRecordsList.get(i).getCollege().toCharArray(), 0,
                    employeeRecordsList.get(i).getCollege().length());
            myHandler.endElement(null, "college", "college");
            myHandler.startElement(null, "aggregate", "aggregate",null);
            String aggregate = employeeRecordsList.get(i).getAggregate()+"";
            myHandler.characters(aggregate.toCharArray(), 0,aggregate.length());
            myHandler.endElement(null, "aggregate", "aggregate");
            myHandler.endElement(null, "education", "education");
            myHandler.endElement(null, "employee", "employee");
        }
        myHandler.endElement(null, "root", "root");
        myHandler.endDocument();
        // Update the data in the result set.
        rs.moveToInsertRow();
        rs.updateString("filename","Import.xml");
        rs.updateSQLXML("xml",sqlxml);
        java.util.Date dt = new java.util.Date();
        rs.updateDate("datecreated",new java.sql.Date(dt.getTime()));
        rs.insertRow();
        return 1;
    } 
    //SQLSERVER CONNECTION
    private Connection getSQLServerConnection() throws Exception
    {
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                + "databaseName=employee;","sa","exemplarr@123$");
        return con;
    }
    //Retrieve xml as a document from table
    public Document retrieveXML() throws Exception
    {
        Document retrivedoc = null;
        Statement stmt  = con.createStatement();
        String query = "select xml from tbl_emp_xml";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next())
        {
            SQLXML xml = rs.getSQLXML(1);
            javax.xml.parsers.DocumentBuilderFactory retrivefactory 
                   = javax.xml.parsers.DocumentBuilderFactory.newInstance();
            retrivefactory.setNamespaceAware(true);
            DocumentBuilder retrivebuilder = retrivefactory.newDocumentBuilder();
            retrivedoc = retrivebuilder.parse(xml.getBinaryStream());
        }
       return retrivedoc;
    }	
}

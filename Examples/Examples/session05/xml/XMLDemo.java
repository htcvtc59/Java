/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.xml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author ChuTuanLuyen
 */
public class XMLDemo {
    /*
    CREATE TABLE [dbo].[Invoices](
    [ID] [nchar](10) NOT NULL,
    [Invoices] [xml] NULL,
    CONSTRAINT [PK_Invoices] PRIMARY KEY CLUSTERED
    (
    [ID] ASC
    )WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
    ) ON [PRIMARY]

     */

    public Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        return DriverManager.getConnection(url, "sa", "12345678");
    }

    public void insertData(String id, String xml) {
        Connection conn = null;
        PreparedStatement prst = null;
        try {
            conn = getConnection();
            prst = conn.prepareStatement("insert into invoices values(?,?)");
            prst.setString(1, id);
            SQLXML sqlXML = conn.createSQLXML();
            sqlXML.setString(xml);
            prst.setSQLXML(2, sqlXML);
            prst.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(XMLDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException ex) {
                }
            }
            if (prst != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }

    public List<String> getInvoice() {
        List<String> retValue = new ArrayList<String>();
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            prst = conn.prepareStatement("select * from invoices");
            rs = prst.executeQuery();

            //Using DOM
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            while (rs.next()) {
                SQLXML sqlXML = rs.getSQLXML(2);
//                String string = sqlXML.getString();
//                retValue.add(string);
                //Using DOM for traverse XML document
                Document doc = db.parse(sqlXML.getBinaryStream());
                NodeList nodeList = doc.getElementsByTagName("customer");
                if (nodeList.getLength() > 0) {
                    Node item = nodeList.item(0);
                    String customer = item.getTextContent();
                    System.out.println("CUtomer: " + customer);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(XMLDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException ex) {
                }
            }
            if (prst != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }

        return retValue;
    }

    public static void main(String[] args) {
        String xml = "<invoice>	<customer>Thanh</customer>	<cost>30</cost></invoice>";
        XMLDemo demo = new XMLDemo();
        //demo.insertData("B003", xml);
        List<String> invoice = demo.getInvoice();
        System.out.println(invoice);
    }
}

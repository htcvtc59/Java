/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintOrderBook;


import Model.DataHelper;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.export.PdfGlyphRenderer;

public class PrintOrder {

    Connection conn = null;
    JasperReport report;

    public void printOrder(String readerid, String datenow) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\PrintOrderBook\\Jasper\\OrderBook.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("id", readerid);
            hashMap.put("dater", datenow);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1200, 900);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();
        } catch (Exception e) {
        }
    }

}

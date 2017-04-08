/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Controller.DateToDTime;
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

public class PrintReport {

    Connection conn = null;
    JasperReport report;

    public void Report1(String datestart, String datefinish, String idbook, String idreader) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report1.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("start", DateToDTime.SDateDateTime(datestart));
            hashMap.put("finish", DateToDTime.SDateDateTime(datefinish));
            hashMap.put("idbook", idbook);
            hashMap.put("idreader", idreader);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }
    }

    public void Report2(String masach) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report2.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("masach", masach);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }

    }

    public void Report3(String masach, String madg) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report3.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("masach", masach);
            hashMap.put("madg", madg);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }
    }

    public void Report4(String masach, String madg) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report4.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("masach", masach);
            hashMap.put("madg", madg);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }

    }

    public void Report5(String masach, String madg) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report5.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("masach", masach);
            hashMap.put("madg", madg);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }
    }

    public void Report6(String ngaybd, String ngaykt, String masach) {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report6.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();
            hashMap.put("ngaybd", DateToDTime.SDateDateTime(ngaybd)); //DateToDTime.SDateDateTime(ngaybd)
            hashMap.put("ngaykt", DateToDTime.SDateDateTime(ngaykt)); //DateToDTime.SDateDateTime(ngaykt)
            hashMap.put("masach", masach);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }

    }

    public void Report7() {
        try {
            conn = DataHelper.getConnection();
            String reportPath = "C:\\Users\\MacOS\\Documents\\NetBeansProjects\\LibraryAppJava\\src\\Report\\Report7.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            HashMap hashMap = new HashMap();

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, conn);
            // JasperViewer.viewReport(jasperPrint);
            JFrame frame = new JFrame();
            frame.setSize(1400, 800);
            frame.setLocationRelativeTo(null);
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
            conn.close();

        } catch (Exception e) {
        }
    }

}

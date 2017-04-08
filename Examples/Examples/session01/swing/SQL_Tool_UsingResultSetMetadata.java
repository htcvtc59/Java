/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SQL_Tool_UsingResultSetMetadata.java
 *
 * Created on Jul 18, 2012, 9:12:57 AM
 */
package session01.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ChuTuanLuyen
 */
public class SQL_Tool_UsingResultSetMetadata extends javax.swing.JFrame {

    /** Creates new form SQL_Tool_UsingResultSetMetadata */
    public SQL_Tool_UsingResultSetMetadata() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSQL = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblResult);

        txtSQL.setColumns(20);
        txtSQL.setRows(5);
        jScrollPane2.setViewportView(txtSQL);

        jButton1.setText("Execute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, 0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        this.tblResult.setModel(model);
        try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
            Connection conn = DriverManager.getConnection(url, "sa", "12345678");

            String sql = txtSQL.getText();
            PreparedStatement prst = conn.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            ResultSetMetaData rsMeta = rs.getMetaData();
            for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                String columnName = rsMeta.getColumnName(i);
                model.addColumn(columnName);
            }
            while (rs.next()) {
                Vector rowData = new Vector();//Mot dong
                for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                    String columnName = rsMeta.getColumnName(i);
                    Object obj = rs.getObject(columnName);
                    rowData.addElement(obj);
                }
                model.addRow(rowData);
            }

            rs.close();
            prst.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL_Tool_UsingResultSetMetadata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SQL_Tool_UsingResultSetMetadata().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextArea txtSQL;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BackgroundColor.SetBackgroundbtn;
import Controller.Valid;
import Model.MyDAO;
import Model.tblPublisher;
import Model.tblPublisherDAO;
import Model.tblPublisherModel;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author MacOS
 */
public class DPulisher extends javax.swing.JDialog {

    MyDAO pubDAO = new tblPublisherDAO();
    public int number;
    static Point comPoint = null;
    private JTable TablePulisher;

    public DPulisher(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public DPulisher(String id, String name, String address, String phone, String email, int number, JTable tablepulisher, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdPulisher.setText(id);
        txtNamePulisher.setText(name);
        txtAddressPulisher.setText(address);
        txtPhonePulisher.setText(phone);
        txtEmailPulisher.setText(email);
        this.number = number;
        this.TablePulisher = tablepulisher;
        if (number == 1) {
            txtIdPulisher.setEditable(false);
            txtNamePulisher.requestFocus();
        }

    }

    public void showTablePub(JTable tablepulisher) {
        tblPublisherModel publisherModel = new tblPublisherModel();
        publisherModel.setData(new tblPublisherDAO().GetAll());
        tablepulisher.setModel(publisherModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palD = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        txtIdPulisher = new javax.swing.JTextField();
        Sepa1 = new javax.swing.JSeparator();
        txtNamePulisher = new javax.swing.JTextField();
        Sepa2 = new javax.swing.JSeparator();
        lb2 = new javax.swing.JLabel();
        btnX = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        Sepa3 = new javax.swing.JSeparator();
        txtAddressPulisher = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        txtPhonePulisher = new javax.swing.JTextField();
        Sepa4 = new javax.swing.JSeparator();
        lb6 = new javax.swing.JLabel();
        Sepa5 = new javax.swing.JSeparator();
        txtEmailPulisher = new javax.swing.JTextField();
        btnSave = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        palD.setBackground(new java.awt.Color(98, 98, 110));
        palD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palDMouseDragged(evt);
            }
        });
        palD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                palDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palDMouseReleased(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Mã NXB");

        txtIdPulisher.setBackground(new java.awt.Color(98, 98, 110));
        txtIdPulisher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIdPulisher.setForeground(new java.awt.Color(255, 255, 255));
        txtIdPulisher.setBorder(null);
        txtIdPulisher.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdPulisher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdPulisherFocusLost(evt);
            }
        });

        txtNamePulisher.setBackground(new java.awt.Color(98, 98, 110));
        txtNamePulisher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNamePulisher.setForeground(new java.awt.Color(255, 255, 255));
        txtNamePulisher.setBorder(null);
        txtNamePulisher.setCaretColor(new java.awt.Color(255, 255, 255));

        lb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Tên NXB");

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
        });

        lb4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Địa Chỉ NXB");

        txtAddressPulisher.setBackground(new java.awt.Color(98, 98, 110));
        txtAddressPulisher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddressPulisher.setForeground(new java.awt.Color(255, 255, 255));
        txtAddressPulisher.setBorder(null);
        txtAddressPulisher.setCaretColor(new java.awt.Color(255, 255, 255));

        lb5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Số Điện Thoại");

        txtPhonePulisher.setBackground(new java.awt.Color(98, 98, 110));
        txtPhonePulisher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhonePulisher.setForeground(new java.awt.Color(255, 255, 255));
        txtPhonePulisher.setBorder(null);
        txtPhonePulisher.setCaretColor(new java.awt.Color(255, 255, 255));

        lb6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("Email");

        txtEmailPulisher.setBackground(new java.awt.Color(98, 98, 110));
        txtEmailPulisher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmailPulisher.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailPulisher.setBorder(null);
        txtEmailPulisher.setCaretColor(new java.awt.Color(255, 255, 255));

        btnSave.setBackground(new java.awt.Color(126, 130, 139));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Lưu");

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout palDLayout = new javax.swing.GroupLayout(palD);
        palD.setLayout(palDLayout);
        palDLayout.setHorizontalGroup(
            palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palDLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnX))
            .addGroup(palDLayout.createSequentialGroup()
                .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(palDLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa1)
                                    .addComponent(lb1)
                                    .addComponent(txtIdPulisher, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa2)
                                    .addComponent(lb2)
                                    .addComponent(txtNamePulisher, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addComponent(Sepa4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lb5)
                            .addComponent(Sepa5)
                            .addComponent(lb6)
                            .addComponent(txtEmailPulisher, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Sepa3)
                            .addComponent(lb4)
                            .addComponent(txtAddressPulisher, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtPhonePulisher)))
                    .addGroup(palDLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        palDLayout.setVerticalGroup(
            palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palDLayout.createSequentialGroup()
                .addComponent(btnX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdPulisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamePulisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressPulisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhonePulisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailPulisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(palD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(palD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (number == 1) {
            if (txtIdPulisher.getText().length() != 0
                    && txtNamePulisher.getText().length() != 0
                    && txtAddressPulisher.getText().length() != 0
                    && txtPhonePulisher.getText().length() != 0
                    && txtEmailPulisher.getText().length() != 0) {
                if (Valid.ValidPhone(txtPhonePulisher.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    txtPhonePulisher.requestFocus();
                } else if (Valid.ValidEmail(txtEmailPulisher.getText())) {

                    if (pubDAO.Update(new tblPublisher(txtIdPulisher.getText(), txtNamePulisher.getText(), txtAddressPulisher.getText(),
                            txtPhonePulisher.getText(), txtEmailPulisher.getText())) != null) {
                        JOptionPane.showMessageDialog(null, "Sửa NXB thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        showTablePub(TablePulisher);
                        this.dispose();

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Sửa NXB thất bại bạn không được để trống", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            if (txtIdPulisher.getText().length() != 0
                    && txtNamePulisher.getText().length() != 0
                    && txtAddressPulisher.getText().length() != 0
                    && txtPhonePulisher.getText().length() != 0
                    && txtEmailPulisher.getText().length() != 0) {
                if (Valid.ValidPhone(txtPhonePulisher.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    txtPhonePulisher.requestFocus();
                } else if (Valid.ValidEmail(txtEmailPulisher.getText())) {
                    if (pubDAO.Insert(new tblPublisher(txtIdPulisher.getText(), txtNamePulisher.getText(), txtAddressPulisher.getText(), txtPhonePulisher.getText(), txtEmailPulisher.getText())) != null) {
                        JOptionPane.showMessageDialog(null, "Thêm NXB thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        txtIdPulisher.setText("");
                        txtNamePulisher.setText("");
                        txtAddressPulisher.setText("");
                        txtPhonePulisher.setText("");
                        txtEmailPulisher.setText("");

                        txtIdPulisher.requestFocus();

                        showTablePub(TablePulisher);

                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm NXB thất bại trùng mã NXB", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Bạn không được để trống", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        this.dispose();
        showTablePub(TablePulisher);
    }//GEN-LAST:event_btnXMouseClicked

    private void palDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palDMousePressed
        comPoint = evt.getPoint();
    }//GEN-LAST:event_palDMousePressed

    private void palDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palDMouseReleased
        comPoint = null;
    }//GEN-LAST:event_palDMouseReleased

    private void palDMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palDMouseDragged
        Point cPoint = evt.getLocationOnScreen();
        this.setLocation(cPoint.x - comPoint.x, cPoint.y - comPoint.y);
    }//GEN-LAST:event_palDMouseDragged

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        new SetBackgroundbtn(btnSave).mousePressed(evt);
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        new SetBackgroundbtn(btnSave).mouseReleased(evt);
    }//GEN-LAST:event_btnSaveMouseReleased

    private void txtIdPulisherFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPulisherFocusLost
        txtIdPulisher.setText(Valid.VToUpper(txtIdPulisher.getText()));
    }//GEN-LAST:event_txtIdPulisherFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DPulisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DPulisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DPulisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DPulisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DPulisher dialog = new DPulisher(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Sepa1;
    private javax.swing.JSeparator Sepa2;
    private javax.swing.JSeparator Sepa3;
    private javax.swing.JSeparator Sepa4;
    private javax.swing.JSeparator Sepa5;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel btnX;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JPanel palD;
    private javax.swing.JTextField txtAddressPulisher;
    private javax.swing.JTextField txtEmailPulisher;
    private javax.swing.JTextField txtIdPulisher;
    private javax.swing.JTextField txtNamePulisher;
    private javax.swing.JTextField txtPhonePulisher;
    // End of variables declaration//GEN-END:variables
}

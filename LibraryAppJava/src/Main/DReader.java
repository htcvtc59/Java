/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BackgroundColor.SetBackgroundbtn;
import Controller.DateInFormat;
import Controller.DateToDTime;
import Controller.Valid;
import Model.MyDAO;
import Model.tblReader;
import Model.tblReaderDAO;
import Model.tblReaderModel;
import java.awt.Point;
import java.awt.TextField;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author MacOS
 */
public class DReader extends javax.swing.JDialog {

    MyDAO readerDAO = new tblReaderDAO();
    public int number;
    static Point comPoint = null;
    private JTable TableReader;

    public DReader(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public DReader(String id, String name, String birthday, String phone, String address, String email, int number, JTable tablereader, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdReader.setText(id);
        txtNameReader.setText(name);
        if (birthday.length() != 0) {
            txtBirthDayReader.setDate(DateToDTime.SToDate(birthday));
        } else {
            txtBirthDayReader.setDate(null);
        }
        txtPhoneReader.setText(phone);
        txtAddressReader.setText(address);
        txtEmailReader.setText(email);
        this.number = number;
        this.TableReader = tablereader;
        if (number == 1) {
            txtIdReader.setEditable(false);
            txtNameReader.requestFocus();
        }

    }

    public void showTableRead(JTable tablereader) {
        tblReaderModel readerModel = new tblReaderModel();
        readerModel.setData(new tblReaderDAO().GetAll());
        tablereader.setModel(readerModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paD = new javax.swing.JPanel();
        btnSave = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        txtIdReader = new javax.swing.JTextField();
        Sepa1 = new javax.swing.JSeparator();
        lb2 = new javax.swing.JLabel();
        txtNameReader = new javax.swing.JTextField();
        Sepa2 = new javax.swing.JSeparator();
        lb4 = new javax.swing.JLabel();
        txtBirthDayReader = new com.toedter.calendar.JDateChooser();
        lb5 = new javax.swing.JLabel();
        txtPhoneReader = new javax.swing.JTextField();
        Sepa4 = new javax.swing.JSeparator();
        lb6 = new javax.swing.JLabel();
        txtAddressReader = new javax.swing.JTextField();
        Sepa5 = new javax.swing.JSeparator();
        lb7 = new javax.swing.JLabel();
        txtEmailReader = new javax.swing.JTextField();
        Sepa6 = new javax.swing.JSeparator();
        btnX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        paD.setBackground(new java.awt.Color(98, 98, 110));
        paD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paDMouseDragged(evt);
            }
        });
        paD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                paDMouseReleased(evt);
            }
        });

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

        lb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Mã Độc Giả");

        txtIdReader.setBackground(new java.awt.Color(98, 98, 110));
        txtIdReader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIdReader.setForeground(new java.awt.Color(255, 255, 255));
        txtIdReader.setBorder(null);
        txtIdReader.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdReader.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdReaderFocusLost(evt);
            }
        });

        lb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Tên Độc Giả");

        txtNameReader.setBackground(new java.awt.Color(98, 98, 110));
        txtNameReader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNameReader.setForeground(new java.awt.Color(255, 255, 255));
        txtNameReader.setBorder(null);
        txtNameReader.setCaretColor(new java.awt.Color(255, 255, 255));

        lb4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Ngày Sinh");

        txtBirthDayReader.setDateFormatString("dd/MM/yyyy");
        txtBirthDayReader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lb5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Số Điện Thoại");

        txtPhoneReader.setBackground(new java.awt.Color(98, 98, 110));
        txtPhoneReader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhoneReader.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneReader.setBorder(null);
        txtPhoneReader.setCaretColor(new java.awt.Color(255, 255, 255));

        lb6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("Địa Chỉ");

        txtAddressReader.setBackground(new java.awt.Color(98, 98, 110));
        txtAddressReader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAddressReader.setForeground(new java.awt.Color(255, 255, 255));
        txtAddressReader.setBorder(null);
        txtAddressReader.setCaretColor(new java.awt.Color(255, 255, 255));

        lb7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setText("Email");

        txtEmailReader.setBackground(new java.awt.Color(98, 98, 110));
        txtEmailReader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmailReader.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailReader.setBorder(null);
        txtEmailReader.setCaretColor(new java.awt.Color(255, 255, 255));

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paDLayout = new javax.swing.GroupLayout(paD);
        paD.setLayout(paDLayout);
        paDLayout.setHorizontalGroup(
            paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paDLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(paDLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paDLayout.createSequentialGroup()
                        .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa2)
                                    .addComponent(lb2)
                                    .addComponent(txtNameReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lb4))
                            .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sepa1)
                                .addComponent(lb1)
                                .addComponent(txtIdReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnX))
                    .addGroup(paDLayout.createSequentialGroup()
                        .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa4)
                                    .addComponent(lb5)
                                    .addComponent(txtPhoneReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa6)
                                    .addComponent(lb7)
                                    .addComponent(txtEmailReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sepa5)
                                    .addComponent(txtAddressReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lb6))
                            .addComponent(txtBirthDayReader, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paDLayout.setVerticalGroup(
            paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paDLayout.createSequentialGroup()
                .addGroup(paDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Sepa1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Sepa2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirthDayReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Sepa4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddressReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Sepa5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailReader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Sepa6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(paDLayout.createSequentialGroup()
                        .addComponent(btnX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(428, 428, 428)))
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (number == 1) {
            if (txtIdReader.getText().length() != 0
                    && txtNameReader.getText().length() != 0
                    && txtBirthDayReader.getDate() != null
                    && txtPhoneReader.getText().length() != 0
                    && txtEmailReader.getText().length() != 0
                    && txtAddressReader.getText().length() != 0) {

                if (DateInFormat.isValidFormat(DateToDTime.Datechooser(txtBirthDayReader)) == false) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtBirthDayReader.requestFocus();
                } else if (Valid.ValidPhone(txtPhoneReader.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    txtPhoneReader.requestFocus();
                } else if (Valid.ValidEmail(txtEmailReader.getText())) {
                    if (readerDAO.Update(new tblReader(txtIdReader.getText(), txtNameReader.getText(), DateToDTime.Datechooser(txtBirthDayReader),
                            txtPhoneReader.getText(), txtEmailReader.getText(), txtAddressReader.getText())) != null) {
                        JOptionPane.showMessageDialog(null, "Sửa độc giả thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        showTableRead(TableReader);
                        this.dispose();

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sửa độc giả thất bại bạn không được để trống", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            if (txtIdReader.getText().length() != 0
                    && txtNameReader.getText().length() != 0
                    && txtBirthDayReader.getDate() != null
                    && txtPhoneReader.getText().length() != 0
                    && txtEmailReader.getText().length() != 0
                    && txtAddressReader.getText().length() != 0) {

                if (DateInFormat.isValidFormat(DateToDTime.Datechooser(txtBirthDayReader)) == false) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtBirthDayReader.requestFocus();
                } else if (Valid.ValidPhone(txtPhoneReader.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                    txtPhoneReader.requestFocus();
                } else if (Valid.ValidEmail(txtEmailReader.getText())) {
                    if (readerDAO.Insert(new tblReader(txtIdReader.getText(), txtNameReader.getText(), DateToDTime.Datechooser(txtBirthDayReader),
                            txtPhoneReader.getText(), txtEmailReader.getText(), txtAddressReader.getText())) != null) {
                        JOptionPane.showMessageDialog(null, "Thêm độc giả thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        txtIdReader.setText("");
                        txtNameReader.setText("");
                        txtBirthDayReader.setDate(null);
                        txtPhoneReader.setText("");
                        txtEmailReader.setText("");
                        txtAddressReader.setText("");

                        txtIdReader.requestFocus();

                        showTableRead(TableReader);

                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm độc giả thất bại trùng mã độc giả", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
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
        showTableRead(TableReader);
    }//GEN-LAST:event_btnXMouseClicked

    private void paDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paDMousePressed
        comPoint = evt.getPoint();
    }//GEN-LAST:event_paDMousePressed

    private void paDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paDMouseReleased
        comPoint = null;
    }//GEN-LAST:event_paDMouseReleased

    private void paDMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paDMouseDragged
        Point cPoint = evt.getLocationOnScreen();
        this.setLocation(cPoint.x - comPoint.x, cPoint.y - comPoint.y);
    }//GEN-LAST:event_paDMouseDragged

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        new SetBackgroundbtn(btnSave).mousePressed(evt);
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        new SetBackgroundbtn(btnSave).mouseReleased(evt);
    }//GEN-LAST:event_btnSaveMouseReleased

    private void txtIdReaderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdReaderFocusLost
        txtIdReader.setText(Valid.VToUpper(txtIdReader.getText()));
    }//GEN-LAST:event_txtIdReaderFocusLost

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
            java.util.logging.Logger.getLogger(DReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DReader dialog = new DReader(new javax.swing.JFrame(), true);
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
    private javax.swing.JSeparator Sepa4;
    private javax.swing.JSeparator Sepa5;
    private javax.swing.JSeparator Sepa6;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel btnX;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JPanel paD;
    private javax.swing.JTextField txtAddressReader;
    private com.toedter.calendar.JDateChooser txtBirthDayReader;
    private javax.swing.JTextField txtEmailReader;
    private javax.swing.JTextField txtIdReader;
    private javax.swing.JTextField txtNameReader;
    private javax.swing.JTextField txtPhoneReader;
    // End of variables declaration//GEN-END:variables
}

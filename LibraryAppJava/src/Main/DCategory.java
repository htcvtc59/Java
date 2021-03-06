/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BackgroundColor.SetBackgroundbtn;
import Controller.Valid;
import Model.MyDAO;
import Model.tblCategory;
import Model.tblCategoryDAO;
import java.awt.Point;
import javax.swing.JOptionPane;
import Model.tblCategoryModel;
import javax.swing.JTable;

/**
 *
 * @author MacOS
 */
public class DCategory extends javax.swing.JDialog {

    MyDAO cateDao = new tblCategoryDAO();
    public int number;
    static Point comPoint = null;
    private JTable TableCate;

    public DCategory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public DCategory(String id, String name, int number, JTable tablecate, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdCate.setText(id);
        txtNameCate.setText(name);
        this.number = number;
        this.TableCate = tablecate;
        if (number == 1) {
            txtIdCate.setEditable(false);
            txtNameCate.requestFocus();
        }
    }

    public void showTableCate(JTable tablecate) {
        tblCategoryModel categoryModel = new tblCategoryModel();
        categoryModel.setData(new tblCategoryDAO().GetAll());
        tablecate.setModel(categoryModel);
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
        txtIdCate = new javax.swing.JTextField();
        Sepa1 = new javax.swing.JSeparator();
        txtNameCate = new javax.swing.JTextField();
        Sepa2 = new javax.swing.JSeparator();
        lb2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        btnX = new javax.swing.JLabel();

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
        lb1.setText("Mã Thể Loại");

        txtIdCate.setBackground(new java.awt.Color(98, 98, 110));
        txtIdCate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIdCate.setForeground(new java.awt.Color(255, 255, 255));
        txtIdCate.setBorder(null);
        txtIdCate.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdCate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdCateFocusLost(evt);
            }
        });

        txtNameCate.setBackground(new java.awt.Color(98, 98, 110));
        txtNameCate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNameCate.setForeground(new java.awt.Color(255, 255, 255));
        txtNameCate.setBorder(null);
        txtNameCate.setCaretColor(new java.awt.Color(255, 255, 255));

        lb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Tên Thể Loại");

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

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
        });

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
                        .addGap(36, 36, 36)
                        .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sepa2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(lb2)
                                .addComponent(txtNameCate))
                            .addGroup(palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sepa1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(lb1)
                                .addComponent(txtIdCate))))
                    .addGroup(palDLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        palDLayout.setVerticalGroup(
            palDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palDLayout.createSequentialGroup()
                .addComponent(btnX)
                .addGap(8, 8, 8)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameCate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Sepa2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
            .addComponent(palD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        this.dispose();
        showTableCate(TableCate);
    }//GEN-LAST:event_btnXMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (number == 1) {
            if (txtIdCate.getText().length() != 0 && txtNameCate.getText().length() != 0) {
                if (cateDao.Update(new tblCategory(txtIdCate.getText(), txtNameCate.getText())) != null) {
                    JOptionPane.showMessageDialog(null, "Sửa thể loại thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    showTableCate(TableCate);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thể loại thất bại bạn không được để trống", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (txtIdCate.getText().length() != 0 && txtNameCate.getText().length() != 0) {
                if (cateDao.Insert(new tblCategory(txtIdCate.getText(), txtNameCate.getText())) != null) {
                    JOptionPane.showMessageDialog(null, "Thêm thể loại thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtIdCate.setText("");
                    txtNameCate.setText("");
                    txtIdCate.requestFocus();
                    showTableCate(TableCate);

                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thể loại thất bại trùng mã thể loại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Bạn không được để trống", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnSaveMouseClicked

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

    private void txtIdCateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCateFocusLost
     txtIdCate.setText(Valid.VToUpper(txtIdCate.getText()));
    }//GEN-LAST:event_txtIdCateFocusLost

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
            java.util.logging.Logger.getLogger(DCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DCategory dialog = new DCategory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                // dialog.showTableCate(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Sepa1;
    private javax.swing.JSeparator Sepa2;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel btnX;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JPanel palD;
    private javax.swing.JTextField txtIdCate;
    private javax.swing.JTextField txtNameCate;
    // End of variables declaration//GEN-END:variables

}

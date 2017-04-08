/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Model.tblUser;
import Model.tblUserDAO;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author MacOS
 */
public class Login extends javax.swing.JDialog {
    
    static Point comPoint = null;
    
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palLogin = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        Separtor1 = new javax.swing.JSeparator();
        lb3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        Separtor3 = new javax.swing.JSeparator();
        Xbtn = new javax.swing.JLabel();
        btnlLogin = new javax.swing.JPanel();
        lb4 = new javax.swing.JLabel();
        btnRetype = new javax.swing.JPanel();
        lb5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Login"); // NOI18N
        setUndecorated(true);

        palLogin.setBackground(new java.awt.Color(126, 130, 139));
        palLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                palLoginMouseDragged(evt);
            }
        });
        palLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                palLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palLoginMouseReleased(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LogoIcon.png"))); // NOI18N

        lb2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Tài Khoản");

        txtAccount.setBackground(new java.awt.Color(126, 130, 139));
        txtAccount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtAccount.setForeground(new java.awt.Color(255, 255, 255));
        txtAccount.setBorder(null);
        txtAccount.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountKeyPressed(evt);
            }
        });

        Separtor1.setForeground(new java.awt.Color(255, 255, 255));
        Separtor1.setPreferredSize(new java.awt.Dimension(0, 0));

        lb3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Mật Khẩu");

        txtPass.setBackground(new java.awt.Color(126, 130, 139));
        txtPass.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        Separtor3.setForeground(new java.awt.Color(255, 255, 255));
        Separtor3.setPreferredSize(new java.awt.Dimension(0, 0));

        Xbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        Xbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XbtnMouseClicked(evt);
            }
        });

        btnlLogin.setBackground(new java.awt.Color(72, 72, 85));
        btnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlLoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlLoginMouseReleased(evt);
            }
        });

        lb4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("Đăng Nhập");

        javax.swing.GroupLayout btnlLoginLayout = new javax.swing.GroupLayout(btnlLogin);
        btnlLogin.setLayout(btnlLoginLayout);
        btnlLoginLayout.setHorizontalGroup(
            btnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        btnlLoginLayout.setVerticalGroup(
            btnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnRetype.setBackground(new java.awt.Color(72, 72, 85));
        btnRetype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetypeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRetypeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRetypeMouseReleased(evt);
            }
        });

        lb5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("Nhập Lại");

        javax.swing.GroupLayout btnRetypeLayout = new javax.swing.GroupLayout(btnRetype);
        btnRetype.setLayout(btnRetypeLayout);
        btnRetypeLayout.setHorizontalGroup(
            btnRetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnRetypeLayout.setVerticalGroup(
            btnRetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout palLoginLayout = new javax.swing.GroupLayout(palLogin);
        palLogin.setLayout(palLoginLayout);
        palLoginLayout.setHorizontalGroup(
            palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palLoginLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(Xbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, palLoginLayout.createSequentialGroup()
                        .addGroup(palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccount)
                            .addComponent(Separtor1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(Separtor3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtPass)
                            .addGroup(palLoginLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb2)
                                    .addComponent(lb3))))
                        .addGap(51, 51, 51))
                    .addGroup(palLoginLayout.createSequentialGroup()
                        .addGroup(palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(palLoginLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnRetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbLogo))
                        .addGap(24, 24, 24))))
        );
        palLoginLayout.setVerticalGroup(
            palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palLoginLayout.createSequentialGroup()
                .addComponent(Xbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(lb2)
                .addGap(2, 2, 2)
                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Separtor1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb3)
                .addGap(2, 2, 2)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Separtor3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(palLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(palLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(palLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XbtnMouseClicked

    private void txtAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountKeyPressed
        EnterLogin(evt);
    }//GEN-LAST:event_txtAccountKeyPressed

    private void btnRetypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetypeMouseClicked
        txtAccount.setText(null);
        txtPass.setText(null);
    }//GEN-LAST:event_btnRetypeMouseClicked

    private void btnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlLoginMouseClicked
        ButtonLogin();
    }//GEN-LAST:event_btnlLoginMouseClicked

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        EnterLogin(evt);
    }//GEN-LAST:event_txtPassKeyPressed

    private void palLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palLoginMousePressed
        comPoint=evt.getPoint();
    }//GEN-LAST:event_palLoginMousePressed

    private void palLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palLoginMouseReleased
        comPoint=null;
    }//GEN-LAST:event_palLoginMouseReleased

    private void palLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palLoginMouseDragged
           Point cPoint = evt.getLocationOnScreen();
        this.setLocation(cPoint.x - comPoint.x, cPoint.y - comPoint.y);
    }//GEN-LAST:event_palLoginMouseDragged

    private void btnlLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlLoginMousePressed
       btnlLogin.setBackground(new Color(111, 111, 121));
    }//GEN-LAST:event_btnlLoginMousePressed

    private void btnlLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlLoginMouseReleased
        btnlLogin.setBackground(new Color(72, 72, 85));
    }//GEN-LAST:event_btnlLoginMouseReleased

    private void btnRetypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetypeMousePressed
         btnRetype.setBackground(new Color(111, 111, 121));
    }//GEN-LAST:event_btnRetypeMousePressed

    private void btnRetypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetypeMouseReleased
       btnRetype.setBackground(new Color(72, 72, 85));
    }//GEN-LAST:event_btnRetypeMouseReleased
    
    private void ButtonLogin() {
        try {
            if (txtAccount.getText().length() != 0 && txtPass.getPassword().length != 0) {
                tblUserDAO userDAO = new tblUserDAO();
                tblUser user;
                user = userDAO.Login(txtAccount.getText(), String.valueOf(txtPass.getPassword()));
                
                if (user == null) {
                    JOptionPane.showMessageDialog(rootPane, "Tài Khoản hoặc Mật Khẩu sai", "Lỗi", JOptionPane.OK_OPTION);
                } else {
                    this.setVisible(false);
                    new LibraryApp(user.getUserFullName()).setVisible(true);
                }
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tài Khoản và Mật Khẩu không được để trống", "Lỗi", JOptionPane.OK_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void EnterLogin(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ButtonLogin();
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
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
    private javax.swing.JSeparator Separtor1;
    private javax.swing.JSeparator Separtor3;
    private javax.swing.JLabel Xbtn;
    private javax.swing.JPanel btnRetype;
    private javax.swing.JPanel btnlLogin;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JPanel palLogin;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

}

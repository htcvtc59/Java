package View;



import Controller.Emailvalid;
import Controller.Randomkey;
import Controller.SendMaillSSL;
import Model.Account;
import Model.AccountDAO;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String randomcode;

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        TextSIGNIN = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        txtfUsername = new javax.swing.JTextField();
        txtfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        TextForgot = new javax.swing.JTextField();
        TextSignUp = new javax.swing.JTextField();
        pnRegister = new javax.swing.JPanel();
        TextSIGNUP = new javax.swing.JTextField();
        user1 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();
        txtfUserSignUp = new javax.swing.JTextField();
        txtfFullname = new javax.swing.JTextField();
        txtfEmail = new javax.swing.JTextField();
        txtfPasswordSignUp = new javax.swing.JPasswordField();
        txtfConfirmPass = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        TextMemberLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application ");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.CardLayout());

        pnLogin.setBackground(new java.awt.Color(42, 142, 191));

        TextSIGNIN.setEditable(false);
        TextSIGNIN.setBackground(new java.awt.Color(42, 142, 191));
        TextSIGNIN.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        TextSIGNIN.setForeground(new java.awt.Color(255, 255, 255));
        TextSIGNIN.setText("SIGN IN");
        TextSIGNIN.setBorder(null);

        user.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Username");

        pass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");

        txtfUsername.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtfUsername.setBorder(null);

        txtfPassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtfPassword.setBorder(null);

        btnLogin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(42, 142, 191));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        TextForgot.setEditable(false);
        TextForgot.setBackground(new java.awt.Color(42, 142, 191));
        TextForgot.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TextForgot.setForeground(new java.awt.Color(255, 255, 255));
        TextForgot.setText("Forgot Password?");
        TextForgot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextForgotMouseClicked(evt);
            }
        });

        TextSignUp.setEditable(false);
        TextSignUp.setBackground(new java.awt.Color(42, 142, 191));
        TextSignUp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TextSignUp.setForeground(new java.awt.Color(255, 255, 255));
        TextSignUp.setText("Sign Up");
        TextSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextSignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TextSIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pass)
                    .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 45, Short.MAX_VALUE))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(TextForgot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(TextSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextSIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(user)
                .addGap(18, 18, 18)
                .addComponent(txtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass)
                .addGap(18, 18, 18)
                .addComponent(txtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextForgot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(pnLogin, "card2");

        pnRegister.setBackground(new java.awt.Color(42, 142, 191));

        TextSIGNUP.setEditable(false);
        TextSIGNUP.setBackground(new java.awt.Color(42, 142, 191));
        TextSIGNUP.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        TextSIGNUP.setForeground(new java.awt.Color(255, 255, 255));
        TextSIGNUP.setText("SIGN UP");
        TextSIGNUP.setBorder(null);

        user1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(255, 255, 255));
        user1.setText("Username");

        fullname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("Fullname");

        email.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");

        pass1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pass1.setForeground(new java.awt.Color(255, 255, 255));
        pass1.setText("Password");

        pass2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pass2.setForeground(new java.awt.Color(255, 255, 255));
        pass2.setText("Confirm Password");

        txtfUserSignUp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfUserSignUp.setForeground(new java.awt.Color(102, 102, 102));
        txtfUserSignUp.setBorder(null);

        txtfFullname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfFullname.setForeground(new java.awt.Color(102, 102, 102));
        txtfFullname.setBorder(null);

        txtfEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtfEmail.setBorder(null);

        txtfPasswordSignUp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfPasswordSignUp.setForeground(new java.awt.Color(102, 102, 102));
        txtfPasswordSignUp.setBorder(null);

        txtfConfirmPass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtfConfirmPass.setForeground(new java.awt.Color(102, 102, 102));
        txtfConfirmPass.setBorder(null);

        btnRegister.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(42, 142, 191));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        TextMemberLogin.setEditable(false);
        TextMemberLogin.setBackground(new java.awt.Color(42, 142, 191));
        TextMemberLogin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TextMemberLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextMemberLogin.setText("Member Login");
        TextMemberLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextMemberLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextMemberLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnRegisterLayout = new javax.swing.GroupLayout(pnRegister);
        pnRegister.setLayout(pnRegisterLayout);
        pnRegisterLayout.setHorizontalGroup(
            pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegisterLayout.createSequentialGroup()
                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegisterLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(TextSIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnRegisterLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnRegisterLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(TextMemberLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(pnRegisterLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegisterLayout.createSequentialGroup()
                        .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user1)
                            .addComponent(txtfUserSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(pnRegisterLayout.createSequentialGroup()
                        .addGroup(pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass2)
                            .addComponent(email)
                            .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass1)
                            .addComponent(fullname))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnRegisterLayout.setVerticalGroup(
            pnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextSIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfUserSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextMemberLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(pnRegister, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextSignUpMouseClicked
        showPanel("card3");
    }//GEN-LAST:event_TextSignUpMouseClicked

    private void TextMemberLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextMemberLoginMouseClicked
        showPanel("card2");
    }//GEN-LAST:event_TextMemberLoginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            Emailvalid emailvalid = new Emailvalid();

            if (txtfUserSignUp.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Username");
            } else if (!checkusername()) {
                JOptionPane.showMessageDialog(null, "Username already exists");
            } else if (txtfFullname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Fullname");
            } else if (txtfEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Email");
            } else if (!emailvalid.validateEmail(txtfEmail.getText())) {
                JOptionPane.showMessageDialog(null, "Email error");
            } else if (!checkemail()) {
                JOptionPane.showMessageDialog(null, "Email already exists");
            } else if (String.valueOf(txtfPasswordSignUp.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Password");
            } else if (String.valueOf(txtfConfirmPass.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Confirm Password");
            } else if (String.valueOf(txtfPasswordSignUp.getPassword()) != String.valueOf(txtfConfirmPass.getPassword())) {
                if (String.valueOf(txtfPasswordSignUp.getPassword()).equals(String.valueOf(txtfConfirmPass.getPassword()))) {
                    CodeConfirm codeConfirm = new CodeConfirm();
                    SendMaillSSL sendmailssl = new SendMaillSSL();
                    randomcode = codeRandom();
                    System.out.println(randomcode); //TODO edit delete
                    sendmailssl.SendMail(txtfEmail.getText(), randomcode);
                    codeConfirm.setVisible(true);
                    creaccountlogin();
                } else {
                    JOptionPane.showMessageDialog(null, "Confirm Password the wrong !");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnRegisterActionPerformed

    public boolean checkemail() throws ClassNotFoundException, SQLException {
        boolean acc = false;
        AccountDAO accountDAO = new AccountDAO();
        Account account;
        account = accountDAO.checkmailaccount(txtfEmail.getText());
        if (account == null) {
            acc = true;
        }
        return acc;

    }

    public boolean checkusername() throws ClassNotFoundException, SQLException {
        boolean users = false;
        AccountDAO accountDAO = new AccountDAO();
        Account account;
        account = accountDAO.checkuseraccount(txtfUserSignUp.getText());
        if (account == null) {
            users = true;
        }
        return users;
    }

    public void creaccountlogin() {
        try {
            Account account = new Account();
            AccountDAO accountDAO = new AccountDAO();
            account.setUsername(txtfUserSignUp.getText());
            account.setFullname(txtfFullname.getText());
            account.setEmail(txtfEmail.getText());
            account.setPassword(String.valueOf(txtfPasswordSignUp.getPassword()));
            account.setCode(0);
            accountDAO.addAccount(account);
            retype();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void retype() {
        showPanel("card2");
        txtfUserSignUp.setText(null);
        txtfPasswordSignUp.setText(null);
        txtfEmail.setText(null);
        txtfConfirmPass.setText(null);
        txtfFullname.setText(null);
    }

    public static String getRandomcode() {
        return randomcode;
    }

    public String codeRandom() {
        Randomkey randomkey = new Randomkey();
        return randomkey.getSaltString();
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Username");
        } else if (String.valueOf(txtfPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Password");
        } else {
            try {
                AccountDAO accountDAO = new AccountDAO();
                Account account;
                account = accountDAO.login(txtfUsername.getText(), String.valueOf(txtfPassword.getPassword()));
                if (account == null) {
                    JOptionPane.showMessageDialog(null, "Username or Password the wrong");
                } else {
                    JOptionPane.showMessageDialog(null, "Logged in successfully!");
                    AllOfAccount allOfAccount = new AllOfAccount();
                    allOfAccount.setVisible(true);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void TextForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextForgotMouseClicked
        ForgotPassword forgot = new ForgotPassword();
        forgot.setVisible(true);
    }//GEN-LAST:event_TextForgotMouseClicked

    public void showPanel(String panelName) {
        CardLayout layoutpanel = (CardLayout) getContentPane().getLayout();
        layoutpanel.show(getContentPane(), panelName);
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextForgot;
    private javax.swing.JTextField TextMemberLogin;
    private javax.swing.JTextField TextSIGNIN;
    private javax.swing.JTextField TextSIGNUP;
    private javax.swing.JTextField TextSignUp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnRegister;
    private javax.swing.JPasswordField txtfConfirmPass;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfFullname;
    private javax.swing.JPasswordField txtfPassword;
    private javax.swing.JPasswordField txtfPasswordSignUp;
    private javax.swing.JTextField txtfUserSignUp;
    private javax.swing.JTextField txtfUsername;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}

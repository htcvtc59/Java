/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cach2;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Program {

 private JFrame frame;
 private JTextField txtEmail;
 private JPasswordField txtPass;
 private JPasswordField txtPassConfig;
 private JTextField txtPhone;

 /**
  * Launch the application.
  */
 private PreparedStatement stmt;
 private Connection conn;
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     Program window = new Program();
     window.frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public Program() {
  initialize();
  try {
   conn = DBUtil.getConnection();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

  private static String key = "1234abcd";
  private static String encrypt(String message) throws Exception {

    Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
    DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));
    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
    IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
    cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
    return toHexString(cipher.doFinal(message.getBytes("UTF-8")));
   }

   private static String toHexString(byte b[]) {
    StringBuffer hexString = new StringBuffer();
    for (int i = 0; i < b.length; i++) {
     String plainText = Integer.toHexString(0xff & b[i]);
     if (plainText.length() < 2)
      plainText = "0" + plainText;
     hexString.append(plainText);
    }
    return hexString.toString();
   }
 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.setBounds(100, 100, 450, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(null);
  
  JLabel lblSend = new JLabel("Send  Your Contact");
  lblSend.setFont(new Font("Tahoma", Font.BOLD, 30));
  lblSend.setBounds(53, 11, 371, 34);
  frame.getContentPane().add(lblSend);
  
  txtEmail = new JTextField();
  txtEmail.setBounds(158, 68, 190, 20);
  frame.getContentPane().add(txtEmail);
  txtEmail.setColumns(10);
  
  JLabel lblEmail = new JLabel("Email:");
  lblEmail.setBounds(40, 71, 46, 14);
  frame.getContentPane().add(lblEmail);
  
  txtPass = new JPasswordField();
  txtPass.setBounds(158, 99, 190, 20);
  frame.getContentPane().add(txtPass);
  
  JLabel lblPassword = new JLabel("Password");
  lblPassword.setBounds(40, 102, 65, 14);
  frame.getContentPane().add(lblPassword);
  
  txtPassConfig = new JPasswordField();
  txtPassConfig.setBounds(158, 132, 190, 20);
  frame.getContentPane().add(txtPassConfig);
  
  JLabel lblConfigPassword = new JLabel("Config Password");
  lblConfigPassword.setBounds(40, 135, 108, 14);
  frame.getContentPane().add(lblConfigPassword);
  
  JLabel lblPhoneNumber = new JLabel("Phone number:");
  lblPhoneNumber.setBounds(40, 171, 108, 14);
  frame.getContentPane().add(lblPhoneNumber);
  
  txtPhone = new JTextField();
  txtPhone.setBounds(157, 168, 191, 20);
  frame.getContentPane().add(txtPhone);
  txtPhone.setColumns(10);
  
  JButton btnSend = new JButton("Send ");
  btnSend.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    if(txtEmail.getText().equals("")){
     JOptionPane.showMessageDialog(null, "Please enter email!");
    }else if(txtPhone.getText().equals("")){
     JOptionPane.showMessageDialog(null, "Please enter number phone!");
    }else if(txtPass.getText().equals("")){
     JOptionPane.showMessageDialog(null, "Please enter pass!");
    }else if(txtPassConfig.getText().equals("")){
     JOptionPane.showMessageDialog(null, "Please enter pass config!");
    }else if(txtPass.getText().equals(txtPassConfig.getText())!= true){
     JOptionPane.showMessageDialog(null, "Pass Config Wrong!!");
    }else{
     String sql = "INSERT INTO `testencryptmd5`.`manager` ( `email`, `pass`, `phone`) VALUES ( ?, ?, ?)";
     try {
      stmt = conn.prepareStatement(sql);
      stmt.setString(1, txtEmail.getText());
      stmt.setString(2, encrypt(txtPass.getText()));
      stmt.setString(3, txtPhone.getText());
      stmt.executeUpdate();
     } catch (Exception e2) {
      e2.printStackTrace();
     }
      JOptionPane.showMessageDialog(null, "sent successfully!");
    }
   }
  });
  btnSend.setBounds(100, 211, 89, 23);
  frame.getContentPane().add(btnSend);
  
  JButton btnReset = new JButton("Reset");
  btnReset.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    txtEmail.setText(null);
    txtPass.setText(null);
    txtPassConfig.setText(null);
    txtPhone.setText(null);
   }
  });
  btnReset.setBounds(259, 211, 89, 23);
  frame.getContentPane().add(btnReset);
 }
}
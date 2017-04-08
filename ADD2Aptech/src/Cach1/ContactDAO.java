/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cach1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import static sun.security.pkcs11.wrapper.Functions.toHexString;

/**
 *
 * @author Monkey.TNT
 */
public class ContactDAO {

    private Connection conn;
    private PreparedStatement stmt;

    public ContactDAO() throws ClassNotFoundException, SQLException {
        conn = DBConnection.getConnection();
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
            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }
            hexString.append(plainText);
        }
        return hexString.toString();
    }

    
    
    public void addContact(Contact contact) throws SQLException, Exception {

        String sql = "Insert into contact values(?,?,?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, contact.getEmail());
        stmt.setString(2, encrypt(contact.getPass()));
        stmt.setString(3, contact.getPhone());
        stmt.executeUpdate();
    }

}

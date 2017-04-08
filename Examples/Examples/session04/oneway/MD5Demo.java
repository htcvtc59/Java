/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package session04.oneway;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ChuTuanLuyen
 */
public class MD5Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");//Message Digest
        String password = "PhuongPhuong";
        byte[] digest = md5.digest(password.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(digest);
        System.out.println("Digested: " + encoded);
        //Encoded Stored In Persistence store
        
        md5 = MessageDigest.getInstance("SHA");//Hash function

    }
}

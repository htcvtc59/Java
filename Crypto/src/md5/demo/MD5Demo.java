/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md5.demo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public class MD5Demo {

    public static void main(String[] args) {
        String input = "123456";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] output = messageDigest.digest(input.getBytes());
            String outString = Hex.encodeHexString(output);
            System.out.println(outString);

        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }

    }
   

}

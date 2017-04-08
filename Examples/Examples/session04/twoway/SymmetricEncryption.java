/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.twoway;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ChuTuanLuyen
 */
public class SymmetricEncryption {

    static final String ALGORITHM = "TripleDES";

    public static void main(String[] args) throws Exception {
        long curr = System.currentTimeMillis();
        //1. Create Cipher Instance By an algorithm
        //2. Create Secret Key
        //3. Set Encrypt mode/or Decrypte mode
        //4. Encrtype Or Decrypte a message
        Cipher cipher = Cipher.getInstance(ALGORITHM);//only algorithm
        //only algorithm
        SecretKey key = KeyGenerator.getInstance(ALGORITHM).generateKey();
        //Encrypting
        cipher.init(Cipher.ENCRYPT_MODE, key);
        String clear = "Phuong Phuogn PHuong";
        byte[] encryptedBytes = cipher.doFinal(clear.getBytes());
        BASE64Encoder base64  = new BASE64Encoder();
        String encryptedText = base64.encode(encryptedBytes);
        System.out.println("Encrypted: " + encryptedText);


        //Decrypte
        cipher.init(Cipher.DECRYPT_MODE, key);
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodeBuffer = decoder.decodeBuffer(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodeBuffer);
        System.out.println("Text Decrypted: " + (new String(decryptedBytes)));
        
        System.out.println("Spend: " + (System.currentTimeMillis() - curr));
    }
}

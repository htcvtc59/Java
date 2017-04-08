/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.twoway;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ChuTuanLuyen
 */
public class AsSymmetricDemo {

    static final String ALGORITHM = "rsa";

    public static void main(String[] args) throws Exception {
        //1. Create Cipher Instance By an algorithm
        //2. Create Key Pair: PubliKey, PrivateKey
        //3. Set Encrypt mode/or Decrypte mode
        //4. Encrtype Or Decrypte a message
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        KeyPairGenerator kpg = KeyPairGenerator.getInstance(ALGORITHM);
        KeyPair keyPair = kpg.genKeyPair();
        PrivateKey aPrivate = keyPair.getPrivate();
        PublicKey aPublic = keyPair.getPublic();


        //Encrypte By Publikey or privateKey
        cipher.init(Cipher.ENCRYPT_MODE, aPublic);
        byte[] encryptedBytes = cipher.doFinal("Phuong PHuong".getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encryptedText = encoder.encode(encryptedBytes);
        System.out.println("Encrypted: " + encryptedText);

        //Decrypt: Neu ma hoa su dugn private key, thi su dung publicKey de giai ma. Va nguoc lai
        cipher.init(Cipher.DECRYPT_MODE, aPrivate);
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodeBuffer = decoder.decodeBuffer(encryptedText);
        byte[] clearBytes = cipher.doFinal(decodeBuffer);
        System.out.println("Clear BYTE: " + new String(clearBytes));
    }
}

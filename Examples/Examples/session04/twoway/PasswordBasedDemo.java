/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.twoway;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ChuTuanLuyen
 */
public class PasswordBasedDemo {

    static final String ALGO = "PBEWithMD5AndDES";

    public static void main(String[] args) throws Exception {
        long cur = System.currentTimeMillis();
        //1. Base on password
        //2. Create Key based on keyspec by paswword
        //3. Create Salte
        //4. Parameter for decrypte/encrypte mode
        String password = "ban tinh ca dau tien";
        SecretKeyFactory skf = SecretKeyFactory.getInstance(ALGO);
        PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());
        SecretKey secretKey = skf.generateSecret(keySpec);
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        byte[] salte = random.generateSeed(8);
        PBEParameterSpec param = new PBEParameterSpec(salte, 8);
        Cipher cipher = Cipher.getInstance(ALGO);
        //Encrypt
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, param);
        String clear = "TOI YEU VIET NAM";
        byte[] encrypted = cipher.doFinal(clear.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(encrypted);
        System.out.println("Encoded: " + encode);

        //Giai ma
        cipher.init(Cipher.DECRYPT_MODE, secretKey, param);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Decryupted: " + new String(decrypted));

        System.out.println("Spend: " +(System.currentTimeMillis() - cur));
    }
}

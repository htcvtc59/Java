
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class SymetricEncryptor {

    public static byte[] encrypt(byte[] sourceBytes, SecretKey key, String transformation) throws NoSuchAlgorithmException,
            NoSuchPaddingException,
            InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(sourceBytes);

    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String sourceText = "FPT International School";
        try {
            byte[] sourceBytes = sourceText.getBytes("UTF-8");
            String algorithm = "AES";
            String transformation = "AES/ECB/PKCS5PADDING";
            SecretKey key = KeyGenerator.getInstance(algorithm).generateKey();
            byte[] encryptBytes = SymetricEncryptor.encrypt(sourceBytes, key, transformation);
            String encryptText = new String(encryptBytes);
            System.out.println("Source Text: " + sourceText);
            System.out.println("Encrypt Text: " + encryptText);

        } catch (UnsupportedEncodingException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(SymetricEncryptor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

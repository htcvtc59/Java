
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
public class DoEncryptDecrypt {

    String original = "I love you";
    byte[] encryptedData = null;
    SecretKey skab = null;

    public void doCreateKey() {
        try {
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            skab = kg.generateKey();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DoEncryptDecrypt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void doEncrypt() {
        try {
            Cipher cp  = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cp.init(Cipher.ENCRYPT_MODE,skab);
            encryptedData = cp.doFinal(original.getBytes());
            System.out.println(new String(encryptedData));
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(DoEncryptDecrypt.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void doDecrypt() {
        try {
            Cipher cp  = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cp.init(Cipher.DECRYPT_MODE,skab);
            byte[] decryptedData =cp.doFinal(encryptedData);
            System.out.println(new String(decryptedData));
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(DoEncryptDecrypt.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public static void main(String[] args) {
        DoEncryptDecrypt de = new DoEncryptDecrypt();
        de.doCreateKey();
        de.doEncrypt();
        de.doDecrypt();
    }

}

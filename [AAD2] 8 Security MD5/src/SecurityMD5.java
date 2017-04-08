
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecurityMD5 {

    public static String encrypt(String srcText) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String enrText = null;
        MessageDigest msd = MessageDigest.getInstance("MD5");
        byte[] srcTextBytes = srcText.getBytes("UTF-8");
        byte[] enrTextBytes = msd.digest(srcTextBytes);
        BigInteger bigInt = new BigInteger(1, enrTextBytes);
        enrText = bigInt.toString(16);
        
        return enrText;
    }

    public static void main(String[] args) {
//SecurityMD5 securityMD5 =new SecurityMD5();
String srcText = "FPT International School";
        try {
            String enrText = encrypt(srcText);
            System.out.println("Source Text: "+srcText);
            System.out.println("Encrypt Text: "+enrText);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(SecurityMD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

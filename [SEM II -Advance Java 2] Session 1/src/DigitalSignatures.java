
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class DigitalSignatures {

    byte[] signatureData = null;
    byte[] pubaData = null;
    byte[] pubbData = null;

//    Alice
    public void doSign(String sentmessage) {
        try {
//            SHA Secure hash algorithm ,DSA : Digital signature algorithm
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA");
//            PRNG Pseudo Random Number Generator
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            kpg.initialize(1024, sr);
            KeyPair kp = kpg.genKeyPair();
//            Private key
            PrivateKey prva = kp.getPrivate();
//            Public key
            PublicKey puba = kp.getPublic();
            pubaData = puba.getEncoded();

//            Create signature object
            Signature sig = Signature.getInstance("SHA1withDSA");
            sig.initSign(prva);
//            put data into the signature object to sign
            sig.update(sentmessage.getBytes());
//            Sign
            signatureData = sig.sign();
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException ex) {
            Logger.getLogger(DigitalSignatures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doSign1(String sentmessage) {
        try {
//            SHA Secure hash algorithm ,DSA : Digital signature algorithm
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("DSA");
//            PRNG Pseudo Random Number Generator
            SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
            kpg.initialize(1024, sr);
            KeyPair kp = kpg.genKeyPair();
//            Private key
            PrivateKey prva = kp.getPrivate();
//            Public key
            PublicKey puba = kp.getPublic();
            pubbData = puba.getEncoded();

//            Create signature object
            Signature sig = Signature.getInstance("SHA1withDSA");
            sig.initSign(prva);
//            put data into the signature object to sign
            sig.update(sentmessage.getBytes());
//            Sign
            signatureData = sig.sign();
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException ex) {
            Logger.getLogger(DigitalSignatures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    Bod
    public void doVerify(String receivemesssage) {
        try {
//            Khoi phuc lai  puba
            X509EncodedKeySpec ksp = new X509EncodedKeySpec(pubaData);
//            KeyFactory
            KeyFactory kf = KeyFactory.getInstance("DSA");
            PublicKey puba = kf.generatePublic(ksp);
//            Create sig  object
            Signature sig = Signature.getInstance("SHA1withDSA");
            sig.initVerify(puba);
            sig.update(receivemesssage.getBytes());
            if (sig.verify(signatureData)) {
                System.out.println("Sent from A , not modified");
            } else {
                System.out.println("Either not sent from A or was modified");
            }

        } catch (NoSuchAlgorithmException | InvalidKeySpecException | InvalidKeyException | SignatureException ex) {
            Logger.getLogger(DigitalSignatures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        DigitalSignatures DS = new DigitalSignatures();
        DS.doSign1("Iam");
        DS.doSign("I love you");

        DS.doVerify("Iam");
        
        
//        Tao 2 chu ki a va b Gui a nhung dung b ki
    }

}

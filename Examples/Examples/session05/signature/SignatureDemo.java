/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.signature;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import sun.misc.BASE64Encoder;

/**
 *
 * @author ChuTuanLuyen
 */
public class SignatureDemo {

    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = kpg.genKeyPair();
        PrivateKey aPrivate = keyPair.getPrivate();//For encrypte
        PublicKey aPublic = keyPair.getPublic();//For Decrypte

        Signature signature = Signature.getInstance("MD5WithRSA");
        //Signing
        signature.initSign(aPrivate);
        String s = "C1108G";
        signature.update(s.getBytes());
        byte[] signed = signature.sign();
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(signed);
        System.out.println("Digital Signature: " + encode);

        //Verifying
        signature.initVerify(aPublic);
        //update data need to verify
        signature.update("C1108G".getBytes());
        boolean verify = signature.verify(signed);
        System.out.println("Data is Verified: " + verify);

    }
}

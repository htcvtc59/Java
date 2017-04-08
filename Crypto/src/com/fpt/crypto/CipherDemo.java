/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.crypto;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author Macintosh
 */
public class CipherDemo {

    public static String encrypt(String in, String key) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher = Cipher.getInstance("AES");
        byte[] inputBytes = in.getBytes();
        SecretKey secKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secKey);
        byte[] outputBytes = cipher.doFinal(inputBytes);
        return Hex.encodeHexString(outputBytes);
    }

    public static String decrypt(String in, String key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, DecoderException {
        Cipher cipher = Cipher.getInstance("AES");
        byte[] inputBytes = Hex.decodeHex(in.toCharArray());
        SecretKey secKey = new SecretKeySpec(key.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secKey);
        byte[] outputBytes = cipher.doFinal(inputBytes);
        return new String(outputBytes);

    }

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, DecoderException {
        String input = "123456dfnkrdf;lnmbdf;";
        String key = "1234567890111225";
        String en = encrypt(input, key);
        String de = decrypt(en, key);
        System.out.println("Decrypt:" + de);
        System.out.println("ecrypt:" + en);

    }
}

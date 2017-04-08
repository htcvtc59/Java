/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.security.platform;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 *
 * @author ChuTuanLuyen
 */
public class FileSecurity {

    public static void main(String[] args) {
        System.setProperty("java.security.policy", "C:/Users/ChuTuanLuyen/Documents/NetBeansProjects/C1108G_SJava/src/session03/security/platform/writeFile.policy");
        System.out.println(SecurityManager.class);
        System.setSecurityManager(new SecurityManager());
        try {
            //Quyen doc
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/test.txt")));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println("Value: " + str);
            }
            br.close();
            //Quyen ghi
            FileWriter fw = new FileWriter("d:/test.txt", true);
            fw.write("\nDay laf dong ghi tu java class");
            fw.flush();
            fw.close();
            System.out.println("Wrote!");
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}

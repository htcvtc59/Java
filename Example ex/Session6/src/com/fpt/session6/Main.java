/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.session6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class Main {

    /**  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url=new URL("http://vnexpress.net");

            URLConnection con=url.openConnection();
            con.connect();
            DataInputStream datIn=new DataInputStream(con.getInputStream());
            File outFile=new File("vnexpress.html");
            String content=datIn.readUTF();
            DataOutputStream datOut=new DataOutputStream(new FileOutputStream(outFile));
            datOut.writeUTF(content);
            datOut.close();
            datIn.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

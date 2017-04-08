/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.session6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class DownloadFileDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input link: ");
        String link=sc.nextLine();
        try {
            URL url=new URL(link);
            URLConnection con=url.openConnection();
            con.connect();
            InputStream in=con.getInputStream();
            BufferedInputStream bufferIn=new BufferedInputStream(in,1024);
            DataInputStream dataIn=new DataInputStream(bufferIn);
            // Out
            String filename=url.getFile();   
            File file=new File(filename);
            file=new File(file.getName());
           // file.createNewFile();
            FileOutputStream out=new FileOutputStream(file);
            BufferedOutputStream bufferOut=new BufferedOutputStream(out,2048);
            DataOutputStream dataOut=new DataOutputStream(bufferOut);
            
            int dat;
            while((dat=dataIn.read())!=-1){
                dataOut.write(dat);
            }
            dataIn.close();
            dataOut.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(DownloadFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DownloadFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

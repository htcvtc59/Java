/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepadexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class OpenFile{
    private JTextArea ta;
    private String path;

    public OpenFile(JTextArea ta, String path) {
        this.ta=ta;
        this.path=path;
    }
    
    public void Load(){
        try {
            Scanner sc=new Scanner(new FileInputStream(path), "UTF-8");
            ta.setText("");
            while(sc.hasNextLine())
                ta.append(sc.nextLine() + "\n");
        }
        catch (FileNotFoundException e) {
             
        }
    }
}  
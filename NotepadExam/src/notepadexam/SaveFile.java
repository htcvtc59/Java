/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepadexam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Monkey.TNT
 */
public class SaveFile {

    private final String path;
    private String content;

    public SaveFile(String path, String content) {
        this.path = path;
        this.content = content;
    }

    public void Write(){
        try {
            PrintWriter fw = new PrintWriter(new FileOutputStream(path), true);
            fw.print(content);
            fw.close();
        } catch (FileNotFoundException e) {

        }
    }

}

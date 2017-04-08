/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Monkey.TNT
 */
public class JProgressBarDemo {
   static Timer tm = null;
    public static void main(String[] args) {
        JFrame frm = new JFrame("Demo2");
        frm.setSize(300, 300);
        Container con = frm.getContentPane();
        //JProgressBar Hien thi phan tram cong viec,Luong thoi gian cua no la bao nhieu     
        con.setLayout(new FlowLayout());
        final JProgressBar proBar = new JProgressBar();
        proBar.setMinimum(0);
        proBar.setMaximum(100);
        proBar.setStringPainted(true);
        con.add(proBar);
        
        tm = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                proBar.setValue(proBar.getValue() + 5);
                if(proBar.getValue()>=100){
                    tm.stop();
                    System.out.println("Stop");
                }
            }
        });
        tm.start();
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
    }
//        Timer tm = new Timer(1000, new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(new Date());
//            }
//        });
//        tm.start();
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//        
//    }
    
}

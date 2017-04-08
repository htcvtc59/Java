/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Monkey.TNT
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frm = new JFrame("Swing JFrame Test");
        frm.setSize(800, 500);
//        1.Create an object of the component
        JLabel lblTest = new JLabel("New Label");
//        2.Container (if haven't done so)
        Container con = frm.getContentPane();
//        set container layout to flowlayout
        con.setLayout(new FlowLayout());
//        3 Put the label
        con.add(lblTest);
//        Create a Button
        JButton btnTest = new JButton("Click me");
//put 
        con.add(btnTest);
        btnTest.addActionListener(new MyListener());
        
        
//        Create a Label
        JLabel lblImage = new JLabel(new ImageIcon("img/1.jpg"));
        lblImage.setPreferredSize(new Dimension(60, 60));
        con.add(lblImage);
        JTextField txtTest = new JTextField(10);
//        Chi hien thi 10 ki tu , co the van viet nhieu hon 10 ki tu
        con.add(txtTest);

        JTextArea txtArea = new JTextArea(10, 20);
//        10 dong 20 cot
        con.add(txtArea);
        JPasswordField pwd = new JPasswordField(12);
        pwd.setEchoChar('*');
        con.add(pwd);
        JButton btnIcon = new JButton("Doid", new ImageIcon("img/1.jpg"));
        btnIcon.setPreferredSize(new Dimension(40, 40));
        con.add(btnIcon);
//        CheckBox
        JCheckBox cbxShopping = new JCheckBox("Shopping");
        JCheckBox cbxReading = new JCheckBox("Reading");
        JCheckBox cbxComputer = new JCheckBox("Game");
        cbxComputer.setSelected(true);
        con.add(cbxShopping);
        con.add(cbxReading);
        con.add(cbxComputer);

//        Radio btn
        JRadioButton rbtn = new JRadioButton("Male");
        JRadioButton rbtn1 = new JRadioButton("Female");
        con.add(rbtn);
        con.add(rbtn1);
//Create button group 
        ButtonGroup btGroup = new ButtonGroup();
        btGroup.add(rbtn);
        btGroup.add(rbtn1);

//JComboBox
        JComboBox cbxClasses = new JComboBox();
        cbxClasses.addItem("Google");
        cbxClasses.addItem("Apple");
        cbxClasses.addItem("Facebook");
        con.add(cbxClasses);

//        Hien thi cua so
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        System.out.println((int) frm.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

}

class MyListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    
    }

}

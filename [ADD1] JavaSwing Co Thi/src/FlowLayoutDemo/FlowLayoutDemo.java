/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlowLayoutDemo;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Monkey.TNT
 */
public class FlowLayoutDemo extends JFrame{
    public FlowLayoutDemo(String title){
        super(title);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        
        JLabel lbKeyWord = new JLabel("Keyword");
        
        JTextField txtKeyword = new JTextField();
        txtKeyword.setPreferredSize(new Dimension(150,25));
        JButton btnSearch = new JButton("Search");
        add(lbKeyWord);
        add(txtKeyword);
        add(btnSearch);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public static void main(String[] args){
    FlowLayoutDemo demo =new FlowLayoutDemo("Demo Flowlayout");
    demo.setVisible(true);
    demo.setSize(250,300);
    }
    
}

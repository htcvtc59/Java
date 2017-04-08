/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackgroundColor;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author MacOS
 */
public class SetBGbtnAED extends JPanel implements MouseListener{
     private JPanel btn;

    public SetBGbtnAED(JPanel btn) {
        this.btn = btn;
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        btn.setBackground(new Color(198, 123, 146));
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        btn.setBackground(new Color(52,152,219));
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

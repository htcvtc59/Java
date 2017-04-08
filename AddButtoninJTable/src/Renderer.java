
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MacOS
 */
public class Renderer extends DefaultTableCellHeaderRenderer {
 private JLabel lb;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected)
		{
			lb.setForeground(table.getSelectionForeground());
	 		lb.setBackground(table.getSelectionBackground());
		}
		else
		{
			lb.setForeground(table.getForeground());
			lb.setBackground(UIManager.getColor("Button.background"));
		}

		if (hasFocus)
		{
			lb.setBorder( new LineBorder(Color.BLUE)  );
		}
		else
		{
			lb.setBorder( lb.getBorder() );
		}

//		lb.setText( (value == null) ? "" : value.toString() );
		if (value == null)
		{
			lb.setText( "" );
			lb.setIcon( null );
		}
		else if (value instanceof Icon)
		{
			lb.setText( "" );
			lb.setIcon( (Icon)value );
		}
		else
		{
			lb.setText( value.toString() );
			lb.setIcon( null );
		}

		return lb;
    }

}

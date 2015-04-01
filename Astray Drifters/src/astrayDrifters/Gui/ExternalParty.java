package astrayDrifters.Gui;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class ExternalParty extends JDialog{
	
	private static final long serialVersionUID = 7474747885944177395L;

	ExternalParty(){
		setUndecorated(true);
		setSize(400, 150);
		setAutoRequestFocus(false);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel goldLabel = new JLabel("Gold:");
		goldLabel.setForeground(Color.LIGHT_GRAY);
		goldLabel.setHorizontalAlignment(SwingConstants.LEFT);
		goldLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		goldLabel.setBounds(10, 10, 30, 14);
		getContentPane().add(goldLabel);
		
		JTextPane goldField = new JTextPane();
		goldField.setBackground(new Color(255, 255, 0));
		goldField.setEditable(false);
		goldField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		goldField.setText("\u20ac10");
		goldField.setBounds(45, 5, 65, 20);
		getContentPane().add(goldField);
		
		JTextPane itemField = new JTextPane();
		itemField.setBackground(Color.DARK_GRAY);
		itemField.setForeground(Color.WHITE);
		itemField.setEditable(false);
		itemField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		itemField.setContentType("text/html");
		itemField.setBounds(10, 48, 380, 92);
		getContentPane().add(itemField);
		
		JLabel itemLabel = new JLabel("Items:");
		itemLabel.setForeground(Color.LIGHT_GRAY);
		itemLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		itemLabel.setBounds(10, 34, 35, 14);
		getContentPane().add(itemLabel);
	}
	

}

package astrayDrifters.Gui;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class ExternalText extends JDialog{
	private JLabel titleLabel;
	private JTextPane dialogPane;
	private JScrollPane dialogScrollPane;
	
	ExternalText(String txt){
		setTitle(txt);
		setResizable(false);
		setAutoRequestFocus(false);
		setUndecorated(true);
		setSize(350,350);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		titleLabel = new JLabel(txt);
		titleLabel.setForeground(Color.LIGHT_GRAY);
		titleLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		titleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		titleLabel.setBounds(10, 0, 75, 20);
		getContentPane().add(titleLabel);
		
		dialogPane = new JTextPane();
		dialogPane.setBackground(Color.DARK_GRAY);
		dialogPane.setContentType("text/html");
		dialogPane.setEditable(false);
		dialogPane.setBounds(10, 20, 330, 320);
		
		dialogScrollPane = new JScrollPane(dialogPane);
		dialogScrollPane.setBounds(10, 20, 330, 320);
		dialogScrollPane.setWheelScrollingEnabled(true);
		getContentPane().add(dialogScrollPane);
	}
}

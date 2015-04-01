package astrayDrifters.Gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextPane;

public class VersionNotesDialog extends JDialog{
	
	private static final long serialVersionUID = 8446284907065177450L;
	
	private JTextPane notePane;
	private JButton closeButton;
	private JScrollPane noteScrollPane;
	
	VersionNotesDialog(String text){
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		setUndecorated(true);
		setSize(400, 200);
		setLocationRelativeTo(null);
		
		addMouseMotionListener(new MouseMotionListener() {
		    private int mx, my;

		    @Override
		    public void mouseMoved(MouseEvent e) {
		        mx = e.getXOnScreen();
		        my = e.getYOnScreen();
		    }

		    @Override
		    public void mouseDragged(MouseEvent e) {
		        Point p = getLocation();
		        p.x += e.getXOnScreen() - mx;
		        p.y += e.getYOnScreen() - my;
		        mx = e.getXOnScreen();
		        my = e.getYOnScreen();
		        setLocation(p);
		    }
		});
		
		notePane = new JTextPane();
		notePane.setEditable(false);
		notePane.setForeground(Color.LIGHT_GRAY);
		notePane.setContentType("text/html");
		notePane.setBackground(Color.DARK_GRAY);
		notePane.setBounds(16, 16, 368, 168);
		notePane.setText(text);
		noteScrollPane = new JScrollPane(notePane);
		noteScrollPane.setBounds(16, 16, 368, 168);
		getContentPane().add(noteScrollPane);
		
		closeButton = new JButton(new ImageIcon("Close.png"));
		closeButton.setFocusPainted(false);
		closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();

			}
		});
		closeButton.setBounds(384, 0, 16, 16);
		getContentPane().add(closeButton);
		
	}
	
}

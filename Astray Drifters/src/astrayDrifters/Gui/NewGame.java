package astrayDrifters.Gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class NewGame extends JFrame{
	
	private static final long serialVersionUID = -4896598605772353691L;
	private Font titleFont;
	private JButton closeButton;
	private JButton beginButton;
	private JTextField saveNameField;
	
	public NewGame(){
		
		try {
			titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("NewRocker-Regular.otf"));
			titleFont = titleFont.deriveFont(Font.BOLD, 20);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont(titleFont);
		} catch (FontFormatException | IOException e) {}
		
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
		setUndecorated(true);
		setSize(250, 250);
		setLocationRelativeTo(null);
		
		getContentPane().setForeground(Color.LIGHT_GRAY);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel newGameLabel = new JLabel("New Game Settings");
		newGameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		newGameLabel.setFont(titleFont);
		newGameLabel.setForeground(Color.LIGHT_GRAY);
		newGameLabel.setBounds(0, 0, 250, 40);
		getContentPane().add(newGameLabel);
		
		closeButton = new JButton(new ImageIcon("Close.png"));
		closeButton.setFocusPainted(false);
		closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new VersionNotesDialog("APRIL FOOLS").setVisible(true);
			}
		});
		closeButton.setBounds(236, 0, 16, 16);
		getContentPane().add(closeButton);
		
		JCheckBox storylessModeCheckbox = new JCheckBox("Story Mode (Currently Unavailable)");
		storylessModeCheckbox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		storylessModeCheckbox.setEnabled(false);
		storylessModeCheckbox.setBackground(Color.BLACK);
		storylessModeCheckbox.setForeground(Color.LIGHT_GRAY);
		storylessModeCheckbox.setBounds(6, 174, 234, 23);
		getContentPane().add(storylessModeCheckbox);
		
		JLabel tmpLabel = new JLabel("More settings coming soon!");
		tmpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tmpLabel.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		tmpLabel.setForeground(Color.LIGHT_GRAY);
		tmpLabel.setBounds(0, 225, 250, 14);
		getContentPane().add(tmpLabel);
		
		beginButton = new JButton(">Begin");
		beginButton.setForeground(Color.LIGHT_GRAY);
		beginButton.setBackground(Color.BLACK);
		beginButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		beginButton.setBounds(75, 204, 89, 23);
		beginButton.setOpaque(true);
		beginButton.setBorderPainted(false);
		beginButton.setBackground(new Color(105, 105, 105));
		beginButton.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				beginButton.setForeground(new Color(0, 75, 125));
			}
			public void mouseExited(MouseEvent arg0) {
				beginButton.setForeground(Color.WHITE);
			}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {
				String url = "http://akk.li/pics/anne.jpg";
				for(int i = 0; i < 10; i++){
					try {
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		getContentPane().add(beginButton);
		
		saveNameField = new JTextField();
		saveNameField.setForeground(Color.LIGHT_GRAY);
		saveNameField.setBorder(null);
		saveNameField.setBackground(Color.DARK_GRAY);
		saveNameField.setBounds(15, 50, 85, 20);
		getContentPane().add(saveNameField);
		
		JLabel lblSaveName = new JLabel("Save Name");
		lblSaveName.setForeground(Color.LIGHT_GRAY);
		lblSaveName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSaveName.setBounds(105, 50, 90, 20);
		getContentPane().add(lblSaveName);
		
		
	}
}

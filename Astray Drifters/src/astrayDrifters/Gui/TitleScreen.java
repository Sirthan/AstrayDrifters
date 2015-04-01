package astrayDrifters.Gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;

public class TitleScreen extends JFrame{
	
	private static final long serialVersionUID = -6717834231177447004L;
	
	private Font titleFont;
	private JButton closeButton;
	private JButton newGameButton;
	private JButton loadGameButton;
	private JLabel creditLabel;
	private JButton versionNotesButton;
	public final String VERSION;
	
	public TitleScreen(String ver){
		getContentPane().setBackground(Color.BLACK);
		setResizable(false);
		setUndecorated(true);
		setTitle("Astray Drifters");
		setSize(400, 300);
		setLocationRelativeTo(null);
		/*try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}*/
		try {
			titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("NewRocker-Regular.otf"));
			titleFont = titleFont.deriveFont(Font.BOLD, 32);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont(titleFont);
			
		} catch (FontFormatException | IOException e) {}
		
		getContentPane().setForeground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		VERSION = ver;
		
		JLabel nameLabel = new JLabel("Astray Drifters");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setForeground(Color.LIGHT_GRAY);
		nameLabel.setFont(titleFont);
		nameLabel.setBounds(93, 25, 214, 34);
		getContentPane().add(nameLabel);
		
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
		
		closeButton = new JButton(new ImageIcon("Close.png"));
		closeButton.setFocusPainted(false);
		closeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		closeButton.setBounds(384, 0, 16, 16);
		getContentPane().add(closeButton);
		
		JLabel versionLabel = new JLabel(VERSION);
		versionLabel.setForeground(Color.LIGHT_GRAY);
		versionLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		versionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		versionLabel.setBounds(103, 55, 214, 14);
		getContentPane().add(versionLabel);
		
		newGameButton = new JButton(">Start a New Game");
		newGameButton.setForeground(Color.WHITE);
		newGameButton.setHorizontalAlignment(SwingConstants.LEADING);
		newGameButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		newGameButton.setBounds(132, 132, 150, 23);
		newGameButton.setOpaque(true);
		newGameButton.setBorderPainted(false);
		newGameButton.setBackground(new Color(105, 105, 105));
		newGameButton.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new NewGame().setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				newGameButton.setForeground(new Color(0, 75, 125));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				newGameButton.setForeground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		newGameButton.setFocusPainted(false);
		getContentPane().add(newGameButton);
		
		loadGameButton = new JButton(">Load a Savefile");
		loadGameButton.setForeground(Color.WHITE);
		loadGameButton.setEnabled(false);
		loadGameButton.setOpaque(true);
		loadGameButton.setHorizontalAlignment(SwingConstants.LEADING);
		loadGameButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		loadGameButton.setBorderPainted(false);
		loadGameButton.setBackground(new Color(105, 105, 105));
		loadGameButton.setBounds(132, 155, 150, 23);
		loadGameButton.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent arg0) {}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				loadGameButton.setForeground(new Color(0, 75, 125));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				loadGameButton.setForeground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		loadGameButton.setFocusPainted(false);
		getContentPane().add(loadGameButton);
		
		creditLabel = new JLabel("Programmed by Nathaniel Singewald");
		creditLabel.setForeground(Color.LIGHT_GRAY);
		creditLabel.setHorizontalAlignment(SwingConstants.CENTER);
		creditLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		creditLabel.setBounds(93, 74, 214, 14);
		getContentPane().add(creditLabel);
		
		versionNotesButton = new JButton(">Version Notes");
		versionNotesButton.setOpaque(true);
		versionNotesButton.setHorizontalAlignment(SwingConstants.LEADING);
		versionNotesButton.setForeground(Color.WHITE);
		versionNotesButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		versionNotesButton.setFocusPainted(false);
		versionNotesButton.setBorderPainted(false);
		versionNotesButton.setBackground(new Color(105, 105, 105));
		versionNotesButton.setBounds(132, 178, 150, 23);
		versionNotesButton.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VersionNotesDialog verNotes = new VersionNotesDialog("<html>"
						+ "<b> <font color=\"white\">" + VERSION + ": </b></font><br>"
						+ "<font color=\"white\"> Astray Drifters is Released! </font>"
						+ "</html>");
				verNotes.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				versionNotesButton.setForeground(new Color(0, 75, 125));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				versionNotesButton.setForeground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		getContentPane().add(versionNotesButton);
		
	}
}

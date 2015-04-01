package astrayDrifters.Gui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class CentralGui extends JFrame{

	private static final long serialVersionUID = -3096161502258895564L;

	private JTable p1EquipmentTable;
	private JTable p2EquipmentTable;
	private JTable p3EquipmentTable;
	private ExternalText combatDialog;
	private ExternalText storyDialog;
	private ExternalParty partyDialog;
	private JLabel titleLabel;
	private JTabbedPane baseTab;
	private JPanel p1Panel;
	private JLabel p1NameLabel;
	private JTextPane p1NameField;
	private JLabel p1ClassLabel;
	private JTextPane p1ClassField;
	private JLabel p1IctusLabel;
	private JTextPane p1IctusField;
	private JTextPane p1Mens;
	private JLabel P1MensLabel;
	private JTextPane p1ArsField;
	private JLabel p1ArseLabel;
	private JLabel p1CritLabel;
	private JTextPane p1CritField;
	private JLabel p1DodgeLabel;
	private JTextPane p1DodgeField;
	private JLabel p1HealthLabel;
	private JTextPane p1HealthField;
	private JLabel p1ResourceLabel;
	private JTextPane p1ResourceField;
	private JLabel p1ResistLabel;
	private JTextPane p1ResistField;
	private JTextPane p1SpellField;
	private JLabel p1SpellLabel;
	private JLabel p1LevelLabel;
	private JTextPane p1LevelField;
	private JLabel p1RankLabel;
	private JTextPane p1RankField;
	private JLabel p1EXPLabel;
	private JTextPane p1EXPField;
	private JLabel p1MaturityLabel;
	private JTextPane p1MaturityField;
	private JLabel p1EquipmentLabel;
	private JLabel p1AfflictionLabel;
	private JTextPane p1AfflictionField;
	private JPanel p2Panel;
	private JLabel p2NameLabel;
	private JTextPane p2NameField;
	private JLabel p2ClassLabel;
	private JTextPane p2ClassField;
	private JLabel p2IctusLabel;
	private JTextPane p2IctusField;
	private JTextPane p2MensField;
	private JLabel p2MensLabel;
	private JTextPane p2ArsField;
	private JLabel p2ArsLabel;
	private JLabel p2CritLabel;
	private JTextPane p2CritField;
	private JLabel p2DodgeLabel;
	private JTextPane p2DodgeField;
	private JLabel p2HealthLabel;
	private JTextPane p2HealthField;
	private JLabel p2ResourceLabel;
	private JTextPane p2ResourceField;
	private JLabel p2ResistLabel;
	private JTextPane p2ResistField;
	private JTextPane p2SpellField;
	private JLabel p2SpellLabel;
	private JLabel p2LevelLabel;
	private JTextPane p2LevelField;
	private JLabel p2RankLabel;
	private JTextPane p2RankField;
	private JLabel p2EXPLabel;
	private JTextPane p2EXPField;
	private JLabel p2MaturityLabel;
	private JTextPane p2MaturityField;
	private JLabel p2EquipmentLabel;
	private JLabel p2AfflictionLabel;
	private JTextPane p2AffictionField;
	private JPanel p3Panel;
	private JLabel p3NameLabel;
	private JTextPane p3NameField;
	private JLabel p3ClassLabel;
	private JTextPane p3ClassField;
	private JLabel p3IctusLabel;
	private JTextPane p3IctusField;
	private JTextPane p3MensField;
	private JLabel p3MensLabel;
	private JTextPane p3ArsField;
	private JLabel p3ArsLabel;
	private JLabel p3CritLabel;
	private JTextPane p3CritField;
	private JLabel p3DodgeLabel;
	private JTextPane p3DodgeField;
	private JLabel p3HealthLabel;
	private JTextPane p3HealthField;
	private JLabel p3ResourceLabel;
	private JTextPane p3ResourceField;
	private JLabel p3ResistLabel;
	private JTextPane p3ResistField;
	private JTextPane p3SpellField;
	private JLabel p3SpellLabel;
	private JLabel p3LevelLabel;
	private JTextPane p3LevelField;
	private JLabel p3RankLabel;
	private JTextPane p3RankField;
	private JLabel p3EXPLabel;
	private JTextPane p3EXPField;
	private JLabel p3MaturityLabel;
	private JTextPane p3MaturityField;
	private JLabel p3EquipmentLabel;
	private JLabel p3AfflictionLabel;
	private JTextPane p3AfflictionField;
	private JButton closeButton;
	private Font titleFont;

	public CentralGui() {

		try {
			titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("NewRocker-Regular.otf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(titleFont);
		} catch (FontFormatException | IOException e) {}


		getContentPane().setBackground(Color.BLACK);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setSize(400,400);

		setBackground(new Color(240, 230, 140));
		setUndecorated(true);
		setTitle("Astray Drifters");
		getContentPane().setLayout(null);

		titleLabel = new JLabel("Astray Drifters");
		titleLabel.setForeground(Color.LIGHT_GRAY);
		titleLabel.setBackground(Color.BLACK);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font(titleFont.getName(), Font.PLAIN, 16));
		titleLabel.setBounds(144, 3, 102, 30);
		getContentPane().add(titleLabel);

		baseTab = new JTabbedPane(JTabbedPane.TOP);
		baseTab.setBackground(new Color(105, 105, 105));
		baseTab.setForeground(new Color(0, 0, 0));
		baseTab.setBounds(10, 30, 380, 360);
		getContentPane().add(baseTab);

		p1Panel = new JPanel();
		p1Panel.setBackground(new Color(240, 179, 117));
		baseTab.addTab("Player 1", null, p1Panel, null);
		p1Panel.setLayout(null);

		p1NameLabel = new JLabel("Name:");
		p1NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1NameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1NameLabel.setBounds(0, 10, 40, 20);
		p1Panel.add(p1NameLabel);

		p1NameField = new JTextPane();
		p1NameField.setBackground(new Color(255, 228, 196));
		p1NameField.setEditable(false);
		p1NameField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1NameField.setText("Player 1");
		p1NameField.setBounds(40, 10, 75, 20);
		p1Panel.add(p1NameField);

		p1ClassLabel = new JLabel("Class:");
		p1ClassLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1ClassLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ClassLabel.setBounds(250, 10, 40, 20);
		p1Panel.add(p1ClassLabel);

		p1ClassField = new JTextPane();
		p1ClassField.setText("   ");
		p1ClassField.setBackground(new Color(255, 228, 196));
		p1ClassField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ClassField.setEditable(false);
		p1ClassField.setBounds(290, 10, 75, 20);
		p1Panel.add(p1ClassField);

		p1IctusLabel = new JLabel("Ictus:");
		p1IctusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1IctusLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1IctusLabel.setBounds(50, 100, 35, 20);
		p1Panel.add(p1IctusLabel);

		p1IctusField = new JTextPane();
		p1IctusField.setText("1000");
		p1IctusField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1IctusField.setEditable(false);
		p1IctusField.setBackground(new Color(255, 69, 0));
		p1IctusField.setBounds(87, 100, 38, 20);
		p1Panel.add(p1IctusField);

		p1Mens = new JTextPane();
		p1Mens.setText("1000");
		p1Mens.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1Mens.setEditable(false);
		p1Mens.setBackground(new Color(135, 206, 235));
		p1Mens.setBounds(177, 100, 38, 20);
		p1Panel.add(p1Mens);

		P1MensLabel = new JLabel("Mens:");
		P1MensLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		P1MensLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		P1MensLabel.setBounds(140, 100, 35, 20);
		p1Panel.add(P1MensLabel);

		p1ArsField = new JTextPane();
		p1ArsField.setText("1000");
		p1ArsField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ArsField.setEditable(false);
		p1ArsField.setBackground(new Color(107, 142, 35));
		p1ArsField.setBounds(258, 100, 38, 20);
		p1Panel.add(p1ArsField);

		p1ArseLabel = new JLabel("Ars:");
		p1ArseLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1ArseLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ArseLabel.setBounds(232, 100, 26, 20);
		p1Panel.add(p1ArseLabel);

		p1CritLabel = new JLabel("Crit:");
		p1CritLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1CritLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1CritLabel.setBounds(100, 130, 24, 20);
		p1Panel.add(p1CritLabel);

		p1CritField = new JTextPane();
		p1CritField.setText("100%");
		p1CritField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1CritField.setEditable(false);
		p1CritField.setBackground(new Color(255, 255, 0));
		p1CritField.setBounds(126, 130, 38, 20);
		p1Panel.add(p1CritField);

		p1DodgeLabel = new JLabel("Dodge:");
		p1DodgeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1DodgeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1DodgeLabel.setBounds(179, 130, 42, 20);
		p1Panel.add(p1DodgeLabel);

		p1DodgeField = new JTextPane();
		p1DodgeField.setText("100%");
		p1DodgeField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1DodgeField.setEditable(false);
		p1DodgeField.setBackground(new Color(100, 149, 237));
		p1DodgeField.setBounds(221, 130, 38, 20);
		p1Panel.add(p1DodgeField);

		p1HealthLabel = new JLabel("Health:");
		p1HealthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1HealthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1HealthLabel.setBounds(50, 70, 40, 20);
		p1Panel.add(p1HealthLabel);

		p1HealthField = new JTextPane();
		p1HealthField.setText("9999/9999");
		p1HealthField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1HealthField.setEditable(false);
		p1HealthField.setBackground(new Color(127, 255, 0));
		p1HealthField.setBounds(90, 70, 68, 20);
		p1Panel.add(p1HealthField);

		p1ResourceLabel = new JLabel("Resource:");
		p1ResourceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1ResourceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ResourceLabel.setBounds(168, 70, 60, 20);
		p1Panel.add(p1ResourceLabel);

		p1ResourceField = new JTextPane();
		p1ResourceField.setText("9999/9999");
		p1ResourceField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ResourceField.setEditable(false);
		p1ResourceField.setBackground(new Color(147, 112, 219));
		p1ResourceField.setBounds(228, 70, 68, 20);
		p1Panel.add(p1ResourceField);

		p1ResistLabel = new JLabel("Resist:");
		p1ResistLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1ResistLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ResistLabel.setBounds(138, 160, 38, 20);
		p1Panel.add(p1ResistLabel);

		p1ResistField = new JTextPane();
		p1ResistField.setText("100%");
		p1ResistField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1ResistField.setEditable(false);
		p1ResistField.setBackground(new Color(210, 180, 140));
		p1ResistField.setBounds(178, 160, 38, 20);
		p1Panel.add(p1ResistField);

		p1SpellField = new JTextPane();
		p1SpellField.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		p1SpellField.setContentType("text/html");
		p1SpellField.setText("<html><b>No Spells here!</b></html>");
		p1SpellField.setEditable(false);
		p1SpellField.setBounds(10, 190, 140, 130);
		p1Panel.add(p1SpellField);

		p1SpellLabel = new JLabel("Spell List");
		p1SpellLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1SpellLabel.setBounds(10, 174, 60, 20);
		p1Panel.add(p1SpellLabel);

		p1LevelLabel = new JLabel("Level:");
		p1LevelLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1LevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1LevelLabel.setBounds(120, 11, 36, 20);
		p1Panel.add(p1LevelLabel);

		p1LevelField = new JTextPane();
		p1LevelField.setText("99");
		p1LevelField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1LevelField.setEditable(false);
		p1LevelField.setBackground(new Color(192, 192, 192));
		p1LevelField.setBounds(156, 11, 20, 20);
		p1Panel.add(p1LevelField);

		p1RankLabel = new JLabel("Rank:");
		p1RankLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1RankLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1RankLabel.setBounds(186, 11, 34, 20);
		p1Panel.add(p1RankLabel);

		p1RankField = new JTextPane();
		p1RankField.setText("10");
		p1RankField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1RankField.setEditable(false);
		p1RankField.setBackground(new Color(143, 188, 143));
		p1RankField.setBounds(220, 10, 20, 20);
		p1Panel.add(p1RankField);

		p1EXPLabel = new JLabel("Experience:");
		p1EXPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1EXPLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1EXPLabel.setBounds(60, 40, 68, 20);
		p1Panel.add(p1EXPLabel);

		p1EXPField = new JTextPane();
		p1EXPField.setText("999999");
		p1EXPField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1EXPField.setEditable(false);
		p1EXPField.setBackground(new Color(186, 85, 211));
		p1EXPField.setBounds(128, 40, 50, 20);
		p1Panel.add(p1EXPField);

		p1MaturityLabel = new JLabel("Maturity:");
		p1MaturityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1MaturityLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1MaturityLabel.setBounds(188, 40, 58, 20);
		p1Panel.add(p1MaturityLabel);

		p1MaturityField = new JTextPane();
		p1MaturityField.setText("999999");
		p1MaturityField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1MaturityField.setEditable(false);
		p1MaturityField.setBackground(new Color(255, 140, 0));
		p1MaturityField.setBounds(246, 40, 50, 20);
		p1Panel.add(p1MaturityField);

		p1EquipmentTable = new JTable();
		p1EquipmentTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		p1EquipmentTable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p1EquipmentTable.setRowSelectionAllowed(false);
		p1EquipmentTable.setModel(new DefaultTableModel(
				new Object[][] {
						{"Head Armor", "--"},
						{"Body Armor", "--"},
						{"Leg Armor", "--"},
						{"Misc. Armor", "--"},
						{"Weapon", "--"},
				},
				new String[] {
						"Place", "Equip"
				}
				) {
			private static final long serialVersionUID = -6057135163429597989L;
			Class[] columnTypes = new Class[] {
					String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		p1EquipmentTable.getColumnModel().getColumn(0).setResizable(false);
		p1EquipmentTable.getColumnModel().getColumn(0).setMinWidth(70);
		p1EquipmentTable.getColumnModel().getColumn(1).setResizable(false);
		p1EquipmentTable.getColumnModel().getColumn(1).setMinWidth(70);
		p1EquipmentTable.setBounds(220, 240, 145, 80);
		p1Panel.add(p1EquipmentTable);

		p1EquipmentLabel = new JLabel("Equipment:");
		p1EquipmentLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1EquipmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1EquipmentLabel.setBounds(220, 220, 64, 20);
		p1Panel.add(p1EquipmentLabel);

		p1AfflictionLabel = new JLabel("Afflictions:");
		p1AfflictionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1AfflictionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1AfflictionLabel.setBounds(220, 160, 65, 20);
		p1Panel.add(p1AfflictionLabel);

		p1AfflictionField = new JTextPane();
		p1AfflictionField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p1AfflictionField.setEditable(false);
		p1AfflictionField.setContentType("text/html");
		p1AfflictionField.setText("<html><font color = \"red\">Bleeding</font>, <font color = 26824E>Poisoned</font>, <font color = 83BA2B>Dieseased</font>, <font color = C3C900>Stunned</font></html>");
		p1AfflictionField.setBounds(220, 178, 140, 45);
		p1Panel.add(p1AfflictionField);

		p2Panel = new JPanel();
		p2Panel.setLayout(null);
		p2Panel.setBackground(new Color(102, 204, 204));
		baseTab.addTab("Player 2", null, p2Panel, null);

		p2NameLabel = new JLabel("Name:");
		p2NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2NameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2NameLabel.setBounds(0, 10, 40, 20);
		p2Panel.add(p2NameLabel);

		p2NameField = new JTextPane();
		p2NameField.setText("Player 2");
		p2NameField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2NameField.setEditable(false);
		p2NameField.setBackground(new Color(153, 204, 204));
		p2NameField.setBounds(40, 10, 75, 20);
		p2Panel.add(p2NameField);

		p2ClassLabel = new JLabel("Class:");
		p2ClassLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2ClassLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ClassLabel.setBounds(250, 10, 40, 20);
		p2Panel.add(p2ClassLabel);

		p2ClassField = new JTextPane();
		p2ClassField.setText("   ");
		p2ClassField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ClassField.setEditable(false);
		p2ClassField.setBackground(new Color(153, 204, 204));
		p2ClassField.setBounds(290, 10, 75, 20);
		p2Panel.add(p2ClassField);

		p2IctusLabel = new JLabel("Ictus:");
		p2IctusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2IctusLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2IctusLabel.setBounds(50, 100, 35, 20);
		p2Panel.add(p2IctusLabel);

		p2IctusField = new JTextPane();
		p2IctusField.setText("1000");
		p2IctusField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2IctusField.setEditable(false);
		p2IctusField.setBackground(new Color(255, 69, 0));
		p2IctusField.setBounds(87, 100, 38, 20);
		p2Panel.add(p2IctusField);

		p2MensField = new JTextPane();
		p2MensField.setText("1000");
		p2MensField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2MensField.setEditable(false);
		p2MensField.setBackground(new Color(135, 206, 235));
		p2MensField.setBounds(177, 100, 38, 20);
		p2Panel.add(p2MensField);

		p2MensLabel = new JLabel("Mens:");
		p2MensLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2MensLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2MensLabel.setBounds(140, 100, 35, 20);
		p2Panel.add(p2MensLabel);

		p2ArsField = new JTextPane();
		p2ArsField.setText("1000");
		p2ArsField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ArsField.setEditable(false);
		p2ArsField.setBackground(new Color(107, 142, 35));
		p2ArsField.setBounds(258, 100, 38, 20);
		p2Panel.add(p2ArsField);

		p2ArsLabel = new JLabel("Ars:");
		p2ArsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2ArsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ArsLabel.setBounds(232, 100, 26, 20);
		p2Panel.add(p2ArsLabel);

		p2CritLabel = new JLabel("Crit:");
		p2CritLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2CritLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2CritLabel.setBounds(100, 130, 24, 20);
		p2Panel.add(p2CritLabel);

		p2CritField = new JTextPane();
		p2CritField.setText("100%");
		p2CritField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2CritField.setEditable(false);
		p2CritField.setBackground(Color.YELLOW);
		p2CritField.setBounds(126, 130, 38, 20);
		p2Panel.add(p2CritField);

		p2DodgeLabel = new JLabel("Dodge:");
		p2DodgeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2DodgeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2DodgeLabel.setBounds(179, 130, 42, 20);
		p2Panel.add(p2DodgeLabel);

		p2DodgeField = new JTextPane();
		p2DodgeField.setText("100%");
		p2DodgeField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2DodgeField.setEditable(false);
		p2DodgeField.setBackground(new Color(100, 149, 237));
		p2DodgeField.setBounds(221, 130, 38, 20);
		p2Panel.add(p2DodgeField);

		p2HealthLabel = new JLabel("Health:");
		p2HealthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2HealthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2HealthLabel.setBounds(50, 70, 40, 20);
		p2Panel.add(p2HealthLabel);

		p2HealthField = new JTextPane();
		p2HealthField.setText("9999/9999");
		p2HealthField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2HealthField.setEditable(false);
		p2HealthField.setBackground(new Color(127, 255, 0));
		p2HealthField.setBounds(90, 70, 68, 20);
		p2Panel.add(p2HealthField);

		p2ResourceLabel = new JLabel("Resource:");
		p2ResourceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2ResourceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ResourceLabel.setBounds(168, 70, 60, 20);
		p2Panel.add(p2ResourceLabel);

		p2ResourceField = new JTextPane();
		p2ResourceField.setText("9999/9999");
		p2ResourceField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ResourceField.setEditable(false);
		p2ResourceField.setBackground(new Color(147, 112, 219));
		p2ResourceField.setBounds(228, 70, 68, 20);
		p2Panel.add(p2ResourceField);

		p2ResistLabel = new JLabel("Resist:");
		p2ResistLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2ResistLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ResistLabel.setBounds(138, 160, 38, 20);
		p2Panel.add(p2ResistLabel);

		p2ResistField = new JTextPane();
		p2ResistField.setText("100%");
		p2ResistField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2ResistField.setEditable(false);
		p2ResistField.setBackground(new Color(210, 180, 140));
		p2ResistField.setBounds(178, 160, 38, 20);
		p2Panel.add(p2ResistField);

		p2SpellField = new JTextPane();
		p2SpellField.setContentType("text/html");
		p2SpellField.setText("<html><b>No Spells here!</b></html>");
		p2SpellField.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		p2SpellField.setEditable(false);
		p2SpellField.setContentType("text/html");
		p2SpellField.setBounds(10, 190, 140, 130);
		p2Panel.add(p2SpellField);

		p2SpellLabel = new JLabel("Spell List");
		p2SpellLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2SpellLabel.setBounds(10, 174, 60, 20);
		p2Panel.add(p2SpellLabel);

		p2LevelLabel = new JLabel("Level:");
		p2LevelLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2LevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2LevelLabel.setBounds(120, 11, 36, 20);
		p2Panel.add(p2LevelLabel);

		p2LevelField = new JTextPane();
		p2LevelField.setText("99");
		p2LevelField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2LevelField.setEditable(false);
		p2LevelField.setBackground(Color.LIGHT_GRAY);
		p2LevelField.setBounds(156, 11, 20, 20);
		p2Panel.add(p2LevelField);

		p2RankLabel = new JLabel("Rank:");
		p2RankLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2RankLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2RankLabel.setBounds(186, 11, 34, 20);
		p2Panel.add(p2RankLabel);

		p2RankField = new JTextPane();
		p2RankField.setText("10");
		p2RankField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2RankField.setEditable(false);
		p2RankField.setBackground(new Color(143, 188, 143));
		p2RankField.setBounds(220, 10, 20, 20);
		p2Panel.add(p2RankField);

		p2EXPLabel = new JLabel("Experience:");
		p2EXPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2EXPLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2EXPLabel.setBounds(60, 40, 68, 20);
		p2Panel.add(p2EXPLabel);

		p2EXPField = new JTextPane();
		p2EXPField.setText("999999");
		p2EXPField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2EXPField.setEditable(false);
		p2EXPField.setBackground(new Color(186, 85, 211));
		p2EXPField.setBounds(128, 40, 50, 20);
		p2Panel.add(p2EXPField);

		p2MaturityLabel = new JLabel("Maturity:");
		p2MaturityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2MaturityLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2MaturityLabel.setBounds(188, 40, 58, 20);
		p2Panel.add(p2MaturityLabel);

		p2MaturityField = new JTextPane();
		p2MaturityField.setText("999999");
		p2MaturityField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2MaturityField.setEditable(false);
		p2MaturityField.setBackground(new Color(255, 140, 0));
		p2MaturityField.setBounds(246, 40, 50, 20);
		p2Panel.add(p2MaturityField);

		p2EquipmentTable = new JTable();
		p2EquipmentTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		p2EquipmentTable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p2EquipmentTable.setRowSelectionAllowed(false);
		p2EquipmentTable.setModel(new DefaultTableModel(
				new Object[][] {
						{"Head Armor", "--"},
						{"Body Armor", "--"},
						{"Leg Armor", "--"},
						{"Misc. Armor", "--"},
						{"Weapon", "--"},
				},
				new String[] {
						"Place", "Equip"
				}
				) {
			private static final long serialVersionUID = 8066302066690166445L;
			Class[] columnTypes = new Class[] {
					String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		p2EquipmentTable.getColumnModel().getColumn(0).setResizable(false);
		p2EquipmentTable.getColumnModel().getColumn(0).setMinWidth(70);
		p2EquipmentTable.getColumnModel().getColumn(1).setResizable(false);
		p2EquipmentTable.getColumnModel().getColumn(1).setMinWidth(70);
		p2EquipmentTable.setBounds(220, 240, 145, 80);
		p2Panel.add(p2EquipmentTable);

		p2EquipmentLabel = new JLabel("Equipment:");
		p2EquipmentLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2EquipmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2EquipmentLabel.setBounds(220, 220, 64, 20);
		p2Panel.add(p2EquipmentLabel);

		p2AfflictionLabel = new JLabel("Afflictions:");
		p2AfflictionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p2AfflictionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2AfflictionLabel.setBounds(220, 160, 65, 20);
		p2Panel.add(p2AfflictionLabel);

		p2AffictionField = new JTextPane();
		p2AffictionField.setContentType("text/html");
		p2AffictionField.setText("<html><font color = \"red\">Bleeding</font>, <font color = 26824E>Poisoned</font>, <font color = 83BA2B>Dieseased</font>, <font color = C3C900>Stunned</font></html>");
		p2AffictionField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p2AffictionField.setEditable(false);
		p2AffictionField.setBounds(220, 178, 140, 45);
		p2Panel.add(p2AffictionField);

		p3Panel = new JPanel();
		p3Panel.setLayout(null);
		p3Panel.setBackground(new Color(153, 204, 153));
		baseTab.addTab("Player 3", null, p3Panel, null);

		p3NameLabel = new JLabel("Name:");
		p3NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3NameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3NameLabel.setBounds(0, 10, 40, 20);
		p3Panel.add(p3NameLabel);

		p3NameField = new JTextPane();
		p3NameField.setText("Player 3");
		p3NameField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3NameField.setEditable(false);
		p3NameField.setBackground(new Color(204, 255, 204));
		p3NameField.setBounds(40, 10, 75, 20);
		p3Panel.add(p3NameField);

		p3ClassLabel = new JLabel("Class:");
		p3ClassLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3ClassLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ClassLabel.setBounds(250, 10, 40, 20);
		p3Panel.add(p3ClassLabel);

		p3ClassField = new JTextPane();
		p3ClassField.setText("   ");
		p3ClassField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ClassField.setEditable(false);
		p3ClassField.setBackground(new Color(204, 255, 204));
		p3ClassField.setBounds(290, 10, 75, 20);
		p3Panel.add(p3ClassField);

		p3IctusLabel = new JLabel("Ictus:");
		p3IctusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3IctusLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3IctusLabel.setBounds(50, 100, 35, 20);
		p3Panel.add(p3IctusLabel);

		p3IctusField = new JTextPane();
		p3IctusField.setText("1000");
		p3IctusField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3IctusField.setEditable(false);
		p3IctusField.setBackground(new Color(255, 69, 0));
		p3IctusField.setBounds(87, 100, 38, 20);
		p3Panel.add(p3IctusField);

		p3MensField = new JTextPane();
		p3MensField.setText("1000");
		p3MensField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3MensField.setEditable(false);
		p3MensField.setBackground(new Color(135, 206, 235));
		p3MensField.setBounds(177, 100, 38, 20);
		p3Panel.add(p3MensField);

		p3MensLabel = new JLabel("Mens:");
		p3MensLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3MensLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3MensLabel.setBounds(140, 100, 35, 20);
		p3Panel.add(p3MensLabel);

		p3ArsField = new JTextPane();
		p3ArsField.setText("1000");
		p3ArsField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ArsField.setEditable(false);
		p3ArsField.setBackground(new Color(107, 142, 35));
		p3ArsField.setBounds(258, 100, 38, 20);
		p3Panel.add(p3ArsField);

		p3ArsLabel = new JLabel("Ars:");
		p3ArsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3ArsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ArsLabel.setBounds(232, 100, 26, 20);
		p3Panel.add(p3ArsLabel);

		p3CritLabel = new JLabel("Crit:");
		p3CritLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3CritLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3CritLabel.setBounds(100, 130, 24, 20);
		p3Panel.add(p3CritLabel);

		p3CritField = new JTextPane();
		p3CritField.setText("100%");
		p3CritField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3CritField.setEditable(false);
		p3CritField.setBackground(Color.YELLOW);
		p3CritField.setBounds(126, 130, 38, 20);
		p3Panel.add(p3CritField);

		p3DodgeLabel = new JLabel("Dodge:");
		p3DodgeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3DodgeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3DodgeLabel.setBounds(179, 130, 42, 20);
		p3Panel.add(p3DodgeLabel);

		p3DodgeField = new JTextPane();
		p3DodgeField.setText("100%");
		p3DodgeField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3DodgeField.setEditable(false);
		p3DodgeField.setBackground(new Color(100, 149, 237));
		p3DodgeField.setBounds(221, 130, 38, 20);
		p3Panel.add(p3DodgeField);

		p3HealthLabel = new JLabel("Health:");
		p3HealthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3HealthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3HealthLabel.setBounds(50, 70, 40, 20);
		p3Panel.add(p3HealthLabel);

		p3HealthField = new JTextPane();
		p3HealthField.setText("9999/9999");
		p3HealthField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3HealthField.setEditable(false);
		p3HealthField.setBackground(new Color(127, 255, 0));
		p3HealthField.setBounds(90, 70, 68, 20);
		p3Panel.add(p3HealthField);

		p3ResourceLabel = new JLabel("Resource:");
		p3ResourceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3ResourceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ResourceLabel.setBounds(168, 70, 60, 20);
		p3Panel.add(p3ResourceLabel);

		p3ResourceField = new JTextPane();
		p3ResourceField.setText("9999/9999");
		p3ResourceField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ResourceField.setEditable(false);
		p3ResourceField.setBackground(new Color(147, 112, 219));
		p3ResourceField.setBounds(228, 70, 68, 20);
		p3Panel.add(p3ResourceField);

		p3ResistLabel = new JLabel("Resist:");
		p3ResistLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3ResistLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ResistLabel.setBounds(138, 160, 38, 20);
		p3Panel.add(p3ResistLabel);

		p3ResistField = new JTextPane();
		p3ResistField.setText("100%");
		p3ResistField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3ResistField.setEditable(false);
		p3ResistField.setBackground(new Color(210, 180, 140));
		p3ResistField.setBounds(178, 160, 38, 20);
		p3Panel.add(p3ResistField);

		p3SpellField = new JTextPane();
		p3SpellField.setContentType("text/html");
		p3SpellField.setText("<html><b>No Spells here!</b></html>");
		p3SpellField.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		p3SpellField.setEditable(false);
		p3SpellField.setBounds(10, 190, 140, 130);
		p3Panel.add(p3SpellField);

		p3SpellLabel = new JLabel("Spell List");
		p3SpellLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3SpellLabel.setBounds(10, 174, 60, 20);
		p3Panel.add(p3SpellLabel);

		p3LevelLabel = new JLabel("Level:");
		p3LevelLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3LevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3LevelLabel.setBounds(120, 11, 36, 20);
		p3Panel.add(p3LevelLabel);

		p3LevelField = new JTextPane();
		p3LevelField.setText("99");
		p3LevelField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3LevelField.setEditable(false);
		p3LevelField.setBackground(Color.LIGHT_GRAY);
		p3LevelField.setBounds(156, 11, 20, 20);
		p3Panel.add(p3LevelField);

		p3RankLabel = new JLabel("Rank:");
		p3RankLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3RankLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3RankLabel.setBounds(186, 11, 34, 20);
		p3Panel.add(p3RankLabel);

		p3RankField = new JTextPane();
		p3RankField.setText("10");
		p3RankField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3RankField.setEditable(false);
		p3RankField.setBackground(new Color(143, 188, 143));
		p3RankField.setBounds(220, 10, 20, 20);
		p3Panel.add(p3RankField);

		p3EXPLabel = new JLabel("Experience:");
		p3EXPLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3EXPLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3EXPLabel.setBounds(60, 40, 68, 20);
		p3Panel.add(p3EXPLabel);

		p3EXPField = new JTextPane();
		p3EXPField.setText("999999");
		p3EXPField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3EXPField.setEditable(false);
		p3EXPField.setBackground(new Color(186, 85, 211));
		p3EXPField.setBounds(128, 40, 50, 20);
		p3Panel.add(p3EXPField);

		p3MaturityLabel = new JLabel("Maturity:");
		p3MaturityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3MaturityLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3MaturityLabel.setBounds(188, 40, 58, 20);
		p3Panel.add(p3MaturityLabel);

		p3MaturityField = new JTextPane();
		p3MaturityField.setText("999999");
		p3MaturityField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3MaturityField.setEditable(false);
		p3MaturityField.setBackground(new Color(255, 140, 0));
		p3MaturityField.setBounds(246, 40, 50, 20);
		p3Panel.add(p3MaturityField);

		p3EquipmentTable = new JTable();
		p3EquipmentTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		p3EquipmentTable.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		p3EquipmentTable.setRowSelectionAllowed(false);
		p3EquipmentTable.setModel(new DefaultTableModel(
				new Object[][] {
						{"Head Armor", "--"},
						{"Body Armor", "--"},
						{"Leg Armor", "--"},
						{"Misc. Armor", "--"},
						{"Weapon", "--"},
				},
				new String[] {
						"Place", "Equip"
				}
				) {
			private static final long serialVersionUID = -9094597867739158418L;
			Class[] columnTypes = new Class[] {
					String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		p3EquipmentTable.getColumnModel().getColumn(0).setResizable(false);
		p3EquipmentTable.getColumnModel().getColumn(0).setMinWidth(70);
		p3EquipmentTable.getColumnModel().getColumn(1).setResizable(false);
		p3EquipmentTable.getColumnModel().getColumn(1).setMinWidth(70);
		p3EquipmentTable.setBounds(220, 240, 145, 80);
		p3Panel.add(p3EquipmentTable);

		p3EquipmentLabel = new JLabel("Equipment:");
		p3EquipmentLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3EquipmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3EquipmentLabel.setBounds(220, 220, 64, 20);
		p3Panel.add(p3EquipmentLabel);

		p3AfflictionLabel = new JLabel("Afflictions:");
		p3AfflictionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p3AfflictionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3AfflictionLabel.setBounds(220, 160, 65, 20);
		p3Panel.add(p3AfflictionLabel);

		p3AfflictionField = new JTextPane();
		p3AfflictionField.setContentType("text/html");
		p3AfflictionField.setText("<html><font color = \"red\">Bleeding</font>, <font color = 26824E>Poisoned</font>, <font color = 83BA2B>Dieseased</font>, <font color = C3C900>Stunned</font></html>");
		p3AfflictionField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		p3AfflictionField.setEditable(false);
		p3AfflictionField.setBounds(220, 178, 140, 45);
		p3Panel.add(p3AfflictionField);

		storyDialog = new ExternalText("The Story:");
		storyDialog.setVisible(true);

		combatDialog = new ExternalText("Combat:");
		combatDialog.setVisible(true);

		partyDialog = new ExternalParty();
		partyDialog.setVisible(true);

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

		setLocationRelativeTo(null);
		Point loc = new Point(this.getX(), this.getY());

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

				p.x -= 350;
				p.y += 50;
				storyDialog.setLocation(p);

				p.x += 750;
				combatDialog.setLocation(p);

				p.y += 350;
				p.x -= 400;
				partyDialog.setLocation(p);

				storyDialog.toFront();
				combatDialog.toFront();
			}
		});

		storyDialog.setLocation(new Point(loc.x - 350, loc.y + 50));
		combatDialog.setLocation(new Point(loc.x + 400, loc.y + 50));
		partyDialog.setLocation(new Point(loc.x, loc.y + 400));

	}


}
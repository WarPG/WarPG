import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.sun.org.apache.xml.internal.security.Init;

import javafx.fxml.Initializable;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class UserInterface {

	private JFrame frame;

	private static JFrame login;
	private JTextField textField;
	private JPasswordField passwordField;
	private ImageIcon icon = new ImageIcon("C:\\Users\\Kasirga\\Desktop\\Bag.jpg","Bag");
	private String id;
	private char[] pass;
	private Character ch;
	/**
	 * Launch the application.
	 */


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					UserInterface window = new UserInterface();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		login = new JFrame();
		login.setBounds(100, 100, 328, 231);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		login.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(40, 46, 60, 14);
		login.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(40, 100, 60, 14);
		login.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(153, 43, 86, 20);
		login.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 97, 86, 20);
		login.getContentPane().add(passwordField);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Info");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(44, 143, 46, 14);
		login.getContentPane().add(lblNewLabel_2);
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setSize(589, 394);
		frame.setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel2 = new JLabel("Dialogues");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(329, 11, 235, 343);
		frame.getContentPane().add(lblNewLabel2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.BLACK);
		separator.setBounds(329, 11, 44, 343);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton2 = new JButton("Left");
		btnNewButton2.setBounds(31, 115, 89, 23);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton_1 = new JButton("Right");
		btnNewButton_1.setBounds(207, 115, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Up");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
				
			}
		});
		

		
		btnNewButton_2.setBounds(120, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Down");
		btnNewButton_3.setBounds(120, 149, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(182, 23, 47, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblCurrentPosition = new JLabel("Current Position:");
		lblCurrentPosition.setForeground(new Color(216, 191, 216));
		lblCurrentPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentPosition.setBounds(31, 23, 118, 14);
		frame.getContentPane().add(lblCurrentPosition);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 128, 128));
		separator_1.setBounds(31, 201, 265, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.setBounds(31, 214, 89, 23);
		frame.getContentPane().add(btnAttack);
		
		
		JButton btnFlee = new JButton("Flee");
		btnFlee.setBounds(207, 214, 89, 23);
		frame.getContentPane().add(btnFlee);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 128, 128));
		separator_2.setBounds(31, 248, 265, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnInventory = new JButton("BAG\r\n");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
					    "Bag consists of:\n" +
					    "A\n" +
					    "B\n" + 
					    "C\n" + 
					    "D\n" + 
					    "E\n",
					    "Bag",
					    JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnInventory.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInventory.setBounds(239, 274, 57, 68);
		frame.getContentPane().add(btnInventory);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(227, 274, 2, 68);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(128, 128, 128));
		separator_4.setBounds(31, 56, 265, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblCoin = new JLabel("Coin");
		lblCoin.setBackground(Color.ORANGE);
		lblCoin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCoin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoin.setForeground(Color.ORANGE);
		lblCoin.setBounds(163, 278, 46, 14);
		frame.getContentPane().add(lblCoin);
		
		JLabel lblNewLabel_4 = new JLabel("Dum");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setBounds(163, 321, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(147, 274, 2, 68);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(163, 303, 46, 30);
		frame.getContentPane().add(separator_6);
		
		JLabel lblG = new JLabel("222");
		lblG.setHorizontalAlignment(SwingConstants.LEFT);
		lblG.setForeground(Color.WHITE);
		lblG.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblG.setBounds(55, 300, 44, 14);
		frame.getContentPane().add(lblG);
		
		JLabel label_1 = new JLabel("268");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(55, 344, 44, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_5 = new JLabel("G:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(255, 165, 0));
		lblNewLabel_5.setBounds(31, 300, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("G:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(255, 165, 0));
		lblNewLabel_6.setBounds(31, 344, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblY.setBounds(272, 23, 47, 14);
		frame.getContentPane().add(lblY);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(216, 28, 30, 30);
		frame.getContentPane().add(separator_7);
		
		JButton btnNewButton_4 = new JButton("Show Stats");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame,
						"Dexterity:" +"\t" +  ch.getDexterity() + "\n" + 
					    "Experience:" + "\t" + ch.getExperience() + "\n" +
					    "Health:" + "\t" + ch.getHealth() + "\n" +
						"Defense:" + "\t" + ch.getDefense() + "\n" +
						"HitPoints:" + "\t" + ch.getHitPoints() + "\n" +
						"Gold:" + "\t" + ch.getGold() + "\n" +
						"Charisma:" + "\t" + ch.getCharisma() + "\n" +
						"Attack:" + "\t" + ch.getAttack() + "\n" +
						"Strength:" + "\t" + ch.getStrength() + "\n" +
						"Luck:" + "\t" + ch.getLuck() + "\n"  ,
						"Stats",
						JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnNewButton_4.setBounds(342, 11, 222, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Assuming that user entered correctly..
				lblNewLabel_2.setText("Login Success!");
				
				login.setVisible(false);
				id = textField.getText();
				pass = passwordField.getPassword();
				ch = auth(id,pass);
				lblNewLabel_4.setText("" + ch.getGold());
				lblNewLabel_3.setText("0");
				lblY.setText("0");
				login.dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(153, 139, 89, 23);
		login.getContentPane().add(btnNewButton);
		
		JButton btnUseManaPot = new JButton("Stamina Pot");
		btnUseManaPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cur = Integer.parseInt(lblNewLabel_4.getText());
				if(cur<=0){
					return;
				}
				lblNewLabel_4.setText("" + (Integer.parseInt(lblNewLabel_4.getText()) - 222));
			}
		});
		btnUseManaPot.setForeground(new Color(25, 25, 112));
		btnUseManaPot.setBounds(31, 274, 106, 23);
		frame.getContentPane().add(btnUseManaPot);
		
		
		JButton btnUseHealthPot = new JButton("Health Pot");
		btnUseHealthPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cur = Integer.parseInt(lblNewLabel_4.getText());
				if(cur<=0){
					return;
				}
				lblNewLabel_4.setText("" + (Integer.parseInt(lblNewLabel_4.getText()) - 268));
			}
		});
		btnUseHealthPot.setForeground(new Color(255, 0, 0));
		btnUseHealthPot.setBounds(31, 319, 106, 23);
		frame.getContentPane().add(btnUseHealthPot);
		
		
	}
	
	public Character auth(String id, char[] pass){
		return new Character();
	}
}

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
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.getContentPane().setLayout(null);
		frame.setSize(589, 394);
		frame.setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel2 = new JLabel("Dialogues");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(329, 11, 235, 343);
		frame.getContentPane().add(lblNewLabel2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
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
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Assuming that user entered correctly..
				lblNewLabel_2.setText("Login Success!");
				
				login.setVisible(false);
				login.dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(153, 139, 89, 23);
		login.getContentPane().add(btnNewButton);
		
		btnNewButton_2.setBounds(120, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Down");
		btnNewButton_3.setBounds(120, 149, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Dummy Pos.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(182, 23, 98, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblCurrentPosition = new JLabel("Current Position:");
		lblCurrentPosition.setForeground(new Color(220, 20, 60));
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
		
		JButton btnUseHealthPot = new JButton("Use Health Pot");
		btnUseHealthPot.setForeground(new Color(255, 0, 0));
		btnUseHealthPot.setBounds(31, 319, 108, 23);
		frame.getContentPane().add(btnUseHealthPot);
		
		JButton btnUseManaPot = new JButton("Use Mana Pot");
		btnUseManaPot.setForeground(new Color(25, 25, 112));
		btnUseManaPot.setBounds(31, 274, 108, 23);
		frame.getContentPane().add(btnUseManaPot);
		
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
					    "Inane custom dialog",
					    JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnInventory.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnInventory.setBounds(161, 274, 57, 68);
		frame.getContentPane().add(btnInventory);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(128, 128, 128));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(149, 274, 2, 68);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(128, 128, 128));
		separator_4.setBounds(31, 56, 265, 2);
		frame.getContentPane().add(separator_4);
		
		JButton btnNewButton_4 = new JButton("SHOP");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_4.setBounds(228, 274, 68, 68);
		frame.getContentPane().add(btnNewButton_4);
		
		
	}
}

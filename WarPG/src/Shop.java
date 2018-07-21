import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop window = new Shop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Shop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current item:");
		lblNewLabel.setBounds(44, 24, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(169, 129, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sell");
		btnNewButton_1.setBounds(169, 163, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel CurItem = new JLabel("Dummy item Dummy item Dummy item");
		CurItem.setBounds(144, 24, 280, 14);
		frame.getContentPane().add(CurItem);
		
		JLabel lblBag = new JLabel("Bag");
		lblBag.setHorizontalAlignment(SwingConstants.CENTER);
		lblBag.setBounds(44, 107, 102, 14);
		frame.getContentPane().add(lblBag);
		
		JLabel lblShop = new JLabel("Shop");
		lblShop.setBounds(291, 107, 89, 14);
		frame.getContentPane().add(lblShop);
		
		JLabel lblNewLabel_2 = new JLabel("Price:");
		lblNewLabel_2.setBounds(44, 60, 51, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gold");
		lblNewLabel_3.setBounds(169, 212, 32, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("6668");
		lblNewLabel_4.setBounds(212, 212, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("751");
		lblNewLabel_5.setBounds(144, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CurItem.setText(comboBox.getSelectedItem().toString());
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DummyArmor", "DummySword2", "DummyShield", "HealthPot", "ManaPot", "Dummy1", "Dummy2", "Dummy3"}));
		comboBox.setBounds(44, 130, 102, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurItem.setText(comboBox_1.getSelectedItem().toString());
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"LegendarySword", "RareArmor", "HealthPot", "CommonRing", "ManaPot"}));
		comboBox_1.setBounds(291, 130, 89, 20);
		frame.getContentPane().add(comboBox_1);
	}
}

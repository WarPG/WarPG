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
import javax.swing.JTextArea;
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
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class UserInterface {

	private static JFrame frame;

	private static JFrame login;
	private JTextField textField;
	private JPasswordField passwordField;
	private ImageIcon icon = new ImageIcon("C:\\Users\\Kasirga\\Desktop\\Bag.jpg","Bag");
	private String id;
	private String pass;
	private static Character ch;
    private static String log = "";
    private static boolean isMovable = true;
    private static boolean moveMade = false;
    
    private static JButton btnNewButton2;
    private static JButton btnNewButton_1;
    private static JButton btnNewButton_2;
    private static JButton btnNewButton_3;
    private static JButton btnNewButton_5;
    
    private static JLabel lblGold;
    private static JLabel lblX;
    private static JLabel lblY;
    
    
    static private int level = 1;
    static private int guy_x = 25, guy_y = 25;
    static private Map map = new Map();
	
    

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
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    lblX.setText("" + 25);
        lblY.setText("" + 25);
        
       
        
        JLabel lblNewLabel_3 = new JLabel("Dialogues");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(342, 25, 222, 20);
        frame.getContentPane().add(lblNewLabel_3);
        
        btnNewButton_5 = new JButton("Lvl Up");
        btnNewButton_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ch.setAttack(ch.getAttack() + 25);
        		ch.setCharisma(ch.getCharisma() + 25);
        		ch.setDefense(ch.getDefense() + 25);
        		ch.setDexterity(ch.getDexterity() + 15);
        		ch.setHitPoints(ch.getHitPoints() + 100);
        		ch.setLuck(ch.getLuck() + 5);
        		ch.setStrength(ch.getStrength() + 20);
        		System.out.println("LVL UP! EARNED BONUS STATS!");
        		btnNewButton_5.setEnabled(false);
        	}
        });
        btnNewButton_5.setEnabled(false);
        btnNewButton_5.setBounds(207, 214, 89, 23);
        frame.getContentPane().add(btnNewButton_5);
        
		runGame();
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
		lblNewLabel_2.setBounds(44, 143, 60, 14);
		login.getContentPane().add(lblNewLabel_2);
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setSize(589, 394);
		frame.setLocationRelativeTo(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.BLACK);
		separator.setBounds(329, 11, 44, 343);
		frame.getContentPane().add(separator);
		
		btnNewButton2 = new JButton("Left");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isMovable = true;
				buttonsDisable();
				guy_x--;
				lblX.setText("" + guy_x);
			}
		});
		btnNewButton2.setBounds(31, 115, 89, 23);
		frame.getContentPane().add(btnNewButton2);
		
		btnNewButton_1 = new JButton("Right");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isMovable = true;
				buttonsDisable();
				guy_x++;
				lblX.setText("" + guy_x);
			}
		});
		btnNewButton_1.setBounds(207, 115, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Up");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isMovable = true;
				buttonsDisable();
				guy_y++;
				lblY.setText("" + guy_y);
		
				
			}
		});
		

		
		btnNewButton_2.setBounds(120, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Down");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isMovable = true;
				buttonsDisable();
				guy_y--;
				lblY.setText("" + guy_y);
			}
		});
		btnNewButton_3.setBounds(120, 149, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setBounds(182, 23, 47, 14);
		frame.getContentPane().add(lblX);
		
		JLabel lblCurrentPosition = new JLabel("Current Position:");
		lblCurrentPosition.setForeground(new Color(216, 191, 216));
		lblCurrentPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentPosition.setBounds(31, 23, 118, 14);
		frame.getContentPane().add(lblCurrentPosition);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 128, 128));
		separator_1.setBounds(31, 201, 265, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 128, 128));
		separator_2.setBounds(31, 248, 265, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnInventory = new JButton("BAG\r\n");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				for(Item i : ch.getBag().items)
				{
					msg = msg + i + "\n";
				}
				JOptionPane.showMessageDialog(frame, msg, "Bag",
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
		
		lblGold = new JLabel("Dum");
		lblGold.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGold.setHorizontalAlignment(SwingConstants.CENTER);
		lblGold.setForeground(Color.ORANGE);
		lblGold.setBounds(163, 321, 46, 14);
		frame.getContentPane().add(lblGold);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(147, 274, 2, 68);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(163, 303, 46, 30);
		frame.getContentPane().add(separator_6);
		
		JLabel label_1 = new JLabel("268");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(55, 322, 44, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_6 = new JLabel("G:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(255, 165, 0));
		lblNewLabel_6.setBounds(31, 322, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblY = new JLabel("Y");
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
		btnNewButton_4.setBounds(31, 214, 106, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				id = textField.getText();
				pass = passwordField.getText();
				ch = Character.getCharacter(id, pass);
				//ch = getCharacter(id, pass.toCharArray());
				if(ch!=null)
				{
					//Assuming that user entered correctly..
					lblNewLabel_2.setText("Login Success!");
					login.setVisible(false);
					lblGold.setText("" + ch.getGold());
					lblX.setText("0");
					lblY.setText("0");
					login.dispose();
					frame.setVisible(true);
					 ch.setHealth(2000);
					  ch.getBag().items.add(new Item(1,1,1,1,""));
				        ch.getBag().items.add(new Item(1,1,1,2,""));
				        ch.getBag().items.add(new Item(1,1,1,3,""));
				        ch.getBag().items.add(new Item(1,1,1,4,""));
				        ch.getBag().items.add(new Item(1,1,1,5,""));
				        ch.getBag().items.add(new Item(1,1,1,6,""));
				        ch.getBag().items.add(new Item(1,1,1,7,""));
				        ch.getBag().items.add(new Item(1,1,1,8,""));
				    ch.setDefense(40);
				    ch.setDexterity(40);
				    ch.setAttack(165);
				    ch.setExperience(375);
				}else{
					if (JOptionPane.showConfirmDialog(null, "No user found with given ID!\nWould you like to create a new one?", "Authentication",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					    ch = Character.newCharacter(id, pass, "newUser");
					} else {
					    return;
					}
					lblNewLabel_2.setText("Try again!");
					return;
				}
				
			}
		});
		btnNewButton.setBounds(153, 139, 89, 23);
		login.getContentPane().add(btnNewButton);
		
		
		JButton btnUseHealthPot = new JButton("Health Pot");
		btnUseHealthPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cur = Integer.parseInt(lblGold.getText());
				if(cur<268){
					return;
				}
				lblGold.setText("" + (Integer.parseInt(lblGold.getText()) - 268));
				ch.setHealth(ch.getHealth()+200);
				System.out.print("Health potion used! +200HP");
			}
		});
		btnUseHealthPot.setForeground(new Color(255, 0, 0));
		btnUseHealthPot.setBounds(31, 274, 106, 30);
		frame.getContentPane().add(btnUseHealthPot);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 56, 222, 287);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setLineWrap(true);
		textArea_1.setCaretPosition(textArea_1.getDocument().getLength());
		
	    PrintStream printStream = new PrintStream(new CustomOutputStream(textArea_1));
	    System.setOut(printStream);
	    
	    
	    

	    
	    
		
		
	}
	public Character getCharacter(String id, char[] password){
		return new Character();
	}
	
    public static void runGame(){
        log = "Hello Adventurer, this is the beginning of the game... ENJOY!";
        System.out.println(log);
        
      
        

        int go = -1;
        while(1==1){
        	
        	isMovable = true;
        	
        	buttonsEnable();
        	
        	isMovable = false;
        	
        	while(true){
        		if(isMovable)
        			break;
        	}
        	
            buttonsDisable();
        	
            if (map.get(guy_x, guy_y) == 0){
                log = "You walked, there was nothing there.";
                System.out.println(log);
            }else if (map.get(guy_x, guy_y) == 1){
                log = "Enemy!";
                System.out.println(log);
                Mob mob = new Mob(level, guy_x, guy_y);
                combat(mob);
                map.combatOver(guy_x, guy_y);
            }else if (map.get(guy_x, guy_y) == 10){
                log = "item";
                int r = (int)(Math.random()*4);
                switch(r){
                case 0:
                	Wearable w = new Wearable();
                	grab(w);
                	break;
                case 1:
                	Weapon wp = new Weapon();
                	grab(wp);
                	break;
                case 2:
                	Armor a = new Armor();
                	grab(a);
                	break;
                case 3:
                	Accessory ac = new Accessory();
                	grab(ac);
                }
                System.out.println(log);
            }else if (map.get(guy_x, guy_y) == -1){
                log = "next level";
                System.out.println(log);
                level++;
                guy_x = 25;
                guy_y = 25;
                map = new Map();
            }else if (map.get(guy_x, guy_y) < -1){
                log = "what";
                System.exit(0);
            }
            
            Character.updateCharacter(ch);

        }

    }

    private static int combat(Mob mob) {
        Random r = new Random();
        int potion = 0;
        boolean turn = true;
        int pos = r.nextInt(9) + 1;
        if (pos > 5) {
            log = "You see a monster. Attack him!";
            System.out.println(log);
        } else {
            log = "HE IS SO CLOSE AAGGHHH!";
            System.out.println(log);
            turn = false;
        }
        
        while (ch.getHealth() > 0 && mob.getHealth() > 0) {
        	System.out.println("Hero remaining health:" + ch.getHealth());
            System.out.println("Enemy remaining health:" + mob.getHealth());
            System.out.println("***************");

            if (turn) {
                int str = ch.getStrength();
                int roll = r.nextInt(100) + 1;

                if (roll < 80 + (ch.getAttack() - mob.getDefence())) {
                    if (roll >= 98) {
                        log = "You hit mob for " + ch.getStrength()*2 + " damage";
                        //System.out.println(log);
                        mob.setHealth(mob.getHealth() - 2 * ch.getStrength());
                    } else {
                        log = "You hit mob for " + ch.getStrength() + " damage";
                        //System.out.println(log);
                        mob.setHealth(mob.getHealth() - ch.getStrength());
                    }
                }else{
                	log = "You tried to hit mob but failed";
                }
                
                System.out.println(log);
                turn = false;
            } else {
                int roll = r.nextInt(100) + 1;

                if (roll < 80 + (mob.getAttack() - ch.getDefense())) {
                    if (roll == 100) {
                    	log = "Enemy hit you for " + ch.getStrength()*2 + " damage";
                        //System.out.println(log);
                        ch.setHealth(ch.getHealth() - 2 * mob.getStrength());
                    } else {
                    	log = "Enemy hit you for " + ch.getStrength() + " damage";
                       //System.out.println(log);
                        ch.setHealth(ch.getHealth() - mob.getStrength());
                    }
                }else
                {
                	log = "Enemy tried to hit you but failed";
                }
                
                System.out.println(log);
                turn = true;
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if (ch.getHealth() <= 0) {
            log = "Ur dead bro";
            System.out.println(log);
            frame.setEnabled(false);
        }else{
        	int str = mob.getStrength();
            log = "You killed it!\n";
            log = log + "Here's some exp and gold!\n";
            ch.setExperience(ch.getExperience() + str/2);
            ch.setGold(ch.getGold() + str);
            lblGold.setText(Integer.parseInt(lblGold.getText()) + ch.getGold() + "");
            if(ch.getExperience()>400){
            	btnNewButton_5.setEnabled(true);
            	ch.setExperience(ch.getExperience() - 400);
            }
            System.out.println(log);
        }

        return 0;
    }
    
    private static void buttonsDisable(){
        btnNewButton2.setEnabled(false);
        btnNewButton_1.setEnabled(false);
        btnNewButton_2.setEnabled(false);
        btnNewButton_3.setEnabled(false);
    }
    private static void buttonsEnable(){
        btnNewButton2.setEnabled(true);
        btnNewButton_1.setEnabled(true);
        btnNewButton_2.setEnabled(true);
        btnNewButton_3.setEnabled(true);
    }
    private static void levelup(){
        // USE GETTERS AND SETTERS FOR CHANGING THEM
    }
    private static void grab(Item item){
        log = "You found an item. Its " + item;
        System.out.println(log);
        log = "Do you wanna have it?" ;
        System.out.println(log);
        if (JOptionPane.showConfirmDialog(null, "An item has been found!\n"+ item + "\nWould you like to equip it?", "Item drop",
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // If yes send it to bag
            if (item.isArmor())
                ch.wearArmor((Armor)item);
            if (item.isWeapon())
                ch.wearWeapon( (Weapon)item );
            if (item.isAccessory())
                ch.wearAccessory((Accessory)(item));
            if (item.isWearable())
                ch.wearWearable((Wearable)(item));
		} 

        else {
        	 // if no get money fuck bitches
            ch.setGold(ch.getGold() + item.getPrice()*ch.getCharisma()/10);
            lblGold.setText("" + ch.getGold());
		}
       

    }
}

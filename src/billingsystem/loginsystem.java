package billingsystem;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import billingsystem.billingsystem.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class loginsystem extends JFrame implements ActionListener{

	private JFrame frame1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private ImageIcon kitchen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginsystem window = new loginsystem();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame("MALHOTRA'S KITCHEN FAMILY RESTUARANT");
		frame1.getContentPane().setBackground(new Color(240, 255, 240));
		frame1.setVisible(true);
		frame1.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(this);
		
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 20));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(1169, 518, 193, 49);
		frame1.getContentPane().add(btnNewButton);
		
		JLabel lblMalhotrasKitchenFamily = new JLabel("MALHOTRA'S KITCHEN FAMILY RESTAURANT");
		lblMalhotrasKitchenFamily.setForeground(new Color(128, 0, 128));
		lblMalhotrasKitchenFamily.setFont(new Font("Verdana", Font.BOLD, 50));
		lblMalhotrasKitchenFamily.setBounds(379, 37, 1276, 45);
		frame1.getContentPane().add(lblMalhotrasKitchenFamily);
		
		JButton btnCreateAnAccount = new JButton("CREATE");
		btnCreateAnAccount.addActionListener(this);
		btnCreateAnAccount.setForeground(Color.WHITE);
		btnCreateAnAccount.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCreateAnAccount.setFocusable(false);
		btnCreateAnAccount.setBackground(Color.BLACK);
		btnCreateAnAccount.setBounds(1599, 860, 207, 49);
		frame1.getContentPane().add(btnCreateAnAccount);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Verdana", Font.BOLD, 18));
		lblUsername.setBounds(1120, 257, 149, 32);
		frame1.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 18));
		lblPassword.setBounds(1120, 366, 149, 32);
		frame1.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.BOLD, 18));
		textField.setBounds(1122, 302, 288, 37);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblForLoginPlease = new JLabel("LOGIN PLEASE ENTER YOUR DETAILS.");
		lblForLoginPlease.setForeground(new Color(184, 134, 11));
		lblForLoginPlease.setFont(new Font("Verdana", Font.BOLD, 17));
		lblForLoginPlease.setBounds(1110, 212, 369, 32);
		frame1.getContentPane().add(lblForLoginPlease);
		
		JLabel lblForCreatingAn = new JLabel("PLEASE ENTER DETAILS");
		lblForCreatingAn.setForeground(new Color(128, 128, 0));
		lblForCreatingAn.setFont(new Font("Verdana", Font.BOLD, 17));
		lblForCreatingAn.setBounds(1528, 212, 238, 32);
		frame1.getContentPane().add(lblForCreatingAn);
		
		JLabel label = new JLabel("USERNAME");
		label.setFont(new Font("Verdana", Font.BOLD, 18));
		label.setBounds(1531, 257, 149, 32);
		frame1.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("PASSWORD");
		label_1.setFont(new Font("Verdana", Font.BOLD, 18));
		label_1.setBounds(1521, 366, 149, 32);
		frame1.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.BOLD, 17));
		passwordField.setBounds(1122, 426, 288, 37);
		frame1.getContentPane().add(passwordField);
		
		JLabel lblEmailid = new JLabel("EMAIL-ID");
		lblEmailid.setFont(new Font("Verdana", Font.BOLD, 18));
		lblEmailid.setBounds(1521, 496, 149, 32);
		frame1.getContentPane().add(lblEmailid);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Verdana", Font.BOLD, 18));
		lblAddress.setBounds(1528, 622, 149, 32);
		frame1.getContentPane().add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Verdana", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(1521, 302, 366, 37);
		frame1.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Verdana", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(1521, 425, 366, 37);
		frame1.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Verdana", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(1520, 541, 367, 37);
		frame1.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Verdana", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(1521, 685, 366, 37);
		frame1.getContentPane().add(textField_5);
		
		kitchen=new ImageIcon(this.getClass().getResource("/KITCHEN.png"));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 107, 1398, 926);
		lblNewLabel.setIcon(kitchen);
		frame1.getContentPane().add(lblNewLabel);
		frame1.setBounds(0, 0, 1920, 1080);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       String s = e.getActionCommand();
        
       // dikkat yaha se leke 
       
       
       if(s.equals("LOGIN"))
       {
           String user=textField.getText();
           String pass=passwordField.getText();
           
           try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra ", "java", "java"); // Connection build
                PreparedStatement pst = null; 
                ResultSet rs;
                String check="Select * from CREATEACCOUNT where USERNAME=?";
                pst=con.prepareStatement(check);
                pst.setString(1, user);
                rs=pst.executeQuery();
                
                if(rs.next()){
                    String password=rs.getString("PASSWORD");
                    if(pass.equals(password)){
                
                        billingsystem bs=new billingsystem();
                        dispose();
                       
                        passwordField.setText("");
                        
                        
                        
                    } else{
                        JOptionPane.showMessageDialog(null,"INVALID USRENAME or PASSWORD","MALHOTRA-KITCHEN",JOptionPane.OK_OPTION);
                    }
                 
                   // yaha takk 
                    
                }
                
               
           }catch(Exception ex){System.out.println("");};
       }
      
        if(s.equals("CREATE"))
        {
            
         try{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/malhotra ", "java", "java"); // Connection build
            PreparedStatement pst = null; //complex queries
            // Statement st = null; simple (Select * from table where name = "sachin")
            String q = "insert into CREATEACCOUNT values (?,?,?,?)"; // Sql Query
            pst = con.prepareStatement(q); 
            pst.setString(1,textField_1.getText() );
            pst.setString(2, textField_2.getText());
            pst.setString(3, textField_3.getText());
            pst.setString(4, textField_5.getText());
             int a = pst.executeUpdate();//Executing SQL
            JOptionPane.showMessageDialog(null,"ACCOUNT CREATED SUCESSFULLY","MALHOTRA-KITCHEN",JOptionPane.OK_OPTION);
            pst.close();
            con.close(); // Close Connection*/
        }
        catch(Exception ex){System.out.println(ex);};
        }
        
            
        } 
      
      
       
    }


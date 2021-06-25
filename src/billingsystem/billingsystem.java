package billingsystem;

import billingsystem.loginsystem.*;
import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class billingsystem extends loginsystem{

	private JFrame frame;
	int NormalThali,DeluxThsli,PunjabiThali,Fries,Pizza,Manchurian;
	int Chowmein,Burger,SpringRolls;
	private  ImageIcon logor,logor2;
	int Chocolate,vanila,Mango;
	int Strawberry,Cheeku,Banana;
	int GolGappe,DahiBhalle,ChaatPapdi;
	int Fried,Tandoori,Malai;
	int roti,naan,aaloP,gobiP,PaneerP;
	int Idli,Dosa,Uttappam;
	int PaneerL,PaneerS,PaneerT,PaneerM;
	int Kadhai,Lemon,Butter;
	int Coke,Mirinda,Pepsi;
	int NormalS,GrilledS,CheeseS,GrilledN;
	int Haryali,MalaiC,MalaiTikka;
	int KadhaiC,LemonC,NormalC;
	int Tea,Coffee,Soup;
	private JTextField textField;
	double tax,netTotal,discount;
	
	Font f1,f2;
	JTextArea txtrArea;
	JRadioButton rdbtnNormalThali;
	JRadioButton rdbtnFries;
	JRadioButton rdbtnChowmein;
	JRadioButton rdbtnBurger;
	JRadioButton rdbtnManchurian;
	JRadioButton rdbtnSpringRolls;
	JRadioButton rdbtnChocate;
	JRadioButton rdbtnDeluxThsli;
	JRadioButton rdbtnPizza ;
	JRadioButton rdbtnPunjabiThali ;
	JRadioButton JrdbtnChocate;
	JRadioButton  rdbtnMango;
	JRadioButton  rdbtnVanila;
	JRadioButton rdbtnStrawberry;
	JRadioButton  rdbtnCheeku ;
	JRadioButton rdbtnSoups  ;
	JRadioButton  rdbtnCoffee ;
	JRadioButton FriedChicken;
	JRadioButton  rdbtnTea;
	JRadioButton  rdbtnBanana;
	JRadioButton rdbtnFriedChicken;
	JRadioButton rdbtnTandooriChicken;
	JRadioButton rdbtnMalaiChicken;
	JRadioButton rdbtnKadhaiChicken;
	JRadioButton rdbtnLemonChicken;
	JRadioButton rdbtnButterChicken;
	JRadioButton rdbtnHaryaliChaamp;
	JRadioButton rdbtnMalaiTikkaChaamp;
	JRadioButton rdbtnChaatPapdi;
	JRadioButton rdbtnLemonChaamp;
	JRadioButton rdbtnIdliSambhar;
	JRadioButton rdbtnSambharDosa;
	JRadioButton rdbtnGolGappe;
	JRadioButton rdbtnDahiBhalle;
	JRadioButton rdbtnNormalSandwich;
	JRadioButton rdbtnGrilledSandwich;
	JRadioButton JrdbtnGrilledCheese;
	JRadioButton rdbtnUttappam;
	JRadioButton rdbtnNormalChaamp;
	JRadioButton rdbtnKadhaiChaamp;
	JRadioButton rdbtnMalaiChaamp ;
	JRadioButton rdbtnGrilledCheese;
	JRadioButton rdbtnGrilledNonVeg ;
	JRadioButton rdbtnPanneerLabalabonePlate;
	JRadioButton  rdbtnMatarPanner;
	JRadioButton rdbtnPannerTikka;
	JRadioButton rdbtnCoke;
	JRadioButton rdbtnMirinda;
	JRadioButton rdbtnPepsi;
	JRadioButton  rdbtnShaahiPanner;
	
	JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingsystem window = new billingsystem();
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
	public billingsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblRestuarantBillingSystem = new JLabel("RESTAURANT BILLING SYSTEM");
		lblRestuarantBillingSystem.setForeground(new Color(210, 105, 30));
		lblRestuarantBillingSystem.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		lblRestuarantBillingSystem.setBounds(767, 71, 290, 40);
		frame.getContentPane().add(lblRestuarantBillingSystem);
		
		JLabel lblMalhotrasKitchenFamily = new JLabel("MALHOTRA'S KITCHEN FAMILY RESTAURANT");
		lblMalhotrasKitchenFamily.setForeground(new Color(0, 128, 0));
		lblMalhotrasKitchenFamily.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
		lblMalhotrasKitchenFamily.setBounds(296, 13, 1276, 45);
		frame.getContentPane().add(lblMalhotrasKitchenFamily);
		logor=new ImageIcon(this.getClass().getResource("/food.jpg"));
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 13, 272, 434);
		lblNewLabel.setIcon(logor);
		frame.getContentPane().add(lblNewLabel);
		logor2=new ImageIcon(this.getClass().getResource("/food2.jpeg"));
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(12, 449, 272, 584);
		lblNewLabel_1.setIcon(logor2);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFromTheThalis = new JLabel("FROM THE THALI'S");
		lblFromTheThalis.setFont(new Font("Verdana", Font.BOLD, 16));
		lblFromTheThalis.setBounds(317, 113, 181, 34);
		frame.getContentPane().add(lblFromTheThalis);
		
		 rdbtnNormalThali = new JRadioButton("Normal thali");
	
		rdbtnNormalThali.setBackground(Color.WHITE);
		rdbtnNormalThali.setBounds(358, 156, 127, 25);
		frame.getContentPane().add(rdbtnNormalThali);
		
		rdbtnDeluxThsli = new JRadioButton("Delux Thali");
		
		rdbtnDeluxThsli.setBackground(Color.WHITE);
		rdbtnDeluxThsli.setBounds(358, 186, 127, 25);
		frame.getContentPane().add(rdbtnDeluxThsli);
		
		rdbtnPunjabiThali = new JRadioButton("Punjabi Thali");
	
		rdbtnPunjabiThali.setBackground(Color.WHITE);
		rdbtnPunjabiThali.setBounds(358, 218, 127, 25);
		frame.getContentPane().add(rdbtnPunjabiThali);
		
		JLabel lblFromChineseCorner = new JLabel("FROM CHINESE CORNER");
		lblFromChineseCorner.setFont(new Font("Verdana", Font.BOLD, 16));
		lblFromChineseCorner.setBounds(524, 113, 229, 34);
		frame.getContentPane().add(lblFromChineseCorner);
		
		rdbtnFries = new JRadioButton("Fries");
	
		rdbtnFries.setBackground(Color.WHITE);
		rdbtnFries.setBounds(525, 156, 109, 25);
		frame.getContentPane().add(rdbtnFries);
		
		rdbtnPizza = new JRadioButton("Pizza");
	
		rdbtnPizza.setBackground(Color.WHITE);
		rdbtnPizza.setBounds(525, 186, 109, 25);
		frame.getContentPane().add(rdbtnPizza);
		
		rdbtnManchurian = new JRadioButton("Manchurian");
	
		rdbtnManchurian.setBackground(Color.WHITE);
		rdbtnManchurian.setBounds(525, 218, 109, 25);
		frame.getContentPane().add(rdbtnManchurian);
		
		rdbtnChowmein = new JRadioButton("Chowmein");
	
		rdbtnChowmein.setBackground(Color.WHITE);
		rdbtnChowmein.setBounds(639, 156, 127, 25);
		frame.getContentPane().add(rdbtnChowmein);
		
		rdbtnBurger = new JRadioButton("Burger");
		
		rdbtnBurger.setBackground(Color.WHITE);
		rdbtnBurger.setBounds(639, 189, 127, 25);
		frame.getContentPane().add(rdbtnBurger);
		
		rdbtnSpringRolls = new JRadioButton("Spring Rolls");
	
		rdbtnSpringRolls.setBackground(Color.WHITE);
		rdbtnSpringRolls.setBounds(639, 218, 127, 25);
		frame.getContentPane().add(rdbtnSpringRolls);
		
		JLabel lblFramShakes = new JLabel("FROM SHAKES");
		lblFramShakes.setFont(new Font("Verdana", Font.BOLD, 16));
		lblFramShakes.setBounds(804, 113, 132, 34);
		frame.getContentPane().add(lblFramShakes);
		
		rdbtnChocate = new JRadioButton("Chocolate");
		
		rdbtnChocate.setBackground(Color.WHITE);
		rdbtnChocate.setBounds(787, 156, 85, 25);
		frame.getContentPane().add(rdbtnChocate);
		
		 rdbtnMango = new JRadioButton("Mango");
		 
		
		rdbtnMango.setBackground(Color.WHITE);
		rdbtnMango.setBounds(787, 189, 82, 25);
		frame.getContentPane().add(rdbtnMango);
		
		 rdbtnVanila = new JRadioButton("Vanila");
	
		rdbtnVanila.setBackground(Color.WHITE);
		rdbtnVanila.setBounds(787, 219, 82, 25);
		frame.getContentPane().add(rdbtnVanila);
		
		 rdbtnStrawberry = new JRadioButton("Strawberry");
	
		rdbtnStrawberry.setBackground(Color.WHITE);
		rdbtnStrawberry.setBounds(870, 156, 100, 25);
		frame.getContentPane().add(rdbtnStrawberry);
		
		 rdbtnCheeku = new JRadioButton("Cheeku");
		
		rdbtnCheeku.setBackground(Color.WHITE);
		rdbtnCheeku.setBounds(870, 189, 75, 25);
		frame.getContentPane().add(rdbtnCheeku);
		
		 rdbtnBanana = new JRadioButton("Banana");
	
		rdbtnBanana.setBackground(Color.WHITE);
		rdbtnBanana.setBounds(870, 218, 75, 25);
		frame.getContentPane().add(rdbtnBanana);
		
		JLabel lblHotDrinks = new JLabel("HOT DRINKS");
		lblHotDrinks.setFont(new Font("Verdana", Font.BOLD, 16));
		lblHotDrinks.setBounds(972, 113, 114, 34);
		frame.getContentPane().add(lblHotDrinks);
		
		 rdbtnTea = new JRadioButton("Tea");
	
		rdbtnTea.setBackground(Color.WHITE);
		rdbtnTea.setBounds(1000, 156, 100, 25);
		frame.getContentPane().add(rdbtnTea);
		
		 rdbtnCoffee = new JRadioButton("Coffee");
	
		rdbtnCoffee.setBackground(Color.WHITE);
		rdbtnCoffee.setBounds(1000, 186, 100, 25);
		frame.getContentPane().add(rdbtnCoffee);
		
		rdbtnSoups = new JRadioButton("Soups");
		
		rdbtnSoups.setBackground(Color.WHITE);
		rdbtnSoups.setBounds(1000, 218, 100, 25);
		frame.getContentPane().add(rdbtnSoups);
		
		JLabel lblSnacksCorner = new JLabel("SNACKS CORNER");
		lblSnacksCorner.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSnacksCorner.setBounds(317, 262, 181, 34);
		frame.getContentPane().add(lblSnacksCorner);
		
		JLabel lblNonvegCorner = new JLabel("NON-VEG CORNER");
		lblNonvegCorner.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNonvegCorner.setBounds(535, 262, 181, 34);
		frame.getContentPane().add(lblNonvegCorner);
		
		JLabel lblTastyChaamps = new JLabel("TASTY CHAAMPS");
		lblTastyChaamps.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTastyChaamps.setBounds(764, 262, 181, 34);
		frame.getContentPane().add(lblTastyChaamps);
		
		JLabel lblSouthIndianCorner = new JLabel("SOUTH INDIAN CORNER");
		lblSouthIndianCorner.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSouthIndianCorner.setBounds(958, 262, 234, 34);
		frame.getContentPane().add(lblSouthIndianCorner);
		
		rdbtnFriedChicken = new JRadioButton("Fried Chicken");
	
		rdbtnFriedChicken.setBackground(Color.WHITE);
		rdbtnFriedChicken.setBounds(555, 299, 127, 25);
		frame.getContentPane().add(rdbtnFriedChicken);
		
		rdbtnTandooriChicken = new JRadioButton("Tandoori Chicken");
	
		rdbtnTandooriChicken.setBackground(Color.WHITE);
		rdbtnTandooriChicken.setBounds(555, 329, 127, 25);
		frame.getContentPane().add(rdbtnTandooriChicken);
		
		rdbtnMalaiChicken = new JRadioButton("Malai Chicken");
	
		rdbtnMalaiChicken.setBackground(Color.WHITE);
		rdbtnMalaiChicken.setBounds(555, 359, 127, 25);
		frame.getContentPane().add(rdbtnMalaiChicken);
		
		rdbtnKadhaiChicken = new JRadioButton("Kadhai Chicken");
	
		rdbtnKadhaiChicken.setBackground(Color.WHITE);
		rdbtnKadhaiChicken.setBounds(555, 389, 127, 25);
		frame.getContentPane().add(rdbtnKadhaiChicken);
		
		rdbtnLemonChicken = new JRadioButton("Lemon Chicken");
	
		rdbtnLemonChicken.setBackground(Color.WHITE);
		rdbtnLemonChicken.setBounds(555, 419, 127, 25);
		frame.getContentPane().add(rdbtnLemonChicken);
		
		rdbtnButterChicken = new JRadioButton("Butter Chicken");
	
		rdbtnButterChicken.setBackground(Color.WHITE);
		rdbtnButterChicken.setBounds(555, 451, 127, 25);
		frame.getContentPane().add(rdbtnButterChicken);
		
		rdbtnHaryaliChaamp = new JRadioButton("Haryali chaamp");
	
		rdbtnHaryaliChaamp.setBackground(Color.WHITE);
		rdbtnHaryaliChaamp.setBounds(782, 299, 127, 25);
		frame.getContentPane().add(rdbtnHaryaliChaamp);
		
		rdbtnMalaiChaamp = new JRadioButton("Malai Chaamp");
	
		rdbtnMalaiChaamp.setBackground(Color.WHITE);
		rdbtnMalaiChaamp.setBounds(782, 329, 127, 25);
		frame.getContentPane().add(rdbtnMalaiChaamp);
		
		rdbtnMalaiTikkaChaamp = new JRadioButton("Malai Tikka chaamp");
	
		rdbtnMalaiTikkaChaamp.setBackground(Color.WHITE);
		rdbtnMalaiTikkaChaamp.setBounds(782, 359, 141, 25);
		frame.getContentPane().add(rdbtnMalaiTikkaChaamp);
		
		 rdbtnKadhaiChaamp = new JRadioButton("Kadhai Chaamp");
	
		rdbtnKadhaiChaamp.setBackground(Color.WHITE);
		rdbtnKadhaiChaamp.setBounds(782, 389, 127, 25);
		frame.getContentPane().add(rdbtnKadhaiChaamp);
		
		rdbtnLemonChaamp = new JRadioButton("Lemon Chaamp");
	
		rdbtnLemonChaamp.setBackground(Color.WHITE);
		rdbtnLemonChaamp.setBounds(782, 419, 127, 25);
		frame.getContentPane().add(rdbtnLemonChaamp);
		
		rdbtnNormalChaamp = new JRadioButton("Normal Chaamp");
	
		rdbtnNormalChaamp.setBackground(Color.WHITE);
		rdbtnNormalChaamp.setBounds(782, 449, 127, 25);
		frame.getContentPane().add(rdbtnNormalChaamp);
		
		rdbtnUttappam = new JRadioButton("Uttappam");
	
		rdbtnUttappam.setBackground(Color.WHITE);
		rdbtnUttappam.setBounds(993, 359, 127, 25);
		frame.getContentPane().add(rdbtnUttappam);
		
		rdbtnIdliSambhar = new JRadioButton("Idli sambhar");
	
		rdbtnIdliSambhar.setBackground(Color.WHITE);
		rdbtnIdliSambhar.setBounds(993, 305, 127, 25);
		frame.getContentPane().add(rdbtnIdliSambhar);
		
		rdbtnSambharDosa = new JRadioButton("Sambhar Dosa");
		
		rdbtnSambharDosa.setBackground(Color.WHITE);
		rdbtnSambharDosa.setBounds(993, 335, 127, 25);
		frame.getContentPane().add(rdbtnSambharDosa);
		
		rdbtnGolGappe = new JRadioButton("Gol Gappe");
	
		rdbtnGolGappe.setBackground(Color.WHITE);
		rdbtnGolGappe.setBounds(327, 305, 127, 25);
		frame.getContentPane().add(rdbtnGolGappe);
		
		rdbtnDahiBhalle = new JRadioButton("Dahi Bhalle");
	
		rdbtnDahiBhalle.setBackground(Color.WHITE);
		rdbtnDahiBhalle.setBounds(327, 329, 127, 25);
		frame.getContentPane().add(rdbtnDahiBhalle);
		
		rdbtnChaatPapdi = new JRadioButton("Chaat Papdi");

		rdbtnChaatPapdi.setBackground(Color.WHITE);
		rdbtnChaatPapdi.setBounds(327, 359, 127, 25);
		frame.getContentPane().add(rdbtnChaatPapdi);
		
		JLabel lblSandwiches = new JLabel("SANDWICHES");
		lblSandwiches.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSandwiches.setBounds(317, 501, 181, 34);
		frame.getContentPane().add(lblSandwiches);
		
		JLabel lblRotis = new JLabel("ROTIS");
		lblRotis.setFont(new Font("Verdana", Font.BOLD, 16));
		lblRotis.setBounds(317, 663, 181, 34);
		frame.getContentPane().add(lblRotis);
		
		JLabel lblPanners = new JLabel("PANNER'S");
		lblPanners.setFont(new Font("Verdana", Font.BOLD, 16));
		lblPanners.setBounds(524, 663, 109, 34);
		frame.getContentPane().add(lblPanners);
		
		rdbtnNormalSandwich = new JRadioButton("Normal sandwich");
		
		rdbtnNormalSandwich.setBackground(Color.WHITE);
		rdbtnNormalSandwich.setBounds(327, 544, 127, 25);
		frame.getContentPane().add(rdbtnNormalSandwich);
		
		rdbtnGrilledSandwich = new JRadioButton("Grilled sandwich");
	
		rdbtnGrilledSandwich.setBackground(Color.WHITE);
		rdbtnGrilledSandwich.setBounds(327, 574, 127, 25);
		frame.getContentPane().add(rdbtnGrilledSandwich);
		
		rdbtnGrilledCheese = new JRadioButton("Grilled Cheese");
		
		rdbtnGrilledCheese.setBackground(Color.WHITE);
		rdbtnGrilledCheese.setBounds(327, 604, 127, 25);
		frame.getContentPane().add(rdbtnGrilledCheese);
		
		rdbtnGrilledNonVeg = new JRadioButton("Grilled Non veg");
	
		rdbtnGrilledNonVeg.setBackground(Color.WHITE);
		rdbtnGrilledNonVeg.setBounds(327, 634, 127, 25);
		frame.getContentPane().add(rdbtnGrilledNonVeg);
		
		JLabel lblPlainRoti = new JLabel("Plain Roti");
		lblPlainRoti.setBounds(317, 710, 56, 16);
		frame.getContentPane().add(lblPlainRoti);
		
		textField = new JTextField();
		textField.setBounds(385, 707, 56, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNaan = new JLabel("Naan");
		lblNaan.setBounds(317, 747, 56, 16);
		frame.getContentPane().add(lblNaan);
		
		JLabel lblAaaloParatha = new JLabel("Aalo paratha");
		lblAaaloParatha.setBounds(296, 789, 77, 16);
		frame.getContentPane().add(lblAaaloParatha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(385, 744, 56, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(385, 786, 56, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(385, 827, 56, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(385, 871, 56, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblPannerRoti = new JLabel("panner roti");
		lblPannerRoti.setBounds(296, 830, 77, 16);
		frame.getContentPane().add(lblPannerRoti);
		
		JLabel lblGobhiParatha = new JLabel("Gobhi paratha");
		lblGobhiParatha.setBounds(296, 874, 85, 16);
		frame.getContentPane().add(lblGobhiParatha);
		
		JLabel lblColdrinks = new JLabel("COLDRINKS");
		lblColdrinks.setFont(new Font("Verdana", Font.BOLD, 16));
		lblColdrinks.setBounds(991, 412, 109, 34);
		frame.getContentPane().add(lblColdrinks);
		
		JLabel lblThanksForVisiting = new JLabel("THANKS! FOR VISITING PLEASE VISIT AGAIN WITH FAMILY");
		lblThanksForVisiting.setForeground(new Color(128, 128, 0));
		lblThanksForVisiting.setFont(new Font("Yu Gothic", Font.BOLD, 30));
		lblThanksForVisiting.setBounds(344, 999, 1145, 41);
		frame.getContentPane().add(lblThanksForVisiting);
		
		 rdbtnPanneerLabalabonePlate = new JRadioButton("Panneer Labalab(one plate)");
	
		rdbtnPanneerLabalabonePlate.setBackground(Color.WHITE);
		rdbtnPanneerLabalabonePlate.setBounds(503, 706, 200, 25);
		frame.getContentPane().add(rdbtnPanneerLabalabonePlate);
		
		 rdbtnShaahiPanner = new JRadioButton("Shaahi Panner(one plate)");
		
		rdbtnShaahiPanner.setBackground(Color.WHITE);
		rdbtnShaahiPanner.setBounds(503, 743, 179, 25);
		frame.getContentPane().add(rdbtnShaahiPanner);
		
		 rdbtnPannerTikka = new JRadioButton("Panner Tikka");
		
		rdbtnPannerTikka.setBackground(Color.WHITE);
		rdbtnPannerTikka.setBounds(503, 785, 127, 25);
		frame.getContentPane().add(rdbtnPannerTikka);
		
		 rdbtnMatarPanner = new JRadioButton("Matar Panner");
				rdbtnMatarPanner.setBackground(Color.WHITE);
		rdbtnMatarPanner.setBounds(506, 826, 127, 25);
		frame.getContentPane().add(rdbtnMatarPanner);
		
		rdbtnCoke = new JRadioButton("Coke");
		
		rdbtnCoke.setBackground(Color.WHITE);
		rdbtnCoke.setBounds(993, 449, 127, 25);
		frame.getContentPane().add(rdbtnCoke);
		
		 rdbtnMirinda = new JRadioButton("Mirinda");
		
		rdbtnMirinda.setBackground(Color.WHITE);
		rdbtnMirinda.setBounds(993, 480, 127, 25);
		frame.getContentPane().add(rdbtnMirinda);
		
		rdbtnPepsi = new JRadioButton("Pepsi");
		
		rdbtnPepsi.setBackground(Color.WHITE);
		rdbtnPepsi.setBounds(993, 510, 127, 25);
		frame.getContentPane().add(rdbtnPepsi);
		
		textField_5 = new JTextField();
		textField_5.setBounds(492, 611, 689, 9);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblVerifivationOfHome = new JLabel("Verifivation of Home delivery");
		lblVerifivationOfHome.setBounds(732, 626, 165, 16);
		frame.getContentPane().add(lblVerifivationOfHome);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_6.setBounds(1000, 860, 192, 40);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setFont(new Font("Verdana", Font.BOLD, 26));
		lblTotalPrice.setBounds(806, 856, 164, 40);
		frame.getContentPane().add(lblTotalPrice);
		
		JLabel lblTax = new JLabel("Discount");
		lblTax.setFont(new Font("Verdana", Font.BOLD, 26));
		lblTax.setBounds(827, 784, 164, 40);
		frame.getContentPane().add(lblTax);
		
		JLabel lblAmount = new JLabel("Tax");
		lblAmount.setFont(new Font("Verdana", Font.BOLD, 26));
		lblAmount.setBounds(826, 715, 132, 40);
		frame.getContentPane().add(lblAmount);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Verdana", Font.BOLD, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(1000, 733, 192, 40);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(1000, 800, 192, 40);
		frame.getContentPane().add(textField_8);
		
		JLabel lblBestFoodIn = new JLabel("BEST FOOD IN THIS TOWN");
		lblBestFoodIn.setForeground(new Color(255, 99, 71));                                     
		lblBestFoodIn.setFont(new Font("Verdana", Font.BOLD, 36));
		lblBestFoodIn.setBounds(556, 547, 544, 58);
		frame.getContentPane().add(lblBestFoodIn);
		
		JLabel lblRateListOf = new JLabel("RATE LIST OF ALL THE ITEMS");
		lblRateListOf.setForeground(new Color(165, 42, 42));
		lblRateListOf.setFont(new Font("Yu Gothic Light", Font.BOLD, 18));
		lblRateListOf.setBounds(1222, 113, 290, 40);
		frame.getContentPane().add(lblRateListOf);
		
		JLabel lblFries = new JLabel("Fries 50");
		lblFries.setBounds(1222, 160, 127, 21);
		frame.getContentPane().add(lblFries);
		
		JLabel lblChowmeinPriceRs = new JLabel("Chowmein 100");
		lblChowmeinPriceRs.setBounds(1222, 186, 153, 21);
		frame.getContentPane().add(lblChowmeinPriceRs);
		
		JLabel lblPizza = new JLabel("Pizza 200");
		lblPizza.setBounds(1222, 218, 127, 21);
		frame.getContentPane().add(lblPizza);
		
		JLabel lblBurger = new JLabel("burger 90");
		lblBurger.setBounds(1222, 252, 127, 21);
		frame.getContentPane().add(lblBurger);
		
		JLabel lblManchurian = new JLabel("Manchurian 130");
		lblManchurian.setBounds(1222, 286, 127, 21);
		frame.getContentPane().add(lblManchurian);
		
		JLabel lblSpringRolls = new JLabel("Spring rolls 80");
		lblSpringRolls.setBounds(1222, 320, 127, 21);
		frame.getContentPane().add(lblSpringRolls);
		
		JLabel lblChaocolateShake = new JLabel("Chaocolate shake 90");
		lblChaocolateShake.setBounds(1222, 359, 127, 21);
		frame.getContentPane().add(lblChaocolateShake);
		
		JLabel lblMangoShake = new JLabel("Mango Shake 60");
		lblMangoShake.setBounds(1222, 393, 127, 21);
		frame.getContentPane().add(lblMangoShake);
		
		JLabel lblVanillaShake = new JLabel("Vanilla Shake 70");
		lblVanillaShake.setBounds(1222, 423, 127, 21);
		frame.getContentPane().add(lblVanillaShake);
		
		JLabel lblStrawberryShake = new JLabel("Strawberry Shake 80");
		lblStrawberryShake.setBounds(1222, 455, 127, 21);
		frame.getContentPane().add(lblStrawberryShake);
		
		JLabel lblCheekuShake = new JLabel("Cheeku Shake  100");
		lblCheekuShake.setBounds(1222, 484, 127, 21);
		frame.getContentPane().add(lblCheekuShake);
		
		JLabel lblBananaShake = new JLabel("Banana Shake 80");
		lblBananaShake.setBounds(1222, 514, 127, 21);
		frame.getContentPane().add(lblBananaShake);
		
		JLabel lblTea = new JLabel("Tea 40");
		lblTea.setBounds(1222, 548, 127, 21);
		frame.getContentPane().add(lblTea);
		
		JLabel lblCoffee = new JLabel("Coffee 50");
		lblCoffee.setBounds(1222, 582, 127, 21);
		frame.getContentPane().add(lblCoffee);
		
		JLabel lblSoup = new JLabel("Soup 80");
		lblSoup.setBounds(1222, 608, 127, 21);
		frame.getContentPane().add(lblSoup);
		
		JLabel lblFriedChicken = new JLabel("Fried Chicken  300");
		lblFriedChicken.setBounds(1222, 638, 127, 21);
		frame.getContentPane().add(lblFriedChicken);
		
		JLabel lblTandooriChicken = new JLabel("Tandoori Chicken 400");
		lblTandooriChicken.setBounds(1222, 674, 127, 21);
		frame.getContentPane().add(lblTandooriChicken);
		
		JLabel lblMalaiChicken = new JLabel("Malai Chicken 350");
		lblMalaiChicken.setBounds(1222, 710, 127, 21);
		frame.getContentPane().add(lblMalaiChicken);
		
		JLabel lblKadhaiChicken = new JLabel("Kadhai Chicken 250");
		lblKadhaiChicken.setBounds(1222, 747, 127, 21);
		frame.getContentPane().add(lblKadhaiChicken);
		
		JLabel lblLemonChicken = new JLabel("Lemon Chicken 380");
		lblLemonChicken.setBounds(1222, 771, 127, 21);
		frame.getContentPane().add(lblLemonChicken);
		
		JLabel lblButterChicken = new JLabel("Butter Chicken 390");
		lblButterChicken.setBounds(1222, 800, 127, 21);
		frame.getContentPane().add(lblButterChicken);
		
		JLabel lblHaryaliChaamp = new JLabel("Haryali Chaamp  120");
		lblHaryaliChaamp.setBounds(1222, 830, 127, 21);
		frame.getContentPane().add(lblHaryaliChaamp);
		
		JLabel lblMalaiChaamp = new JLabel("Malai Chaamp  140");
		lblMalaiChaamp.setBounds(1222, 864, 127, 21);
		frame.getContentPane().add(lblMalaiChaamp);
		
		JLabel lblMalaiTikkaChaamp = new JLabel("Malai tikka chaamp 150");
		lblMalaiTikkaChaamp.setBounds(1222, 896, 153, 21);
		frame.getContentPane().add(lblMalaiTikkaChaamp);
		
		JLabel lblKadhaiChaamp = new JLabel("Kadhai Chaamp 100");
		lblKadhaiChaamp.setBounds(1222, 925, 127, 21);
		frame.getContentPane().add(lblKadhaiChaamp);
		
		JLabel lblLemonChaamp = new JLabel("Lemon chaamp  90");
		lblLemonChaamp.setBounds(1403, 158, 127, 21);
		frame.getContentPane().add(lblLemonChaamp);
		
		JLabel lblNormalChaamp = new JLabel("Normal Chaamp  80");
		lblNormalChaamp.setBounds(1403, 190, 127, 21);
		frame.getContentPane().add(lblNormalChaamp);
		
		JLabel lblIdliSambhar = new JLabel("Idli sambhar 200");
		lblIdliSambhar.setBounds(1403, 222, 127, 21);
		frame.getContentPane().add(lblIdliSambhar);
		
		JLabel lblSambharDosa = new JLabel("Sambhar Dosa 150");
		lblSambharDosa.setBounds(1403, 254, 127, 21);
		frame.getContentPane().add(lblSambharDosa);
		
		JLabel lblUttappam = new JLabel("Uttappam  90");
		lblUttappam.setBounds(1403, 288, 127, 21);
		frame.getContentPane().add(lblUttappam);
		
		JLabel lblCoke = new JLabel("coke 45");
		lblCoke.setBounds(1403, 322, 127, 21);
		frame.getContentPane().add(lblCoke);
		
		JLabel lblMirinda = new JLabel("mirinda 45");
		lblMirinda.setBounds(1403, 363, 127, 21);
		frame.getContentPane().add(lblMirinda);
		
		JLabel lblPepsi = new JLabel("pepsi 50");
		lblPepsi.setBounds(1403, 449, 127, 21);
		frame.getContentPane().add(lblPepsi);
		
		JLabel lblGolGappeunlimited = new JLabel("Gol gappe (unlimited)  60");
		lblGolGappeunlimited.setBounds(1403, 423, 162, 21);
		frame.getContentPane().add(lblGolGappeunlimited);
		
		JLabel lblNormalThali = new JLabel("Normal thali  240");
		lblNormalThali.setBounds(1403, 391, 127, 21);
		frame.getContentPane().add(lblNormalThali);
		
		JLabel lblDahiBhalle = new JLabel("Dahi bhalle  70");
		lblDahiBhalle.setBounds(1403, 484, 127, 21);
		frame.getContentPane().add(lblDahiBhalle);
		
		JLabel lblChaatPapdi = new JLabel("Chaat papdi  70");
		lblChaatPapdi.setBounds(1403, 512, 127, 21);
		frame.getContentPane().add(lblChaatPapdi);
		
		JLabel lblNormalSandwich = new JLabel("normal sandwich  50");
		lblNormalSandwich.setBounds(1403, 544, 127, 21);
		frame.getContentPane().add(lblNormalSandwich);
		
		JLabel lblGrilledSandwich = new JLabel("grilled sandwich 60");
		lblGrilledSandwich.setBounds(1403, 578, 127, 21);
		frame.getContentPane().add(lblGrilledSandwich);
		
		JLabel lblGrilledCheese = new JLabel("grilled cheese  70");
		lblGrilledCheese.setBounds(1403, 608, 127, 21);
		frame.getContentPane().add(lblGrilledCheese);
		
		JLabel lblGilledNonVeg = new JLabel("gilled non veg  80");
		lblGilledNonVeg.setBounds(1403, 638, 127, 21);
		frame.getContentPane().add(lblGilledNonVeg);
		
		JLabel lblPlainRoti_1 = new JLabel("plain roti  10");
		lblPlainRoti_1.setBounds(1403, 674, 127, 21);
		frame.getContentPane().add(lblPlainRoti_1);
		
		JLabel lblNaan_1 = new JLabel("naan 12");
		lblNaan_1.setBounds(1403, 710, 127, 21);
		frame.getContentPane().add(lblNaan_1);
		
		JLabel lblAaloParatha = new JLabel("Aalo paratha 20");
		lblAaloParatha.setBounds(1403, 731, 127, 21);
		frame.getContentPane().add(lblAaloParatha);
		
		JLabel lblPanneerLabalab = new JLabel("Panneer labalab 90");
		lblPanneerLabalab.setBounds(1403, 786, 127, 21);
		frame.getContentPane().add(lblPanneerLabalab);
		
		JLabel lblShaahiPanner = new JLabel("Shaahi panner 100");
		lblShaahiPanner.setBounds(1403, 820, 127, 21);
		frame.getContentPane().add(lblShaahiPanner);
		
		JLabel lblPanneerTikka = new JLabel("Panneer tikka 70");
		lblPanneerTikka.setBounds(1403, 848, 127, 21);
		frame.getContentPane().add(lblPanneerTikka);
		
		JLabel lblMataPanner = new JLabel("Mata Panner 80");
		lblMataPanner.setBounds(1403, 874, 127, 21);
		frame.getContentPane().add(lblMataPanner);
		
		JLabel lblPannerRoti_1 = new JLabel("Panner roti 40");
		lblPannerRoti_1.setBounds(1403, 749, 127, 21);
		frame.getContentPane().add(lblPannerRoti_1);
		
		JLabel lblGobhiParatha_1 = new JLabel("Gobhi paratha 40");
		lblGobhiParatha_1.setBounds(1403, 765, 127, 21);
		frame.getContentPane().add(lblGobhiParatha_1);
		
		JLabel lblDiscount = new JLabel("Amount");
		lblDiscount.setFont(new Font("Verdana", Font.BOLD, 26));
		lblDiscount.setBounds(827, 656, 153, 40);
		frame.getContentPane().add(lblDiscount);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Verdana", Font.BOLD, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(1000, 660, 192, 40);
		frame.getContentPane().add(textField_9);
		
		JLabel lblDeluxThali = new JLabel("Delux thali 300");
		lblDeluxThali.setBounds(1403, 898, 127, 21);
		frame.getContentPane().add(lblDeluxThali);
		
		JLabel lblPunjabiThali = new JLabel("Punjabi Thali 290");
		lblPunjabiThali.setBounds(1403, 927, 127, 21);
		frame.getContentPane().add(lblPunjabiThali);
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setFocusable(false);
		
		
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				double total;
				
				txtrArea.setText("RECIEPT\n\n\n\nMALHOTRA KITCHEN FAMILY RESTRUANT\n\n\n");
				txtrArea.setFont(f1);
				if(rdbtnNormalThali.isSelected())
				{ 
					NormalThali=240;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Normal Thali of rupees \n:"+NormalThali+"\n");
					txtrArea.setFont(f2);
					int Total=NormalThali;	
				}
				else
				{
					NormalThali=0;
				}
				
				if(rdbtnDeluxThsli.isSelected())
				{
					DeluxThsli=300;
					txtrArea.setText(txtrArea.getText()+"you have ordered the delux thali of rupees \n:"+DeluxThsli+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					DeluxThsli=0;
				}
				if(rdbtnPunjabiThali.isSelected())
				{
					PunjabiThali=290;
					txtrArea.setText(txtrArea.getText()+"you have ordered the punjabi thali of rupees \n:"+PunjabiThali+"\n");
					txtrArea.setFont(f2);
					 
				}
				if(rdbtnFries.isSelected())
				{
					Fries=50;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Fries of rupees \n:"+Fries+"\n");
					txtrArea.setFont(f2);
					 
					
				}
				if(rdbtnPizza.isSelected())
				{
					Pizza=200;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Pizza  of rupees \n:"+Pizza+"\n");
					txtrArea.setFont(f2);	 
				}
				else
				{
					Pizza=0;
				}
				if(rdbtnManchurian.isSelected())
				{
					Manchurian=130;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Manchurian  of rupees \n:"+Manchurian+"\n");
					txtrArea.setFont(f2);		
				}
				else
				{
					Manchurian=0;
				}
				if(rdbtnChowmein.isSelected())
				{
					Chowmein=100;
				}
				else
				{
					Chowmein=0;
				}
				if(rdbtnBurger.isSelected())
				{
					Burger=90;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the burger of rupees \n:"+Burger+"\n");
					txtrArea.setFont(f2);
				}
				else{
					Burger=0;
				}
				if(rdbtnSpringRolls.isSelected())
				{
					SpringRolls=80;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Sprinrolls of rupees \n:"+SpringRolls+"\n");
					txtrArea.setFont(f2);	 
				}
				else
				{
					SpringRolls=0;
				}
				if(rdbtnChocate.isSelected())
				{
					Chocolate=90;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Chocoalte Shake of rupees \n:"+Chocolate+"\n");
					txtrArea.setFont(f2);
				}
				else{
					Chocolate=0;
				}
				if(rdbtnVanila.isSelected())
				{
					vanila=70;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the valia shake of rupees \n:"+vanila+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					vanila=0;
				}
				if(rdbtnMango.isSelected())
				{
					Mango=70;
					txtrArea.setText(txtrArea.getText()+"you have ordered the MangoShake of rupees \n:"+Mango+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					Mango=0;
				}
				if(rdbtnStrawberry.isSelected())
				{
					Strawberry=100;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Strawberry Shake of rupees \n:"+Strawberry+"\n");
					txtrArea.setFont(f2);

					 
					
				}
				else
				{
					Strawberry=0;
				}
				if(rdbtnCheeku.isSelected())
				{
					Cheeku=80;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Cheeku Shake of rupees \n:"+Cheeku+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					Cheeku=0;
				}
				if(rdbtnBanana.isSelected())
				{
					Banana=80;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Banana of rupees \n:"+Banana+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Banana=0;
				}
				if(rdbtnTea.isSelected())
				{
					Tea=40;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Tea of rupees \n:"+Tea+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Tea=0;
				}
				if(rdbtnCoffee.isSelected())
				{
					Coffee=50;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Coffee of rupees \n:"+Coffee+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Coffee=0;
				}
				if(rdbtnSoups.isSelected())
				{
					Soup=80;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Soup of rupees \n:"+Soup+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
				Soup=0;
				}
				if(rdbtnGolGappe.isSelected())
				{
					GolGappe=60;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Gol Gappe of rupees \n:"+GolGappe+"\n");
					txtrArea.setFont(f2);	
				}
				else
				{
					GolGappe=0;
				}
				if(rdbtnDahiBhalle.isSelected())
				{
					DahiBhalle=70;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Dahi bhalle of rupees \n:"+DahiBhalle+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					DahiBhalle=0;
				}
				if(rdbtnChaatPapdi.isSelected())
				{
					ChaatPapdi=70;
					txtrArea.setText(txtrArea.getText()+"you have ordered the ChaatPapdi of rupees \n:"+ChaatPapdi+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					ChaatPapdi=0;
				}
				if(rdbtnFriedChicken.isSelected())
				{
					Fried=300;
					txtrArea.setText(txtrArea.getText()+"You have ordered the  Friedchicken of rupees \n:"+Fried+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Fried=0;
				}
				if(rdbtnTandooriChicken.isSelected())
				{
					Tandoori=400;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Tandoori chicken of rupees \n:"+Tandoori+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					Tandoori=0;
				}
				if(rdbtnMalaiChicken.isSelected())
				{
					Malai=350;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Malai chicken of rupees \n:"+Malai+"\n");
					txtrArea.setFont(f2);

					 
					
				}
				else
				{
					Malai=0;
				}
				if(rdbtnKadhaiChicken.isSelected())
				{
					Kadhai=250;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Kadhai chicken of rupees \n:"+Kadhai+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Kadhai=0;
				}
				if(rdbtnLemonChicken.isSelected())
				{
					Lemon=380;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Lemon chicken of rupees \n:"+Lemon+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Lemon=0;
				}
				if(rdbtnButterChicken.isSelected())
				{
					Butter=390;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Butterchicken of rupees \n:"+Butter+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					Butter=0;
				}
				if(rdbtnHaryaliChaamp.isSelected())
				{
					Haryali=120;;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Haryali chaamp of rupees \n:"+Haryali+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					Haryali=0;
				}
				if(rdbtnMalaiChaamp.isSelected())
				{
					MalaiC=140;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the MalaiChaamp of rupees \n:"+MalaiC+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					MalaiC=0;
				}
				if(rdbtnMalaiTikkaChaamp.isSelected())
				{
					MalaiTikka=150;
					txtrArea.setText(txtrArea.getText()+"you have ordered the MalaiTikka chaap of rupees \n:"+MalaiTikka+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					MalaiTikka=0;
				}
				if(rdbtnKadhaiChaamp.isSelected())
				{
					KadhaiC=100;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Kadhai chaamp of rupees \n:"+KadhaiC+"\n");
					txtrArea.setFont(f2);
				}
				else
				{
					KadhaiC=0;
				}
				if(rdbtnLemonChaamp.isSelected())
				{
					LemonC=90;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Lemon chaamp of rupees \n:"+LemonC+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					LemonC=0;
				}
				if(rdbtnNormalChaamp.isSelected())
				{
					NormalC=80;
					txtrArea.setText(txtrArea.getText()+"you have ordered the NormalChaamp of rupees \n:"+NormalC+"\n");
					txtrArea.setFont(f2);

					 
					
				}
				else
				{
					NormalC=0;
				}
				if(rdbtnIdliSambhar.isSelected())
				{
					Idli=200;
					txtrArea.setText(txtrArea.getText()+"You have ordered the IdliSambhar of rupees \n:"+Idli+"\n");
					txtrArea.setFont(f2);

					
					
				}
				else
				{
					Idli=0;
				}
				if(rdbtnSambharDosa.isSelected())
				{
					Dosa=150;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Sambhar Dosa of rupees \n:"+Dosa+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					Dosa=0;
				}
				if(rdbtnUttappam.isSelected())
				{
					Uttappam=90;
					txtrArea.setText(txtrArea.getText()+"you have ordered the Uttappam of rupees \n:"+Uttappam+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					Uttappam=0;
				}
				if(rdbtnCoke.isSelected())
				{
					Coke=45;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Coke of rupees \n:"+Coke+"\n");
					txtrArea.setFont(f2);

					
					
				}
				else
				{
					Coke=0;
				}
				if(rdbtnMirinda.isSelected())
				{
					Mirinda=45;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Mirinda of rupees \n:"+Mirinda+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					Mirinda=0;
				}
				if(rdbtnPepsi.isSelected())
				{
					Pepsi=50;
					txtrArea.setText(txtrArea.getText()+"you have ordered the pepsi of rupees \n:"+Pepsi+"\n");
					txtrArea.setFont(f2);

										
				}
				else
				{
					Pepsi=0;
				}
				if(rdbtnNormalSandwich.isSelected())
				{
					NormalS=50;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Normal Sandwich of rupees \n:"+NormalS+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					NormalS=0;
				}
				if(rdbtnGrilledSandwich.isSelected())
				{
					GrilledS=60;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the GrilledSandwich of rupees \n:"+GrilledS+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					GrilledS=0;
				}
				if(rdbtnGrilledCheese.isSelected())
				{
					CheeseS=70;
					txtrArea.setText(txtrArea.getText()+"you have ordered the grilledsandwich of rupees \n:"+CheeseS+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					CheeseS=0;
				}
				if(rdbtnGrilledNonVeg.isSelected())
				{
					GrilledN=80;
					txtrArea.setText(txtrArea.getText()+"You have ordered the GrilledNonveg of rupees \n:"+GrilledN+"\n");
					txtrArea.setFont(f2);

						
				}
				else
				{
					GrilledN=0;
				}
				if(rdbtnPanneerLabalabonePlate.isSelected())
				{
					PaneerL=90;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Pannerlabalab of rupees \n:"+PaneerL+"\n");
					txtrArea.setFont(f2);

					
				}
				else
				{
					PaneerL=0;
				}
				if(rdbtnShaahiPanner.isSelected())
				{
					PaneerS=100;
					txtrArea.setText(txtrArea.getText()+"you have ordered the ShahiPaneer of rupees \n:"+PaneerS+"\n");
					txtrArea.setFont(f2);

					 
					
				}
				else
				{
					PaneerS=0;
				}
				if(rdbtnPannerTikka.isSelected())
				{
					PaneerT=80;
					txtrArea.setText(txtrArea.getText()+"You have ordered the Panner tikka of rupees \n:"+PaneerT+"\n");
					txtrArea.setFont(f2);

					 
				}
				else
				{
					PaneerT=0;
				}
				if(rdbtnMatarPanner.isSelected())
				{
					PaneerM=90;
					
					txtrArea.setText(txtrArea.getText()+"you have ordered the Panner matar of rupees \n:"+PaneerM+"\n");
					txtrArea.setFont(f2);

 				}			
				else
				{
					PaneerM=0;
				}
				txtrArea.setText(txtrArea.getText()+"you have ordered simple rotis:"+textField.getText()+"\n");
				int numberofrotis=Integer.parseInt(textField.getText());
				int amountofrotis=numberofrotis*10;
				txtrArea.setText("\n"+txtrArea.getText()+"total amount of plain rotis are ::"+amountofrotis+"\n");
					
				txtrArea.setText("\n"+txtrArea.getText()+"you have ordered Naans:"+String.valueOf(textField_1.getText()+"\n"));
				int numberofnaan=Integer.parseInt(textField_1.getText());
				int amountofnaan=numberofnaan*12;
				txtrArea.setText("\n"+txtrArea.getText()+"total maount of ordered naans are:: "+amountofnaan+"\n");
				
				txtrArea.setText("\n"+txtrArea.getText()+"you have ordered Aaalo paratha:"+String.valueOf(textField_2.getText()+"\n"));
				int numberofaalop=Integer.parseInt(textField_2.getText());
				int amountofaalop=numberofaalop*20;
				txtrArea.setText("\n"+txtrArea.getText()+"total maount of aaalo naans are:: "+amountofaalop+"\n");
				
				txtrArea.setText("\n"+txtrArea.getText()+"you have ordered Paneer paratha:"+String.valueOf(textField_3.getText()+"\n"));
				int numberofpaneerp=Integer.parseInt(textField_3.getText());
				int amountofpaneerp=numberofpaneerp*40;
				txtrArea.setText("\n"+txtrArea.getText()+"total maount of pannerr naans are:: "+amountofpaneerp+"\n");
				
				txtrArea.setText("\n"+txtrArea.getText()+"you have ordered Gobhi paratha:"+String.valueOf(textField_4.getText()+"\n"));
				int numberofgobhip=Integer.parseInt(textField_4.getText());
				int amountofgobhip=numberofgobhip*40;
				txtrArea.setText("\n"+txtrArea.getText()+"total amount of gobhi paratha are:: "+amountofgobhip+"\n\n");
				
				
				
				
				//total of rotis to be ordered//
				
				double totalofitems=(amountofrotis+amountofnaan+amountofaalop+amountofpaneerp+amountofgobhip);
			
				
				
				
				
				//total of otheritems to be orderded//
				
				total=totalofitems+NormalThali+DeluxThsli+PunjabiThali+Fries+Pizza+Manchurian+Chowmein+Burger+SpringRolls+Chocolate+vanila+Mango+Strawberry+Cheeku+Banana+GolGappe+DahiBhalle+ChaatPapdi+Fried+Tandoori+Malai+roti+naan+aaloP+gobiP+PaneerP+Idli+Dosa+Uttappam+PaneerL+PaneerS+PaneerT+PaneerM+Kadhai+Lemon+Butter+Coke+Mirinda+Pepsi+NormalS+GrilledS+CheeseS+GrilledN+Haryali+MalaiC+MalaiTikka+KadhaiC+LemonC+NormalC+Tea+Coffee+Soup;
				
				
				 tax=total/100*18;
					
					
					
				 discount=(total+tax)/100*10;
				 netTotal=total+tax-discount;
				 
				 txtrArea.setText("\n\n"+txtrArea.getText()+"the paid amount:::"+netTotal+"\n");
				 
				
				
				
				
				
				 
				
				
				
				/*textField_9.setText(String.valueOf());
				
				
				textField_8.setText(String.valueOf(dis));*/
				textField_9.setText(String.valueOf(total));
				textField_7.setText(String.valueOf(tax));
				textField_6.setText(String.valueOf(netTotal));
				textField_8.setText(String.valueOf(discount));
				
				JOptionPane.showMessageDialog(null,"THANKS FOR PLACING ORDER PLEASE ORDER AGAIN...","message", JOptionPane.OK_OPTION);
			}
		});
		f1=new Font("Arial",Font.BOLD,14);
		f2=new Font("verdana",Font.BOLD,12);
		btnOrder.setBackground(new Color(210, 105, 30)); //disocunt =8 total=6 //
		btnOrder.setForeground(Color.ORANGE);
		btnOrder.setFont(new Font("Verdana", Font.BOLD, 16));
		btnOrder.setBounds(926, 923, 114, 40);
		frame.getContentPane().add(btnOrder);
		
		txtrArea = new JTextArea();
		txtrArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtrArea.setBounds(1551, 81, 339, 939);
		frame.getContentPane().add(txtrArea);
		txtrArea.setText(String.valueOf("Welcome"+textField.getText())+"in malhotras kitchen");
                                    
                                    txtrArea.setText(String.valueOf(textField_1.getText()));
		txtrArea.setText(String.valueOf(textField_2.getText()));
		txtrArea.setText(String.valueOf(textField_2.getText())); 
		txtrArea.setText(String.valueOf(textField_2.getText()));
		
		JLabel lblPleaseDoNot = new JLabel("Please do not left any textField blank ");
		lblPleaseDoNot.setBounds(344, 947, 213, 19);
		frame.getContentPane().add(lblPleaseDoNot);
	}
}

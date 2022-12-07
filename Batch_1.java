import java.awt.*;
import java.text.*;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.print.*;
public class Batch_1{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_4_2;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_4_3;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblNewLabel_4_4;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JLabel lblNewLabel_4_5;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JLabel lblNewLabel_4_6;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel lblNewLabel_4_7;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JLabel lblNewLabel_4_8;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JLabel lblNewLabel_4_9;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JLabel lblNewLabel_5;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JLabel lblNewLabel_4_10;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JLabel lblNewLabel_4_11;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JLabel lblNewLabel_4_12;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	 private JTextField textField_49;
	    private JTextField textField_50;
	    private JTextField textField_51;
		private JTextField textField_52;
		private JTextField textField_53;
		private JTextField textField_54;
		private JTextField textField_55;

		private JTextField textField_56;
		private JTextField textField_57;
		private JTextField textField_58;
	    private JTextField textField_59;
	    private JTextField textField_60;
	    private JTextField textField_61;
		private JTextField textField_62;
		private JTextField textField_63;
		private JTextField textField_64;
		private JTextField textField_65;

		private JTextField textField_66;
		private JTextField textField_67;
		private JTextField textField_68;
	    private JTextField textField_69;
	    private JTextField textField_70;


	    private JTextField textField_71;
		private JTextField textField_72;
		private JTextField textField_73;
		private JTextField textField_74;
		private JTextField textField_75;

		private JTextField textField_76;
		private JTextField textField_77;
		private JTextField textField_78;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_3_4;
	private JLabel lblNewLabel_3_5;
	private JLabel lblNewLabel_3_6;
	
	
	    private JTextField textField_81;
	    private JTextField textField_82;
	  
	    int bno, quantity=0,totit=0;
	    int q1=0,q2=0,q3=0,q4=0,q5=0,q6=0,q7=0,q8=0,q9=0,q10=0,q11=0,q12=0,q13=0,q14=0,q15=0,q16=0,q17=0,q18=0,q19=0,q20=0,q21=0,q22=0,q23=0,q24=0,q25=0;
	    int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p23,p22,p24,p25;
	    int it1,it2,it3,it4,it5,it6,it7,it8,it9,it10,it11,it12,it13,it14,it15,it16,it17,it18,it19,it20,it21,it22,it23,it24,it25,change1,ap1;
	    

	    String ARET,TOTIT;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Batch_1 window = new Batch_1();
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
	public Batch_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	/* quantity textfields-->4,9,10,13,16,19,22,25,28,31,34,37,40,
43,46,49,52,55,58,61,64,67,70,73,76;

item total--->6,7,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57
60,63,66,69,72,75,78;


price:5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56,59,62,65,68,71,74,77

Customer Name: textfield;customer telephone :textfield_1;
      */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(101, 10, 1315, 791);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("BIRTHDAY DECORATION BILLING  SYSTEM");
		
		JLabel lblNewLabel = new JLabel("Customer Name:");
		lblNewLabel.setBounds(23, 30, 118, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCustomerTelephone = new JLabel("Customer Telephone:");
		lblCustomerTelephone.setBounds(23, 56, 138, 29);
		frame.getContentPane().add(lblCustomerTelephone);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char cn=e.getKeyChar();
				if(Character.isDigit(cn))
				{
					textField.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid Customer  Name");
					textField.setEditable(true);
					
				}
				else
				{
					textField.setEditable(true);
				}
			}
		});
		textField.setBounds(161, 33, 204, 19);
		textField.setText(null);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c =e.getKeyChar();
				if(Character.isLetter(c))
				{
					textField_1.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid 10 digit Mobile Number");
					textField_1.setEditable(true);
					
				}
				else
				{
					textField_1.setEditable(true);
				}
			}
		});
		textField_1.setBounds(161, 61, 204, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setBounds(468, 40, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c22 =e.getKeyChar();
				if(Character.isDigit(c22)|| Character.isLetter(c22))
				{
					textField_2.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER DATE"); 
					textField_2.setEditable(true);
					
				}
				else
				{
					textField_2.setEditable(true);
				}
			
				
			}
		});
		textField_2.setBounds(509, 37, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Time:");
		lblNewLabel_2.setBounds(468, 68, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();//time
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c33 =e.getKeyChar();
				if(Character.isDigit(c33)|| Character.isLetter(c33))
				{
					textField_3.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER TIME");
					textField_3.setEditable(true);
					
				}
				else
				{
					textField_3.setEditable(true);
				}
			
			}
		});
		textField_3.setBounds(509, 66, 96, 19);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		Calendar timer =Calendar.getInstance();
		timer.getTime();
		SimpleDateFormat tTime =new SimpleDateFormat("HH:mm:ss");
		textField_3.setText(tTime.format(timer.getTime()));
		

		SimpleDateFormat Tdate =new SimpleDateFormat("dd-MM-yyyy");
		textField_2.setText(Tdate.format(timer.getTime()));
		
		JLabel lblNewLabel_3 = new JLabel("Item Type");
		lblNewLabel_3.setBounds(23, 150, 87, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantity");
		lblNewLabel_3_1.setBounds(153, 150, 51, 13);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Price");
		lblNewLabel_3_2.setBounds(217, 150, 37, 13);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Item Total");
		lblNewLabel_3_3.setBounds(279, 150, 77, 13);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ballons-Plain");
		lblNewLabel_4.setBounds(23, 184, 87, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				char c4 =e.getKeyChar();
				if(Character.isLetter(c4))
				{
					textField_4.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_4.setEditable(true);
					
				}
				else
				{
					textField_4.setEditable(true);
				}
				
			}
		});
		textField_4.setBounds(153, 181, 51, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setText("0");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("40");
		textField_5.setBounds(214, 181, 51, 19);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c6 =e.getKeyChar();
				if(Character.isDigit(c6)|| Character.isLetter(c6))
				{
					textField_6.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_6.setEditable(true);
					
				}
				else
				{
					textField_6.setEditable(true);
				}
			}
		});
		textField_6.setBounds(277, 183, 51, 19);
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c7 =e.getKeyChar();
				if(Character.isDigit(c7)|| Character.isLetter(c7))
				{
					textField_7.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_7.setEditable(true);
					
				}
				else
				{
					textField_7.setEditable(true);
				}
			}
			
		});
		textField_7.setBounds(277, 212, 51, 19);
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("60");
		textField_8.setBounds(214, 212, 51, 19);
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c9 =e.getKeyChar();
				if(Character.isLetter(c9))
				{
					textField_9.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_9.setEditable(true);
					
				}
				else
				{
					textField_9.setEditable(true);
				}

			}
		});
		textField_9.setBounds(153, 212, 51, 19);
		textField_9.setColumns(10);
		textField_9.setText("0");
		frame.getContentPane().add(textField_9);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ballons-Dotted");
		lblNewLabel_4_1.setBounds(23, 215, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		lblNewLabel_4_2 = new JLabel("Ballons-Metallic");
		lblNewLabel_4_2.setBounds(23, 250, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c10=e.getKeyChar();
				if(Character.isLetter(c10))
				{
					textField_10.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_10.setEditable(true);
					
				}
				else
				{
					textField_10.setEditable(true);
				}

			}
		});
		textField_10.setBounds(153, 247, 51, 19);
		textField_10.setColumns(10);
		textField_10.setText("0");
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("50");
		textField_11.setBounds(214, 247, 51, 19);
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				
				char c12 =e.getKeyChar();
				if(Character.isDigit(c12)|| Character.isLetter(c12))
				{
					textField_12.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_12.setEditable(true);
					
				}
				else
				{
					textField_12.setEditable(true);
				}
			}
			
		});
		textField_12.setBounds(277, 250, 51, 19);
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12);
		
		lblNewLabel_4_3 = new JLabel("Ballons-Dil");
		lblNewLabel_4_3.setBounds(23, 284, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c13 =e.getKeyChar();
				if(Character.isLetter(c13))
				{
					textField_13.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_13.setEditable(true);
					
				}
				else
				{
					textField_13.setEditable(true);
				}

			}
		});
		textField_13.setBounds(153, 281, 51, 19);
		textField_13.setText("0");
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("40");
		textField_14.setBounds(214, 281, 51, 19);
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c15 =e.getKeyChar();
				if(Character.isDigit(c15)|| Character.isLetter(c15))
				{
					textField_15.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_15.setEditable(true);
					
				}
				else
				{
					textField_15.setEditable(true);
				}
				
				
				
				
			}
		});
		textField_15.setBounds(277, 284, 51, 19);
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15);
		
		lblNewLabel_4_4 = new JLabel("Ballons-Printed");
		lblNewLabel_4_4.setBounds(23, 317, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c16 =e.getKeyChar();
				if(Character.isLetter(c16))
				{
					textField_16.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_16.setEditable(true);
					
				}
				else
				{
					textField_16.setEditable(true);
				}

			}
		});
		textField_16.setBounds(153, 314, 51, 19);
		textField_16.setText("0");
		textField_16.setColumns(10);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("50");
		textField_17.setBounds(214, 314, 51, 19);
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				
				char c18 =e.getKeyChar();
				if(Character.isDigit(c18)|| Character.isLetter(c18))
				{
					textField_18.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_18.setEditable(true);
					
				}
				else
				{
					textField_18.setEditable(true);
				}
			}
		});
		textField_18.setBounds(277, 313, 51, 19);
		textField_18.setColumns(10);
		frame.getContentPane().add(textField_18);
		
		lblNewLabel_4_5 = new JLabel("BackgroundCloth");
		lblNewLabel_4_5.setBounds(23, 352, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_5);
		
		textField_19 = new JTextField();
		textField_19.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c19 =e.getKeyChar();
				if(Character.isLetter(c19))
				{
					textField_19.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_19.setEditable(true);
					
				}
				else
				{
					textField_19.setEditable(true);
				}

			
			}
		});
		textField_19.setBounds(153, 349, 51, 19);
		textField_19.setText("0");
		textField_19.setColumns(10);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("200");
		textField_20.setBounds(214, 349, 51, 19);
		textField_20.setColumns(10);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				char c21 =e.getKeyChar();
				if(Character.isDigit(c21)|| Character.isLetter(c21))
				{
					textField_21.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_21.setEditable(true);
					
				}
				else
				{
					textField_21.setEditable(true);
				}
			}
		});
		textField_21.setBounds(277, 348, 51, 19);
		textField_21.setColumns(10);
		frame.getContentPane().add(textField_21);
		
		lblNewLabel_4_6 = new JLabel("BDAY-BannerGold.B");
		lblNewLabel_4_6.setBounds(23, 388, 124, 13);
		frame.getContentPane().add(lblNewLabel_4_6);
		
		textField_22 = new JTextField();
		textField_22.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c22 =e.getKeyChar();
				if(Character.isLetter(c22))
				{
					textField_22.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_22.setEditable(true);
					
				}
				else
				{
					textField_22.setEditable(true);
				}

			}
		});
		textField_22.setBounds(153, 385, 51, 19);
		textField_22.setText("0");
		textField_22.setColumns(10);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("300");
		textField_23.setBounds(214, 385, 51, 19);
		textField_23.setColumns(10);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c24 =e.getKeyChar();
				if(Character.isDigit(c24)|| Character.isLetter(c24))
				{
					textField_24.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_24.setEditable(true);
					
				}
				else
				{
					textField_24.setEditable(true);
				}
			}
		});
		textField_24.setBounds(277, 384, 51, 19);
		textField_24.setColumns(10);
		frame.getContentPane().add(textField_24);
		
		lblNewLabel_4_7 = new JLabel("BDAY-Banner-Cards");
		lblNewLabel_4_7.setBounds(23, 419, 124, 13);
		frame.getContentPane().add(lblNewLabel_4_7);
		
		textField_25 = new JTextField();
		textField_25.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c25 =e.getKeyChar();
				if(Character.isLetter(c25))
				{
					textField_25.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_25.setEditable(true);
					
				}
				else
				{
					textField_25.setEditable(true);
				}

			}
		});
		textField_25.setBounds(153, 416, 51, 19);
		textField_25.setText("0");
		textField_25.setColumns(10);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setText("250");
		textField_26.setBounds(214, 416, 51, 19);
		textField_26.setColumns(10);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c27=e.getKeyChar();
				if(Character.isDigit(c27)|| Character.isLetter(c27))
				{
					textField_27.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_27.setEditable(true);
					
				}
				else
				{
					textField_27.setEditable(true);
				}
			}
		});
		textField_27.setBounds(277, 415, 51, 19);
		textField_27.setColumns(10);
		frame.getContentPane().add(textField_27);
		
		lblNewLabel_4_8 = new JLabel("BDAY-Banner-Plain");
		lblNewLabel_4_8.setBounds(23, 461, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_8);
		
		textField_28 = new JTextField();
		textField_28.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c28 =e.getKeyChar();
				if(Character.isLetter(c28))
				{
					textField_28.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_28.setEditable(true);
					
				}
				else
				{
					textField_28.setEditable(true);
				}

			}
		});
		textField_28.setBounds(153, 458, 51, 19);
		textField_28.setColumns(10);
		textField_28.setText("0");
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setText("250");
		textField_29.setBounds(214, 458, 51, 19);
		textField_29.setColumns(10);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c30 =e.getKeyChar();
				if(Character.isDigit(c30)|| Character.isLetter(c30))
				{
					textField_30.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_30.setEditable(true);
					
				}
				else
				{
					textField_30.setEditable(true);
				}
			}
		});
		textField_30.setBounds(277, 457, 51, 19);
		textField_30.setColumns(10);
		frame.getContentPane().add(textField_30);
		
		lblNewLabel_4_9 = new JLabel("Magic Candles");
		lblNewLabel_4_9.setBounds(23, 501, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_9);
		
		textField_31 = new JTextField();
		textField_31.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c31 =e.getKeyChar();
				if(Character.isLetter(c31))
				{
					textField_31.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_31.setEditable(true);
					
				}
				else
				{
					textField_31.setEditable(true);
				}

			}
		});
		textField_31.setBounds(153, 498, 51, 19);
		textField_31.setText("0");
		textField_31.setColumns(10);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText("20");
		textField_32.setBounds(214, 498, 51, 19);
		textField_32.setColumns(10);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c33 =e.getKeyChar();
				if(Character.isDigit(c33)|| Character.isLetter(c33))
				{
					textField_33.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_33.setEditable(true);
					
				}
				else
				{
					textField_33.setEditable(true);
				}
			}
		});
		textField_33.setBounds(277, 497, 51, 19);
		textField_33.setColumns(10);
		frame.getContentPane().add(textField_33);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(643, 45, 57, 59);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\M SAIGANESH\\Downloads\\SRUniversity.png"));
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_9_1 = new JLabel("Flower Candles");
		lblNewLabel_4_9_1.setBounds(23, 530, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_9_1);
		
		textField_34 = new JTextField();
		textField_34.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c34 =e.getKeyChar();
				if(Character.isLetter(c34))
				{
					textField_34.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_34.setEditable(true);
					
				}
				else
				{
					textField_34.setEditable(true);
				}

			}
		});
		textField_34.setBounds(153, 527, 51, 19);
		textField_34.setText("0");
		textField_34.setColumns(10);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText("30");
		textField_35.setBounds(214, 527, 51, 19);
		textField_35.setColumns(10);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c36 =e.getKeyChar();
				if(Character.isDigit(c36)|| Character.isLetter(c36))
				{
					textField_36.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_36.setEditable(true);
					
				}
				else
				{
					textField_36.setEditable(true);
				}
			}
		});
		textField_36.setBounds(277, 526, 51, 19);
		textField_36.setColumns(10);
		frame.getContentPane().add(textField_36);
		
		JLabel lblNewLabel_4_9_2 = new JLabel("Number Candles");
		lblNewLabel_4_9_2.setBounds(23, 562, 118, 13);
		frame.getContentPane().add(lblNewLabel_4_9_2);
		
		textField_37 = new JTextField();
		textField_37.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
			
				char c37 =e.getKeyChar();
				if(Character.isLetter(c37))
				{
					textField_37.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_37.setEditable(true);
					
				}
				else
				{
					textField_37.setEditable(true);
				}

			}
		});
		textField_37.setBounds(153, 559, 51, 19);
		textField_37.setText("0");
		textField_37.setColumns(10);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText("10");
		textField_38.setBounds(214, 559, 51, 19);
		textField_38.setColumns(10);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c39 =e.getKeyChar();
				if(Character.isDigit(c39)|| Character.isLetter(c39))
				{
					textField_39.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_39.setEditable(true);
					
				}
				else
				{
					textField_39.setEditable(true);
				}
			}
		});
		textField_39.setBounds(277, 558, 51, 19);
		textField_39.setColumns(10);
		frame.getContentPane().add(textField_39);
		
		lblNewLabel_4_10 = new JLabel("Knife");
		lblNewLabel_4_10.setBounds(22, 594, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_10);
		
		textField_40 = new JTextField();
		textField_40.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c40 =e.getKeyChar();
				if(Character.isLetter(c40))
				{
					textField_40.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_40.setEditable(true);
					
				}
				else
				{
					textField_40.setEditable(true);
				}

			}
		});
		textField_40.setBounds(153, 591, 51, 19);
		textField_40.setText("0");
		textField_40.setColumns(10);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setText("10");
		textField_41.setBounds(214, 591, 51, 19);
		textField_41.setColumns(10);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c42 =e.getKeyChar();
				if(Character.isDigit(c42)|| Character.isLetter(c42))
				{
					textField_42.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_42.setEditable(true);
					
				}
				else
				{
					textField_42.setEditable(true);
				}
			}
		});
		textField_42.setBounds(276, 596, 51, 19);
		textField_42.setColumns(10);
		frame.getContentPane().add(textField_42);
		
		lblNewLabel_4_11 = new JLabel("Caps-Ordinary");
		lblNewLabel_4_11.setBounds(22, 629, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_11);
		
		textField_43 = new JTextField();
		textField_43.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c43 =e.getKeyChar();
				if(Character.isLetter(c43))
				{
					textField_43.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_43.setEditable(true);
					
				}
				else
				{
					textField_43.setEditable(true);
				}

			}
		});
		textField_43.setBounds(154, 626, 51, 19);
		textField_43.setText("0");
		textField_43.setColumns(10);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setText("10");
		textField_44.setBounds(213, 626, 51, 19);
		textField_44.setColumns(10);
		frame.getContentPane().add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c45 =e.getKeyChar();
				if(Character.isDigit(c45)|| Character.isLetter(c45))
				{
					textField_45.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_45.setEditable(true);
					
				}
				else
				{
					textField_45.setEditable(true);
				}
			
			}
		});
		textField_45.setBounds(277, 626, 51, 19);
		textField_45.setColumns(10);
		frame.getContentPane().add(textField_45);
		
		lblNewLabel_4_12 = new JLabel("Caps-Special");
		lblNewLabel_4_12.setBounds(22, 657, 87, 13);
		frame.getContentPane().add(lblNewLabel_4_12);
		
		textField_46 = new JTextField();
		textField_46.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c46 =e.getKeyChar();
				if(Character.isLetter(c46))
				{
					textField_46.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_46.setEditable(true);
					
				}
				else
				{
					textField_46.setEditable(true);
				}

			}
		});
		textField_46.setBounds(153, 655, 51, 19);
		textField_46.setText("0");
		textField_46.setColumns(10);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText("40");
		textField_47.setBounds(214, 654, 51, 19);
		textField_47.setColumns(10);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				char c48 =e.getKeyChar();
				if(Character.isDigit(c48)|| Character.isLetter(c48))
				{
					textField_48.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_48.setEditable(true);
					
				}
				else
				{
					textField_48.setEditable(true);
				}
			
				
			}
		});
		textField_48.setBounds(277, 654, 51, 19);
		textField_48.setColumns(10);
		frame.getContentPane().add(textField_48);
		
		lblNewLabel_6 = new JLabel("Item Type");
		lblNewLabel_6.setBounds(414, 151, 87, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_3_4 = new JLabel("Quantity");
		lblNewLabel_3_4.setBounds(529, 151, 51, 13);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		lblNewLabel_3_5 = new JLabel("Price");
		lblNewLabel_3_5.setBounds(608, 151, 37, 13);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		lblNewLabel_3_6 = new JLabel("Item Total");
		lblNewLabel_3_6.setBounds(679, 151, 77, 13);
		frame.getContentPane().add(lblNewLabel_3_6);

		JLabel lblNewLabel_7 = new JLabel("Papershot-Small");
		lblNewLabel_7.setBounds(415, 184, 97, 13);
		frame.getContentPane().add(lblNewLabel_7);




        textField_49 = new JTextField();
        textField_49.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c49 =e.getKeyChar();
				if(Character.isLetter(c49))
				{
					textField_49.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_49.setEditable(true);
					
				}
				else
				{
					textField_49.setEditable(true);
				}

        	}
        });
        textField_49.setBounds(530, 181, 51, 19);
        textField_49.setText("0");
		textField_49.setColumns(10);
		frame.getContentPane().add(textField_49);


        
        textField_50 = new JTextField();
        textField_50.setText("30");
        textField_50.setBounds(600, 181, 51, 19);
		textField_50.setColumns(10);
		frame.getContentPane().add(textField_50);
		

        
        textField_51 = new JTextField();
        textField_51.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		
        		
        		char c51 =e.getKeyChar();
				if(Character.isDigit(c51)|| Character.isLetter(c51))
				{
					textField_51.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_51.setEditable(true);
					
				}
				else
				{
					textField_51.setEditable(true);
				}
			
        	}
        });
        textField_51.setBounds(685, 181, 51, 19);
		textField_51.setColumns(10);
		frame.getContentPane().add(textField_51);


        
		JLabel lblNewLabel_7_1 = new JLabel("Papershot-Big");
		lblNewLabel_7_1.setBounds(415, 212, 97, 13);
		frame.getContentPane().add(lblNewLabel_7_1);

        
        textField_52 = new JTextField();
        textField_52.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c52 =e.getKeyChar();
				if(Character.isLetter(c52))
				{
					textField_52.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_52.setEditable(true);
					
				}
				else
				{
					textField_52.setEditable(true);
				}

        	}
        });
        textField_52.setBounds(530, 212, 51, 19);
        textField_52.setText("0");
		textField_52.setColumns(10);
		frame.getContentPane().add(textField_52);


        textField_53 = new JTextField();
        textField_53.setText("70");
        textField_53.setBounds(600, 212, 51, 19);
		textField_53.setColumns(10);
		frame.getContentPane().add(textField_53);
		

        textField_54 = new JTextField();
        textField_54.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c54 =e.getKeyChar();
				if(Character.isDigit(c54)|| Character.isLetter(c54))
				{
					textField_54.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_54.setEditable(true);
					
				}
				else
				{
					textField_54.setEditable(true);
				}
			
        	}
        });
        textField_54.setBounds(685, 212, 51, 19);
		textField_54.setColumns(10);
		frame.getContentPane().add(textField_54);


        
		JLabel lblNewLabel_7_2 = new JLabel("Papershot-Medium");
		lblNewLabel_7_2.setBounds(415, 247, 109, 13);
		frame.getContentPane().add(lblNewLabel_7_2);


        textField_55 =new JTextField();
        textField_55.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c55 =e.getKeyChar();
				if(Character.isLetter(c55))
				{
					textField_55.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_55.setEditable(true);
					
				}
				else
				{
					textField_55.setEditable(true);
				}

        	}
        });
        textField_55.setBounds(530, 247, 51, 19);
        textField_55.setText("0");
        textField_55.setColumns(10);
        frame.getContentPane().add(textField_55);


        
        textField_56 = new JTextField();
        textField_56.setText("50");
        textField_56.setBounds(600, 247, 51, 19);
		textField_56.setColumns(10);
		frame.getContentPane().add(textField_56);
		

        
        textField_57 = new JTextField();
        textField_57.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		
        		
        		
        		char c57 =e.getKeyChar();
				if(Character.isDigit(c57)|| Character.isLetter(c57))
				{
					textField_57.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_57.setEditable(true);
					
				}
				else
				{
					textField_57.setEditable(true);
				}
			
        	}
        });
        textField_57.setBounds(685, 247, 51, 19);
		textField_57.setColumns(10);
		frame.getContentPane().add(textField_57);

		JLabel lblNewLabel_7_3 = new JLabel("Snow Spray");
		lblNewLabel_7_3.setBounds(415, 281, 97, 13);
		frame.getContentPane().add(lblNewLabel_7_3);


        textField_58 =new JTextField();
        textField_58.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c58 =e.getKeyChar();
				if(Character.isLetter(c58))
				{
					textField_58.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_58.setEditable(true);
					
				}
				else
				{
					textField_58.setEditable(true);
				}

        	}
        });
        textField_58.setBounds(530, 281, 51, 19);
        textField_58.setText("0");
        textField_58.setColumns(10);
        frame.getContentPane().add(textField_58);
        
        textField_59 = new JTextField();
        textField_59.setText("40");
        textField_59.setBounds(600, 281, 51, 19);
		textField_59.setColumns(10);
		frame.getContentPane().add(textField_59);
		

        
        textField_60 = new JTextField();
        textField_60.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c60 =e.getKeyChar();
				if(Character.isDigit(c60)|| Character.isLetter(c60))
				{
					textField_60.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_60.setEditable(true);
					
				}
				else
				{
					textField_60.setEditable(true);
				}
			
        	}
        });
        textField_60.setBounds(685, 281, 51, 19);
		textField_60.setColumns(10);
		frame.getContentPane().add(textField_60);

		JLabel lblNewLabel_7_4 = new JLabel("Ribbons-Carribbon");
		lblNewLabel_7_4.setBounds(415, 314, 115, 13);
		frame.getContentPane().add(lblNewLabel_7_4);


        textField_61 = new JTextField();
        textField_61.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c61 =e.getKeyChar();
				if(Character.isLetter(c61))
				{
					textField_61.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_61.setEditable(true);
					
				}
				else
				{
					textField_61.setEditable(true);
				}

        	}
        });
        textField_61.setBounds(530, 314, 51, 19);
        textField_61.setText("0");
        textField_61.setColumns(10);
        frame.getContentPane().add(textField_61);

        textField_62 = new JTextField();
        textField_62.setText("30");
        textField_62.setBounds(600, 314, 51, 19);
		textField_62.setColumns(10);
		frame.getContentPane().add(textField_62);
		

        
        textField_63 = new JTextField();
        textField_63.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c63 =e.getKeyChar();
				if(Character.isDigit(c63)|| Character.isLetter(c63))
				{
					textField_63.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_63.setEditable(true);
					
				}
				else
				{
					textField_63.setEditable(true);
				}
			
        		
        	}
        });
        textField_63.setBounds(685, 314, 51, 19);
		textField_63.setColumns(10);
		frame.getContentPane().add(textField_63);


        
		JLabel lblNewLabel_7_5 = new JLabel("Ballon Pump");
		lblNewLabel_7_5.setBounds(415, 349, 115, 13);
		frame.getContentPane().add(lblNewLabel_7_5);



        textField_64 = new JTextField();
        textField_64.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		
        		
        		char c64 =e.getKeyChar();
				if(Character.isLetter(c64))
				{
					textField_64.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_64.setEditable(true);
					
				}
				else
				{
					textField_64.setEditable(true);
				}

        	}
        });
        textField_64.setBounds(530, 349, 51, 19);
        textField_64.setText("0");
        textField_64.setColumns(10);
        frame.getContentPane().add(textField_64);

        
        textField_65 = new JTextField();
        textField_65.setText("50");
        textField_65.setBounds(600, 349, 51, 19);
		textField_65.setColumns(10);
		frame.getContentPane().add(textField_65);

        textField_66 = new JTextField();
        textField_66.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c66 =e.getKeyChar();
				if(Character.isDigit(c66)|| Character.isLetter(c66))
				{
					textField_66.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_66.setEditable(true);
					
				}
				else
				{
					textField_66.setEditable(true);
				}
			
        	}
        });
        textField_66.setBounds(685, 349, 51, 19);
		textField_66.setColumns(10);
		frame.getContentPane().add(textField_66);



		JLabel lblNewLabel_7_6 = new JLabel("Plaster-Singleside");
		lblNewLabel_7_6.setBounds(415, 385, 115, 13);
		frame.getContentPane().add(lblNewLabel_7_6);

        
        textField_67 = new JTextField();
        textField_67.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c67 =e.getKeyChar();
				if(Character.isLetter(c67))
				{
					textField_67.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_67.setEditable(true);
					
				}
				else
				{
					textField_67.setEditable(true);
				}

        	}
        });
        textField_67.setBounds(530, 385, 51, 19);
        textField_67.setText("0");
        textField_67.setColumns(10);
        frame.getContentPane().add(textField_67);

        textField_68 = new JTextField();
        textField_68.setText("10");
        textField_68.setBounds(600, 385, 51, 19);
		textField_68.setColumns(10);
		frame.getContentPane().add(textField_68);
		

        
        textField_69 = new JTextField();
        textField_69.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c69 =e.getKeyChar();
				if(Character.isDigit(c69)|| Character.isLetter(c69))
				{
					textField_69.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_69.setEditable(true);
					
				}
				else
				{
					textField_69.setEditable(true);
				}
			
        	}
        });
        textField_69.setBounds(685, 385, 51, 19);
		textField_69.setColumns(10);
		frame.getContentPane().add(textField_69);

		JLabel lblNewLabel_7_7 = new JLabel("Plaster-2side");
		lblNewLabel_7_7.setBounds(415, 416, 115, 13);
		frame.getContentPane().add(lblNewLabel_7_7);


        
        textField_70 = new JTextField();
        textField_70.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c70 =e.getKeyChar();
				if(Character.isLetter(c70))
				{
					textField_70.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_70.setEditable(true);
					
				}
				else
				{
					textField_70.setEditable(true);
				}

        	}
        });
        textField_70.setBounds(530, 416, 51, 19);
        textField_70.setText("0");
        textField_70.setColumns(10);
        frame.getContentPane().add(textField_70);

        textField_71 = new JTextField();
        textField_71.setText("25");
        textField_71.setBounds(600, 416, 51, 19);
		textField_71.setColumns(10);
		frame.getContentPane().add(textField_71);
		

        
        textField_72 = new JTextField();
        textField_72.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c72 =e.getKeyChar();
				if(Character.isDigit(c72)|| Character.isLetter(c72))
				{
					textField_72.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_72.setEditable(true);
					
				}
				else
				{
					textField_72.setEditable(true);
				}
			
        	}
        });
        textField_72.setBounds(685, 416, 51, 19);
		textField_72.setColumns(10);
		frame.getContentPane().add(textField_72);


      
		JLabel lblNewLabel_7_8 = new JLabel("BDAY-Tag");
		lblNewLabel_7_8.setBounds(415, 458, 115, 13);
		frame.getContentPane().add(lblNewLabel_7_8);

        
        textField_73 = new JTextField();
        textField_73.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c73 =e.getKeyChar();
				if(Character.isLetter(c73))
				{
					textField_73.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_73.setEditable(true);
					
				}
				else
				{
					textField_73.setEditable(true);
				}

        	}
        });
        textField_73.setBounds(530, 458, 51, 19);
        textField_73.setText("0");
        textField_73.setColumns(10);
        frame.getContentPane().add(textField_73);

        textField_74 = new JTextField();
        textField_74.setText("70");
        textField_74.setBounds(600, 458, 51, 19);
		textField_74.setColumns(10);
		frame.getContentPane().add(textField_74);
		

        
        textField_75 = new JTextField();
        textField_75.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		
        		
        		char c75 =e.getKeyChar();
				if(Character.isDigit(c75)|| Character.isLetter(c75))
				{
					textField_75.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_75.setEditable(true);
					
				}
				else
				{
					textField_75.setEditable(true);
				}
			
        	}
        });
        textField_75.setBounds(685, 458, 51, 19);
		textField_75.setColumns(10);
		frame.getContentPane().add(textField_75);

		JLabel lblNewLabel_7_9 = new JLabel("Crown");
		lblNewLabel_7_9.setBounds(415, 498, 109, 13);
		frame.getContentPane().add(lblNewLabel_7_9);

        textField_76 = new JTextField();
        textField_76.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c76 =e.getKeyChar();
				if(Character.isLetter(c76))
				{
					textField_76.setEditable(false);
					JOptionPane.showMessageDialog(null,"Enter Valid quantity of items");
					textField_76.setEditable(true);
					
				}
				else
				{
					textField_76.setEditable(true);
				}

        	}
        });
        textField_76.setBounds(530, 498, 51, 19);
        textField_76.setText("0");
        textField_76.setColumns(10);
        frame.getContentPane().add(textField_76);

        textField_77 = new JTextField();
        textField_77.setText("40");
        textField_77.setBounds(600, 498, 51, 19);
		textField_77.setColumns(10);
		frame.getContentPane().add(textField_77);
		

        
        textField_78 = new JTextField();
        textField_78.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		char c78 =e.getKeyChar();
				if(Character.isDigit(c78)|| Character.isLetter(c78))
				{
					textField_78.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ITEM TOTAL");
					textField_78.setEditable(true);
					
				}
				else
				{
					textField_78.setEditable(true);
				}
			
        	}
        });
        textField_78.setBounds(685, 498, 51, 19);
		textField_78.setColumns(10);
		frame.getContentPane().add(textField_78);
		
		JLabel lblNewLabel_8 = new JLabel("Total");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_8.setBounds(23, 699, 45, 28);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_81 = new JTextField();
		textField_81.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c81 =e.getKeyChar();
				if(Character.isDigit(c81)|| Character.isLetter(c81))
				{
					textField_81.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER TOTAL");
					textField_81.setEditable(true);
					
				}
				else
				{
					textField_81.setEditable(true);
				}
			
			}
		});
		textField_81.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_81.setBounds(65, 701, 109, 24);
		frame.getContentPane().add(textField_81);
		textField_81.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Bill No:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_9.setBounds(197, 699, 68, 28);
		frame.getContentPane().add(lblNewLabel_9);
		
		
		textField_82 = new JTextField();
		textField_82.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c82=e.getKeyChar();
				if(Character.isDigit(c82)|| Character.isLetter(c82))
				{
					textField_82.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER BILL NUMBER");
					textField_82.setEditable(true);
					
				}
				else
				{
					textField_82.setEditable(true);
				}
			
			}
		});
		textField_82.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_82.setBounds(263, 706, 96, 19);
		textField_82.setColumns(10);
		String Bno="";
		bno=1105+(int)(Math.random()*4238);
		Bno+=bno+1258;
		textField_82.setText(Bno);
		bno++;
		
		frame.getContentPane().add(textField_82);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(746, 58, 545, 584);
		frame.getContentPane().add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				char cta =e.getKeyChar();
				if(Character.isDigit(cta)|| Character.isLetter(cta))
				{
					textArea.setEditable(false);
					JOptionPane.showMessageDialog(null,"NO CHANCE TO ENTER ANY TEXT");
					textArea.setEditable(true);
					
				}
				else
				{
					textArea.setEditable(true);
				}
			
			}
		});
		textArea.setBounds(new Rectangle(800, 58, 491, 570));
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		scrollPane_1.setViewportView(textArea);
		
		int ittot[] =new int[25];
		int itqt[]=new int[25];
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
					totit=0; quantity=0;
				//int totit=0;
				 q1=Integer.parseInt(textField_4.getText());
			     p1=Integer.parseInt(textField_5.getText());
				 it1=q1*p1;
				ittot[0]=it1;
				//totit+=it1;
			    String IT1=Integer.toString(it1);
				textField_6.setText(IT1);				

				 q2=Integer.parseInt(textField_9.getText());
				 p2=Integer.parseInt(textField_8.getText());
				 it2=q2*p2;
				ittot[1]=it2;
				//totit+=it2;
			    String IT2=Integer.toString(it2);
				textField_7.setText(IT2);	

			
				 q3=Integer.parseInt(textField_10.getText());
				 p3=Integer.parseInt(textField_11.getText());
				 it3=q3*p3;
				ittot[2]=it3;
				//totit+=it3;
			    String IT3=Integer.toString(it3);
				textField_12.setText(IT3);	
				
				 q4=Integer.parseInt(textField_13.getText());
				 p4=Integer.parseInt(textField_14.getText());
				 it4=q4*p4;
				ittot[3]=it4;
				//totit+=it4;
			    String IT4=Integer.toString(it4);
				textField_15.setText(IT4);	

				
				 q5=Integer.parseInt(textField_16.getText());
				 p5=Integer.parseInt(textField_17.getText());
				 it5=q5*p5;
				ittot[4]=it5;
				//totit+=it5;
			    String IT5=Integer.toString(it5);
				textField_18.setText(IT5);	
				
				
				 q6=Integer.parseInt(textField_19.getText());
				
				 p6=Integer.parseInt(textField_20.getText());
				 it6=q6*p6;
				ittot[5]=it6;
			//	totit+=it6;
			    String IT6=Integer.toString(it6);
				textField_21.setText(IT6);	
				
				
				
				 q7=Integer.parseInt(textField_22.getText());
				
				
				 p7=Integer.parseInt(textField_23.getText());
				 it7=q7*p7;
				ittot[6]=it7;
				//totit+=it7;
			    String IT7=Integer.toString(it7);
				textField_24.setText(IT7);	
				
				 q8=Integer.parseInt(textField_25.getText());
				 p8=Integer.parseInt(textField_26.getText());
				 it8=q8*p8;
				ittot[7]=it8;
				//totit+=it8;
			    String IT8=Integer.toString(it8);
				textField_27.setText(IT8);	
				
				
				 q9=Integer.parseInt(textField_28.getText());
				 p9=Integer.parseInt(textField_29.getText());
				 it9=q9*p9;
				ittot[8]=it9;
				//totit+=it9;
			    String IT9=Integer.toString(it9);
				textField_30.setText(IT9);	
			
				
				 q10=Integer.parseInt(textField_31.getText());
				 p10=Integer.parseInt(textField_32.getText());
				 it10=q10*p10;
				ittot[9]=it10;
				//totit+=it10;
			    String IT10=Integer.toString(it10);
				textField_33.setText(IT10);	
				
				
				 q11=Integer.parseInt(textField_34.getText());
				
				 p11=Integer.parseInt(textField_35.getText());
				 it11=q11*p11;
				ittot[10]=it11;
				//totit+=it11;
			    String IT11=Integer.toString(it11);
				textField_36.setText(IT11);				


				 q12=Integer.parseInt(textField_37.getText());
				 p12=Integer.parseInt(textField_38.getText());
				 it12=q12*p12;
				ittot[11]=it12;
				//totit+=it12;
			    String IT12=Integer.toString(it12);
				textField_39.setText(IT12);	
				
				 q13=Integer.parseInt(textField_40.getText());
				 p13=Integer.parseInt(textField_41.getText());
				 it13=q13*p13;
				ittot[12]=it13;
				//totit+=it13;
			    String IT13=Integer.toString(it13);
				textField_42.setText(IT13);	
				
				 q14=Integer.parseInt(textField_43.getText());
				 p14=Integer.parseInt(textField_44.getText());
				 it14=q14*p14;
				ittot[13]=it14;
				//totit+=it14;
			    String IT14=Integer.toString(it14);
				textField_45.setText(IT14);	
				
				 q15=Integer.parseInt(textField_46.getText());
				 p15=Integer.parseInt(textField_47.getText());
				 it15=q15*p15;
				ittot[14]=it15;
				//totit+=it15;
			    String IT15=Integer.toString(it15);
				textField_48.setText(IT15);	
				
			
				
				 q16=Integer.parseInt(textField_49.getText());
				 p16=Integer.parseInt(textField_50.getText());
				 it16=q16*p16;
				ittot[14]=it15;
				//totit+=it16;
			    String IT16=Integer.toString(it16);
				textField_51.setText(IT16);	
			
				
				 q17=Integer.parseInt(textField_52.getText());
				 p17=Integer.parseInt(textField_53.getText());
				 it17=q17*p17;
				ittot[16]=it17;
				//totit+=it17;
			    String IT17=Integer.toString(it17);
				textField_54.setText(IT17);	
			
				
				 q18=Integer.parseInt(textField_55.getText());
				
				 p18=Integer.parseInt(textField_56.getText());
				 it18=q18*p18;
				ittot[17]=it18;
				//totit+=it18;
			    String IT18=Integer.toString(it18);
				textField_57.setText(IT18);	
			
				 q19=Integer.parseInt(textField_58.getText());
				 p19=Integer.parseInt(textField_59.getText());
				 it19=q19*p19;
				ittot[18]=it19;
				//totit+=it19;
			    String IT19=Integer.toString(it19);
				textField_60.setText(IT19);	
			
				
				 q20=Integer.parseInt(textField_61.getText());
				 p20=Integer.parseInt(textField_62.getText());
				 it20=q20*p20;
				ittot[19]=it20;
				//totit+=it20;
			    String IT20=Integer.toString(it20);
				textField_63.setText(IT20);	
				
			
				
				 q21=Integer.parseInt(textField_64.getText());
				 p21=Integer.parseInt(textField_65.getText());
				 it21=q21*p21;
				ittot[20]=it21;
				//totit+=it21;
			    String IT21=Integer.toString(it21);
				textField_66.setText(IT21);				

				
				 q22=Integer.parseInt(textField_67.getText());
				 p22=Integer.parseInt(textField_68.getText());
				 it22=q22*p22;
				ittot[21]=it22;
				//totit+=it22;
			    String IT22=Integer.toString(it22);
				textField_69.setText(IT22);	
				
				 q23=Integer.parseInt(textField_70.getText());
				 p23=Integer.parseInt(textField_71.getText());
				 it23=q23*p23;
				ittot[22]=it23;
				//totit+=it23;
			    String IT23=Integer.toString(it23);
				textField_72.setText(IT23);	

				
				 q24=Integer.parseInt(textField_73.getText());
				
				 p24=Integer.parseInt(textField_74.getText());
				 it24=q24*p24;
				ittot[23]=it24;
				//totit+=it24;
			    String IT24=Integer.toString(it24);
				textField_75.setText(IT24);	
				
				
				
				 q25=Integer.parseInt(textField_76.getText());
				 p25=Integer.parseInt(textField_77.getText());
				 it25=q25*p25;
				ittot[24]=it25;
				//totit+=it25;
			    String IT25=Integer.toString(it25);
				textField_78.setText(IT25);	

			 for(int i=0;i<=24;i++)
			 {
				 totit+=ittot[i];
			 }
			 
			 if(textField.getText().equals(""))
				 JOptionPane.showMessageDialog(null,"THE CUSTOMER NAME IS A REQUIREMENT. ENTER THE CUSTOMERS NAME" );
			 if(textField_1.getText().length()!=10) 
				 JOptionPane.showMessageDialog(null,"PLEASE ENTER A VALID PHONE NUMBER" );
			 if(totit<=0)
					JOptionPane.showMessageDialog(frame,"THE TOTAL IS 0.00 PLEASE CHECK THE ITEMS." );
				 TOTIT=Integer.toString(totit);
				
				textField_81.setText(TOTIT);
				
		}
		});
		btnNewButton.setBounds(753, 699, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BILL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 /*change1 = totit + a;
				 String CHG1=Integer.toString(change1);
				 textField_85.setText(CHG1);
				*/
			
             if(totit>0) 
             {
				textArea.setText("Manager:M.SAIGANESH \t  \t Prop:M.DHARMARAJU\n");
				textArea.append("---------------------------------------------------------------------------------------------------");
				textArea.append("\n\t     SAI GANESH DECORATIONS \n");
				textArea.append("\t             WARANGAL-(TS)\n");
				textArea.append("----------------------------------------------------------------------------------------------------");
				textArea.append("\nNAME  : "+textField.getText());
				textArea.append("\n\nPHONE NO : "+textField_1.getText());
				textArea.append("\n\nDATE  :"+textField_2.getText());
				textArea.append("\n\nTIME  :"+textField_3.getText());
				textArea.append("\n\nBill NO  :"+textField_82.getText()+"\n");
				textArea.append("----------------------------------------------------------------------------------------------------");
				textArea.append("\n ITEM                  QUATITY  \t \t ITEM-COST\n");
				textArea.append("----------------------------------------------------------------------------------------------------");
				quantity=0;
				if(q1>0)
				{itqt[0]=q1;
					textArea.append("\n\n Ballon-Plain                       "+q1+"\t\t"+it1);
				}
				
				if(q2>0)
				{itqt[1]=q2;
					textArea.append("\n\n Ballon-Dotted                    "+q2+"\t\t"+it2);
				}
				
				if(q3>0)
				{itqt[2]=q3;
					textArea.append("\n\n Ballon-Metallic                  "+q3+"\t\t"+it3);
				}
				
				if(q4>0)
				{itqt[3]=q4;
					textArea.append("\n\n Ballon-Dil                          "+q4+"\t\t"+it4);
				}
				
				if(q5>0)
				{itqt[4]=q5;
					textArea.append("\n\n Ballon-Printed                   "+q5+"\t\t"+it5);
				}
				
				if(q6>0)
				{itqt[5]=q6;
					textArea.append("\n\n Background Cloth              "+q6+"\t\t"+it6);
				}
				
				if(q7>0)
				{itqt[6]=q7;
					textArea.append("\n\n BDAY-BannerGold B         "+q7+"\t\t"+it7);
				}
				
				if(q8>0)
				{itqt[7]=q8;
					textArea.append("\n\n BDAY-Banner-Cards          "+q8+"\t\t"+it8);
				}
				
				if(q9>0)
				{itqt[8]=q9;
					textArea.append("\n\n BDAY-Banner-Plain           "+q9+"\t\t"+it9);
				}
				
				if(q10>0)
				{itqt[9]=q10;
					textArea.append("\n\n Magic Candles                    "+q10+"\t\t"+it10);
				}
				
				
				if(q11>0)
				{itqt[10]=q11;
					textArea.append("\n\n Flower Candles                   "+q11+"\t\t"+it11);
				}
				
				if(q12>0)
				{itqt[11]=q12;
					textArea.append("\n\n Number Candles                 "+q12+"\t\t"+it12);
				}
				
				if(q13>0)
				{itqt[12]=q13;
					textArea.append("\n\n Knife                                  "+q13+"\t\t"+it13);
				}
				
				if(q14>0)
				{itqt[13]=q14;
					textArea.append("\n\n Caps-Ordinary                    "+q14+"\t\t"+it14);
				}
				
				if(q15>0)
				{itqt[14]=q15;
					textArea.append("\n\n Caps-Special                       "+q15+"\t\t"+it15);
				}
				
				if(q16>0)
				{itqt[15]=q16;
					textArea.append("\n\n Papershot-Small                  "+q16+"\t\t"+it16);
				}
				
				if(q17>0)
				{itqt[16]=q17;
					textArea.append("\n\n Papershot-Big                     "+q17+"\t\t"+it17);
				}
				
				if(q18>0)
				{itqt[17]=q18;
					textArea.append("\n\n Papershot-Medium              "+q18+"\t\t"+it18);
				}
				
				if(q19>0)
				{itqt[18]=q19;
					textArea.append("\n\n Snow Spray                         "+q19+"\t\t"+it19);
				}
				
				if(q20>0)
				{itqt[19]=q20;
					textArea.append("\n\n Ribbons-Caribbon              "+q20+"\t\t"+it20);
				}
				
				if(q21>0)
				{itqt[20]=q21;
					textArea.append("\n\n Ballon-Pump                      "+q21+"\t\t"+it21);
				}
				
				if(q22>0)
				{itqt[21]=q22;
					textArea.append("\n\n Plaster-single side                 "+q22+"\t\t"+it22);
				}
				
				if(q23>0)
				{  
					itqt[22]=q23;
					textArea.append("\n\n Plaster 2 side                        "+q23+"\t\t"+it23);
				}
				
				if(q24>0)
				{itqt[23]=q24;
					textArea.append("\n\n BDay-crown                         "+q24+"\t\t"+it24);
				}
				
				if(q25>0)
				{itqt[24]=q25;
					textArea.append("\n\n Crown                                 "+q25+"\t\t"+it25);
				} 
				/*for(int i=0;i<=24;i++)
				 {
					if(itqt[i]>0)
					 quantity+=itqt[i];
				 }*/
				quantity=q1+q2+q3+q4+q5+q6+q7+q8+q9+q10+q11+q12+q13+q14+q15+q16+q17+q18+q19+q20+q21+q22+q23+q24+q25;
				textArea.append("\n\n-------------------------------------------------------------------------------------------------------------");
				textArea.append("\n\n\t   TOTAL QTY."+quantity+"          TOTAL :"+totit);
				textArea.append("\n\n-------------------------------------------------------------------------------------------------------------");
				
				textArea.append("\n\n-----------------------THANK YOU FOR VISITING!!!VISIT AGAIN!-------------------------------------------------------------");
				textArea.append("\n\n-------------------------------------------------------------------------------------------------------------");
				
             }
             else if(totit<=0 || quantity<=0)
             {
            	 if(textField.getText().equals(""))
					 JOptionPane.showMessageDialog(null,"THE CUSTOMER NAME IS A REQUIREMENT. ENTER THE CUSTOMERS NAME" );
				 if(textField_1.getText().length()!=10) 
					 JOptionPane.showMessageDialog(null,"PLEASE ENTER A VALID PHONE NUMBER" );
				 if(totit<=0)
						JOptionPane.showMessageDialog(frame,"THE TOTAL IS 0.00 PLEASE CHECK THE ITEMS." );
				 TOTIT=Integer.toString(totit);
             
             }
            // totit=0;
			}
             
		});
		btnNewButton_1.setBounds(886, 699, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_81.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_12.setText(null);
				textField_15.setText(null);
				textField_18.setText(null);
				textField_21.setText(null);
				textField_24.setText(null);
				textField_27.setText(null);
				textField_30.setText(null);
				textField_33.setText(null);
				textField_36.setText(null);
				textField_39.setText(null);
				textField_42.setText(null);
				textField_45.setText(null);
				textField_48.setText(null);
				textField_51.setText(null);
				textField_54.setText(null);
				textField_57.setText(null);
				textField_60.setText(null);
				textField_63.setText(null);
				textField_66.setText(null);
				textField_69.setText(null);
				textField_72.setText(null);
				textField_75.setText(null);
				textField_78.setText(null);
				
				
				String Bno="";
				bno=1105+(int)(Math.random()*4238);
				Bno+=bno+1326;
				textField_82.setText(Bno);
				bno++;
				
				textField_4.setText("0");
				textField_9.setText("0");
				textField_10.setText("0");
				textField_13.setText("0");
				textField_16.setText("0");
				textField_19.setText("0");
				textField_22.setText("0");
				textField_25.setText("0");
				textField_28.setText("0");
				textField_31.setText("0");
				textField_34.setText("0");
				textField_37.setText("0");
				textField_40.setText("0");
				textField_43.setText("0");
				textField_46.setText("0");
				textField_49.setText("0");
				textField_52.setText("0");
				textField_55.setText("0");
				textField_58.setText("0");
				textField_61.setText("0");
				textField_64.setText("0");
				textField_67.setText("0");
				textField_70.setText("0");
				textField_73.setText("0");
				textField_76.setText("0");
				Calendar timer =Calendar.getInstance();
				timer.getTime();
				
				SimpleDateFormat tTime =new SimpleDateFormat("HH:mm:ss");
				textField_3.setText(tTime.format(timer.getTime()));

				SimpleDateFormat Tdate =new SimpleDateFormat("dd-MM-yyyy");
				textField_2.setText(Tdate.format(timer.getTime()));
				
				textArea.setText(null);
				totit=0;
				quantity=0;
			}
		});
		btnNewButton_2.setBounds(1033, 699, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("PRINT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textArea.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "NO BILL TO PRINT");
				}
				else {
				boolean ppt;
				try {
					ppt = textArea.print();
						if(ppt)
						{
						JOptionPane.showMessageDialog(null, "Done");
						}
						else
						{
						JOptionPane.showMessageDialog(null, "Printing");
						}
					
					} 
					catch (PrinterException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					}
				}
				
			}
		});
		btnNewButton_1_1.setBounds(1150, 699, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
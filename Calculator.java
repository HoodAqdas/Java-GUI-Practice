package AP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	JTextField textField, textField2;
	JPanel buttonpanel;
	JButton[] NumButtons= new JButton[10];
	JButton[] OtherButtons= new JButton[14];
	
	String StrNum;
	double a=0,b=0,c=0;
	String operator;
	
	DecimalFormat df= new DecimalFormat("#.#########");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setLayout(null);
		setTitle("Calculator");
		setResizable(false);
		setSize(349,580);
		getContentPane().setBackground(new Color(217,217,217));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,38));
		textField.setBackground(new Color(217,217,217));
		textField.setBounds(7, 78, 328, 68);
		 
		textField.setForeground(new Color(52,52,52));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBorder(new LineBorder(new Color(217,217,217)));
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,15));
		textField2.setBackground(new Color(217,217,217));
		textField2.setBounds(7, 30, 320, 30);
		textField2.setForeground(new Color(100,100,100));
		textField2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2.setEditable(true);
		textField2.setBorder(new LineBorder(new Color(217,217,217)));
		
		OtherButtons[0] = new JButton("CE");
		OtherButtons[1] = new JButton("C");
		OtherButtons[2] = new JButton("<");
		OtherButtons[3] = new JButton(Character.toString(247));
		OtherButtons[4] = new JButton("x");
		OtherButtons[5] = new JButton("-");
		OtherButtons[6] = new JButton("+");
		OtherButtons[7] = new JButton("=");
		OtherButtons[8] = new JButton(".");
		OtherButtons[9] = new JButton(Character.toString(177));
		OtherButtons[10] = new JButton("%");
		OtherButtons[11] = new JButton(Character.toString(0x221A));
		OtherButtons[12] = new JButton("x"+Character.toString(178));
		OtherButtons[13] = new JButton(Character.toString(185)+"/"+"x");
		
		for(int i=0;i<10;i++) {
			NumButtons[i]=new JButton(String.valueOf(i));
			NumButtons[i].setFont(new Font("Arial Rounded MT Bold",Font.BOLD,18));
			NumButtons[i].setFocusPainted(false);
			NumButtons[i].setBackground(new Color(242,242,242));
			NumButtons[i].setForeground(new Color(0,0,0));
			NumButtons[i].setFocusPainted(false);
			NumButtons[i].addActionListener((ActionListener) this);
			NumButtons[i].setBorder(new LineBorder(new Color(217,217,217)));
		}
		
		for(int i=0;i<14;i++) {
			//NumButtons[i]=new JButton(String.valueOf(i));
			OtherButtons[i].setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
			OtherButtons[i].setFocusPainted(false);
			OtherButtons[i].setBackground(new Color(230,230,230));
			OtherButtons[i].setForeground(new Color(0,0,0));
			OtherButtons[i].setFocusPainted(false);
			OtherButtons[i].addActionListener((ActionListener) this);
			OtherButtons[i].setBorder(new LineBorder(new Color(217,217,217)));
		}
		
		OtherButtons[3].setBackground(new Color(230,230,230));
		OtherButtons[4].setBackground(new Color(230,230,230));
		OtherButtons[5].setBackground(new Color(230,230,230));
		OtherButtons[6].setBackground(new Color(230,230,230));
		
		OtherButtons[3].setBorder(new LineBorder(new Color(217,217,217)));
		OtherButtons[4].setBorder(new LineBorder(new Color(217,217,217)));
		OtherButtons[5].setBorder(new LineBorder(new Color(217,217,217)));
		OtherButtons[6].setBorder(new LineBorder(new Color(217,217,217)));
		
		OtherButtons[7].setBorder(new LineBorder(new Color(217,217,217)));
		OtherButtons[7].setBackground(new Color(230,230,230));
		
		
		buttonpanel= new JPanel();
		buttonpanel.setBackground(new Color(217,217,217));
		buttonpanel.setBounds(0, 180, 335, 362);
		buttonpanel.setLayout(new GridLayout(6,5));
		
		buttonpanel.add(OtherButtons[10]);
		buttonpanel.add(OtherButtons[11]);
		buttonpanel.add(OtherButtons[12]);
		buttonpanel.add(OtherButtons[13]);
		
		buttonpanel.add(OtherButtons[0]);
		buttonpanel.add(OtherButtons[1]);
		buttonpanel.add(OtherButtons[2]);
		buttonpanel.add(OtherButtons[3]);
		
		buttonpanel.add(NumButtons[7]);
		buttonpanel.add(NumButtons[8]);
		buttonpanel.add(NumButtons[9]);
		buttonpanel.add(OtherButtons[4]);
		
		buttonpanel.add(NumButtons[4]);
		buttonpanel.add(NumButtons[5]);
		buttonpanel.add(NumButtons[6]);
		buttonpanel.add(OtherButtons[5]);
		
		buttonpanel.add(NumButtons[1]);
		buttonpanel.add(NumButtons[2]);
		buttonpanel.add(NumButtons[3]);
		buttonpanel.add(OtherButtons[6]);
		
		buttonpanel.add(OtherButtons[9]);
		buttonpanel.add(NumButtons[0]);
		buttonpanel.add(OtherButtons[8]);
		buttonpanel.add(OtherButtons[7]);
	
		
		add(buttonpanel);
		add(textField);
		add(textField2);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<10;i++) {
			if(e.getSource()==NumButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		
		//Decimal button
		if(e.getSource() == OtherButtons[8]) {
			textField.setText(textField.getText().concat("."));
		}
		
		//clear button
		if(e.getSource()==OtherButtons[0] || e.getSource()==OtherButtons[1] ) {
			textField.setText("");
			textField2.setText("");
			a=0;
			b=0;
			c=0;
		}
		
		//Delete Button
		if(e.getSource() == OtherButtons[2]) {
			int del = textField.getText().length()-1;
			textField.setText(textField.getText().substring(0,del));
		}
		
		
		//Negative Button Action
		if(e.getSource() == OtherButtons[9]) {
			
			double NegSign = (Double.parseDouble(textField.getText())) * -1;
			
			if(NegSign % 1 ==0) {
				 int n  = (int)Double.parseDouble(String.valueOf(NegSign));
				 textField.setText("" + n);
			}else {
				textField.setText("" + NegSign);
		
			}
		}
		// Divide
		
		if(e.getSource() == OtherButtons[3]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText().concat("/"));
			
			operator = "divide";
			textField.setText("");
		}
		
		//Multiply
		
		if(e.getSource() == OtherButtons[4]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText().concat("*"));
			
			operator = "multiply";
			textField.setText("");
		}
		
		//Und
		
		if(e.getSource() == OtherButtons[13]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(Character.toString(185)+"/"+textField.getText());
			
			operator = "und";
			textField.setText("");
		}
		
		//Square
		
		if(e.getSource() == OtherButtons[11]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(Character.toString(0x221A)+textField.getText());
			
			operator = "Sqrt";
			textField.setText("");
		}
		
		//Square root
		
		if(e.getSource() == OtherButtons[12]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText()+Character.toString(178));
			
			operator = "Sqr";
			textField.setText("");
		}

		// Subtract 
       if(e.getSource() == OtherButtons[5]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText().concat("-"));
			
			operator = "subtract";
			textField.setText("");
		}
       
       //Addition
       if(e.getSource() == OtherButtons[6]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText().concat("+"));
			
			operator = "addition";
			textField.setText("");
		}
       
       // Module
       if(e.getSource() == OtherButtons[10]) {
			
			a= Double.parseDouble(textField.getText());
			textField2.setText(textField.getText().concat("%"));
			
			operator = "modulus";
			textField.setText("");
		}
       
       //Equal button
       if(e.getSource() == OtherButtons[7]) {
			
    	   if(operator != "Sqr" && operator != "Sqrt" && operator != "und") {
    	   b= Double.parseDouble(textField.getText());
    	   
    	   if( b%2 ==0) {
    		   textField2.setText(textField2.getText().concat(String.valueOf((int)b)));
    	   }else {
    		   textField2.setText(textField2.getText().concat(String.valueOf(b)));
    	   }
    	   
    	   }
    	   
    	   switch (operator) {
    	   		case "addition":
    	   		 c= a+b;
    	   		 break;
    	   		
    	   		case "Sqrt":
    	   			double temp;

    	   			c = a / 2;

    	   			do {
    	   				temp = c;
    	   				c = (temp + (a / temp)) / 2;
    	   			} while ((temp - c) != 0);
    	   			
       	   		 break;
    	   		
    	   		case "Sqr":
       	   		 c= a*a; 
       	   		 break;
       	   		 
    	   		case "und":
          	   		 c= 1/a; 
          	   		 break;
    	   		 
    	   		 
    	   		case "subtract":
    	   			c= a-b;
    	   			break;
    	   			
    	   		case "multiply":
    	   			c = a*b;
    	   			break;
    	   			
    	   		case "divide":
    	   			if( b ==0) {
    	   				textField.setText("ERROR");
    	   				c = a /b;
    	   			}else {
    	   				c = a/b;
    	   			}
    	   			break;
    	   		case "modulus":
    	   			c = a % b;
    	   			 break;
    	   
    	   }
    	   
    	   // DETECT DECIMAL
    	   if( c%1 ==0) {
    		   int d = (int) Double.parseDouble(String.valueOf(c));
    		   textField.setText(""+d);
    		   a=d;
    	   }else {
    		   textField.setText(df.format(c));
    		   a=c;
    	   }
    	   
    	   
    	   
		}
		
		
		
	}

}

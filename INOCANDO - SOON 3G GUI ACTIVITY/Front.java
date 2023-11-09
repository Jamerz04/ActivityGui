package cite.gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;




class Front{
	
	JFrame frame = new JFrame();
	
	
	JLabel label1,label2,labelName,labelM,labelLast,labelSuffix,labelMobile,labelEmail;
	
	
	TextField firstName,middleName,lastName,suffix,mobile,email;
	
	
	JButton submit,clear; 	
	
	
	public void Gui(){
		
		frame.setTitle("CITE");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);	
		frame.setSize(400,900);
		frame.setResizable(false);
		
	//-----------------------------------------------------/	
		label1 = new JLabel("Welcome to CITE Online Submission Portal.");
		label1.setBounds(40,0,360,100);
		frame.add(label1);
	//-----------------------------------------------------/	
		
		label2 = new JLabel("Please specify the required fields.");
		label2.setBounds(40,10,360,120);
		frame.add(label2);
		
	//-----------------------------------------------------/	
		labelName = new JLabel("First Name");
		labelName.setBounds(40,100,100,30);
		frame.add(labelName);
		
		
		
		firstName = new TextField();
		firstName.setBounds(40,130,300,30);
		frame.add(firstName);
	//-----------------------------------------------------/	
		
		labelM = new JLabel("Middle Name (leave empty, if not applicable)");
		labelM.setBounds(40,160,300,30);
		frame.add(labelM);
		
		
		
		middleName = new TextField();
		middleName.setBounds(40,190,300,30);
		frame.add(middleName);
		
//-----------------------------------------------------/		
		
		labelLast = new JLabel("Last Name");
		labelLast.setBounds(40,220,100,30);
		frame.add(labelLast);
		
		
		lastName = new TextField();
		lastName.setBounds(40,250,300,30);
		frame.add(lastName);
		
		
//-------------------------------------------------------------------------/		
		labelSuffix = new JLabel("Suffix (Type none, if not applicable)");
		labelSuffix.setBounds(40,280,300,30);
		frame.add(labelSuffix);
		
		
		suffix = new TextField();
		suffix.setBounds(40,310,300,30);
		frame.add(suffix);
		
//----------------------------------------------------------------------/		
		
		labelMobile = new JLabel("Mobile Number");
		labelMobile.setBounds(40,340,100,30);
		frame.add(labelMobile);
		
		
		mobile = new TextField();
		mobile.setBounds(40,370,300,30);
		frame.add(mobile);
		
//-----------------------------------------------------------------------/	
		labelEmail = new JLabel("Email");
		labelEmail.setBounds(40,400,100,30);
		frame.add(labelEmail);
		
		email = new TextField();
		email.setBounds(40,430,300,30);
		frame.add(email);
		
//-----------------------------------------------------------------------/	
		
		submit = new JButton("Submit");
		submit.setBounds(240,480,100,30); 
		frame.add(submit);
		
		
		
		clear = new JButton("Clear");
		clear.setBounds(130,480,100,30); 
		frame.add(clear);
	//-----------------------------------------------------------------/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
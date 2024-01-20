package com.labPractice;

import javax.swing.*;
import java.awt.*;

public class MenuExample {
	JMenu email,address,roll,number;
	JMenuItem em,ad,rln,num;
	MenuExample(){
		JFrame frame=new JFrame("MenuExample");
		JMenuBar bar=new JMenuBar();
		JMenu name=new JMenu("Aadit");
		JMenuItem name2=new JMenuItem("Bipin");
		email=new JMenu("Email");
		address=new JMenu("Address");
		roll=new JMenu("Roll No.");
		number=new JMenu("Phone Number");
		em=new JMenuItem("vardanshiwakoti123@gmail.com");
		ad=new JMenuItem("Pepsicola");
		rln=new JMenuItem("210108");
		num=new JMenuItem("9863034803");
		email.add(em);
		address.add(ad);
		roll.add(rln);
		number.add(num);
		name.add(email);
		name.add(address);
		name.add(roll);
		name.add(number);
		bar.add(name);
		bar.add(name2);
		frame.setJMenuBar(bar);
//      to insert horizontal and vertical gaps
//		frame.setLayout(new BorderLayout(20,20));
		Button north=new Button("Top");
		frame.add(north,BorderLayout.NORTH);
		Button east=new Button("Right");
		frame.add(east,BorderLayout.EAST);
		Button west=new Button("Left");
		frame.add(west,BorderLayout.WEST);
		Button south=new Button("Bottom");
		Button center=new Button("Middle");
		frame.add(center,BorderLayout.CENTER);
		frame.add(south,BorderLayout.SOUTH);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new MenuExample();
	}

}

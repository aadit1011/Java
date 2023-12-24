package CasitaPractice;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormSample extends JFrame{
	
	FormSample(){
		JFrame frame=new JFrame();
		frame.setLayout(null);
		frame.setTitle("Form");
		frame.setVisible(true);
		frame.setSize(400,400);
		JLabel name=new JLabel("Name");
		name.setBounds(20,30,60,20);
		JLabel address=new JLabel("Address");
		address.setBounds(20,60,60,20);
		JLabel email=new JLabel("Email");
		email.setBounds(20,90,60,20);
		JLabel password=new JLabel("Password");
		password.setBounds(20,120,60,20);
		frame.add(name);
		frame.add(address);
		frame.add(email);
		frame.add(password);
		JTextField f_name=new JTextField();
		JTextField f_address=new JTextField();
		JTextField f_email=new JTextField();
		JTextField f_password=new JTextField();
		f_name.setBounds(90,30,200,20);
		f_address.setBounds(90,60,200,20);
		f_email.setBounds(90,90,200,20);
		f_password.setBounds(90,120,200,20);
		frame.add(f_name);
		frame.add(f_address);
		frame.add(f_email);
		frame.add(f_password);
		Button submit=new Button("Submit");
		frame.add(submit);
		submit.setBounds(100,200,80,20);
	}
	
	public static void main(String[] args) {
		
		new FormSample();
	}

}

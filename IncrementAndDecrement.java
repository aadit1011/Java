package CasitaPractice;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IncrementAndDecrement extends JFrame implements ActionListener{
	
	int num=0;
	JLabel result;
	JTextField f_name;
	IncrementAndDecrement(){
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
		result=new JLabel();
		result.setBounds(10,20,100,50);
		Button plus=new Button("+");
		Button minus=new Button("-");
		Button reset=new Button("reset");
		plus.setBounds(30, 90, 30, 50);
		minus.setBounds(80,90,30,50);
		reset.setBounds(130,90,50,50);
		JLabel name=new JLabel("Name");
		f_name=new JTextField();
		frame.add(name);
		frame.add(f_name);
		name.setBounds(300,30,100,50);
		f_name.setBounds(300,150,100,20);
		frame.add(plus);
		frame.add(result);
		frame.add(minus);
		frame.add(reset);
		plus.addActionListener(this);
		minus.addActionListener(this);
		reset.addActionListener(this);
		Button submit=new Button("Submit");
		frame.add(submit);
		submit.setBounds(300,300,60,70);
		submit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int res;
		String but=e.getActionCommand();
		switch (but){
		case "+":
			res=++num;
			result.setText("Result::"+res);
			break;
		case "-":
			res=--num;
			result.setText("Result::"+res);
			break;
		case "reset":
			num=0;
			res=num;
			result.setText("Result::"+res);
			break;
		case "Submit":
			System.out.println("Name is "+f_name.getText());
			break;
		default:
			System.out.println("No button");
		}
		
		
		
	}
	public static void main(String[] args) {
		new IncrementAndDecrement();

	}

}

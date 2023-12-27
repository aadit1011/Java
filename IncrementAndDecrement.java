package CasitaPractice;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class IncrementAndDecrement extends JFrame implements ActionListener{
	
	int num=0;
	IncrementAndDecrement(){
		JFrame frame=new JFrame();
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
		Button plus=new Button("+");
		Button minus=new Button("-");
		Button reset=new Button("reset");
		plus.setBounds(30, 40, 30, 50);
		minus.setBounds(80,40,30,50);
		reset.setBounds(130,40,50,50);
		frame.add(plus);
		frame.add(minus);
		frame.add(reset);
		plus.addActionListener(this);
		minus.addActionListener(this);
		reset.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int res;
		
		String but=e.getActionCommand();
		switch (but){
		case "+":
			res=++num;
			System.out.println(res);
			break;
		case "-":
			res=--num;
			System.out.println(res);
			break;
		case "reset":
			num=0;
			res=num;
			System.out.println(res);
			break;
		default:
			System.out.println("Wrong Button Clicked.......");
		}
		
	}
	public static void main(String[] args) {
		new IncrementAndDecrement();

	}

}

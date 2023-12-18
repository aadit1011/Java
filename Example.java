package com.exam;

public class Example {
	private String name;
	private String address;
	private int roll_no;
	
	//Example using setter and getter.
//	public static void main(String[] args) {	
//		
//		Example exam1=new Example();
//		exam1.setName("Aadit");
//		exam1.setAddress("Pepsicola");
//		exam1.setRoll(210108);
//		System.out.println("Name is "+exam1.getName());
//		System.out.println("Address is "+exam1.getAddress());
//		System.out.println("ROll number is "+exam1.getRoll());
//	}
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	public void setAddress(String address)
//	{
//		this.address=address;
//	}
//	public void setRoll(int roll)
//	{
//		this.roll_no=roll;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public String getAddress()
//	{
//		return address;
//	}
//	public int getRoll()
//	{
//		return roll_no;
//	}
	
//Example using constructor
	
	Example(String name,String Address,int roll)
	{
		this.name=name;
		this.address=Address;
		this.roll_no=roll;
	}
	public static void main(String [] args)
	{
		Example exam1=new Example( "Aadit" ,"Pepsicola",210108);
		exam1.show();
		
	}
	public void show()
	{
		System.out.println("Name is="+name);
		System.out.println("Address is="+address);
		System.out.println("Roll number is="+roll_no);
	}
}

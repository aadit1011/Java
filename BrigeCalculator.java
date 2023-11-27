package com.practice;

public class BrigeCalculator {

	public static void main(String[] args) {
			
		BrigeCalculator time1=new BrigeCalculator();
		time1.bridgeChecker("########");
	}
	public void bridgeChecker(String bridge)
	{
		if(bridge.contains(" "))
		{
			System.out.println("Broken Bridge");
		}
		else
		{
			System.out.println("Safe Bridge");
		}
	}

}

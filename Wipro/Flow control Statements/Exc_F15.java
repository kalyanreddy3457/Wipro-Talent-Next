package com.wipro.flowcontrolstatements;

public class Exc_F15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0)
		{
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<a;i++)
		{
		
		for(int j=0;j<=i;j++)
			System.out.print("*\t");
		System.out.println();
		}
		}
		else
			System.out.println("Please enter an integer number");
		

	}

}

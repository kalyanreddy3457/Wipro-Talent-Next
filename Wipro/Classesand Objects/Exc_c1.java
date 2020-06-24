package com.wipro.classesandobjects;

class Calculator
{
	static double powerInt(int num1,int num2)	
	{
		return(Math.pow(num1,num2));
	}
	static double powerDouble(double num1,int num2)
	{
		return(Math.pow((int)num1,num2)); 
	}
	void show()
	{
		System.out.println();
	}
}
public class Exc_c1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double j=Calculator.powerInt(3,2);
      double k=Calculator.powerDouble(2, 4);
      System.out.println(j+" "+k);
	}

}

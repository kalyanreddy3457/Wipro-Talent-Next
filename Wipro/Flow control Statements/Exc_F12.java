package com.wipro.flowcontrolstatements;

public class Exc_F12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=Integer.parseInt(args[0]);
      int c=0;
      for(int i=1;i<=a;i++)
      {
    	  if(a%i==0)
    		  c++;
      }
      if(c==2)
    	  System.out.println("The given number is Prime");
      else
    	  System.out.println("The given number is Not Prime");
	}

}

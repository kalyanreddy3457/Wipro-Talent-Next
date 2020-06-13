package com.wipro.flowcontrolstatements;

public class Exc_F17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=Integer.parseInt(args[0]);
       int rev=0,b=a;
       while(a>0)
       {
    	   rev=(rev*10)+(a%10);
    	   a=a/10;
       }
       if(b==rev)
    	   System.out.println(b+" is a Palindrome");
       else
    	   System.out.println(b+" is not a Palindrome");
	}

}

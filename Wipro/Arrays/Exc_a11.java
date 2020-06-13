package com.wipro.arrays;

public class Exc_a11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
     int []a=new int[] {1,4,1,4};
     int i;
     for(i=0;i<a.length;i++)
     {
    	 if(a[i]!=1&&a[i]!=4)
    	 {
    		break; 
    	 }
     }
     if(i>=a.length)
    	 System.out.println("true");
     else
    	 System.out.println("false");
	}

}

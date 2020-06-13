package com.wipro.arrays;

public class Exc_a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a=new int[]{1,4,34,56,7};
      int num=Integer.parseInt(args[0]);
      int i;
      for(i=0;i<a.length;i++)
      {
    	  if(num==a[i]) {
    		  System.out.println(i);
    	  break;
      }
      }
      if(i==a.length)
    	  System.out.println(-1);
      
	}

}

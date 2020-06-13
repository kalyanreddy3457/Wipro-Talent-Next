package com.wipro.flowcontrolstatements;

public class Exc_F13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c=0;
      for(int i=10;i<=99;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  if(i%j==0)
    			  c++;
    	  }
    	  if(c==2)
    		  System.out.println(i);
    	  c=0;
      }
	}

}

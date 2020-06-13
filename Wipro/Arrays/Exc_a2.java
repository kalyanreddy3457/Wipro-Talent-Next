package com.wipro.arrays;

public class Exc_a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a=new int[] {1,2,5,3,7,11,4};
      int i,max=0,min=9999;
      for(i=0;i<a.length;i++)
      {
    	  if(a[i]>max)
    		  max=a[i];
    	  if(a[i]<min)
    		  min=a[i];
      }
      System.out.println(max+" "+min);
	}

}

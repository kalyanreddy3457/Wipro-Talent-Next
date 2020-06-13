package com.wipro.arrays;

public class Exc_a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a=new int[] {1,3,4,4,6,3};
      int d=a.length-1;
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length-1;j++)
    	  {
    		  if(a[i]==a[j])  
    		  {
    			  d--;
    			for(int k=j;k<a.length-1;k++)
    			{
    				a[k]=a[k+1];
    			}
    		  }
    	  }
      }
      for(int i=0;i<d;i++)
      {
    	  System.out.print(a[i]+"\t");
      }
	}

}

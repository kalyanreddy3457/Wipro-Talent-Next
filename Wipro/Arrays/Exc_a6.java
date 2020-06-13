package com.wipro.arrays;

public class Exc_a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a=new int[] {1,8,3,9,4,6};
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a.length-1;j++)
    	  {
    		  if(a[j]>a[j+1])
    		  {
    			  a[j]=a[j]+a[j+1];
    			  a[j+1]=a[j]-a[j+1];
    			  a[j]=a[j]-a[j+1];
    		  }
    	  }
      }
      for(int i=0;i<a.length;i++)
      {
    	  System.out.print(a[i]+"\t");
      }
	}

}

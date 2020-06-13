package com.wipro.arrays;

public class Exc_a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []a=new int[]{1,2,3,4,5};
     int sum=0,avg;
     for(int i=0;i<a.length;i++)
     {
    	 sum+=a[i];
     }
     avg=sum/a.length;
     System.out.println(sum+" "+avg);
	}

}

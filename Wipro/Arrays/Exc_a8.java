package com.wipro.arrays;

public class Exc_a8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []a=new int[] {5,20,6,4,10,7};
     int i,sum=0,n=a.length,c=0;
     for(i=0;i<n;i++)
     {
    	 if(a[i]==6)
    	 {
    		 for(i=i+1;i<n;i++)
    		 {
    			 if(a[i]==7) {
    				 c=1;
    				 break;
    				
    			 }
    		 }
    		 if(c==0)
        		 sum+=6;
    		 i++;
    	 }
    	 
    	 if(i<n)
    	 {
    	 sum=sum+a[i];
    	 }
     }
     System.out.println(sum);
	}

}

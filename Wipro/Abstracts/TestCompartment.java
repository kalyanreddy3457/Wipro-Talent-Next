package com.wipro.abstracts;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Random rand=new Random();
     Compartment []a=new Compartment[10];
     for(int i=0;i<10;i++)
     {
    	 int n=rand.nextInt(4);
     if(n==0)
     {
    	a[i]=new FirstClass();
     }
     else if(n==1)
     {
    	 a[i]=new Ladies();
     }
     else if(n==2)
     {
    	a[i]=new General(); 
     }
     else if(n==3)
     {
    	a[i]=new Luggage(); 
     }
   System.out.println(a[i].notice());
     }
	}

}

package com.wipro.abstracts;

abstract class Compartment {
		public abstract String notice();  
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return("The Comparment is FirstClass");
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return("The Comparment is Ladies");
	}
}
class General extends Compartment
{
	public String notice()
	{
		return("The Comparment is General");
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return("The Comparment is Luggage");
	}
}
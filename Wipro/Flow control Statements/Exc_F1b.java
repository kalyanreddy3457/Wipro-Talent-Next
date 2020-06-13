
public class Exc_F1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		Exc_F1b d=new Exc_F1b(); 
		boolean ans=d.lastDigit(a,b);
		System.out.println(ans);

	}
	boolean lastDigit(int a,int b)
	{
		if(a%10==b%10)
			return true;
		else
			return false;
	}

}

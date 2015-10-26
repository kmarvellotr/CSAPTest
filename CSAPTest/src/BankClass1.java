
public class BankClass1 {


	public static void main(String args[])
	{
		Bank tom = new Bank();
		Bank sue = new Bank();
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
		System.out.println();
	}
}


/*class Bank
{
	private double checking;
	private double savings;
	
	public Bank()
	{
		checking = 0;
		savings = 0;
	}
	
	public double getChecking()
	{
		return checking;
	}

	public double getSavings()
	{
		return savings;
	}




	
}

*/


public class BankClass2 {

	public static void main(String args[])
	{
		Bank tom = new Bank(3000.0,2000.0);
		Bank sue = new Bank(4500.0,1500.0);
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
		System.out.println();
		tom.alterChecking(-1000.0);
		tom.alterSavings(-500.0);
		sue.alterChecking(2000.0);
		sue.alterSavings(1500.0);
		System.out.println("Tom's checking balance:	" + tom.getChecking());
		System.out.println("Tom's savings balance:	" + tom.getSavings());
		System.out.println("Sue's checking balance:	" + sue.getChecking());
		System.out.println("Sue's savings balance:	" + sue.getSavings());
	}
}


class Bank
{
	private double checking;
	private double savings;
	
	public Bank()
	{
		checking 
	
	public double getChecking ()
	{
		return checking;
	}
	



}

	
}

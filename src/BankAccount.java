/**
 * 
 * Erin Bevec
 * AP Computer Science - Period 6
 * Bank Account
 *
 */
public class BankAccount
{
	private String name;
	private int accountNumber;
	private double balance;
	public BankAccount()
	{
		name = "Erin";
		accountNumber = 212177;
		balance = 100;
	}

	public BankAccount(String a, int b, double c)
	{ 
		a = name;
		b = accountNumber;
		c = balance;
	}
	
	public void deposit(double amountIn) 
	{
		balance = balance + amountIn;
	}
	
	public void withdraw(double amountOut)
	{
		balance = balance - amountOut;
	}
	public double getBalance() 
	{
		return balance;
	}
	public String toString()
	{
		return "balance:" + balance;
		return "accountNumber:" + accountNumber;
		return "name:" + name;
	}
}



public class BankAccount
{
	int balance=2000;
	int amount;
	public int WithDraw(int amount) throws InsufficientFundsExpcetion
	{
		if(amount>balance)
		{
			throw  new InsufficientFundsExpcetion();
		}
		
		return balance - amount;
	}
	
		
}
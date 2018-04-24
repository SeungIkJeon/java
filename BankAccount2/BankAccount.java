
public class BankAccount {
	private int accountNum;
	private int balance;
	private static int accountCount=0;
	public static final int WITHDRAW_MIN = 100;

	public BankAccount() {
		balance = 0;
		accountNum = ++accountCount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", balance=" + balance + "]";
	}

	public static int getAccountCount() {
		return accountCount;
	}
}

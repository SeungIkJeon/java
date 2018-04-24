
public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab6_4 : Àü½ÂÀÍ");
		System.out.println();

		System.out.println(BankAccount.getAccountCount());
		System.out.println(BankAccount.WITHDRAW_MIN);

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		System.out.println(BankAccount.getAccountCount());
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}
}

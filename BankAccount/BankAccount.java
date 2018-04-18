/*
 * ���ϸ�: BankAccountTest.java
 * �ۼ���: 2018.4.17
 * �ۼ���: ������
 * ����:  this() ȣ��� Ŭ���� �Ű������� ���� �޼ҵ� �ۼ��� ����
 */

public class BankAccount {
	private int accountNum; //���¹�ȣ �ʵ�
	private String name; //�����ָ� �ʵ�
	private int balance; //�ܾ��ʵ�

	public BankAccount(int accountNum, String name, int balance){
		this.accountNum = accountNum;
		this.name = name;
		if(balance<0)
			balance=0;
		else
			this.balance = balance;
	} //���¹�ȣ, �����ָ�, �ܾ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor(������) - �ܾ��� �����̸� 0���� �ʱ�ȭ

	public BankAccount(int accountNum, String name) {
		this(accountNum, name, 0);
	} //���¹�ȣ, �����ָ��� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor(������) - this():���� constructor(������)�� ȣ���Ͽ� �ʱ�ȭ

	public int getAccountNum() {
		return accountNum;
	} //�ܾ� getter(������) �޼ҵ�

	public String getName() {
		return name;
	} //�����ָ� getter(������) �޼ҵ�

	public void setName(String name) {
		this.name = name;
	} //�����ָ� setter(������) �޼ҵ�

	public int getBalance() {
		return balance;
	} //�ܾ� getter(������) �޼ҵ�

	public void deposit(int money) {
		balance+=money;
	} //�Ա� �޼ҵ� 

	public void withdraw(int money) {
		if(money>balance)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance-=money;
	} //��� �޼ҵ� (�ܾ� ������ ����� �̷������ �ʰ� ���� �޽��� ���)

	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	} //toString() - ���¹�ȣ, �����ָ�, �ܾ��� ���ڿ��� ����

	public void remittance(BankAccount account, int money) {
		if(money>balance)
			System.out.println("�ܾ��� �����մϴ�.");
		else {
			balance-=money;
			account.balance+=money;
		}
	} //�۱� �޼ҵ�(�ٸ� ������� ��ü�� �۱ݾ��� �Ű������� �޾� �� ���·κ��� �ٸ� ���·� �۱� �� ������ �ܾ� ������ �۱��� �̷������ �ʰ� ���� �޽��� ���)

}

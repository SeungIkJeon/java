/*
 * ���ϸ�: BankAccount.java
 * �ۼ���: 2018.5.15
 * �ۼ���: ������
 * ����:  ����� �����Ѵ�.
 */

// ���� ���� Ŭ����
public class BankAccount {
	protected int id; // ���¹�ȣ
	private int balance; // �ܾ�

	public BankAccount(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	public BankAccount(int id) {
		this(id, 0);
	}
	public int getBalance() { // �ܾ���ȸ
		return balance;
	}
	public void deposit(int amount) { // �Ա�
		System.out.println("���� " + id + ": " + amount + "�� �Ա�");
		balance += amount;
	}
	public void withdraw(int amount) { // ���
		System.out.println("���� " + id + ": " + amount + "�� ���");
		balance -= amount;
	}
}

class NormalAccount extends BankAccount {
	public NormalAccount(int id, int balance) {
		super(id, balance);
	}

	public NormalAccount(int id) {
		super(id, 0);
	}

	@Override
	public void withdraw(int amount) {
		if(getBalance() >= amount) 
			super.withdraw(amount);
		else
			System.out.println("���� "+id+": �ܾ� �������� ��� ����");
	}
}

class MinusAccount extends BankAccount {
	private int loanLimit;

	public MinusAccount(int id, int balance, int loanLimit) {
		super(id, balance);
		this.loanLimit = loanLimit;
	}

	public MinusAccount(int id, int loanLimit) {
		super(id, 0);
		this.loanLimit = loanLimit;
	}

	@Override
	public void withdraw(int amount) {
		if(loanLimit <= amount)
			super.withdraw(amount);
		else
			System.out.println("�����ѵ��� �ʰ��Ǿ����ϴ�.");
	}

	public int getLoanLimit() {
		return loanLimit;
	}
}

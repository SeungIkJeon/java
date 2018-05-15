/*
 * 파일명: BankAccount.java
 * 작성일: 2018.5.15
 * 작성자: 전승익
 * 내용:  상속을 연습한다.
 */

// 은행 계좌 클래스
public class BankAccount {
	protected int id; // 계좌번호
	private int balance; // 잔액

	public BankAccount(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	public BankAccount(int id) {
		this(id, 0);
	}
	public int getBalance() { // 잔액조회
		return balance;
	}
	public void deposit(int amount) { // 입금
		System.out.println("계좌 " + id + ": " + amount + "원 입금");
		balance += amount;
	}
	public void withdraw(int amount) { // 출금
		System.out.println("계좌 " + id + ": " + amount + "원 출금");
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
			System.out.println("계좌 "+id+": 잔액 부족으로 출금 실패");
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
			System.out.println("대출한도가 초과되었습니다.");
	}

	public int getLoanLimit() {
		return loanLimit;
	}
}

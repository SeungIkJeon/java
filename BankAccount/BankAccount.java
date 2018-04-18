/*
 * 파일명: BankAccountTest.java
 * 작성일: 2018.4.17
 * 작성자: 전승익
 * 내용:  this() 호출과 클래스 매개변수를 갖는 메소드 작성을 연습
 */

public class BankAccount {
	private int accountNum; //계좌번호 필드
	private String name; //예금주명 필드
	private int balance; //잔액필드

	public BankAccount(int accountNum, String name, int balance){
		this.accountNum = accountNum;
		this.name = name;
		if(balance<0)
			balance=0;
		else
			this.balance = balance;
	} //계좌번호, 예금주명, 잔액을 매개변수로 받아 초기화하는 constructor(생성자) - 잔액이 음수이면 0으로 초기화

	public BankAccount(int accountNum, String name) {
		this(accountNum, name, 0);
	} //계좌번호, 예금주명을 매개변수로 받아 초기화하는 constructor(생성자) - this():위의 constructor(생성자)를 호출하여 초기화

	public int getAccountNum() {
		return accountNum;
	} //잔액 getter(접근자) 메소드

	public String getName() {
		return name;
	} //예금주명 getter(접근자) 메소드

	public void setName(String name) {
		this.name = name;
	} //예금주명 setter(설정자) 메소드

	public int getBalance() {
		return balance;
	} //잔액 getter(접근자) 메소드

	public void deposit(int money) {
		balance+=money;
	} //입금 메소드 

	public void withdraw(int money) {
		if(money>balance)
			System.out.println("잔액이 부족합니다.");
		else
			balance-=money;
	} //출금 메소드 (잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력)

	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	} //toString() - 계좌번호, 예금주명, 잔액을 문자열로 리턴

	public void remittance(BankAccount account, int money) {
		if(money>balance)
			System.out.println("잔액이 부족합니다.");
		else {
			balance-=money;
			account.balance+=money;
		}
	} //송금 메소드(다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금 내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력)

}

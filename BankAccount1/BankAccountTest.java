/*
 * 파일명: BankAccountTest.java
 * 작성일: 2018.4.04
 * 작성자: 전승익
 * 내용: 클래스를 이용 객체생성, 메소드 호출하는  프로그램
 */

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount();
		//BankAccount형의 계좌 myBankAccount()객체 생성

		myBankAccount.deposit(2000); //2000원 입금
		myBankAccount.deposit(3000); //3000원 입금

		System.out.println("잔액 = " + myBankAccount.balance + "원"); 
		//계좌의 잔액 필드 출력

		System.out.println("잔액 = " + myBankAccount.getBalance() + "원"); 
		// 잔액조회(메소드 getBalance()를 호출)하여 잔액 출력

		myBankAccount.withdraw(1000); //1000원 출금

		System.out.println("잔액 = " + myBankAccount.getBalance() + "원");
		// 잔액조회(메소드 getBalance()를 호출)하여 잔액 출력

	}

}

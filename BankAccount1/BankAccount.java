/*
 * 파일명: BankAccount.java
 * 작성일: 2018.4.04
 * 작성자: 전승익
 * 내용: 클래스 작성 필드와 메소드 정의
 */

public class BankAccount {
	int balance; //잔액 필드

	void deposit(int depositAmount) {
		balance+=depositAmount; //잔액은 기존 잔액에 입금액을  더한것
	} //입금 메소드

	int getBalance() {
		return balance;
	} //잔액조회 메소드 리턴값이 잔액

	void withdraw(int remittance) {
		balance-=remittance; //잔액은 기존 잔액에 출금액을 뺀것
	} //출금 메소드

}

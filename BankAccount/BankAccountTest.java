/*
 * 파일명: BankAccountTest.java
 * 작성일: 2018.4.17
 * 작성자: 전승익
 * 내용:  this() 호출과 클래스 매개변수를 갖는 메소드 작성을 연습
 */

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("hw6_2 : 전승익");
		System.out.println();

		BankAccount account1 = new BankAccount(1, "kim", 9000); 
		//계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 account1 생성
		BankAccount account2 = new BankAccount(2, "lee"); 
		//계좌번호 2, 예금주명 lee로 초기화한 은행계좌 account2 생성

		Scanner input = new Scanner(System.in); 

		account2.deposit(input.nextInt()); //사용자로부터 입금액을 입력받아 account2에 입금
		account2.withdraw(input.nextInt()); //사용자로부터 출금액을 입력받아 account2에서 출금
		account2.deposit(input.nextInt());
		account2.withdraw(input.nextInt());

		account2.remittance(account1, input.nextInt()); 
		// 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		account2.remittance(account1, input.nextInt()); 

		account2.setName("park"); //account2의 예금주명을 park으로 수정

		System.out.println(account2.toString()); //account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(account1.toString()); //account1의 계좌번호, 예금주명, 잔액 출력


	}

}
/*
 * 파일명: AccountTest.java
 * 작성일: 2018.5.15
 * 작성자: 전승익
 * 내용:  상속을 연습한다.
 */
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : 전승익");
		System.out.println();
		//(1) 다음과 같은 4개의 계좌 생성
		//일반 계좌(계좌번호 11, 잔액 1000로 초기화)
		//일반 계좌(계좌번호 22로 초기화)
		//마이너스통장 계좌(계좌번호 33, 잔액 1000, 대출한도 500로 초기화)
		//마이너스통장 계좌(계좌번호 44, 대출한도 500로 초기화)
		NormalAccount acc1 = new NormalAccount(11, 1000);
		NormalAccount acc2 = new NormalAccount(22);
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);
		MinusAccount acc4 = new MinusAccount(44, 500);
		
		Scanner input = new Scanner(System.in);
		//(2) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc1 = " + acc2.getBalance());
		System.out.println("acc1 = " + (acc3.getBalance() + acc3.getLoanLimit()));
		System.out.println("acc1 = " + (acc4.getBalance() + acc4.getLoanLimit()));
		System.out.println();
		//(3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.print("출금액 입력: ");
		int withdrawMoney = input.nextInt();
		acc1.withdraw(withdrawMoney);
		acc2.withdraw(withdrawMoney);
		acc3.withdraw(withdrawMoney);
		acc4.withdraw(withdrawMoney);
		System.out.println();
		//(4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.print("입금액 입력: ");
		int depositMoney = input.nextInt();
		acc1.deposit(depositMoney);
		acc2.deposit(depositMoney);
		acc3.deposit(depositMoney);
		acc4.deposit(depositMoney);
		System.out.println();
		//(5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금가능액");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc1 = " + acc2.getBalance());
		System.out.println("acc1 = " + (acc3.getBalance() + acc3.getLoanLimit()));
		System.out.println("acc1 = " + (acc4.getBalance() + acc4.getLoanLimit()));
	}

}
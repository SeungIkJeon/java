/*
 * 파일명: ExchangeMoney.java
 * 작성일: 2018.3.16
 * 작성자: 전승익
 * 내용:  주석, 변수 사용, 간단한 수식, 입력과 출력을 연습하는 프로그램
 */

package hw2_1;

import java.util.Scanner;

public class ExchangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		final int EXCHANGE_RATE = 1060;

		System.out.println("hw2_1: 전승익 \n");

		System.out.print("500원 갯수 입력: ");
		int i = input.nextInt();
		System.out.print("100원 갯수 입력: ");
		int x = input.nextInt();
		System.out.print("50원 갯수 입력: ");
		int y = input.nextInt();
		System.out.print("10원 갯수 입력: ");
		int z = input.nextInt();

		int totalSaving = 500*i + 100*x + 50*y + 10*z;
		System.out.println("\n저금 총액 = " + totalSaving);
		int dollar = totalSaving/EXCHANGE_RATE;
		System.out.println("달러 액수 = " + dollar );
		int won = totalSaving%EXCHANGE_RATE;
		System.out.println("남은 한화 = " + won);
	}

}

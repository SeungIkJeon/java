/*
 * ���ϸ�: ExchangeMoney.java
 * �ۼ���: 2018.3.16
 * �ۼ���: ������
 * ����:  �ּ�, ���� ���, ������ ����, �Է°� ����� �����ϴ� ���α׷�
 */

package hw2_1;

import java.util.Scanner;

public class ExchangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		final int EXCHANGE_RATE = 1060;

		System.out.println("hw2_1: ������ \n");

		System.out.print("500�� ���� �Է�: ");
		int i = input.nextInt();
		System.out.print("100�� ���� �Է�: ");
		int x = input.nextInt();
		System.out.print("50�� ���� �Է�: ");
		int y = input.nextInt();
		System.out.print("10�� ���� �Է�: ");
		int z = input.nextInt();

		int totalSaving = 500*i + 100*x + 50*y + 10*z;
		System.out.println("\n���� �Ѿ� = " + totalSaving);
		int dollar = totalSaving/EXCHANGE_RATE;
		System.out.println("�޷� �׼� = " + dollar );
		int won = totalSaving%EXCHANGE_RATE;
		System.out.println("���� ��ȭ = " + won);
	}

}

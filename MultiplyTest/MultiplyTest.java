/*
 * ���ϸ�: MultiplyTest.java
 * �ۼ���: 2018.3.20
 * �ۼ���: ������
 * ����:  �Է� ����, ���� �ѹ� ����, �ݺ���, ���ǹ��� ���.
 */

package hw3_1;

import java.util.Random;
import java.util.Scanner;

public class MultiplyTest {

	public static void main(String[] args) {
		System.out.println("hw3_1: ������");
		System.out.println("\n���� ������ ���� �Է��ϼ���(����Ϸ��� 0�� �Է�)\n");

		Random generator = new Random();
		Scanner input = new Scanner(System.in);

		int a = 0; //����� ���� a
		int b = 0; //����� ���� b
		int score = 0; //����

		for(int i=0; i<5; i++) {

			int x = generator.nextInt(9)+1;
			int y = generator.nextInt(9)+1;

			System.out.print(x + " * " + y + "= ? ");
			int answer = input.nextInt();

			if(answer == x * y) {
				a++;
				System.out.println("�����Դϴ�.");
			}

			else if(answer == 0) {
				System.out.println("���");
			}
			else {
				b++;
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			if(score >= 0) {
				score = 20*a + (-10*b);
			}
			else {
				score = 0;
			}

		}
		
		String pass = (score >= 50) ? "�հ�" : "���հ�"; 

		System.out.println("\n����� " + a + " ����� " + b + " ���� " + score + " --> " + pass);


	}

}

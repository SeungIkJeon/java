package lab1_2;

import java.util.Scanner;


public class Array {


	public static void main(String[] args) {

		System.out.println("lab1_2 : ������");
		System.out.println();

		int [] arr = new int[10];
		Scanner input = new Scanner(System.in);

		System.out.println("������ 10�� �Է�: ");

		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println();

		System.out.println("�˻��� ������ �Է�: ");

		int num = input.nextInt();

		for(int i = 0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.println("�ε��� = " + i);
				return;
			}
		}
		System.out.println("-1");
	}
}
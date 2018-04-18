/*
 * ���ϸ�: ArrayMethod.java
 * �ۼ���: 2018.3.27
 * �ۼ���: ������
 * ����:  �迭, �Է�, �޼ҵ� ȣ���� �̿��� ���α׷�
 */

import java.util.Scanner;

public class ArrayMethod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum=0;

		System.out.println("\n" + n + "���� ���� �Է�: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		sum = sumArray(arr);
		System.out.println("\n�迭 ������ ��: " + sum);

	}

	private static int sumArray(int[] array) {
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}

}

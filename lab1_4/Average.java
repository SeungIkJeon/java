//***************************
// ���ϸ�: Average.java
// �ۼ���: ������
// �ۼ���: 2018.09.02
// ����:���ϴ� ������ �������� �Է¹޾� ���������� ��� ���ϴ� ���α׷�
//***************************
package lab1_4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("lab1_4: ������");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.println("���� ���� �Է�: ");
		int num = input.nextInt();
		int[] arr = new int[num];
		System.out.println("5���� ���� �Է�: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("��� = " + getAverage(arr));
	}
	public static double getAverage(int[] arr) {
		double average = 0;
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			average = sum/arr.length;
		}
		return average;
	}

}
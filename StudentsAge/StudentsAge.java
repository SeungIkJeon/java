/*
 * ���ϸ�: StudentsAge.java
 * �ۼ���: 2018.03.23-03.26
 * �ۼ���: ������
 * ����: �ݺ����� �迭�� �̿��� ���α׷�
 */

import java.util.Scanner;

public class StudentsAge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("hw4_1: ������");

		System.out.print("\n���� ���� �Է�: ");
		int min = input.nextInt(); //���� ���� ���� min
		System.out.print("���� ���� �Է�: ");
		int max = input.nextInt(); //���� ���� ���� max
		System.out.print("�л��� �Է�: ");
		int n = input.nextInt(); //�л��� n

		int[] age1 = new int[n]; //�л��� n��ŭ ���̸� ���� �迭 age
		int[] age2 = new int[max-min+1]; //���� ���� ���� ���� �迭

		for(int i=0; i<age1.length; i++) {
			System.out.print("���� �Է�: ");
			age1[i] = input.nextInt();

			if(age1[i]>max||min>age1[i]) {
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���.");
				i--; //������ ��� ���̸� �Է��ϸ� �ٽ� ���̸� �Է��ϵ���
			}
		}

		System.out.println("\n����\t�л���");
		for(int i=0; i<age2.length; i++) {
			age2[i]=min++; 
			int count = 0; //���̺� �л��� �� ���� count ����
			for(int a=0; a<age1.length; a++) {
				if(age1[a]==age2[i]) {
					count++; //�� �迭�� ���Ұ� ���ԵǸ� count ����
				}
			}
			System.out.println(age2[i] + "\t" + count);			
		}
	}
}

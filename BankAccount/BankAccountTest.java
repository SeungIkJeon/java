/*
 * ���ϸ�: BankAccountTest.java
 * �ۼ���: 2018.4.17
 * �ۼ���: ������
 * ����:  this() ȣ��� Ŭ���� �Ű������� ���� �޼ҵ� �ۼ��� ����
 */

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("hw6_2 : ������");
		System.out.println();

		BankAccount account1 = new BankAccount(1, "kim", 9000); 
		//���¹�ȣ 1, �����ָ� kim, �ܾ� 9000���� �ʱ�ȭ�� ������� account1 ����
		BankAccount account2 = new BankAccount(2, "lee"); 
		//���¹�ȣ 2, �����ָ� lee�� �ʱ�ȭ�� ������� account2 ����

		Scanner input = new Scanner(System.in); 

		account2.deposit(input.nextInt()); //����ڷκ��� �Աݾ��� �Է¹޾� account2�� �Ա�
		account2.withdraw(input.nextInt()); //����ڷκ��� ��ݾ��� �Է¹޾� account2���� ���
		account2.deposit(input.nextInt());
		account2.withdraw(input.nextInt());

		account2.remittance(account1, input.nextInt()); 
		// ����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� ����
		account2.remittance(account1, input.nextInt()); 

		account2.setName("park"); //account2�� �����ָ��� park���� ����

		System.out.println(account2.toString()); //account2�� ���¹�ȣ, �����ָ�, �ܾ� ���
		System.out.println(account1.toString()); //account1�� ���¹�ȣ, �����ָ�, �ܾ� ���


	}

}
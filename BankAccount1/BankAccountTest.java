/*
 * ���ϸ�: BankAccountTest.java
 * �ۼ���: 2018.4.04
 * �ۼ���: ������
 * ����: Ŭ������ �̿� ��ü����, �޼ҵ� ȣ���ϴ�  ���α׷�
 */

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount();
		//BankAccount���� ���� myBankAccount()��ü ����

		myBankAccount.deposit(2000); //2000�� �Ա�
		myBankAccount.deposit(3000); //3000�� �Ա�

		System.out.println("�ܾ� = " + myBankAccount.balance + "��"); 
		//������ �ܾ� �ʵ� ���

		System.out.println("�ܾ� = " + myBankAccount.getBalance() + "��"); 
		// �ܾ���ȸ(�޼ҵ� getBalance()�� ȣ��)�Ͽ� �ܾ� ���

		myBankAccount.withdraw(1000); //1000�� ���

		System.out.println("�ܾ� = " + myBankAccount.getBalance() + "��");
		// �ܾ���ȸ(�޼ҵ� getBalance()�� ȣ��)�Ͽ� �ܾ� ���

	}

}

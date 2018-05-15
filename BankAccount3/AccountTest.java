/*
 * ���ϸ�: AccountTest.java
 * �ۼ���: 2018.5.15
 * �ۼ���: ������
 * ����:  ����� �����Ѵ�.
 */
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : ������");
		System.out.println();
		//(1) ������ ���� 4���� ���� ����
		//�Ϲ� ����(���¹�ȣ 11, �ܾ� 1000�� �ʱ�ȭ)
		//�Ϲ� ����(���¹�ȣ 22�� �ʱ�ȭ)
		//���̳ʽ����� ����(���¹�ȣ 33, �ܾ� 1000, �����ѵ� 500�� �ʱ�ȭ)
		//���̳ʽ����� ����(���¹�ȣ 44, �����ѵ� 500�� �ʱ�ȭ)
		NormalAccount acc1 = new NormalAccount(11, 1000);
		NormalAccount acc2 = new NormalAccount(22);
		MinusAccount acc3 = new MinusAccount(33, 1000, 500);
		MinusAccount acc4 = new MinusAccount(44, 500);
		
		Scanner input = new Scanner(System.in);
		//(2) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc1 = " + acc2.getBalance());
		System.out.println("acc1 = " + (acc3.getBalance() + acc3.getLoanLimit()));
		System.out.println("acc1 = " + (acc4.getBalance() + acc4.getLoanLimit()));
		System.out.println();
		//(3) ����ڷκ��� ��ݾ� �Է¹޾� 4�� ���¿��� ���� ��� ����
		System.out.print("��ݾ� �Է�: ");
		int withdrawMoney = input.nextInt();
		acc1.withdraw(withdrawMoney);
		acc2.withdraw(withdrawMoney);
		acc3.withdraw(withdrawMoney);
		acc4.withdraw(withdrawMoney);
		System.out.println();
		//(4) ����ڷκ��� �Աݾ� �Է¹޾� 4�� ���¿� ���� �Ա� ����
		System.out.print("�Աݾ� �Է�: ");
		int depositMoney = input.nextInt();
		acc1.deposit(depositMoney);
		acc2.deposit(depositMoney);
		acc3.deposit(depositMoney);
		acc4.deposit(depositMoney);
		System.out.println();
		//(5) 4�� ������ �ִ� ��� ���ɾ� ���� ���
		System.out.println("�ִ� ��ݰ��ɾ�");
		System.out.println("acc1 = " + acc1.getBalance());
		System.out.println("acc1 = " + acc2.getBalance());
		System.out.println("acc1 = " + (acc3.getBalance() + acc3.getLoanLimit()));
		System.out.println("acc1 = " + (acc4.getBalance() + acc4.getLoanLimit()));
	}

}
/*
 * ���ϸ�: BankAccount.java
 * �ۼ���: 2018.4.04
 * �ۼ���: ������
 * ����: Ŭ���� �ۼ� �ʵ�� �޼ҵ� ����
 */

public class BankAccount {
	int balance; //�ܾ� �ʵ�

	void deposit(int depositAmount) {
		balance+=depositAmount; //�ܾ��� ���� �ܾ׿� �Աݾ���  ���Ѱ�
	} //�Ա� �޼ҵ�

	int getBalance() {
		return balance;
	} //�ܾ���ȸ �޼ҵ� ���ϰ��� �ܾ�

	void withdraw(int remittance) {
		balance-=remittance; //�ܾ��� ���� �ܾ׿� ��ݾ��� ����
	} //��� �޼ҵ�

}

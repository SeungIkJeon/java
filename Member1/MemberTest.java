/*
 * ���ϸ�: MemberTest.java
 * �ۼ���: 2018.5.20
 * �ۼ���: ������
 * ����:  �߻�Ŭ���� ��Ӱ� �������� �����Ѵ�.
 */

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_3: ������");
		System.out.println();

		Member[] member = new Member[4];
		member[0] = new HourlyMember(22, 2);
		member[1] = new HourlyMember(33, 3);
		member[2] = new RegularMember(44);
		member[3] = new RegularMember(55);

		double sum1 = 0; //���� ���� ������ ����
		int sum2 = 0; //ȸ�� ���� ������ ����

		for(int i =0; i<member.length; i++) { 
			sum1 += member[i].getAge(); //�� ȸ���� ���̸� �� ���Ͽ� sum1�� �����Ѵ�.
			sum2 += member[i].getPayment(); //�� ȸ���� ȸ�� �� ���Ͽ� sum2�� �����Ѵ�.
		}
		System.out.println("���� ��� = " + sum1/member.length); //���� ���� ȸ������ member�迭�� ������� ������.-->���� ��� 
		System.out.println("ȸ�� �� = " + sum2);
	}

}

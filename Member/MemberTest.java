/*
 * ���ϸ�: MemberTest.java
 * �ۼ���: 2018.4.10
 * �ۼ���: ������
 * ����: �ʵ�� �޼ҵ带 ���� Ŭ������ ��ü �迭�� �����Ѵ�
 */
public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw5_1 : ������");
		System.out.println();

		Member[] member = new Member[5]; //Member�ڷ����� ũ�Ⱑ 5�� �迭 member ����

		for(int i=0; i<5; i++) {
			member[i] = new Member(); //Member�� ��ü ���� 
			member[i].grade=i+1; //����� �����Ѵ� 1-5���
			member[i].appointGrade(i+1); //�޼ҵ� ȣ���Ͽ� ����� �Ű������� �޾� ȸ���������
			member[i].supportPoint(); //�޼ҵ� ȣ���Ͽ� ����Ʈ ����
			member[i].supportPoint(); //�޼ҵ� ȣ���Ͽ� ����Ʈ ����
			System.out.println("ȸ��"+(i+1)+"�� ���η� : "+member[i].discountRate()); //�޼ҵ带 ȣ���Ͽ� ���η� ���

		}
	}

}

/*
 * ���ϸ�: Member.java
 * �ۼ���: 2018.4.10
 * �ۼ���: ������
 * ����: �ʵ�� �޼ҵ带 ���� Ŭ������ ��ü �迭�� �����Ѵ�
 */

public class Member {
	int grade; //��� �ʵ� ����
	int point; //����Ʈ �ʵ� ����

	void appointGrade(int level) {
		grade=level;
	} //ȸ����޹��� �޼ҵ�
	void supportPoint() {
		if(grade==1) 
			point+=100; //1��޽� 100����Ʈ ����
		else if(grade==2)
			point+=50; //2��޽� 50����Ʈ ����
		else if(grade==3)
			point+=40; //3��޽� 40����Ʈ ����
		else 
			point+=10; //�׿� ����� 10����Ʈ ����
	} //����Ʈ���� �޼ҵ�
	double discountRate() {
		double discountRate;
		if(point>=100) {
			discountRate = 0.2;
			return discountRate;
		} //����Ʈ�� 100�� ������ ���η� 0.2 ��ȯ
		else {
			discountRate = 0.1;
			return discountRate;
		} //�׿ܿ��� ���η� 0.1 ��ȯ
	} //������ ��ȸ �޼ҵ�
}

/*
 * ���ϸ�: Member.java
 * �ۼ���: 2018.5.20
 * �ۼ���: ������
 * ����:  �߻�Ŭ������ �߻�޼ҵ�, ���
 */

public abstract class Member {
	private int age;

	public Member(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public abstract int getPayment();
}

class HourlyMember extends Member {
	private int hour;

	public HourlyMember(int age, int hour) {
		super(age);
		this.hour = hour;
	}
	@Override
	public int getPayment() {
		return 100 * hour;
	}
}

class RegularMember extends Member {
	public RegularMember(int age) {
		super(age);
	}
	@Override
	public int getPayment() {
		return 1000;
	}
}

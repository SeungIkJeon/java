/*
 * 파일명: Member.java
 * 작성일: 2018.5.20
 * 작성자: 전승익
 * 내용:  추상클래스와 추상메소드, 상속
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

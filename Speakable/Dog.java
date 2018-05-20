/*
 * 파일명: Dog.java
 * 작성일: 2018.5.20
 * 작성자: 전승익
 * 내용:  인터페이스 구현
 */

public class Dog implements Speakable {
	private int age;

	public Dog(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void speak() {
		for(int i = 0; i<age; i++)
			System.out.print("멍");
	}
}

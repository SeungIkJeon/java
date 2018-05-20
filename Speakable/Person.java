/*
 * 파일명: Person.java
 * 작성일: 2018.5.20
 * 작성자: 전승익
 * 내용:  인터페이스 구현
 */

public class Person implements Speakable {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("안녕하세요.");
	}
}

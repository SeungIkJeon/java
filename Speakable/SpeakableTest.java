/*
 * 파일명: SpeakableTest.java
 * 작성일: 2018.5.20
 * 작성자: 전승익
 * 내용:  인터페이스와 다형성을 연습
 */

public class SpeakableTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: 전승익");
		System.out.println();

		Speakable[] creature = new Speakable[4];
		creature[0] = new Person("강감찬");
		creature[1] = new Person("홍길동");
		creature[2] = new Dog(2);
		creature[3] = new Dog(5);

		for(int i = 0; i<creature.length; i++) {
			if(creature[i] instanceof Person) {
				creature[i].speak();
				System.out.println(((Person)creature[i]).getName()+"입니다.");
				System.out.println();
			}
			else {
				creature[i].speak();
				System.out.println();
				System.out.println();
			}
		}
	}

}

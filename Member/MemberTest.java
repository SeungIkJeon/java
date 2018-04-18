/*
 * 파일명: MemberTest.java
 * 작성일: 2018.4.10
 * 작성자: 전승익
 * 내용: 필드와 메소드를 갖는 클래스와 객체 배열을 연습한다
 */
public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw5_1 : 전승익");
		System.out.println();

		Member[] member = new Member[5]; //Member자료형의 크기가 5인 배열 member 선언

		for(int i=0; i<5; i++) {
			member[i] = new Member(); //Member형 객체 생성 
			member[i].grade=i+1; //등급을 지정한다 1-5등급
			member[i].appointGrade(i+1); //메소드 호출하여 등급을 매개변수로 받아 회원등급지정
			member[i].supportPoint(); //메소드 호출하여 포인트 지급
			member[i].supportPoint(); //메소드 호출하여 포인트 지급
			System.out.println("회원"+(i+1)+"의 할인률 : "+member[i].discountRate()); //메소드를 호출하여 할인률 출력

		}
	}

}

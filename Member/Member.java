/*
 * 파일명: Member.java
 * 작성일: 2018.4.10
 * 작성자: 전승익
 * 내용: 필드와 메소드를 갖는 클래스와 객체 배열을 연습한다
 */

public class Member {
	int grade; //등급 필드 선언
	int point; //포인트 필드 선언

	void appointGrade(int level) {
		grade=level;
	} //회원등급배정 메소드
	void supportPoint() {
		if(grade==1) 
			point+=100; //1등급시 100포인트 지급
		else if(grade==2)
			point+=50; //2등급시 50포인트 지급
		else if(grade==3)
			point+=40; //3등급시 40포인트 지급
		else 
			point+=10; //그외 등급은 10포인트 지급
	} //포인트지급 메소드
	double discountRate() {
		double discountRate;
		if(point>=100) {
			discountRate = 0.2;
			return discountRate;
		} //포인트가 100이 넘으면 할인률 0.2 반환
		else {
			discountRate = 0.1;
			return discountRate;
		} //그외에는 할인률 0.1 반환
	} //할인율 조회 메소드
}

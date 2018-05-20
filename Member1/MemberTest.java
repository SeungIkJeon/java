/*
 * 파일명: MemberTest.java
 * 작성일: 2018.5.20
 * 작성자: 전승익
 * 내용:  추상클래스 상속과 다형성을 연습한다.
 */

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_3: 전승익");
		System.out.println();

		Member[] member = new Member[4];
		member[0] = new HourlyMember(22, 2);
		member[1] = new HourlyMember(33, 3);
		member[2] = new RegularMember(44);
		member[3] = new RegularMember(55);

		double sum1 = 0; //나이 합을 저장할 변수
		int sum2 = 0; //회비 합을 저장할 변수

		for(int i =0; i<member.length; i++) { 
			sum1 += member[i].getAge(); //각 회원의 나이를 다 더하여 sum1에 저장한다.
			sum2 += member[i].getPayment(); //각 회원의 회비를 다 더하여 sum2에 저장한다.
		}
		System.out.println("나이 평균 = " + sum1/member.length); //나이 합을 회원수인 member배열의 사이즈로 나눈다.-->나이 평균 
		System.out.println("회비 합 = " + sum2);
	}

}

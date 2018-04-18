/*
 * 파일명: MultiplyTest.java
 * 작성일: 2018.3.20
 * 작성자: 전승익
 * 내용:  입력 연습, 랜덤 넘버 생성, 반복문, 조건문을 사용.
 */

package hw3_1;

import java.util.Random;
import java.util.Scanner;

public class MultiplyTest {

	public static void main(String[] args) {
		System.out.println("hw3_1: 전승익");
		System.out.println("\n곱셈 문제의 답을 입력하세요(통과하려면 0을 입력)\n");

		Random generator = new Random();
		Scanner input = new Scanner(System.in);

		int a = 0; //정답수 변수 a
		int b = 0; //오답수 변수 b
		int score = 0; //총점

		for(int i=0; i<5; i++) {

			int x = generator.nextInt(9)+1;
			int y = generator.nextInt(9)+1;

			System.out.print(x + " * " + y + "= ? ");
			int answer = input.nextInt();

			if(answer == x * y) {
				a++;
				System.out.println("정답입니다.");
			}

			else if(answer == 0) {
				System.out.println("통과");
			}
			else {
				b++;
				System.out.println("틀렸습니다.");
			}

			if(score >= 0) {
				score = 20*a + (-10*b);
			}
			else {
				score = 0;
			}

		}
		
		String pass = (score >= 50) ? "합격" : "불합격"; 

		System.out.println("\n정답수 " + a + " 오답수 " + b + " 총점 " + score + " --> " + pass);


	}

}

/*
 * 파일명: StudentsAge.java
 * 작성일: 2018.03.23-03.26
 * 작성자: 전승익
 * 내용: 반복문과 배열을 이용한 프로그램
 */

import java.util.Scanner;

public class StudentsAge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("hw4_1: 전승익");

		System.out.print("\n나이 하한 입력: ");
		int min = input.nextInt(); //나이 하한 변수 min
		System.out.print("나이 상한 입력: ");
		int max = input.nextInt(); //나이 상한 변수 max
		System.out.print("학생수 입력: ");
		int n = input.nextInt(); //학생수 n

		int[] age1 = new int[n]; //학생수 n만큼 나이를 받을 배열 age
		int[] age2 = new int[max-min+1]; //상한 나이 하한 나이 배열

		for(int i=0; i<age1.length; i++) {
			System.out.print("나이 입력: ");
			age1[i] = input.nextInt();

			if(age1[i]>max||min>age1[i]) {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				i--; //범위가 벗어난 나이를 입력하면 다시 나이를 입력하도록
			}
		}

		System.out.println("\n나이\t학생수");
		for(int i=0; i<age2.length; i++) {
			age2[i]=min++; 
			int count = 0; //나이별 학생수 셀 변수 count 선언
			for(int a=0; a<age1.length; a++) {
				if(age1[a]==age2[i]) {
					count++; //두 배열의 원소가 같게되면 count 증가
				}
			}
			System.out.println(age2[i] + "\t" + count);			
		}
	}
}

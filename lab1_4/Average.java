//***************************
// 파일명: Average.java
// 작성자: 전승익
// 작성일: 2018.09.02
// 설명:원하는 갯수의 정수값을 입력받아 정수값들의 평균 구하는 프로그램
//***************************
package lab1_4;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("lab1_4: 전승익");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.println("정수 개수 입력: ");
		int num = input.nextInt();
		int[] arr = new int[num];
		System.out.println("5개의 정수 입력: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("평균 = " + getAverage(arr));
	}
	public static double getAverage(int[] arr) {
		double average = 0;
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			average = sum/arr.length;
		}
		return average;
	}

}
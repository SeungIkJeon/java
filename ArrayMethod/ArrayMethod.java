/*
 * 파일명: ArrayMethod.java
 * 작성일: 2018.3.27
 * 작성자: 전승익
 * 내용:  배열, 입력, 메소드 호출을 이용한 프로그램
 */

import java.util.Scanner;

public class ArrayMethod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("정수 개수 입력: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum=0;

		System.out.println("\n" + n + "개의 정수 입력: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		sum = sumArray(arr);
		System.out.println("\n배열 원소의 합: " + sum);

	}

	private static int sumArray(int[] array) {
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}

}

package lab1_2;

import java.util.Scanner;


public class Array {


	public static void main(String[] args) {

		System.out.println("lab1_2 : 전승익");
		System.out.println();

		int [] arr = new int[10];
		Scanner input = new Scanner(System.in);

		System.out.println("정수값 10개 입력: ");

		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println();

		System.out.println("검색할 정수값 입력: ");

		int num = input.nextInt();

		for(int i = 0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.println("인덱스 = " + i);
				return;
			}
		}
		System.out.println("-1");
	}
}
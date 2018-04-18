import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("lab4_1: 전승익");

		System.out.print("\n배열 길이 입력: ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.println("\n" + size + "개의 정수 입력: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.print("\n배열 = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n배열 = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

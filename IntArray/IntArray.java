import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("lab4_1: ������");

		System.out.print("\n�迭 ���� �Է�: ");
		int size = input.nextInt();
		int[] arr = new int[size];

		System.out.println("\n" + size + "���� ���� �Է�: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.print("\n�迭 = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n�迭 = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

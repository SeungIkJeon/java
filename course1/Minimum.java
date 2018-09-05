package course1;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("course1: 전승익");
		System.out.println();

		int[] arr = new int[10];
		int min = 100; //배열의 최소값 
		int index = 0; //인덱스

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + " ");
			if(min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println();
		System.out.println("최소값 = " + min);
		System.out.println("최소값 인덱스 = " + index);
		
		for(int i = 0; i<arr.length; i++) {
			int num = min;
			min = arr[0];
			arr[0] = num;
			System.out.print(arr[i] + " ");
		} //첫번째로 최소값이 옮겨지긴하는데 자리 교환이 안되고 최소값이 두개가 되어 나오게된다..
	}
}
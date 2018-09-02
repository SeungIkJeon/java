//***************************
// 파일명: CountNumber.java
// 작성자: 전승익
// 작성일: 2018.09.02
// 설명:1~4 범위의 랜덤 넘버 10개 생성 각 넘버 몇개씩 생성되었는지 센다.
//***************************
package lab1_3;

public class CountNumber {

	public static void main(String[] args) {
		System.out.println("lab1_3: 전승익");
		System.out.println();
		int[]arr = new int[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		System.out.print("랜덤 넘버 = ");

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*4)+1;
			System.out.print(arr[i] + " ");
			if(arr[i]==1)
				count1++;
			else if(arr[i]==2)
				count2++;
			else if(arr[i]==3)
				count3++;
			else
				count4++;
		}
		System.out.println();
		System.out.println("1의 갯수 = " + count1);
		System.out.println("2의 갯수 = " + count2);
		System.out.println("3의 갯수 = " + count3);
		System.out.println("4의 갯수 = " + count4);
	}

}

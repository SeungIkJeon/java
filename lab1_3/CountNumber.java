//***************************
// ���ϸ�: CountNumber.java
// �ۼ���: ������
// �ۼ���: 2018.09.02
// ����:1~4 ������ ���� �ѹ� 10�� ���� �� �ѹ� ��� �����Ǿ����� ����.
//***************************
package lab1_3;

public class CountNumber {

	public static void main(String[] args) {
		System.out.println("lab1_3: ������");
		System.out.println();
		int[]arr = new int[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		System.out.print("���� �ѹ� = ");

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
		System.out.println("1�� ���� = " + count1);
		System.out.println("2�� ���� = " + count2);
		System.out.println("3�� ���� = " + count3);
		System.out.println("4�� ���� = " + count4);
	}

}

package course1;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("course1: ������");
		System.out.println();

		int[] arr = new int[10];
		int min = 100; //�迭�� �ּҰ� 
		int index = 0; //�ε���

		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + " ");
			if(min > arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println();
		System.out.println("�ּҰ� = " + min);
		System.out.println("�ּҰ� �ε��� = " + index);
		
		for(int i = 0; i<arr.length; i++) {
			int num = min;
			min = arr[0];
			arr[0] = num;
			System.out.print(arr[i] + " ");
		} //ù��°�� �ּҰ��� �Ű������ϴµ� �ڸ� ��ȯ�� �ȵǰ� �ּҰ��� �ΰ��� �Ǿ� �����Եȴ�..
	}
}
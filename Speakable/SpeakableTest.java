/*
 * ���ϸ�: SpeakableTest.java
 * �ۼ���: 2018.5.20
 * �ۼ���: ������
 * ����:  �������̽��� �������� ����
 */

public class SpeakableTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: ������");
		System.out.println();

		Speakable[] creature = new Speakable[4];
		creature[0] = new Person("������");
		creature[1] = new Person("ȫ�浿");
		creature[2] = new Dog(2);
		creature[3] = new Dog(5);

		for(int i = 0; i<creature.length; i++) {
			if(creature[i] instanceof Person) {
				creature[i].speak();
				System.out.println(((Person)creature[i]).getName()+"�Դϴ�.");
				System.out.println();
			}
			else {
				creature[i].speak();
				System.out.println();
				System.out.println();
			}
		}
	}

}

/*
 * ���ϸ�: Dog.java
 * �ۼ���: 2018.5.20
 * �ۼ���: ������
 * ����:  �������̽� ����
 */

public class Dog implements Speakable {
	private int age;

	public Dog(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void speak() {
		for(int i = 0; i<age; i++)
			System.out.print("��");
	}
}

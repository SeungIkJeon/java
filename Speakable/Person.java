/*
 * ���ϸ�: Person.java
 * �ۼ���: 2018.5.20
 * �ۼ���: ������
 * ����:  �������̽� ����
 */

public class Person implements Speakable {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("�ȳ��ϼ���.");
	}
}

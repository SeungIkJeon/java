/*
 * ���ϸ�: Student.java
 * �ۼ���: 2018.4.24
 * �ۼ���: ȫ�浿
 * ����: �̸�, ����, ���� ������ ���� �л� Ŭ������ ����
 * ���� ����� ���ǻ���: Student Ŭ���� �ܺο����� Student�� �̸�, ����, ���� ������ �̷���� ������ �˰� ������, Address Ŭ������ ����� ���� ����
 */

public class Student {
	private class Address {
		String city;
		String country;

		// (1) private inner class�� Address Ŭ���� ���� - �ʵ�� ����(city)�� ����(country), �޼ҵ�� ������(����, ������ �Ű������� ����)
		public Address(String city, String country) {
			this.city = city;
			this.country = country;
		}
	}

	// (2) 2���� private �ʵ� ���� - �̸�(String Ÿ��), �ּ�(Address Ÿ��)
	private String name;
	private Address address;

	// (3) ������ ���� - name, city, country�� �Ű������� ����
	public Student(String name, String city, String country) {
		this.name = name;
		address = new Address(city, country);
	}

	// (4) �̸��� �����ϴ� �޼ҵ�
	public String getName() {
		return name;
	}

	// (5) ���ø� �����ϴ� �޼ҵ�
	public String getCity() {
		return address.city;
	}

	// (6) ������ �����ϴ� �޼ҵ�
	public String getCountry() {
		return address.country;
	}

	// (7) �Ű������� ���� ����, ������ �̻��ϴ� �޼ҵ�
	public void move(String city, String country) {
		address.city = city;
		address.country = country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + " city=" + address.city + " country=" + address.country + "]";
	}

	// (8) �̸�, ����, ������ ���ڿ��� �����ϴ� �޼ҵ�

}


public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab7_2: ������");
		System.out.println();

		//(1) �й� 11, ���� 1.5�� �ʱ�ȭ�� �кλ��� ����
		UnderGraduateStudent student1 = new UnderGraduateStudent(11, 1.5);
		//(2) �й� 222, ���� 1.5�� �ʱ�ȭ�� ���п����� ����
		GraduateStudent student2 = new GraduateStudent(222, 1.5);

		//(3) �кλ��� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(student1.getId()+" "+student1.getScore()+" "+student1.warning());
		//(4) ���п����� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(student2.getId()+" "+student2.getScore()+" "+student2.warning());
	}

}
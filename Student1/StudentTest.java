
public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab7_2: 전승익");
		System.out.println();

		//(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
		UnderGraduateStudent student1 = new UnderGraduateStudent(11, 1.5);
		//(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성
		GraduateStudent student2 = new GraduateStudent(222, 1.5);

		//(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
		System.out.println(student1.getId()+" "+student1.getScore()+" "+student1.warning());
		//(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력
		System.out.println(student2.getId()+" "+student2.getScore()+" "+student2.warning());
	}

}
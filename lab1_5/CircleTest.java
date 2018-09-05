//***************************
// 파일명: CircleTest.java
// 작성자: 전승익
// 작성일: 2018.09.05
// 설명: 클래스 작성, 객체 생성과 사용을 연습
//***************************

package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(2);
		Circle circle2 = new Circle((int)(Math.random()*4+1));
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		System.out.println(circle1.area());
		System.out.println(circle2.area());
	}

}

class Circle {
	private int radius;

	public Circle() {
		this.radius = 1;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

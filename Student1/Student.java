
public abstract class Student {
	private int id;
	private double score;

	public Student(int id, double score) {
		this.id = id;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public abstract boolean warning();
}

class UnderGraduateStudent extends Student {
	public UnderGraduateStudent(int id, double score) {
		super(id, score);
	}
	@Override
	public boolean warning() {
		if(getScore() < 1.5)
			return true;
		else
			return false;
	}
}

class GraduateStudent extends Student {
	public GraduateStudent(int id, double score) {
		super(id, score);
	}
	@Override
	public boolean warning() {
		if((getScore() >=1.5) && (getScore() <3.0))
			return true;
		else
			return false;
	}
}
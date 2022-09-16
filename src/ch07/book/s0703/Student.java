package ch07.book.s0703;

public class Student extends People {
	private int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getStudentNo() {
		return studentNo;
	}
}

package week_3_Homework;

public class Student extends User {
	private int StudentNo;

	public Student() {
	}

	public Student(int id,String firstName,String lastName,String email,int StudentNo) {
		this.StudentNo=StudentNo;

	}
	public int getStudentNo() {
		return this.StudentNo;
	}
	public void setStudentNo(int StudentNo) {
		this.StudentNo=StudentNo;
	}
}

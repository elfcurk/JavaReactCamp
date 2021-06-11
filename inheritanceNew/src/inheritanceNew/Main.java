package inheritanceNew;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
	
		StudentManager studentManager=new StudentManager();
		TeacherManager teacherManager=new TeacherManager();
		studentManager.add();
		teacherManager.add();
		teacherManager.bestTeacher();
		studentManager.list();
		

	}

}

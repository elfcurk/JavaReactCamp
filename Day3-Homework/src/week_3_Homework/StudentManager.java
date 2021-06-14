package week_3_Homework;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öğrenci: "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
	public void listStudents(User user) {
		System.out.println("Öğrenci: "+user.getFirstName()+" "+user.getLastName()+" listelendi.");
	}
	public void updateStudent(User user) {
		System.out.println("Öğrenci: "+user.getFirstName()+" "+user.getLastName()+" güncellendi.");
	}
	public void deleteStudent(User user) {
		System.out.println("Öğrenci: "+user.getFirstName()+" "+user.getLastName()+" silindi.");
	}
}

package week_3_Homework;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öðrenci: "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
}

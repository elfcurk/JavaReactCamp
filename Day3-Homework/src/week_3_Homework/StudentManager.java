package week_3_Homework;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��renci: "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
}

package week_3_Homework;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("E�itmen: "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
	
}

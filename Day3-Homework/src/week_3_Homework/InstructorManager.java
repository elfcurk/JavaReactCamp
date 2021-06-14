package week_3_Homework;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Eğitmen: "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
	public void listInstructor(User user) {
		System.out.println("Eğitmen: "+user.getFirstName()+" "+user.getLastName()+" listelendi.");
	}
	public void updateInstructor(User user) {
		System.out.println("Eğitmen: "+user.getFirstName()+" "+user.getLastName()+" güncellendi.");
	}
	public void deleteInstructor(User user) {
		System.out.println("Eğitmen: "+user.getFirstName()+" "+user.getLastName()+" silindi.");
	}
}

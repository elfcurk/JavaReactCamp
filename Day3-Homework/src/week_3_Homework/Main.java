package week_3_Homework;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "elif", "crk", "elif@hotmail.com", "yazılım");
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("engin");
		instructor.setLastName("demirog");
		instructor.setEmail("engin@hormail.com");
		instructor.setBranch("java");
		instructor.setPhoneNumber("01234567897");
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("ahmet");
		student.setLastName("deneme");
		student.setEmail("ahmet@gmail.com");
		student.setStudentNo(123456789);
		
		UserManager userManager = new UserManager();
		userManager.add(user);


		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

//		User[] users=new User[] {user,instructor,student};
//		userManager.addMultiple(users);

}

}

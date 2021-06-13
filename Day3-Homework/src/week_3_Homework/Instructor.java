package week_3_Homework;

public class Instructor extends User {

	private String phoneNumber;

	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String branch, String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

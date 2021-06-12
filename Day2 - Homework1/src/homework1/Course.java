package homework1;

public class Course {

	public Course() {
	}

	public Course(int id, String name, String detail, String instructor, String price, String percent) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.instructor = instructor;
		this.price = price;
		this.percent = percent;
	}

	int id;
	String name;
	String detail;
	String instructor;
	String price; // ücretsiz de yazýlabileceði için string kullanýldý
	String percent;

}

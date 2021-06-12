package homework1;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category(1, "T�m�");
		Category category2 = new Category(2, "Programlama");

		Category categories[] = { category1, category2 };
		for (Category category : categories) {
			System.out.println(category.name);

		}

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeyti�tirme Kamp� (C# + ANGULAR)",
				"2 Ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z.",
				"Engin Demirog", "�CRETS�Z", "%..");

		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeyti�tirme Kamp� (JAVA + REACT)",
				"2 Ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z.",
				"Engin Demirog", "�CRETS�Z", "%..");

		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giri� ��in Temel Kurs";
		course3.detail = "PYTHON,JAVA,C# gibi t�m programalama dilleri i�in temel prog. mant���n� anla��l�r �rneklerle ��renin";
		course3.instructor = "Engin Demirog";
		course3.price = "�CRETS�Z";
		course3.percent = "%..";

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name + ": " + course.detail + ": " + course.instructor + ": " + course.price);
		}

		Lesson lesson1 = new Lesson(1, "1.G�n", "Ders Program�", "G�n Sonu Kay�t", "Quiz", "�dev 1", "�dev 2");
		Lesson lesson2 = new Lesson(2, "2.G�n", "Ders Program�", "G�n Sonu Kay�t", "Quiz", "�dev 1", "�dev 2");
		Lesson lesson3 = new Lesson(3, "3.G�n", "Ders Program�", "G�n Sonu Kay�t", "Quiz", "�dev 1", "�dev 2");

		Lesson[] lessons = { lesson1, lesson2, lesson3 };
		for (Lesson lesson : lessons) {
			System.out.println(lesson.name + ": " + lesson.lessonProgram + ": " + lesson.registration + ": "
					+ lesson.quiz + ": " + lesson.homework1 + ": " + lesson.homework2);
		}
	}

}

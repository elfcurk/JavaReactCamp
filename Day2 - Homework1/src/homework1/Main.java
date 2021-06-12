package homework1;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2, "Programlama");

		Category categories[] = { category1, category2 };
		for (Category category : categories) {
			System.out.println(category.name);

		}

		Course course1 = new Course(1, "Yazýlým Geliþtirici Yeytiþtirme Kampý (C# + ANGULAR)",
				"2 Ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip,döküman ve duyurularýný buradan yapacaðýz.",
				"Engin Demirog", "ÜCRETSÝZ", "%..");

		Course course2 = new Course(2, "Yazýlým Geliþtirici Yeytiþtirme Kampý (JAVA + REACT)",
				"2 Ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip,döküman ve duyurularýný buradan yapacaðýz.",
				"Engin Demirog", "ÜCRETSÝZ", "%..");

		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlamaya Giriþ Ýçin Temel Kurs";
		course3.detail = "PYTHON,JAVA,C# gibi tüm programalama dilleri için temel prog. mantýðýný anlaþýlýr örneklerle öðrenin";
		course3.instructor = "Engin Demirog";
		course3.price = "ÜCRETSÝZ";
		course3.percent = "%..";

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name + ": " + course.detail + ": " + course.instructor + ": " + course.price);
		}

		Lesson lesson1 = new Lesson(1, "1.Gün", "Ders Programý", "Gün Sonu Kayýt", "Quiz", "Ödev 1", "Ödev 2");
		Lesson lesson2 = new Lesson(2, "2.Gün", "Ders Programý", "Gün Sonu Kayýt", "Quiz", "Ödev 1", "Ödev 2");
		Lesson lesson3 = new Lesson(3, "3.Gün", "Ders Programý", "Gün Sonu Kayýt", "Quiz", "Ödev 1", "Ödev 2");

		Lesson[] lessons = { lesson1, lesson2, lesson3 };
		for (Lesson lesson : lessons) {
			System.out.println(lesson.name + ": " + lesson.lessonProgram + ": " + lesson.registration + ": "
					+ lesson.quiz + ": " + lesson.homework1 + ": " + lesson.homework2);
		}
	}

}

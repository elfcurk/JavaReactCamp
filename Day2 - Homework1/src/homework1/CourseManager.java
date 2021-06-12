package homework1;

public class CourseManager {

	public static void includeToCourse(Course course) {
		System.out.println("Kursa Katýlým Saðlandý"+": "+course.name);

	}
	
	public static void finishAndContinue(Lesson lesson) {
		System.out.println("Bir sonraki derse geçildi"+": "+lesson.name);
	}

}

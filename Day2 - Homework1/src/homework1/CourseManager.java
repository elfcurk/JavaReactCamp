package homework1;

public class CourseManager {

	public static void includeToCourse(Course course) {
		System.out.println("Kursa Kat�l�m Sa�land�"+": "+course.name);

	}
	
	public static void finishAndContinue(Lesson lesson) {
		System.out.println("Bir sonraki derse ge�ildi"+": "+lesson.name);
	}

}

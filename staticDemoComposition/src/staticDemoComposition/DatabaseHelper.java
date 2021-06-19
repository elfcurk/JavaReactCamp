package staticDemoComposition;

public class DatabaseHelper {
	public static class Crud { // CRUD - Create Read Update Delete
		public static void delete() {
			System.out.println("veritaban�ndan silindi");
		}

		public static void update() {
			System.out.println("veritaban�nda g�ncellendi");
		}
	}

	public static class Connection {
		public static void createConnection() {
			System.out.println("yeni ba�lant� olu�turuldu");
		}
	}
}

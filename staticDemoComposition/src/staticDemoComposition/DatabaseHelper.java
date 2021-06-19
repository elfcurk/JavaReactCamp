package staticDemoComposition;

public class DatabaseHelper {
	public static class Crud { // CRUD - Create Read Update Delete
		public static void delete() {
			System.out.println("veritabanından silindi");
		}

		public static void update() {
			System.out.println("veritabanında güncellendi");
		}
	}

	public static class Connection {
		public static void createConnection() {
			System.out.println("yeni bağlantı oluşturuldu");
		}
	}
}

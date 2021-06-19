package staticDemoComposition;

public class DatabaseHelper {
	public static class Crud { // CRUD - Create Read Update Delete
		public static void delete() {
			System.out.println("veritabanýndan silindi");
		}

		public static void update() {
			System.out.println("veritabanýnda güncellendi");
		}
	}

	public static class Connection {
		public static void createConnection() {
			System.out.println("yeni baðlantý oluþturuldu");
		}
	}
}

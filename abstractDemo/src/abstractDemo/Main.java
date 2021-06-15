package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDbManager();
		customerManager.databaseManager = new SqlServerDbManager();
		customerManager.databaseManager = new MySqlDbManager();
		customerManager.getCustomers();

	}

}

package dbAccessBank;

// *****************************************************************************
// File name  : BankDatabase.java
// Start date : Sep 26, 2013
// Programmer : Hans So.
// Java       : Java 1.6.0 
// Description: 
//
// Revision history:
//   date     init  comment
//
// *****************************************************************************

import java.sql.SQLException;
import java.util.ArrayList;
import java.math.BigDecimal;



public class BankDatabase {
	private Database db;
	private String table;

	// ////////////////////
	/*
	 * private String driver = "postgres@localhost/postgres"; private String url
	 * = "jdbc:postgresql://localhost:5432/postgres"; private String user =
	 * "postgres"; private String pw = "musicsound92";
	 */
	// /////////////////////////////////////////
	public BankDatabase(String dbName, String table) {
		this.table = table;
		try {
			this.db = new Database(dbName);
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL driver not found. Exiting.");
			System.exit(1);
		}
	}

	public void insertDB(Account acc) throws SQLException {
		// The id (primary key) is auto incremented
		String sql = "INSERT INTO " + table
				+ "(accountNo, name, balance) VALUES (?, ?, ?)";
		try {
			db.update(sql, acc.accountNo, acc.name, acc.balance);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateDB(Account acc) throws SQLException {
		String sql = "UPDATE " + table
				+ " SET balance = balance + ? where accountNo = ?";
		try {
			db.update(sql, acc.balance, acc.accountNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteDB(Account acc) throws SQLException {
		System.out.println("BankDatabase.deleteDB; no test of balance == 0.00");

		String sql = "DELETE FROM " + table + " WHERE accountNo = ?";
		try {
			db.update(sql, acc.accountNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Account[] queryDB(Account acc) throws SQLException {
		String sql = "SELECT accountNo, name, balance FROM " + table
				+ " WHERE name = bogdan";

		ArrayList<Object[]> list;
		Account[] accountList;
		try {
			list = db.query(sql, acc.name);

			accountList = new Account[list.size()];

			for (int i = 0; i < accountList.length; i++)
				accountList[i] = toAccount(list.get(i));

			return accountList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Account toAccount(Object[] arr) {
		Account acc = new Account(((Long) arr[0]).intValue(),
				arr[1].toString(), ((BigDecimal) arr[2]).doubleValue());
		return acc;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("DbBank start ...");

		System.out
				.println("Notice: This BankDatabase class uses my dbAccessBank.Account class");

		System.out
				.println("Therefore: you are not able to insert a new account in Bank "
						+ "before you have an Account class \n");

		BankDatabase db = new BankDatabase("postgres", "Account");
		
		

		// dbAccessBank.Account acc = new Account (21, "YY", 300.00);
		// db.insertDB(acc);

		
		/*
		
		  dbAccessBank.Account acc = new dbAccessBank.Account (0, "BB", 0.00);
		  dbAccessBank.Account[] arr = db.queryDB (acc);
		  
		  for (Account account : arr) { System.out.println("accountNo: " +
		 account.accountNo + "; name: " + account.name + "; balance: " +
		 account.balance); }
		 
		  
		  System.out.println("\nDbBank: arr size: " + arr.length);
		  
		  */
		  System.out.println("\nDbBank END");
		 
	}
}

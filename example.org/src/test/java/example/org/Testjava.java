package example.org;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjava {
public static void main(String[] args) throws Throwable {
	String UserName="usrName";
	String Password="pwd";
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	String DB_URL ="jdbc:sqlserver://<hostname>\\<instance_name>;databaseName=";
	//OR by using ip
	DB_URL ="jdbc:sqlserver://192.168.0.10:3324\\<instance_name>;databaseName=";
	Connection con = DriverManager.getConnection(DB_URL, UserName, Password);
}
}

package Sample;
import java.sql.*;
public class Testor {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st= c.createStatement();
		st.execute("create database Dell");
		c.close();
	}
}

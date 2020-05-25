package Eclipse_Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		
		try {
			Class.forName(driver); // java 7 이후 생략 가능.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("데이터베이스 연결  성공~~~");
		} catch (ClassNotFoundException | SQLException e) {
			// e.printStackTrace();
			System.out.println("데이터베이스 연결  실패 ㅠㅠㅠ");
		}finally {
				try {
					if(conn != null) { conn.close(); }
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}

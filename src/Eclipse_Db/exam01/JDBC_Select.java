package Eclipse_Db.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		int no = 0;
		String name = null, email = null, tel = null;
		
		try {
			Class.forName(driver); // java 7 이후 생략 가능.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//System.out.println("데이터베이스 연결  성공~~~");
			
			stmt = conn.createStatement();
			String sql = "select * from customer";
			
			rs = stmt.executeQuery(sql);
			
			System.out.println("번호\t이름\t\t이메일\t\t전화번호");
			System.out.println("-----------------------------------------------");
			
			while(rs.next()) {
				no = rs.getInt("no");
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				
				System.out.printf("%d\t%s\t%s\t%s\n", 
						                                      no, name, email, tel);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// e.printStackTrace();
			System.out.println("데이터베이스 연결  실패 ㅠㅠㅠ");
		}finally {
				try {
					if(rs != null ) { rs.close(); }
					if(stmt != null) { stmt.close(); }
					if(conn != null) { conn.close(); }
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}

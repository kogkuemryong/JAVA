package Eclipse_Db.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Delete {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt = null;
		
		try {
			Class.forName(driver); // java 7 이후 생략 가능.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//System.out.println("데이터베이스 연결  성공~~~");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("customer 테이블에서 레코드 삭제하기...");
			System.out.print("삭제할 번호 입력 : ");
			int no = input.nextInt();
			
			stmt = conn.createStatement();
			
			String sql = "delete from customer where no = "+no;
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("데이터 삭제 성공");
			}else {
				System.out.println("데이터 삭제 실패");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// e.printStackTrace();
			System.out.println("데이터베이스 연결  실패 ㅠㅠㅠ");
		}finally {
				try {
					if(stmt != null) { stmt.close(); }
					if(conn != null) { conn.close(); }
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}

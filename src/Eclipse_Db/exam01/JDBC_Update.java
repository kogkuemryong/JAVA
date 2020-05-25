package Eclipse_Db.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Update {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt = null;
		
		try {
			Class.forName(driver); // java 7 이후 생략 가능.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			// System.out.println("데이터베이스 연결  성공~~~");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("customer 테이블에 값 수정하기...");
			System.out.print("수정할 번호 입력 : ");
			int no = input.nextInt();
			
			input.nextLine(); // dummy
			
			System.out.print("변경할 이름 입력 : ");
			String name = input.nextLine();
			
			System.out.print("변경할 이메일 입력 : ");
			String email = input.nextLine();
			
			System.out.print("변경할 전화번호 입력 : ");
			String tel = input.nextLine();
			
			stmt = conn.createStatement();
			
			// update 쿼리문에 작성.
			String sql = "update customer set name = '"+name+
					                                      "', email = '"+email+
					                                      "', tel = '"+tel+
					                                      "' where no = "+no;
			
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("데이터 수정 성공");
			}else {
				System.out.println("데이터 수정 실패");
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
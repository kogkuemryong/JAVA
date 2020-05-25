package Eclipse_Db.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		// Statement stmt = null;
		PreparedStatement pstmt= null;
		
		try {
			Class.forName(driver); // java 7 이후 생략 가능.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			// System.out.println("데이터베이스 연결  성공~~~");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("customer 테이블에 값 입력하기...");
			System.out.print("번호 입력 : ");
			int no = input.nextInt();
			
			input.nextLine(); // dummy
			
			System.out.print("이름 입력 : ");
			String name = input.nextLine();
			
			System.out.print("이메일 입력 : ");
			String email = input.nextLine();
			
			System.out.print("전화번호 입력 : ");
			String tel = input.nextLine();
			
			//stmt = conn.createStatement();
			
			// insert 쿼리문에 작성.
			String sql = "insert into customer values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			
			//int result = stmt.executeUpdate(sql);
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("데이터 저장 성공");
			}else {
				System.out.println("데이터 저장 실패");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// e.printStackTrace();
			System.out.println("데이터베이스 연결  실패 ㅠㅠㅠ");
		}finally {
				try {
					if(pstmt != null) { pstmt.close(); }
					if(conn != null) { conn.close(); }
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
		}
	}
}
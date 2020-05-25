package Eclipse_Db.exam03;

import java.util.ArrayList;

public class UseJDBC {
	public static void main(String[] args) {
		UseDAO dao = new UseDAO();
		
		ArrayList<UseDTO> list = dao.select();
		
		System.out.println("부서번호\t부서명\t위치");
		System.out.println("------------------------------------------");
		
		for(UseDTO dto : list) {
			int deptno = dto.getDeptno();
			String dname = dto.getDname();
			String loc = dto.getLoc();
			
			System.out.printf("%d\t%s\t%s\n", deptno, dname, loc);
		}
	}
}





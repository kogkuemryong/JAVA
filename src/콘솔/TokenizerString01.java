package 콘솔;

import java.util.StringTokenizer;

public class TokenizerString01 {

	public static void main(String[] args) {
		// StringTokenizer의 거의 정형화 되어있는 형태. 
		
				String data = "11:22:33:44:55"; // : 단위로 데이터가 저장.
				
				StringTokenizer st = new StringTokenizer(data, ":"); // 데이터 구분단위 지정
				
		        while(st.hasMoreTokens()) {                     // hasMoreTokens : 데이터가 존재하는지 확인해주는 명령어. 
		        	System.out.println(st.nextToken());     // nextToken : 데이터를 꺼내오는 명령어. 
		        } 
		
		        

	}

}

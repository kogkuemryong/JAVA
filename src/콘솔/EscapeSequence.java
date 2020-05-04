package 콘솔;

public class EscapeSequence {
	public static void main(String[] args) {

		System.out.print("프로그램"); // 출력 후 그 자리에서  뛰고 대기 
		System.out.println("시작."); // 출력 후 줄 바꾼 후 대기 
		
		//System.out.println("친구가 어제" 잘 다녀왔어? "라고 물어서...");
		// error : java가 인식하는 것과 우리의 의도가 다르기 때문에 오류가 나타난다. 
	
		// 문자열에 (" ") 싶을 때는?
		System.out.println("친구가 어제\"잘 다녀왔어?\"라고 물어서...");	
		// (\") 역슬레시와 큰따옴표를 사용해서 문자열화 시켜준다. (\"잘 다녀왔어?\")
		
		System.out.println("친구가 어제 '잘 다녀왔어? ' 라고 물어서...");	
		// (') 작은 따옴표는 문제없이 사용된다. 		
		
		System.out.println("친구가 어제 \t 잘 다녀왔어 \t 라고 물어서...");	
		// (\t) 탭(tab) 만큼 띄어쓰기가 된다.  (4칸)
		
		System.out.println("친구가 어제 \n 잘 다녀왔어 \n 라고 물어서...");	
		// (\n) 다음줄로 넘어가서 출력 시켜분다. 
		
	    //System.out.println("C:\workspaces\JAVA"); // error
	    // (\) 역슬레시 뒤에 ", t, n 이 올거라고 java 는 생각하는데 오지 않아서 error가 나고 있다. 
	    // 해결점 (\\) 역슬레시 두번 사용
	    System.out.println("C:\\workspaces\\JAVA"); 
		

	}

}

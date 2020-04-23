package 반복문;

public class DupLoop {

	public static void main(String[] args) {
		// 2단 (구구단) 출력
		
				System.out.println("For");
				
				for(int num= 1; num<=9 ; num++) {
					System.out.println("2 x "+num+" = "+(num*2)); // 연산이 먼저이니깐 ( )괄호를 꼭 넣어주자!
				}
				
				
				System.out.println("Do While");
				
				int num= 1;
				do {
					System.out.println("2 x "+num+" = "+(num*2));
					num++;
				} while(num<=9);
				
				
				System.out.println("While");
				
				 num = 1;
				while(num<=9) {
					System.out.println("2 x "+num+" = "+(num*2));
					num++;
				}
				
				// 전체 구구단 출력 (반복문의 중첩 사용)
				
				for(int i = 1; i < 10; i++){
				    for(num= 2; num<10 ; num++) {
					    System.out.print(num +" x " +i + " = " + (num*i)+ "  "); 
				    	 
				    }
				    System.out.println("");
				}
				
				// 반쪽 tree 모양 출력
				for(int q = 1  ; q <=5 ; q++) {
					for(int w = 1; w <= q; w++){
					    System.out.print("*"); // 옆으로 출력해주고 싶을 때, print 함수 사용. 
					}
					System.out.println(""); // println의  ln은 line의 약자로 줄바꿈을 해준다. 
				}
					
					
				// 역 반쪽 tree 모양 출력
				for(int q = 5  ; q >=1 ; q--) {
					for(int w = 1; w <= q; w++){
					    System.out.print("*"); // 옆으로 출력해주고 싶을 때, print 함수 사용. 
					}
					System.out.println(""); // println의  ln은 line의 약자로 줄바꿈을 해준다. 
				}
		

	}

}

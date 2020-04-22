package 반복문;

public class WhileBasic {

	public static void main(String[] args) {
int num  = 1, result = 0;
		
		//괄호 안에는 boolean 값이 온다. 
//     while(num < 5) { 
//         System.out.println("명령문 실행 :" + num); 이대로 명령문을 실행하면 1이 반복해서 출력된다.  }
		// 무한 반복이 걸리지 않게 주의!
	    
		while(num < 5) { 
        	System.out.println("명령문 실행 :" + num); 
        	num++; //num +=1
//        	명령문 실행 :1
//        	명령문 실행 :2
//        	명령문 실행 :3
//        	명령문 실행 :4
        	while(num <= 10) { 
            	System.out.println("명령문 실행 :" + num); 
            	num++; //num +=1 	
        	}
        	
       /* 1~10의 합은 =?
        result = 1+2+3+4+5+6+7+8+9+10;
        System.out.println("1~10의 합 : "+result);*/
        
        	
        num = 1;
        /* 1~100의 합은 =?*/ 
        while(num<=100) {
        	result += num;
        	num++;	
        }
       System.out.println("1~100의 합 :"+result);
        // 계산 값이 int의 범위를 넘는지 넘지 않는지 확인해야한다. 

		}

		do { 
			if(num % 10 == 0) {
			System.out.println("카운팅 값 : "+ num);
			result += num;
			System.out.println("누적값 : " + result);}
			num++;		
		}while(num <= 100);
		
		System.out.println("1~100까지의 합 : " + result);
		
		while(num <= 100) {
			if(num % 10 == 0) {
				System.out.println("카운팅 값 : "+ num);
				result += num;
	        } num++;
			
		} 
		
		System.out.println("1~100까지의 합 : " + result);
		
		
		
	}

}

package 조건문;

public class NoticeCond {

	public static void main(String[] args) {
int num1 = 152 , num2 = 173;
		
		if(num1 > num2) // if , else 조건문이 한줄 이때만 { } 생략 가능하나, 지양한다. 
			System.out.println("num1값이 num2 보다크다.");
		else 
			System.out.println("num1값이 num2 보다크다.");
		
		if(num1 > num2) {
			if(num1 > 100) {
				System.out.println("1. num1 = "+num1);
			}	     
		}else {
			System.out.println("2. num1 = "+num1);
			// 출력 값  : 2. num1 = 152

		}
		
		if(num1 > num2) 
			if(num1 > 100) 
				System.out.println("1. num1 = "+num1);		     
	    else 
	 		System.out.println("2. num1 = "+num1);		
		
		// 괄호를 지우니깐 동작 되지 않는다. 여백을 무시하므로  else 는 가까운 if 문으로 연결이 된다. 
		// java는 위에서 부터 동작이 되어지기 때문에 if(num1 > num2) 이 수행 되므로 밑에 코드를 생략하므로
		// 결과는 아무것도 출력되지 않는다. 
		

		int n = 24;
		
		// 0<= n < 10 error : 연산 우선 순위에 의해서 0<=n 을 수행하는데 그 값이 true가 나오는데  
		//  true < 10 연산이 되지 않기 때문에 error 가 나온다. 
		
		if(n >= 0 && n < 10) 
		System.out.println("0이상 10미만의 수");
		
		else if(n >= 10 && n < 20)
		System.out.println ("10이상 20미만의 수");
	    
		else if(n >= 20 && n < 30)
	    System.out.println ("20이상 30미만의 수");
		
		else
	    System.out.println ("음수 혹은 30이상의 수");

		//아래의 예제를 switch문을 활용하여 변경해 보자. 
		
		switch(n) {
		    case 1 : case 2 : case 3 : case 4 : case 5 : 
		    case 6: case 7 : case 8 : case 9 :       
		    	System.out.println("0이상 10미만의 수");
		        break;
		 
		    case 10: case 11: case 12: case 13: case 14:
		    case 15: case 16: case 17: case 18: case 19:
		    	System.out.println ("10이상 20미만의 수");
		        break;
		    
		    case 20: case 21: case 22: case 23: case 24: 
		    case 25: case 26: case 27: case 28: case 29:
		    	System.out.println ("20이상 30미만의 수");
		        break;
		    
		    default:
		    	System.out.println ("음수 혹은 30이상의 수");
		    	break;
		    	
		
		}

	}

}

package 조건문;

public class SwichBasic { // switch 문 (수식(값)) 수식 값은 반드시 정수(or 문자)
	public static void main(String[] args) {
		
int num = 1;
		
		// num의 경우의 수를  case문 안에 명시한다. 조건을 체크해서 경우의 수에 맞추어 정의해서 사용하는 것이다. 
		// case , break 와 항상 함께 사용된다. break의 의미는 수 일치 문을 벗어나라는 것이다. 
		// break; 를 넣지 않으면 맞는 조건 이후의 조건들을 모두 수행해서 출력해준다. 
		// default 값은 넣어도 되고 넣지 않아도 문제가 되지 않는다. 
		
		switch(num) {
		    case 1:
		    	System.out.println("정수의 값은 1이에요.");
		    	System.out.println("Good Morning, Java!");
		    	break;
		  
		    case 2:
		    	System.out.println("정수의 값은 2이에요.");
		    	System.out.println("Good Afternoon, Java!");
		    	break; 
		    
		    case 3:
		    	System.out.println("정수의 값은 3이에요.");
		    	System.out.println("Good Evening, Java!");
		    	break;
		    	
		    default:
		    	System.out.println("정수의 값은 1~3이외의 값이에요.");
		    	System.out.println("Hello, Java!");
		    	break;
		  
		}
		
		//7버전 이후 가능한 문법
		
		String name  = "홍길동";
		
		switch(name) { 
		case "김유신":
			System.out.println("제 이름은"+name+"입니다.");
			break;
			
		case "세종대왕":
			System.out.println("제 이름은"+name+"입니다.");
            break;
			
		case "홍길동":
			System.out.println("제 이름은 "+name+" 입니다.");
			break;
		
		default:
			System.out.println("이름을 알 수 없습니다.");
			break;
		
		}
		// 위의 swich문 간략하게 편집하기
		
        String name1 = "세종대왕";
		
		switch(name1) { 
		case "김유신": case "홍길동": case "세종대왕": // 중복되는 값이므로 가능
			System.out.println("제 이름은 "+name1+" 입니다.");
			break;
		default:
			System.out.println("이름을 알 수 없습니다.");
			break;
			
		}

		
		System.out.println("프로그램 종료...");
	
	}

}

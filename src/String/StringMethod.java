package String;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart"; // = String str1 = new String("Smart");
		// String은 Scanner 와 다르게 import 하지 않아도 error 가 나지 않는다. 
		// String과 같은 아주 많이 사용되는 것들을  java.lang.String;에 넣어놨고,  java.lang.은 import를 하지 않아도 되게 만들었다. 
		// java스스로 import 해서 넣어준다. (system포함)
	
		String str2 = " and ";
		String str3 = "Simple";
		
		// concat(str) 활용 많다. 멀티미디어( 파일의 이름과 확장자 명을 더해줄 때 사용된다. ex) drama.mp4)
		String result = str1.concat(str2); // concat(str) : 내가 가진 문자열에 입력된 문자열을 연결시켜준다= str1+str2 = Smart and 
		System.out.println(result); 
		System.out.println(str1+str2);
		
		//compareTo(anotherString) : 파일의 내용이 같은지 다른지를 확인시켜준다. 
		str1.compareTo(str3); 
		System.out.println(str1.compareTo(str3)); 
		// 반환형(int) - 결과값 :  4  , 결과의 수가 중요한 것이 아니라, 0인지 양수인지 음수인지 확인하는것이 중요하다. 
        // 값이 0이 나오면 내용을 가지고 있다. 
		
		// 문자열을 숫자 값을 가지고 차를 구했을 때, 양수인가(앞의 문자열이 사전 뒤쪽에 있다) 음수인가 (앞의 문자열이 사전 앞쪽에 있다)
		// simple의 숫자값이 smart 보다 크다( 유니코드 ) 
		if(str1.compareTo(str3) == 0) { 
			System.out.println("str1 과 str3의 문자열 내용이 똑같다.");
		}else {
			System.out.println("str1 과 str3의 문자열 내용이 다르다.");
		}
		// 	if(num == num1){}else{} : 이건 num와 num1의 주소값이 같은지 확인해주는 것이다. 안의 값이 같은지 확인해주는 것이 아니다.
		
		
		result = str1.concat(str2); // 두개의 문자열을 결합
		result = str1.concat(str2).concat(str3);// 3개의 문자열 결합
		System.out.println(result);
		
		/*
		 * str1의 메모리가 존재할 때 str1이 가리는키는 값은 smart str2의 메모리가 존재할 때 str2이 가리는키는 값은 and
		 * str3의 메모리가 존재할 때 str3이 가리는키는 값은 simple
		 * 
		 * str1.concat(str2) -> str1만큼 같은 크기를 별도로 메모리에 할당하고, 입력으로 전달한 str2의 값의 크기만큼도
		 * 할당하고 모든 데이터를 복사해주고 concat이 주소값을 줘서 result 에 저장된다.
		 * str1.concat(str2).concat(str3) -> str1.concat(str2)가 결합되어 있는 상태를 메모리에 할당하고
		 * concat(str3)의 크기를 할 당한다음 str1.concat(str2)과 concat(str3)을 복사해준 다음 주소값을 다시 줘서
		 * result에 저장된다. str1.concat(str2)의 result 값과 str1.concat(str2).concat(str3)의
		 * result의 값은 다르다.
		 * 
		 * 주소값을 잃어버린 str1.concat(str2)은 쓸데 없이 메모리를 차지하고 있다. (concat 많이 사용할수록 낭비되는 메모리가
		 * 많아지다) 메모리는 한정적이기 때문에 작은 수의 문자열을 결합할 때는 유용하지만 많은 문자열을 결합할 때는 좋지 않다.
		 * 
		 * 문제점을 해결 : new StringBuilder();
		 */
		

	}

}

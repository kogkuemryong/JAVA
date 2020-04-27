package 객체지향언어.add;

public class Adder {
private int cntAdd; 
	
	public Adder(){  // 생성자를 적용 + 필드를 초기화 
		cntAdd = 0;
	}
	public int addTwoNumber(int num1, int num2) { // default 값이 적용되기 때문에 같은 package에서만 사용이 가능.
		cntAdd++;
		return num1 + num2 ; // ( + ) 연산을 먼저 하고 num1 + num2 최종적으로 이 값을 제공해줄 것이다. 수행한 값을 return 할 것이다. 
		// return 연산식, method 무엇이든 최종의 값이 하나로만 반환 된다면 그 값이 올 수 있다. 
	}
	public int getCntAdd() {  // counting 하는 값을 변경하지 못하게 method로 정의 한 것이다. 
		return cntAdd;
	}	
}
	
	
// 하나의 파일에 하나의 public 만 넣을 수 있다. 



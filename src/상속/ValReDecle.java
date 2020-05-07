package 상속;
 // 인스턴스 변수도 오버라이딩 가능 하지만 지양하자. 

class AAAA { 
	public int num=2; 
	} 
class BBBB extends AAAA { 
	public int num=5; 
	} 
class CCCC extends BBBB { 
	public int num=7; 
	}
// 동일한 이름 사용 - error가 나지 않는다. 

public class ValReDecle {
	public static void main(String[] args) {
		CCCC ref1 = new CCCC(); // CCCC
		BBBB ref2 = ref1; // CCCC
		AAAA ref3 = ref2; // BBBB
		
		// field 의 경우, 접근하는 참조변수의 자료형이 명확하면 똑같은 변수 사용이 가능하다. 
		System.out.println("CCCC's ref: "+ref1.num);  // CCCC  :  num =  7
		System.out.println("BBBB's ref: "+ref2.num);  // BBBB  :  num =  5
		System.out.println("AAAA's ref: "+ref3.num);  // AAAA  :  num =  2
		
		// 기능은 확실하게 수행되지만 가독성이 좋지 않으므로 지향하는 것이 조
		

	}

}
//상속의 관계를 전제로 부모 class에 있는 입력의 형태와 반환형의 형태 모두 같게  자녀class에 재정의 하는 것을 의미한다. 
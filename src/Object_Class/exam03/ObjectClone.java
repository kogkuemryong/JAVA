package Object_Class.exam03;

public class ObjectClone {

	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point copy = null;
		
		System.out.println(org);
		// 출력 값 : exam04.Point@15db9742 (해시코드: 일련번호)toString method 에 의해서 출력된 값. 
        
		try {
			copy =  (Point)org.clone();
			
		    org.showPosition();
		    copy.showPosition();
		 
		} catch (CloneNotSupportedException e) {
			
			//e.printStackTrace(); // 강제로 종료된 것과 동일한 결과가 나타난다. 
			System.out.println("예외 발생");
			
		   // org 가 implements Cloneabl 되어 있으면 true 값으로 복사가 되고, 그렇지 않으면 clone으로 부터 예외를 발생시키도록 되어 있다.(보안을 확실하게 하기 위함이다.)
		} // 반환형은 Object 이므로 최종적으로 Object가 반환되지만 강제형변환 하여 참조변수에 담아준다. 

	}

}

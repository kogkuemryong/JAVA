package Object_Class.exam02;

public class ObjectEqulas {

	public static void main(String[] args) {
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		
		IntNumber name1 = new IntNumber("홍길동");
		IntNumber name2 = new IntNumber("홍길동");
		IntNumber name3 = new IntNumber("이순신");
		
		
		if(name1.equals(name2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
        // 1) getter 메서드 사용
		
		if(num1.getNum() == num3.getNum()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 2) equals 메서드 사용 (overriding)
		
		
		
		
		if(num1.equals(num2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(num1.equals(num3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		/*
		 3) field 값 사용 
		 
		if(num1.num == num2.num) { // field 값인 num 이 private 일때, error 가 발생한다. 
			System.out.println("같다");   //  getter 메서드를 만들어서 읽어오게 만들 수 있다.  
		}else {
			System.out.println("다르다");
		}
		
		if(num1.num == num3.num) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(num2.num == num3.num) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		*/

	}

}

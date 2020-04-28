package 객체지향언어;

class NoAccessWay{
	static int num = 0;
	int memVari = 0;
	
	 NoAccessWay(){
		 incrementCnt(); // 같은 구역 안에 있기 때문에 이름만으로 호출이 가능하다. (이미 호출이 된 이후 생성자가 호출 되기 때문에 문제 x)
    	 noAccessway(); // main 안에서 들어가는 순간 메모리가 할당 된다. 	 
	 }
	
	public void incrementCnt() {
		memVari++;
		num++;
		noAccessway(); //들어가는 것은 문제 없다.  
	}
		
    public static void noAccessway() {
    	num++;
    	// memVar++; : error num 과  noAccessway 의 값은 static 으로 할당이 되었는데 
		// memVar++의 값 new 이후 할당 받을 수 있기 때문에 접근이 불가능 하다. 
    	// incrementCnt() // 호출 불가능
	}
	
}
public class ClassVarNoAccess {
	public static void main(String[] args) {   //static 을 넣어서 메모리에 올려놓고 그 자료형의 main 찾는 것이다.  
		NoAccessWay.num =5;                      //static 을 붙이지 않고 매서드를 만들면 메모리에 올라와 있지 있기 때문에 사용할 수 없다.  
        //static 을 빼고 선언하면 new를 넣을 때 사용가능해진다. 
        //static 을 넣으면 main에 들어가는 순간 할당되기 때문에 범용적으로 사용될 수 있다. 
NoAccessWay  accessWay = null; // 참조변수 인데 인스턴스가 담겨있지 않다는 의미
accessWay = new NoAccessWay();

System.out.println(accessWay.num);
System.out.println(NoAccessWay.num);
	}

}

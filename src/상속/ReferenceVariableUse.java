package 상속;

class Computer{
	 Computer(){	 
	 }
}
class Notebook extends  Computer{
	Notebook(){
		super();
		}
}
class TabletPC extends Notebook{
	TabletPC(){
		super();
		}
}

public class ReferenceVariableUse {
	public static void main(String[] args) {
		Computer computer1 = new Notebook();
		Computer computer2 = new TabletPC();
		
		// 자료형과 메서드는  여전히 computer 에서 선언 되어져 있는 것을 사용한다. 
		
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new TabletPC();
		
		// TabletPC tabletPC = new Notebook(); // error 
		// 부모의 자료형으로 자식의 자료형으로 바라보는 것은 error가 난다. 
		
		TabletPC tabletPC1 = new TabletPC();
		TabletPC tabletPC2 = tabletPC1;
	    // 	tabletPC1, tabletPC2 이름의 참조변수로 TabletPC 접근이 가능해졌다. 
	
		Notebook notebook3 = tabletPC2; // 자료형과 method는 선언된 자료형으로 사용된다. 
		// 자식의 자료형으로 부모 자료형으로 바라보는 것이 가능하다. 
		
		Computer computer3 = tabletPC2; // 문제 없다. 

		// TabletPC tabletPC3 = Notebook3 ; // error
		// TabletPC tabletOPC4 = computer3;  // error

	}

}

package 상속;

class Computer1{
	 Computer1(){}
	 
	 public void computerMethod() {
		 System.out.println("컴퓨터 자료형 메서드 호출.");
	 }
}
class Notebook1 extends Computer1{
	Notebook1(){super();}
	
	public void NotebookMethod() {
		System.out.println("노트북 자료형 메서드 호출.");
	}	
}

class TabletPC1 extends Notebook1{
	TabletPC1(){super();}
	
	public void TabletPCMethod() {
		System.out.println("테블릿PC 자료형 메서드 호출.");
	}	
}

public class InstanceOf {
	public static void main(String[] args) {
	
		// 인스턴스화 해서 메로리 할당해서 참소변수 안에 주소값을 저장하여 사용할 수 있게 되었다. 
				Computer1 computer1 = new Computer1(); 
				Notebook1 notebook1 = new Notebook1();
				TabletPC1 tabletPC1 = new TabletPC1();
				
				useComputer(computer1); // computer에 담겨있는 주소값을 가져오고, 그 주소값이 담겨있는 data(Computer)로 이동한다.  
				                                   // computer의 주소값이 comp 에 저장된다. comp를 통해서 heap 영역의 Computer로 이동할 수 있다. 
				                                   // computer는 main 에서  comp는 useComputer 메서드 에서 인식된다. 
				                                   // 그렇기 때문에 지역 변수로서 각각의 메모리를 할당 받는다. 같은 메모리가 아니다. 
				
				useComputer(notebook1); // notebook에 담겨 있는 주소값을 가져오고, 그 주소값이 담겨있는 data(Notebook)로 이동. 
				                                   // Computer로 이동하여 computerMethod()를 호출한다. 
		                                           // 부모 class 의 method 안에 있는 것을 읽어 드릴 수 있다. 
				
				
				useComputer(tabletPC1); // tabletPC 에 담겨 있는 주소값을 가져오고, 그 주소값이 담겨 있는 data(tabletPC)로 이동. 
				
				// 다형성에 의해서 부모의 조건에서 자식을 바라보는 것이 문제가 되지 않기 때문에 가능하다. 
				// useComputer(notebook); 주소값은 notebook으로 연결 되지만 자료형이 Computer 이기 때문에 결과 값은 Computer 안에서만 수행한다. 
			}                                
			
		    // main에 static으로 메모리에 올라와 있기 때문에 method에도 static을 붙여서 메모리에 올라와 있도록 한다. 
			
			                                           // Computer comp 변수 선언 = computer;
			                                           // Computer comp 변수 선언 = notebook; 가능 
			                                           // Computer comp 변수 선언 = tabletPC; 가능 
			public static void useComputer(Computer1 comp) { // 내가 만든 자료형의 변수는 무조건 자리값을 담기 때문에 4byte할당 받는다. 
				
				comp.computerMethod(); 
				
				if(comp instanceof TabletPC1) {
					TabletPC1 tabletPC1 = (TabletPC1)comp; // comp 의 값이 변하는 것이 아니라, 새롭게 할당된 메모리에 값을 넣어주는 것이다. 
					tabletPC1.computerMethod();             // 그 주소값을 tabletPC 에 넣어준다. 
					tabletPC1.NotebookMethod();
					tabletPC1.TabletPCMethod();

				} else if(comp instanceof Notebook1) {
					Notebook1  notebook1= (Notebook1)comp;
					notebook1.computerMethod();             
					notebook1.NotebookMethod();
					// notebook.TabletPCMethod(); // error 
				
				} else 	{
					comp.computerMethod();
				}
				
				// 어떤 자료형을 가지고 있는지 check 할 수 있도록 하는 명령어 = instanceof(상속 안에서만 의미 있다)
				// instanceof는 연산자 이므로 양쪽에 피연산자가 와야한다.  
		        // 참조변수 instanceof 자료형 , 결과값을 boolean 값 (true = 참조변수가 자료형이 안다, false = 참조변수가 자료형을 모른다.)
				// 주의) instanceof 가장 하단의 자식 class 부터 역순으로 비교하도록 해야지 원하는 자료형을 체크할 수 있다. 

			}		

				// error : 다형성에 의해서 주소값을 담는건 문제가 되지 않지만, 그때 comp의 자료형은 Computer 이기 때문에 computer만 접근할 수 있다, 
			    //다형성에서는 자신의 자료형에 안에서만 수행할 수 있다.  
				// comp.NotebookMethod();
				// comp.TabletPCMethod();
			}
			/*
			public static void useComputer(Notebook1 comp) { // 매개변수의 자료형이 다른 경우로 overloading 된다. 
				comp.computerMethod(); 
				comp.NotebookMethod();
			}
			
			public static void useComputer(TabletPC1 comp) { // 매개변수의 자료형이 다른 경우로 overloading 된다. 
				comp.computerMethod(); 
				comp.NotebookMethod();
				comp.TabletPCMethod();
				
			}
			*/
		


package 상속;

public interface Interface_2 {

	public void superMethod();
}

interface SubInterf extends  Interface_2 {
	
	public void subMethod();
	
} 

// 인터페이스 간 상속이 가능, 단 이때는 implements 가 아닌 extends를 사용한다. 

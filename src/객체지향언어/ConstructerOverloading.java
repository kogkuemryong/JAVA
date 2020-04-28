package 객체지향언어;

public class ConstructerOverloading {

	public static void main(String[] args) {
        //생성자 overloading
		
		human cheolsoo = new human("철수" , 202004281);
		human younghee = new human("영희");    

		cheolsoo.showInfo();
		younghee.showInfo();
	
	

	}

}

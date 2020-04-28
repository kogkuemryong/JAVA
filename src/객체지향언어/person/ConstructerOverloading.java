package 객체지향언어.person;

public class ConstructerOverloading {

	public static void main(String[] args) {
        //생성자 overloading
		
		person cheolsoo = new person("철수" , 202004281, 1990 , 4 ,28);
		person younghee = new person("영희", 1995,6,28);    

		cheolsoo.showInfo();
		younghee.showInfo();
		

	}

}

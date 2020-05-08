package 상속.exam08;

import java.util.Scanner;

class Menu { // 프로그램의 시작 포인프로 화면을 띄워주는 역할을 한다. 
	
	//field
	FriendInfoController controller;
	
	//생성자
	Menu(){
		controller = new FriendInfoController();
		// swich 안에 1~2번을 수행하기 위해서는 swich 사용 이전에 
		// 메모리 위애 있어야 하기 때문에 먼저 생성하도록 한다. class FriendInfoController 를 new 해준다. 
		// 무조건 생성자에서 넣어줘야 하는 것은 아니지만 일반적으로 생성자 안에서 new했을 때, 
		// 무리 없이 기능들을 수행할 수 있기 때문에 생성자 안에서 new해준다. 
	}
	
	//메서드 
	public void displayMenu() {
		
	    while(true) { 
	    	// 무한 반복 : 프로그램 스스로는 종료시키지 않겠지만, 사용자의 선택에 의해서 선택 되도록 만든다. 
	    	// 0번이 입력되기 전까지 반복된다. 
		System.out.println("*** 메뉴를 선택 ***");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 고등학교 친구 정보 입력.");
		System.out.println("2. 대학교 친구 정보 입력.");
		System.out.println("3. 고등학교 친구 정보 출력.");
		System.out.println("4. 대학교 친구 정보 출력.");
		System.out.println("5. 모든 정보 출력.");
		
		System.out.print("원하는 항목 번호를 선택하세요>>"); 
		
		Scanner input = new Scanner(System.in);
		
		int choice = input.nextInt(); 
		
		switch(choice) {
		    case 0 :
		    	System.out.println("프로그램을 종료합니다.");
		    	return; // 메서드를 빠자나가도록 함으로 무한반복이 끝이 난다. 
		    	
		    case 1: case 2:
		    	controller.addFriend(choice); 
		    	break;
             
		    case 3:   case 4:
		    	controller.displayInfo(choice);
		    	break;
		    	
		    case 5:
		    	controller.diplayAllInfo();
		    	break;
		    	
		    	
		    default: // 예외 처리 
		    	System.out.println("잘못된 입력을 하셨습니다.");
		    	System.out.println("번호를 확인하세요.");
		    	break;
		    	
		    	// return 을 활용하여 displayMenu() method를 벗어나 main 으로 가게 된다. 
		    	
		}

		
	    }
	 // 0번이 눌리면 프로그램이 종료 되도록 하고, 0번이 눌리지 않으면 무한 반복.	
	}
}
// 화면과 controler 같은 경우는 빠르게 정의하기 쉽지 않다. 
// 사용자로 하여금 내용을 입력 받을 수 있게 유도 하는 기능이 필요할 것이다.




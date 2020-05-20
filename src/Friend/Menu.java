package Friend;

import java.util.Scanner;

class Menu {
	
Menu(){}
	
	public void displayMenu(){
		FriendInfoController controller = new FriendInfoController();
		
		while(true){
			System.out.println("\n\n*** 메뉴 선택 ***");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 중학교 친구 정보 입력");
			System.out.println("2. 고교 정보 입력");
			System.out.println("3. 대학 친구 정보 입력");
			System.out.println("4. 중학교 친구 정보 출력");
			System.out.println("5. 고교 친구 정보 출력");
			System.out.println("6. 대학교 친구 정보 출력");
			System.out.println("7. 중학교/고등학교/대학교 친구 정보 출력");
			System.out.println("8. 친구 기본 정보 출력.");
			System.out.println("9. 데이터 삭제 기능");
			System.out.println("10. 데이터 검색 기능");
			
			System.out.print("원하는 항목 번호을 선택하세요 >> ");
			
			Scanner keyboard = new Scanner(System.in);
			int num = keyboard.nextInt();
			
			switch(num){
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				case 1:	case 2:	case 3:
					controller.addFriend(num);
					break;
				case 4:
					controller.displayMiddleInfo();
					break;
				case 5:
					controller.displayHighInfo();
					break;
				case 6:
					controller.displayUnivInfo();
					break;
				case 7:
					controller.displayFriendInfo();
					break;
				case 8:
					controller.displayBasicFriendInfo();
					break;
				case 9:
					controller.deleteData();
					break;
				case 10:
					controller.searchData();
					break;
				default:
					System.out.println("잘못된 번호를 입력하셨습니다.");
					System.out.println("번호를 확인하세요.");
					break;
			}
		}
	}

}

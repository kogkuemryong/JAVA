package 상속.exam10;


import java.util.Scanner;

//화면 <---> 데이터 처리 (상호작용 필수)
//저장하는 기능을 수행하기 위해서 controller 사용. 

//행위와 기능 
class FriendInfoController {
	// Menu에서 new 된다. 
		// HighFriend[] highFriend;
	    // UnivFriend[] univFriend;
		// int indexUniv;
	    // int indexHigh;
		
		Friend[] friend;  // 자료형면 상속의 구조로 잘 만들어준다면 기능이나 대상이 추가 될때 추가적인 대상을 선언할 필요 없다. 
		// 추가장점 : 각 class 와 상관 없이 200명을 담아둘 수 있다. 
	    int index; 
	 
		FriendInfoController() {
		    // highFriend = new HighFriend[100];
			// univFriend = new UnivFriend[100];
			// indexHigh = 0;
		    // indexUniv = 0;
		    
			friend = new Friend[200];
			index = 0;
		    
		}
		
		public void addFriend(int choice) {   // 입력 받은 data를 저장시키는 기능 
			 // System.out.println("addFriend() 호출."); // 기능 확인용 
			 // if(indexHigh>=100 || indexUniv >=100) {
			
			if(index>=200) {
				System.out.println("더 이상 저장할 공간이 없습니다.");
				return; // 매서드를 벗어나서 도출한 쪽으로 돌아가는 용도로 사용한다. 
			} 
			
			Scanner input = new Scanner(System.in); 
			// 위에 몰아서 사용하는 것이 일반적이다. 코드를 추가할 때, 개수가 많으면 이름을 다 기억할 수 없어서 
			// 겹칠 우려가 있어서 그것을 방지하기 위해서  몰아서 작성하는 것이다. 가독성이 훨씬 좋다. 
			
			String name = null , phone= null, address= null, work= null;
			// 참조자료형 같은 경우는 null 값으로 초기화 해주므로 안정적으로 실행될 수 있도록 해준다. 
	        
			System.out.print("이름을 입력하세요 : ");
			name = input.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			phone = input.nextLine();
			System.out.print("주소를 입력하세요 : ");
			address = input.nextLine();
			
			if(choice ==1) {
			System.out.print("직업을 입력하세요 : ");
			work = input.nextLine();
			
			// System.out.printf("%s, %s, %s,  %s\n",name, phone, address, work);
			
			// highFriend[indexHigh] =  new HighFriend(name, phone, address, work);
			// indexHigh++; // 10명 =  10; 다음 저장될 수까지 올려서 기다린다. 
		    
			friend[index] = new HighFriend(name, phone, address, work);
			index++;
			
			// new Friend(name, phone, address);
			// abstract 붙은 자료형이기 때문에 instance되어 질 수 없기에 error 나타난다. 
			
			
			} 
			
			else {
			System.out.print("전공을 입력하세요 : "); 
				work = input.nextLine();
				
			// System.out.printf("%s, %s, %s,  %s\n",name, phone, address, work);
		    // univFriend[indexUniv] =  new UnivFriend(name, phone, address, work);
			// indexUniv++;	
			
		    friend[index] =  new UnivFriend(name, phone, address, work);
			index++;	
			}
			
			// 상속 받은 HighFriend 를 선언으로 생성자를 호출하여 입력받은 데이더를 매개변수에 저장해줘서 
			// 부모 class 에 3개 data는 초기화 해주고 1개 data는 자신의 class에 초기화 된다. 
			// 문제점 : 이전 입력한 data가 날아가버린다. (하나의 변수로는 한개의 값만 저장한다.)
			// 해결 : 배열 - 하나의 변수의 이름으로 인덱스를 통해서 관리(저장)해준다. (전제조건: 동일한 자료형(HighFriend))
			// 배열은 index 관리가 중요하므로 index의 값이 추가 되도록 만든다. (몇번까지 추가 되어졌는지 확인)
		
		}
		
		
		
		// 자료형의 차이를 체크하여 일부만 출력이 가능하므로 instanceof 사용

		/*
		 * public void displayHighInfo() { for(int i = 0; i<indexHigh; i++) {
		 * highFriend[i].displayHighFriendInfo(); } }
		 * 
		 * public void displayUnivInfo() {
		 * for(int i = 0; i<indexUniv; i++) { univFriend[i].displayUnivFriendInfo(); }
		 * }
		 */
		
		public void displayHighInfo() { 
		for(int i=0; i<index;i++) {
			if(friend[i] instanceof HighFriend){
				friend[i].displayFriendInfo();
			}
		}
		}
		
		public void displayUnivInfo() {
		for(int i =0; i<index;i++) {
			if(friend[i] instanceof UnivFriend){
				friend[i].displayFriendInfo();
			}
		}
		}
		

		
		public void diplayFrinedInfo() {
			/*
			 * for(int i = 0; i<indexHigh; i++) { highFriend[i].displayHighFriendInfo(); }
			 * 
			 * for(int i = 0; i<indexUniv; i++) { univFriend[i].displayUnivFriendInfo(); }
			 */
			
			for(int i = 0; i < index; i++) {  // friend의 모든 정보 출력
				friend[i].displayFriendInfo();
			}
			// overriding에 의해서 각각의 자료형 method를 java가 호출해서 출력해준다. 
			// overriding 만 잘해주면 추가 정보를 업그레이드 하더라도 코드 변형이 없다. 
			
			
		}
		
		public void displayBasicFriendInfo() {
			for(int i = 0; i < index ; i++) {
				friend[i]. displayBasicFriendInfo();
			}
		}
			

}

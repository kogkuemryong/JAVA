package 상속.exam08;

import java.util.Scanner;

//화면 <---> 데이터 처리 (상호작용 필수)
//저장하는 기능을 수행하기 위해서 controller 사용. 

//행위와 기능 
class FriendInfoController {
        // Menu에서 new 된다. 
		HighFriend[] highFriend;
		// 자료형을 배열로 바꿔도 4byte할당 한다(주소값을 담는다) 
	    // HighFriend[] highFriend = new HighFriend[100]; 일때, 
		//각각의 이름을 저장해주므로 4x100 = 400byte를 할당 받는다.
		int indexHigh;
	    UnivFriend[] univFriend;
	    int indexUniv;
		
	    String result ;
		FriendInfoController() {
		    highFriend = new HighFriend[100];
		    indexHigh = 0;
		    univFriend = new UnivFriend[100];
		    indexUniv = 0;
		    
		}
		
		public void addFriend(int choice) {   // 입력 받은 data를 저장시키는 기능 
			 //System.out.println("addFriend() 호출."); // 기능 확인용 
			if(indexHigh>=100 || indexUniv >=100) {
				System.out.println("더 이상 저장할 공간이 없습니다.");
				return; // 매서드를 벗어나서 도출한 쪽으로 돌아가는 용도로 사용한다. 
			} 
			
			Scanner input = new Scanner(System.in); 
			// 위에 몰아서 사용하는 것이 일반적이다. 코드를 추가할 때, 개수가 많으면 이름을 다 기억할 수 없어서 
			// 겹칠 우려가 있어서 그것을 방지하기 위해서  몰아서 작성하는 것이다. 가독성이 훨씬 좋다. 
			
			String name = null , phone= null, address= null, work= null, major = null;
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
			
			System.out.printf("%s, %s, %s,  %s\n",name, phone, address, work);
			
			highFriend[indexHigh] =  new HighFriend(name, phone, address, work);
			indexHigh++; // 10명 =  10; 다음 저장될 수까지 올려서 기다린다. 
			System.out.println("이름: " +  name + " 전화번호 : " +  phone + " 주소 : " + address+" 직업 : "+ work);
			
			} else {
			System.out.print("전공을 입력하세요 : "); 
				major = input.nextLine();
				
			System.out.printf("%s, %s, %s,  %s\n",name, phone, address, major);
				
		    univFriend[indexUniv] =  new UnivFriend(name, phone, address, major);
			indexUniv++;	
			System.out.println("이름: " +  name + " 전화번호 : " +  phone + " 주소 : " + address+ " 전공 : "+ major);
			}
			
			// 상속 받은 HighFriend 를 선언으로 생성자를 호출하여 입력받은 데이더를 매개변수에 저장해줘서 
			// 부모 class 에 3개 data는 초기화 해주고 1개 data는 자신의 class에 초기화 된다. 
			// 문제점 : 이전 입력한 data가 날아가버린다. (하나의 변수로는 한개의 값만 저장한다.)
			// 해결 : 배열 - 하나의 변수의 이름으로 인덱스를 통해서 관리(저장)해준다. (전제조건: 동일한 자료형(HighFriend))
			// 배열은 index 관리가 중요하므로 index의 값이 추가 되도록 만든다. (몇번까지 추가 되어졌는지 확인)
		
		}
		
		public void displayInfo(int choice) {
		if(choice ==3) {
		
			for(int i  = 0; i<indexHigh; i++) { // 크기에 다 맞춰서 넣었을 때 = length 사용, 크기를 다 넣지 않았을 때는 != length
				highFriend[i].displayHighFriendInfo(); 
			}

		}else {
			for(int i  = 0; i<indexUniv; i++) { // 크기에 다 맞춰서 넣었을 때 = length 사용, 크기를 다 넣지 않았을 때는 != length
				univFriend[i].displayUnivFriendInfo(); 
			}

		}
		}
		
		public void diplayAllInfo() {
			
			for(int i  = 0; i<indexHigh || i<indexUniv; i++) {
				highFriend[i].displayHighFriendInfo(); 
				univFriend[i].displayUnivFriendInfo();	
			}
		}

}

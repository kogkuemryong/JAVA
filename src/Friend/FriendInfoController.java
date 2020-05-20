package Friend;

import java.util.Scanner;

class FriendInfoController {
	Friend[] friend;
	int numOfFriends;
	int MAX_FRIENDS;
	
	FriendInfoController(){
		numOfFriends = 0;
		MAX_FRIENDS = 20;
		friend = new Friend[MAX_FRIENDS];
	}
	
	private boolean overlapCheckName(String phoneNum) {
		
		for(int i=0; i<numOfFriends; i++){
			if(friend[i].getPhoneNum().equals(phoneNum)){
				return true;
			}
		}
		return false;
	}
	
	private void readName(String name) throws NameInputException{
			
		if(name.length() == 1){
			NameInputException nameExcep = new NameInputException();
			throw nameExcep;
		}
	}

	public void addFriend(int choice){
		if(numOfFriends >= MAX_FRIENDS){
			System.out.println("친구를 저장할 공간이 없습니다.");
			return;
		}
		
		Scanner keyboard = new Scanner(System.in);
		String name=null, phoneNum=null, address=null, work=null, major=null, classNum=null;
		boolean nameChk = true;
		
		while(nameChk) {
			System.out.print("이름을 입력하세요 : ");
			name = keyboard.nextLine();
			try {
				readName(name);
				nameChk = false;
			} catch (NameInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		System.out.print("폰번호를 입력하세요 : ");
		phoneNum = keyboard.nextLine();
		
		if(overlapCheckName(phoneNum)) {
			System.out.println("중복된 전화번호가 존재합니다.");
			System.out.println("번호를 확인하세요.");
			return;
		}
		
		System.out.print("주소를 입력하세요 : ");
		address = keyboard.nextLine();
		
		if(choice == 1){ // 중학교
			System.out.print("반을 입력하세요 : ");
			classNum = keyboard.nextLine();
			
			friend[numOfFriends++] = new MiddleFriend(name, phoneNum, address, classNum);
			
		}else if(choice == 2){ // 고등학교
			System.out.print("직업을 입력하세요 : ");
			work = keyboard.nextLine();
			
			friend[numOfFriends++] = new HighFriend(name, phoneNum, address, work);
			
		}else if(choice == 3){ // 대학교
			System.out.print("전공을 입력하세요 : ");
			major = keyboard.nextLine();
			
			friend[numOfFriends++] = new UnivFriend(name, phoneNum, address, major);
			
		}else{
			System.out.println("번호를 확인하세요.");
			return;
		}
	}
	
	public void displayMiddleInfo(){
		for(int i = 0; i < numOfFriends; i++ ) {
			if(friend[i] instanceof MiddleFriend) {
				friend[i].displayFriendInfo();
			}
		}
	}
	
	public void displayHighInfo(){
		for(int i = 0; i < numOfFriends; i++ ) {
			if(friend[i] instanceof HighFriend) {
				friend[i].displayFriendInfo();
			}
		}
	}
	
	public void displayUnivInfo(){
		for(int i = 0; i < numOfFriends; i++ ) {
			if(friend[i] instanceof UnivFriend) {
				friend[i].displayFriendInfo();
			}
		}
	}
	
	public void displayFriendInfo() {		
		for(int i = 0; i < numOfFriends; i++ ) {
			friend[i].displayFriendInfo();
		}
	}
	
	public void displayBasicFriendInfo() {
		for(int i = 0; i < numOfFriends; i++ ) {
			friend[i].displayBasicFriendInfo();
		}
	}
	
	public void searchData(){
		System.out.print("검색할 친구 폰번호를 입력하세요 :");
		Scanner keyboard = new Scanner(System.in);
		String phoneNum = keyboard.nextLine();
		
		for(int i=0; i<numOfFriends; i++){
			if(friend[i].getPhoneNum().equals(phoneNum)){
				friend[i].displayFriendInfo();
				return;
			}
		}
		
		System.out.println("일치하는 폰번호가 없습니다.");
	}
	
	public void deleteData(){
		System.out.print("주소록 삭제할 친구 폰번호를 입력하세요 : ");
		Scanner keyboard = new Scanner(System.in);
		String phoneNum = keyboard.nextLine();
		
		for(int i=0; i<numOfFriends; i++){
			if(friend[i].getPhoneNum().compareTo(phoneNum)==0){
				for(int j=i; j<numOfFriends; j++){
					friend[j]=friend[j+1];
				}
				
				numOfFriends--;
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
	}
	
	class NameInputException extends Exception{
		public NameInputException(){
			super("한 글자의 이름은 입력하실 수 없습니다.");
		}
	}

}

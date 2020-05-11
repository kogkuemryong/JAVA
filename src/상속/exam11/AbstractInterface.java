package 상속.exam11;

public class AbstractInterface {
	public static void main(String[] args) {
		// UI 구현
		
		//PersonalStorage personal = new PersonalStorageImplements();
		PersonalStorage personal = new PersonalStorageThirdparty(1000);
		 // 4byte x 1000 = 4000(각각의 주소값 저장)
		
		personal.addPersonalInfo("20200511", "홍길동");
		
		//  UI 구현
		String name = personal.searchName("20200511");
		System.out.println(name);
	
	}

}

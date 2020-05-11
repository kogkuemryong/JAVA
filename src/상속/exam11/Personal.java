package 상속.exam11;

//자바 bean 같은 class 안에서는 변경 가능 하지만 다른 class에서는 method를 통해서 만 접근 가능하게 만든다. 

class Personal {
	private String perNum;
	private String name;
	
	
	Personal(String perNum, String name){
	this.perNum = perNum;
	this.name = name; 
	
	}


	public String getPerNum() {
		return perNum;
	}


	public String getName() {
		return name;
	}
}

// class PersonalStorageThirdparty extends PersonalStorage{
class PersonalStorageThirdparty implements PersonalStorage{ // 외주 개발사 
	Personal[] perArr; //  = Personal perArr[]; ,[]의 위치는 상관없다. 일반적으로는 자료형에 붙여서 선언하는 것을 선호한다.
	int indexPerInfo;  
	
	PersonalStorageThirdparty(int number){
		
		perArr = new Personal[number]; 
		indexPerInfo = 0;
		
	} 

	@Override
	public void addPersonalInfo(String purNum, String name) { // 생년월일, 이름 (저장 기능)
		perArr[indexPerInfo++] = new Personal(purNum, name);
		// indexPerInfo++;
		// 증가되기 전의 값 0이 오고 다음에 addPersonalInfo가 호출 될 때, 1의 값이 온다.
		
		System.out.println("데이터 저장 완료.");
		
	}

	@Override
	public String searchName(String perNum) {
		for(int i = 0; i <indexPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getPerNum()) == 0 ) { // 생년월일이 같은 사람
				return perArr[i].getName(); // return 으로 method로 나가면서 getName()을 가지고 나갈것이다.
				// null 값이 출력되면 해당 데이터가 없다는 것을 의미한다. 
			}	
		}	return null;
	}

}

// 객체지향을 통해서 독립적으로 수행할 수 있도록 한다. 

// n 차원 배열 
// Personal perArr[]; ,[]의 위치는 상관없다. 일반적으로는 자료형에 붙여서 선언하는 것을 선호한다.
// int [][] num ; 2차원 배열 일 때 int []num[] ; , int [][] num ; , int num[][] ; 의 형태를 허용한다. 
// 하지만 int [][] num ; 형태를 선호한다. 
// int [][][] num ;  3차원 배열의 개념은 행열의 배열이 여러개 있는 모양이라 생각하자. 
// 일반적인 배열은 2차원 까지 사용하고, 3차원은 특수한 분야가 아니면 사용되어지지 않는다. 
// 3차원 배열은 3D 작업 하는 곳(건축분야)에서 사용된다. (행, 열로 되어진 2차열 배열이 면으로 되어진 것이다.) 



package Generics;

class Orange {
int sugarContent; // 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent= sugarContent;
	}

	public void  showSugarContent() {
		System.out.println("당분 함량 : " + sugarContent);
	}

}

package 상속.exam07;

public class Overriding {
	public static void main(String[] args) {
		
        Speaker speaker = new Speaker();
		
		speaker.setVolumeRate(5); 
		//speaker.showCurrentState();
		
		BaseEnSpeaker baseEnSpeaker = new BaseEnSpeaker();
		
		baseEnSpeaker.setBaseRate(5);
		baseEnSpeaker.setVolumeRate(7);
		
		baseEnSpeaker.showCurrentState(); 
		// 자료형이 BaseEnSpeaker 이므로 자료형에 정의 되어 있는 method를 호출한다. 
	    // 부모의 정의 되어 있는 showCurrenState() 을 호출하고 싶으면 
		// 자녀의 super.showCurrenState() 안에 호출해놓으면 된다. 
		
		Speaker speaker1 = new BaseEnSpeaker(); 
		// 상속의 전제 조건하에서만 가능하다. 
		// 부모class 자료형으로 자식 class를 new 할 수 있다 = (다형성)
	    // Speaker 로만 바라본다. 
		
		speaker1.setVolumeRate(5);
		// speaker1.setBaseRate(7); error
		// 자료형 Speaker 이기 때문에 BaseEnSpeaker의 method가  인식되지 않는다. 
		// 대상을 Speaker로만 바라보기 때문에 Speaker를 사용한다. 
	    
	
		baseEnSpeaker.setBaseRate(10);
		baseEnSpeaker.showCurrentState(); 
		
		speaker1.showCurrentState();
		speaker1.showCurrentState();
	    // Speaker가 아닌 BaseEnSpeaker의 오버라이딩 되어 있는 method가 출력된다. 
		// 자식의 method가 출력 되는 이유는???? 
		
		// BaseEnSpeaker baseEnSpeaker1  =  new Speaker(); = error
		// 자식 class를 자료형으로 부모 class를 new 할 수 없다. 
		
		


		

	}

}

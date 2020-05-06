package 상속.exam07;// java bean 목적 : (저장 and 읽기)

class Speaker {
    private int volumeRate;
	
	public int getVolumeRate() {   // volumeRate을 읽어오는 용도(getter)
		return volumeRate;             
	}
	
	public void setVolumeRate(int vol) {    // volumeRate을 업데이트 하는 용도(setter)
		this.volumeRate= vol;	
	}	
	
	public void showCurrentState() {
		//System.out.println("볼륨크기 : " +  volumeRate); // 같은 class 안에서 이름 만으로 field값을 불러온다. 
		System.out.println("볼륨크기 : " +  getVolumeRate());// 같은 class 안서 이름 만으로 method값를 불러올 수 있다.
	}

}

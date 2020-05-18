package Thread;

class Sum1{
	
    int num; 
	
	Sum1(){num=0;}
	
	public synchronized void addNum(int num) {this. num += num;} // 둘 이상의 thread 가 heap 영역하나의 data 를 바라보도록 접근해서 처리하게 되면 문제가 생기므로 동시화를 고려한다. 
	public int getNum() {return num;}                        // 순서가 왔다갔다 하면서 결과 값이 날아가버리게 된다. 
	                                                                       // synchronized 를 활용하여 동작이 완료되서 복귀 될 때까지 순서가 넘어가지 않도록 하도록 한다. 
}                                                                         // 제어권을 넘기지 않고 다 수행한 이후 제어권을 넘기도록 하면 출력 속도가 느려진다. 꼭 필요한 경우애 사용한다. 
                                                                           // synchronized = 동기화 한다. 
class AdderThread extends Thread{

	Sum1 sumInst ;
	int start, end;
	
	AdderThread(Sum1 sum, int s , int e){
		
		this.sumInst = sum;
		this.start = s;
		this.end = e; 
	}
	
	@Override
	public void run() {
		for(int i =start ; i<= end ; i++) {
			sumInst.addNum(i);
		}
	}
}

public class ThreadHeapMultiAccess {

	public static void main(String[] args) {
        Sum1 sum = new Sum1();
		
		AdderThread at1 = new AdderThread(sum , 1 , 5000); // sum의 주소값이 저장
		AdderThread at2 = new AdderThread(sum , 5001 , 10000); // sum의 주소값이 저장
		
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~10000까지의 합 : " + sum.getNum());
        // 둘 이상의 thread 가 하나의 data 를 바라보도록 접근해서 처리하게 될 때 동기화 해줘야 한다. 
		// 최종적으로 업데이트가 균일하게 진행되면 문제가 없지만 그렇지 못하게 때문에 나오는 문제점이다.
		// 하나의 thread 의 동작이 완전히 진행된 이후 순서를 넘기는 것 = 동기화 
		

	}

}

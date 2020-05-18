package Thread;  // Thread 우선 순위 부여. 

class MessageSendingThread extends Thread{

    String message; 
    
    // 우선순위 부여(절대적인 것이 아닌 가중치정도록 생각하자.)
    MessageSendingThread(String message, int prio){
    	
    	this.message = message;
    	setPriority(prio); // 값을 다시 setting 할 수 있게 만들어준다. 
    }
	
	@Override
	public void run() {  // main 2개 효과 
		for(int i = 0; i < 1000; i++) {
			System.out.printf("%s(%d) \n" , message, getPriority()); //set 읽어, get 출력. 
		}
		
	}
	
	
	
}

public class PriorityTest {

	public static void main(String[] args) {

		// 우선순위 
		MessageSendingThread tr1 = new MessageSendingThread ("First", Thread.MAX_PRIORITY); // ("First", 10);
		MessageSendingThread tr2 = new MessageSendingThread ("Second", Thread.NORM_PRIORITY); // ("Second", 5);
		MessageSendingThread tr3 = new MessageSendingThread ("Third", Thread.MIN_PRIORITY); // ("Third", 1);
		
	    tr1.start();
	    tr2.start();
	    tr3.start();
	    
	    // 우선순위가 부여되었다고 해서 Thread의 특성상 결과에 있어서 정확하게 순서에 맞춰서 출력되지는 않는다. 
	    // 각각 1000가지 씩 수행되어야 하는데, 우선순위가 낮다고 해서 무조건 늦게 나오는 것이 아니라 할당된 메모리 안에 내용들이 
		

	}

}

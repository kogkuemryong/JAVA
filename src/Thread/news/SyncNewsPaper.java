package Thread.news;

class NewsPaper {
	String todayNews;
	boolean isTodayNews=false;
	
	public void setTodayNews(String news) { // 기자가 기사를 작성
		todayNews=news;
		isTodayNews=true; // 기사가 작성되는 순간 true 값으로 초기화 
		
		synchronized(this) {
			notifyAll();   // 기다리고 있는 wait(); 메서드를 진행하도록 한다. 
		}
	}
	
	// 동기화를 맞춰갈 때, notifyAll();과 wait(); 은 한쌍으로 같이 움직인다. 
	// wait과 notifyAll 메소드에 의한 동기화가 진행될 때, 이전 예제에서 달라지는 부분은 쓰레드 클래스가 아닌 
	// 쓰레드에 의해 접근이 이뤄지는 NewsPaper 클래스라는 사실에 주목해야 한다.
	
	public String getTodayNews() { // 독자가 기사를 읽음
		if(isTodayNews==false) { // 아직 기사가 작성되지 않았다. 
			try {
				synchronized(this) {
					wait();  // notifyAll();이 호출될 때까지 기다리도록 하는 메서드이다. 
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return todayNews;
	}
}

class NewsWriter extends Thread {
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		paper.setTodayNews("자바의 열기가 뜨겁습니다.");
	}
}

class NewsReader extends Thread {
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper) {
		this.paper=paper;
	}
	public void run() {
		System.out.println("오늘의 뉴스: "+paper.getTodayNews());
	}
}

public class SyncNewsPaper {

	public static void main(String[] args) {
		
		NewsPaper paper=new NewsPaper();
		NewsReader reader1=new NewsReader(paper);
		NewsReader reader2=new NewsReader(paper);
		NewsWriter writer=new NewsWriter(paper);

		try {
			reader1.start();
			reader2.start();
			
			Thread.sleep(1000);			
			writer.start();
	
			reader1.join();
			reader2.join();
			writer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

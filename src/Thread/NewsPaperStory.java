package Thread;

class NewsPaper {
	String todayNews;
	
	public void setTodayNews(String news) {
		todayNews=news;
	}
	
	public String getTodayNews() {
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

public class NewsPaperStory {

	public static void main(String[] args) {
		
		NewsPaper paper=new NewsPaper();
		NewsReader reader=new NewsReader(paper);
		NewsWriter writer=new NewsWriter(paper);

		reader.start();
		writer.start();

		try {
			reader.join();
			writer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		// 논리적으로 실현되려면 NewWrite 쓰레드가 먼저 실행되고, 이어서 NewReader 쓰레드가 실행되어햐 한다. 
		// 하지만 이를 보장하지 못하는 구조로 구현이 되어 있다. 
		// java의 스케쥴러가 운영체제와 교류하면서 결과가 나타나는것이 thread 이기 때문에 내가 원하는 결과가 나타나지 않을 수 있다. 
	

	}

}

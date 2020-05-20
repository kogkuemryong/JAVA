package Stream;

import java.io.File;

public class RelativePath {

	public static void main(String[] args) {
		// 운영체제에 따라서 파일 단위를 나누는 기호가 다르다. 윈도우는 \ 사용하지만, 리눅스에서는 / 를 사용한다.
				// java에서는 이런 문제점 발생하지 않고 모든 운영체제에서 동작이 작동하도록 제시한다. = File.separator
				// RelativePath : 
				
		        File myFile = new File("c:" + File.separator + "my.bin" ); // File.separator(static으로 제공하기 때문에 이름만으로 사용 가능)
				                                                                                // 어떤 운영체제에서도 동작될 수 있게 범용적으로 사용할 수 있다. 

				/*
				if(! myFile.exists()) { 
					System.out.println("파일이 존재하지 않습니다.");
					return;
				}
				*/
				
				
				// 절대 경로 : c드라이브
				//File reDir = new File("c: " +  File.separator + "YourJava" +  File.separator +"Java");
				
		        // 상대 결로(RelativePath) : default 위치에서 시작. sorce 안. 
		        File reDir = new File("YourJava" +  File.separator + "YourJava" +  File.separator +"Java");
				reDir.mkdirs(); 
				
			    // 일반적으로 파일을 상대 경로로 정해주는 것이 좋다. 
				
				
				File reFile = new File(reDir, "you.bin"); 
				myFile.renameTo(reFile); 
				
				
				if(reFile.exists()) {System.out.println("파일 이동 성공.");} else {System.out.println("파일 이동 실패.");}
				
				
				System.out.println("프로그램 종료.");

	}

}

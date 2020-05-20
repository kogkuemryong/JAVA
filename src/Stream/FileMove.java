package Stream;

import java.io.File;

public class FileMove {

	public static void main(String[] args) { // 저장 위치를 잡아주지 않으면 sorce에 자동 저장된다. 
		

		// File 은 Stream에 맞는 컵셉은 아니지만 프로그램과 파일 사이에 연결통로를 만들어서 
				// 처리해서 사용되는 의미로 생각하는게 직관성이 살아난다. 
				// File 에 존재 유무 확인, 실시간 폴더 작성
				
				File myFile = new File("c:\\Myjava\\my.bin"); // 특정 폴더에 저장. (연결)
				
				//if(myFile.exists() == false) { // exists() : 연결한 파일이 존재하지 않으면 false 를 반환, 존재하면 true 반환.}
				if(! myFile.exists()) {
					System.out.println("파일이 존재하지 않습니다.");
					return;
				}
				
				File reDir = new File("c:\\YourJava\\Java");
				reDir.mkdirs(); // 연결된 파일이 없으면 만들도록 한다. (실시간 폴더 작성.)
				
				File reFile = new File(reDir, "you.bin"); // reDir("c:\\YourJava\\Java") 정보와 "you.bin"의 정보를 가지고 있는 객체
				myFile.renameTo(reFile); // "c:\\Myjava\\my.bin"의 파일을 c:\\YourJava\\Java 안에  you.bin의 이름으로 변경하여 저장한다. 
				// renameTo : 이름 변경 / 파일의 이동 효과.
				
				if(reFile.exists()) {System.out.println("파일 이동 성공.");} else {System.out.println("파일 이동 실패.");}
				
				
				System.out.println("프로그램 종료.");
				
	}

}

package Stream.Circle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1,1,2.4);
		Circle c2 = new Circle(2,2,4.8);
		
	
		// 인스턴스 저장(File 단위) implements Serializable 구현되어 있어야지 가능하다. 
		  
		//OutputStream out = new FileOutputStream("Object.ser");
	    // new ObjectOutputStream(out);
		 
		try {
		    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			// 연결할 통로와 함께 저장될 확장자를 입력해준다. 
		
			out.writeObject(c1);
			out.writeObject(c2);
			out.writeObject("String implements Serializable");
			out.close();
			
			// 인스턴스 복원
			ObjectInputStream In = new ObjectInputStream(new FileInputStream("Object.ser"));
			
			
		   // 저장한 순서대로 출력된다. 
		   Circle c10 = (Circle)In.readObject(); // 반환형 : Object , 모든 자료형을 읽어 올 수 있도록 범용적으로 사용이 가능하게 정의해주고 있는 것이다.  
			                                                 // readObject() file 에서 인스턴스를 읽어와서 heap에 저장해주고 접근할 수 있게 시작값을 return 해준다.  
			
		   Circle c11 = (Circle)In.readObject();
		   String Message = (String)In.readObject();
		   
		   // 정보 출력
		   c10.showCircleInfo();
		   c11.showCircleInfo();
		   System.out.println(Message);
		   
		   In.close();

		   
		   
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		

	}

}

package Object_Class;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UseCalendar {

	public static void main(String[] args) {
		
		// 현재 날짜 / 시간 
				Calendar today = Calendar.getInstance();
				
				// 년, 월, 일 구하기 
				int year = today.get(Calendar.YEAR); // 해당연도 return (get 의 반황형은 int)
				int month = today.get(Calendar.MONTH)+1; // 월의 정보는 1월일 때는 0의 값으로 반환한다. 
				                                                               // 사용함에 있어서 +1을 해줘야한다.
				int day = today.get(Calendar.DAY_OF_MONTH);
				System.out.printf("%d년 %d월 %d일 \n" , year, month, day);
				
				
				// 시, 분, 초 구하기 
				int hour = today.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY(0~23시) vs  HOUR(0~12시)
				int minute = today.get(Calendar.MINUTE);
				int second = today.get(Calendar.SECOND);
				
				System.out.printf("%d:%d:%d \n",hour,minute,second);
				
				// 요일 구하기 
				String[] DAY_OF_WEEK = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};  // 숫자로 반환 할때 일 - 0, 월 - 1 
				System.out.println("오늘은 " + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)-1]+ " 입니다."); 
				// 인덱스는 0부터 시작하기 때문에 -1을 해줘야지 정확한 요잃이 출력된다.  
				// 대괄호 안에는 인덱스, 메서드, 연산식 등 최종의 값이 0이상 인덱스의 결과값이 온다면 어떠한 문법구문이 가능하다. 
				 
				
				// Date
				Date now = new Date(); // import java.util java에서 사용하는 참조자료형이다.   
				                                   // import java.sql database에서 사용되는 date을 연동시켜 놓은 것을 이야기 한다. 
				                                   //database와 연결되어 사용하고 싶을 때 사용한다.  
				System.out.println("현재시간 " +now.toString()); //.toString()을 override 하여 결과값을 나타낸다:  Thu May 14 10:20:38 KST 2020
				
			    Date getNow = today.getTime(); // Date 타입으로 변경
			    System.out.println(getNow);
				 
			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a"); // 년 , 월 , 일 , 시, 분, 초, 오전/오후
			     
			    String date = sdf.format(getNow);
			    System.out.println(date);
			    
			    
			    // Calendar -> Date 변환.
			    Date d1 = new Date(today.getTimeInMillis());  // 입력으로 아무것도 넣지 않으면 컴퓨터 운영체제로 가서 시간을 읽어온다. 
			    // today.getTimeInMillis() =/ Date(long date) 내가 처리한 임의의 시간으로 부터 출력 되게 할 수 있다. 
			    
			    
			    // Date -> Calendar 변환. 
			    Date d2 = new Date();
				Calendar cal =  Calendar.getInstance() ;
				
				cal.setTime(d2); 
				
				
				
				// Calendar 메서드를 호출만 하면 자기 자신이 new 해서 this 값을 return 해준다
				// 하나의 값으로 나눠쓰라는 개념으로 시간은 독립적인 것이 아니기 때문에 이러한 시퀀스를 가진다 
				// java가 알아서 인스턴스 해준다. 메서드를 통해서 알아서 new 해주기 때문에 method만 사용 
				//  Calendar.getInstance() static으로 되어 있어서 이름만으로 사용 가능하다. 
				
				// 인스턴스 방법 1. 내가 new선언 2. 메서드를 호출만 하면 자기 자신이 new 해서 this 값을 return 해준다. 
				
		

	}

}

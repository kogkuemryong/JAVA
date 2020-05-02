package 배열;

public class TwoDimenArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; // 대괄호를 2
		 // 4byte 가 12개 할당 받은 것이다 = 48byte , arr 의 이름으로 다 관리한다.
         // 2차원 -> 행 : length / 열 arr[num].length
		
		// 배열은 index로!!
		
		// 00 01 02 03
		// 10 11 12 13
		// 20 21 22 23
		
		// int [3][4] / 3행 4열
		
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[0][3] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = 7;
		
		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;
		arr[2][3] = 11;

		for(int i = 0; i< 3;i++) {       // 행의 개념
			for(int j=0; j<4; j++) {   // 열의 개념
				System.out.println("[" + i +"]"+"["+j+"]"+ " = "  + arr[i][j]);
			}
		}

		System.out.println("행 : " + arr.length );
		System.out.println("열 : " + arr[0].length );
		System.out.println("열 : " + arr[1].length );
		System.out.println("열 : " + arr[2].length );
		
		//  new int[i][j]; 변경 되어도 error 나지 않도록 하는 방법
		// 2차원 -> 행 : length / 열 : arr[num].length 
		for(int i = 0; i< arr.length ;i++) {       // 행의 개념
			for(int j=0; j<arr[i].length; j++) {      // 열의 개념
				System.out.println("[" + i +"]"+"["+j+"]"+ " = "  + arr[i][j]);
			}
		}
	

	}

}

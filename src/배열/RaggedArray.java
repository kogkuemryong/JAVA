package 배열;

public class RaggedArray {
	public static void main(String[] args) {
		int[][] arr = {
	             {0 ,1, 2, 3},           // 형식에서 주의! (,)를 잘 찍어주자!
	             {4, 5, 6, 7},
	             {8, 9, 10, 11}
	            };  //new int[3][4] {};  


for(int i = 0; i< arr.length ;i++) {       // 행의 개념
for(int j=0; j<arr[i].length; j++) {      // 열의 개념
	System.out.println("[" + i +"]"+"["+j+"]"+ " = "  + arr[i][j]);
}
}


int[][] ar = {
    {0 ,1},           
    {4, 5, 6},
    {8, 9, 10, 11}
};

for(int i = 0; i< ar.length ;i++) {       // 행의 개념
for(int j=0; j<ar[i].length; j++) {      // 열의 개념
	System.out.println("[" + i +"]"+"["+j+"]"+ " = "  + ar[i][j]);
}
}

// arr[i].length 괄호 안에 i 가 들어가야 하는 이유는 열의 개수가 항상 동일한 것이 아니기 때문이다. 


// 행과 열의 분리선언 - 기능은 지원 되지만 많이 사용하지 않는다. 가급적이면 처음부터 초기화 시키는 것이 좋다. 

int[][] a = new int[3][]; // ragged array
a[0] = new int[2];
a[1] = new int[3];
a[2] = new int[4];

		
	}

}

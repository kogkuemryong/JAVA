//문제) 다음과 같은 데이터가 존재한다고 할 때, 데이터를 검색하여 최대값, 최소값, 평균값을 구하는 프로그램 oop로 작성하세요.(단, 배열 이용하지 말 것)
//{17,53,84,73,49,27,90,85,75,50,85,92,78,98,68}

package 예제;

class max{
	
	static int max = 0, num1 = 17, num2 = 53, num3 =84, num4 =73 , num5 = 49, num6= 27, num7= 90, num8= 85, 
			num9=75 , num10=50, num11 = 85 , num12 =92, num13 = 78, num14 = 98, num15 = 68;

	public static int displaymax() {
		
	if(max<num1){max=num1;}
	if(max<num2){max=num2;}
	if(max<num3){max=num3;}
	if(max<num4){max=num4;}
	if(max<num5){max=num5;}
	if(max<num6){max=num6;}
	if(max<num7){max=num7;}
	if(max<num8){max=num8;}
	if(max<num9){max=num9;}
	if(max<num10){max=num10;}
	if(max<num11){max=num11;}
	if(max<num12){max=num12;}
	if(max<num13){max=num13;}
	if(max<num14){max=num14;}
	if(max<num15){max=num15;}
	
	System.out.println("최댓값 = " +max);
	
	return max;
	
	}
	
}

class min{
	static int num1 = 17, num2 = 53, num3 =84, num4 =73 , num5 = 49, num6= 27, num7= 90, num8= 85, 
			num9=75 , num10=50, num11 = 85 , num12 =92, num13 = 78, num14 = 98, num15 = 68;

	static int min = num1;
	
	public static int displaymin() {
   
    if(min>num1){min=num1;}
    if(min>num2){min=num2;}
    if(min>num3){min=num3;}
    if(min>num4){min=num4;}
    if(min>num5){min=num5;}
    if(min>num6){min=num6;}
    if(min>num7){min=num7;}
    if(min>num8){min=num8;}
    if(min>num9){min=num9;}
    if(min>num10){min=num10;}
    if(min>num11){min=num11;}
    if(min>num12){min=num12;}
    if(min>num13){min=num13;}
    if(min>num14){min=num14;}
    if(min>num15){min=num15;}
    
    
     
    System.out.println("최솟값 = " + min);
    
    return min;
    
    
	}	
}
class avg{	
	static int num1 = 17, num2 = 53, num3 =84, num4 =73 , num5 = 49, num6= 27, num7= 90, num8= 85, 
                num9=75 , num10=50, num11 = 85 , num12 =92, num13 = 78, num14 = 98, num15 = 68;
	

	public static void displayavg() {
		System.out.println("평균값 = "+ (num1+num2+num3+num4+num5+num6+
				                        num7+num8+num9+num10+num11+num12+num13+num14+num15)/15);
	
		 
	}
}
		
public class 예제1 {
	public static void main(String[] args) {
		
		max M_ax = new max();
		M_ax.displaymax();
		
		min M_in = new min();
	    M_in.displaymin();
	    
	    avg A_vg = new avg();
	    A_vg.displayavg();
		
		

	}

}

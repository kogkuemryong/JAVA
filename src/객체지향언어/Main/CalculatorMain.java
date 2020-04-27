package 객체지향언어.Main;

import 객체지향언어.Calculator;
import 객체지향언어.add.Adder;

class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator(); // 덧셈과 뺼셈을 이용하기 위해서 메모리를 할당한다. 
		
		System.out.println (calc.addNum(10,20));
		System.out.println (calc.subNum(30,15));
		
		Adder adder = new Adder();
		System.out.println (adder.addTwoNumber(20,30));

	
}
	}

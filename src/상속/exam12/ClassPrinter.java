package 상속.exam12;

class ClassPrinter {
	public static void print(Object obj) { // 어떤 자료형이든  new 하기만 하면 그걸 바라보는 모든 참조 변수들은 입력으로 전달받아 처리한다. 
        // 다형성에 의해 최상위 class는 Object이기 때문에 가능하다. 		

String org = obj.toString(); // overriding 된 method

if(obj instanceof UpperCasePrintable) {

org = org.toUpperCase(); // 입력받은 문자를 모두 대문자로 변환 // 
}System.out.println(org);
}

}

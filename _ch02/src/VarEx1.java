
public class VarEx1 {

	public static void main(String[] args) {
		System.out.println("4+2");
		// 우클릭 -> 런 -> 자바 애플리케이션 
		final int score;
		score = 100;
//		score = 200; 라인단위 주석 ctrl + /
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; //8진수,10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		long l = 10_000_000_000L;
		System.out.println(oct); // 8
		System.out.println(hex); // 16
		System.out.println(score); 
		// 지역변수는 읽기전에 반드시 초기화를 해야한다. 
		System.out.println(power);
	
		float f = 3.14f;
		double d = 3.14f; // 접미사 d 생략 가능 
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'A'; //홀따옴표는 반드시 하나의문자만 들어와야함
		int i = ch;
		System.out.println(i); // 65
	
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		System.out.println(""+7+7); // 문자로  77
		System.out.println(7+7+""); // 14 
		/*System.out.println(6+3); // 덧셈
		System.out.println(6-3); // 뺄셈
		System.out.println(6*3); // 곱셈
		System.out.println(6/3); // 나눗셈
		 */	
		// 값을 일일이 바꿔주기 힘드다 그래서 변수 사용
		int a = 4 , b2 = 2;
		System.out.println(a+b2);
		System.out.println(a-b2);
		System.out.println(a*b2);
		System.out.println(a/b2);
		
		
		// ctrl+space 자동완성
	    // ctrl+alt+shift+down 행단위 복사 
		// Alt+Shift+A 컬럼편집모드(토글) 
		// print() - 출력 후에 줄바꿈을 안함
		// println() - 출력 후에 줄바꿈을 한다. 
		System.out.println(5+3); // 덧셈
		System.out.println(5-3); // 뺄셈
		System.out.println(5*3); // 곱셈
		System.out.println(5/3); // 나눗셈
		System.out.print("Hello"); 
		// println 줄바꿈이다.
	}
}

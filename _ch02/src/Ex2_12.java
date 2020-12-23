
public class Ex2_12 {
	public static void main(String[] args) {
		// 문자열3을 문자3으로 바꾸려면 charAt
	
		/*String str = "3";
		System.out.println("3".charAt(0) - '0'); // 3   51-48=3
		System.out.println('3' - '0' + 1); // 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // 31
		System.out.println(3 + '0'); // 51   0은 숫자로 48
		*/
		// 문자는 문자끼리 연산이 가능 , 문자열 charAt 문자로 변환후 문자 끼리 연산
		// 문자열과 숫자 연산하면 문자열  , 문자열을 Integer.parseInt 인트로변환후 정수끼리 연산가능
		String str = "3";
		System.out.println(str.charAt(0) - '3'); // 51 - 51
		System.out.println('3' - '0' + 1); // 51 - 48 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1 ); // 31
		System.out.println( 3 + '0'); // 51
		
	}
}

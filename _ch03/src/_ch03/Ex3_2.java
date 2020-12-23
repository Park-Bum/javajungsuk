package _ch03;

public class Ex3_2 {
	public static void main(String[] args) {
		
		int i = 5 , j = 0;	
		j = i++; // 후위형
		System.out.println("j=i++; 실행 후 , i = " + i + ", j="+j); // i = 5 , j = 6
		                                                   
		i=5;
		j=0;	
		j = ++i; // i = 6 , j = 6 
		System.out.println("j=++i; 실행 후 , i = " + i + ", j = " + j);
				
		byte b = 100; // 자동형변환 묵시적 형변환  
		byte b3 = (byte)1000; // 값손실이 있기에 byte 수동형변환 
		
		int i2 = 100;
		byte b2 =(byte)i2; // int타입 변수는 byte타입에 대입할때 수동 형변환 	
		float f = (float)3.4d;
		
		// 같은타입으로 계산할수있고 그 타입으로 결과값이 나온다.
		float a = 1;
		int i3 = 5;
		System.out.println(a + i3);// float + int = 결과는 큰쪽인  float 
		
		double d = 1.5;
		System.out.println(a + d); // float + double = double 
		
		// 피연산자의 타입이 int보다 작은 타입이면 int로 변환한다.
		byte by = 1;
		short sh = 1;
		short sh2 = 2;
		int love = by + sh; // byte + short = int 이다. 
		System.out.println(love); // 2

		// char - char = int  문자-'0' = 숫자
		char ch1 = '2'; // 50
		char ch2 = '0'; // 48
		System.out.println(ch1 - ch2); // 2 
		
		
	}
}

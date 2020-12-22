
public class PrintEx1 {
	public static void main(String[] args) {
		System.out.println(10/3); // 정수 나누기 정수 = 정수
		System.out.println(10.0/3); //실수 나누기 정수 = 실수
	
		// 10진수로만 출력 된다. 8진수 16진수로 출력하려면 ?
		System.out.println(0x1A);
		
		System.out.printf("%.2f", 10.0/3); // 3.33
		// %.2f 소수점 2째자리
		System.out.printf("%d",0x1A); // 26 10진수
		System.out.printf("%x",0x1A); // 1A 16진수 
		
		System.out.printf("%d%n",15); // 15 10진수 00001111
		System.out.printf("%o%n",15); // 17 8진수
		System.out.printf("%x%n",15); // f  16진수
		System.out.printf("%s",Integer.toBinaryString(15)); // 1111 2진수
									//   2진 문자열 
		// 8진수와 16진수에 접두사 붙이기
		//  0      0x     String
		float f = 123.4567890f;
		System.out.printf("%f",f); // 123.456787      소수점 아래 6자리
		System.out.printf("%e",f); // 1.234567e+02  지수형식
		System.out.printf("%g",123.456789); // 123.45 간략한 형식
		System.out.printf("%g",0.000000001); // 1.00000e-8 간략한 형식
		
		System.out.printf("%#o%n",15);
		System.out.printf("%#x%n",15);
		System.out.printf("%s",Integer.toBinaryString(15)); // 1111
		
		float f2 = 123.456788f;  
		System.out.printf("%f%n",f2); // 123.456787
		System.out.printf("%e%n",f2); // 1.234568e+02
		System.out.printf("%g%n",f2); // 123.457
		
		System.out.printf("%5d%n",1234567); // [][][][]10  오른쪽 정렬
		System.out.printf("%-5d",10); // 10[][][][] 왼쪽 정렬
		System.out.printf("%-20s",10); // [][][]10
		System.out.printf("[%5d]%n",10); // [][][]10
		System.out.printf("[%-5d]%n",10); //10[][][]
		System.out.printf("[%05d]%n",10); // 00010
		
		double d = 1.23456789;
		System.out.printf("%14.6f",d); // 14.6은  총 14자리 소수점6자리 
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%.10s]%n","www.codechobo.com");
		
	}
}

package _ch03;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000; // 10의 6제곱
		int b = 2_000_000; // 10의 6제곱
		
		// 10의 12제곱 int범위는 10의 9제곱 초과해서 오버플로우 그럼 어떻게 ?  
//		a * b는 이미 오버플로우 됨 
		long c = (long)a * b; // long 큰 범위로 형변환  long * long = long 
		System.out.println(c);  
		
		
		System.out.println("=======================");
		
		int i1 = 500_000_000;
		int i2 = 300_000_000;

		int ch1 = 'A' - '0'; // 65 - 48 = 17
		System.out.println(ch1);
	}
}

import java.util.Scanner;

public class ScannerCalculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수1를 입력하세요.");
		int num1 = s.nextInt();
		System.out.println("정수2를 입력하세요.");
		int num2 = s.nextInt();

		int sum = num1 + num2;
		int min = num1 - num2;
		int div = num1 / num2;
		int gop = num1 * num2;
		
		System.out.printf("합 %d 뺼셈 %d 곱셈 %d 나눗셈 %d",sum,min,gop,div);

		s.close();
	}
}

import java.util.Scanner;

public class ScannerCalculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���.");
		int num1 = s.nextInt();
		System.out.println("����2�� �Է��ϼ���.");
		int num2 = s.nextInt();

		int sum = num1 + num2;
		int min = num1 - num2;
		int div = num1 / num2;
		int gop = num1 * num2;
		
		System.out.printf("�� %d �E�� %d ���� %d ������ %d",sum,min,gop,div);

		s.close();
	}
}

package _ch03;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000; // 10�� 6����
		int b = 2_000_000; // 10�� 6����
		
		// 10�� 12���� int������ 10�� 9���� �ʰ��ؼ� �����÷ο� �׷� ��� ?  
//		a * b�� �̹� �����÷ο� �� 
		long c = (long)a * b; // long ū ������ ����ȯ  long * long = long 
		System.out.println(c);  
		
		
		System.out.println("=======================");
		
		int i1 = 500_000_000;
		int i2 = 300_000_000;

		int ch1 = 'A' - '0'; // 65 - 48 = 17
		System.out.println(ch1);
	}
}

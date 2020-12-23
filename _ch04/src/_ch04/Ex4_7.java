package _ch04;

public class Ex4_7 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
	/*	for(int i = 1; i <= 5; i++) {
			num = (int)(Math.random() * 10) + 1;
			// 0.0 <= random * 3 <= 2.99999(3.0이안됨) 3은 개별값의 갯수
			// (int)0 <= 숫자 <= 2  소수점버림
			// 0 ~ 2
			// 1부터 3까지 하려면 각변에 1을 더한다. 
			// 1 <= 숫자 <= 3
			System.out.println(num);
		}
		*/
		// Quiz2 -5 ~ 5 난수 구하기   , 0 포함해서 11개 
		for(int i = 1; i <= 5; i++) {
			num2 =(int)(Math.random() * 11) - 5;
			// 0.00 <= random * 11 <= 10.9999
			// (int) 0 <= random <= 10
			// -5 <= random <= 5
			System.out.println(num2);
		}
	}
}

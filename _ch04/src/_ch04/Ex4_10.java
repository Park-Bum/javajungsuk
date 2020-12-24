package _ch04;

public class Ex4_10 {
	public static void main(String[] args) {
		
		int sum = 0;
		
/*		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;*/			
		for (int i = 1; i <= 5; i++) {
			sum += i; // sum = sum + i;
			System.out.printf("1부터 %d 까지의 합 : %d%n",i,sum);
		}
	}
}

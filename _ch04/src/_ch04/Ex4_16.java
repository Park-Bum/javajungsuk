package _ch04;

public class Ex4_16 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// for(;true;) { 
		while(true) { // true 무한반복 true 생략불가  , for문은 for(;true;) true생략가능 
			if(sum > 100) { // 반복문을 멈추기위해 조건 총합이 100보다 크면 false 로 while문 종료
				break; // 자신이 속한 (하나의) 반복문을 벗어난다.
					 // break; 하면 아래 문장이 실행 안된다. 
			}
			++i;
			sum += i;
		}	
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

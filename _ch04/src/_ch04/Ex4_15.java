package _ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0 , answer = 0;
		answer = (int)(Math.random() * 100) + 1;  // 대답 1~100 사이 수 랜덤난수 저장
		System.out.println("answer : " + answer);
		Scanner scanner = new Scanner(System.in);
		
		do { // 블록 {}을 최소한 한번 이상 반복 - 사용자 입력을 처음 받을 때 유용하다.
			System.out.print("1과 100사이의 정수를 입력 하세요. > ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 입력하세요.");
			} else if(input < answer) {
				System.out.println("더 큰수로 입력하세요.");
			}
		} while(input!=answer); // true시 do 한번더 실행 
		System.out.println("정답입니다.");
	}

}

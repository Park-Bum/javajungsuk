package _ch04;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) { // main 시작 
		System.err.print("숫자를 하나 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	} // main 끝
}

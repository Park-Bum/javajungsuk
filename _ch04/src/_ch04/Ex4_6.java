package _ch04;

import java.util.Scanner;

// switch문의 제약 조건 
// 조건식 결과는 정수 또는 문자열 이여야 한다.
// case문의 값은 정수 상수 문자열만 가능하며 중복되지 않아야 한다. 
// case에는 값과 문자만 올수있는데 '1',ONE상수올수있다. 변수x,실수x 
public class Ex4_6 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요 > ");
		
		Scanner s = new Scanner(System.in);
		int month = s.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장 
		
		switch(month) { // 조건식에는 조건또는변수명이 올수있다. 
		case 3: case 4: case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:	
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
		}
	} // main의 끝
}

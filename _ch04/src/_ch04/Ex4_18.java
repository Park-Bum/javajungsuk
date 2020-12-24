package _ch04;

import java.util.Scanner;

public class Ex4_18 {
	public static void main(String[] args) {
		int menu = 0 , num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");
			
			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu == 0) { // 입력받은게 0이면 
				System.out.println("프로그램을 종료합니다.");
				break; // break는 while 반복문 종료를 시킨다. 
			} else if(!(1<=menu && menu <=3)) { // 1~3숫자가 아니면 
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu +"번 입니다.");
		}
	} // main 끝
}

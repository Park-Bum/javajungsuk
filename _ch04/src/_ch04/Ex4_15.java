package _ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0 , answer = 0;
		answer = (int)(Math.random() * 100) + 1;  // ��� 1~100 ���� �� �������� ����
		System.out.println("answer : " + answer);
		Scanner scanner = new Scanner(System.in);
		
		do { // ��� {}�� �ּ��� �ѹ� �̻� �ݺ� - ����� �Է��� ó�� ���� �� �����ϴ�.
			System.out.print("1�� 100������ ������ �Է� �ϼ���. > ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if(input < answer) {
				System.out.println("�� ū���� �Է��ϼ���.");
			}
		} while(input!=answer); // true�� do �ѹ��� ���� 
		System.out.println("�����Դϴ�.");
	}

}

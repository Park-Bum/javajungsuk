package _ch04;

import java.util.Scanner;

public class Ex4_5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt ='0';
		
		System.out.print("������ �Է����ּ��� > ");
		
		Scanner s = new Scanner(System.in);
		score = s.nextInt();
		
		System.out.printf("����� ������ %d �Դϴ�. ", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98)
				opt = '+';
			else if(score < 94) 
				opt = '-';
		} else if (score >= 80) {
				grade = 'B';
			if(score >= 88) 				
				opt = '+';
			else if(score < 84)
				opt = '-';
		}	else 
				grade ='c';
		System.out.printf("����� ������ %c �Դϴ�\n",grade,opt);		
	}
}

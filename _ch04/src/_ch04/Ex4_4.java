package _ch04;

import java.util.Scanner;

public class Ex4_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = 0;    // ������ �����ϱ� ���� ����
		char grade = 'D'; // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
		
		System.out.print("������ �Է��ϼ��� > ");
		score = s.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if(score >= 90 )  // score�� 90�� ���� ���ų� ũ�� A����
			grade = 'A';
		else if(score >= 80) 	   // score�� 80�� ���� ���ų� ũ�� B����
								   // score >= 80 && score < 90
			grade = 'B';
			else if(score >= 70 && score < 80)  // score�� 70�� ���� ���ų� ũ�� C����
				grade = 'C';
//			else  // �������� D���� 
//				grade = 'D';  // �ʱⰪ�� D���ָ� else ���൵ �ȴ�. 
							  // else ����� ��������� �Ⱦ����ִ� ����� �����ؾ��Ѵ�(���Ἲ)
		System.out.println(" ����� ������ " + grade +" �Դϴ�.");
			
	}
}

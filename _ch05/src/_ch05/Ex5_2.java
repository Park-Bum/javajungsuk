package _ch05;

import java.util.Arrays;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		// ����Ҹ� ����Ϸ��� �迭�� ��Ҹ� ������� �ϳ��� ����Ѵ�. 	
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}	
		average = sum / (float)score.length; // ��� ����� float�� ��� ���ؼ� ����ȯ
		//float    int     float 
		
		System.out.println("���� : " + sum); // 478 
		System.out.println("��� : " + average); // 95.6	
		// �迭 score �� ��� ��Ҹ� ����Ѵ�. Arrays�� �迭�� ���õ� 
		System.out.println(Arrays.toString(score));  // �迭�� ���ڿ��� ��ȯ���ش�. ���ڿ��� ������ش�.
		
	}
}

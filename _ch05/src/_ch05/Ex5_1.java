package _ch05;

import java.util.Arrays;

public class Ex5_1 {
	public static void main(String[] args) {
//		int[] iArr1 = new int[10];
//		int[] score;        // 1. �迭 score�� ����(��������)
//		score = new int[5]; // 2. �迭�� ����(int������� x 5)
		//�������� �ּҸ� score�� ����
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		char[] chArr = {'A','B','C'};
		
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i] = i + 1; // 1�� �����ؼ� ���� 
		}
		
		for(int i=0; i<iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*10)+1; // 1���� 10������ ������ ä���. 
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i] + " , ");
		}
		
		int[] score = new int[5]; // �迭�� ����� ������ ���ÿ� 
		score[3] = 100; // ���� �����Ѵ�.
		System.out.println(Arrays.toString(iArr1)); // ������ ����
		System.out.println(Arrays.toString(iArr2));
		System.out.println(iArr1); // �ּҰ��� ����
		System.out.println(iArr2); // 
		System.out.println(chArr); // char�� ������ ����ش�
		
		
		System.out.println("score[0]"+score[0]); // 100
		System.out.println("score[1]"+score[1]); // 100
		System.out.println("score[2]"+score[2]); // 100
		System.out.println("score[3]"+score[3]); // 100
		System.out.println("score[4]"+score[4]); // 100
		
		int value = score[3];
		System.out.println(value); // 100
		
		System.out.println(score); // �ּҰ��� ���´�. int@�ּҰ�
		char[] ch = {'A','B','C','D'};
		System.out.println(ch); // ABCD ĳ���͹迭�� ������ ����Ѵ�. println������� ���ؼ� 
		
		
		
	}
}

package _ch05;

import java.util.Arrays;

public class Ex5_1 {
	public static void main(String[] args) {
//		int[] iArr1 = new int[10];
//		int[] score;        // 1. 배열 score를 선언(참조변수)
//		score = new int[5]; // 2. 배열의 생성(int저장공간 x 5)
		//참조변수 주소를 score에 저장
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		char[] chArr = {'A','B','C'};
		
		for(int i=0; i<iArr1.length;i++) {
			iArr1[i] = i + 1; // 1씩 증가해서 넣음 
		}
		
		for(int i=0; i<iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*10)+1; // 1부터 10사이의 난수로 채운다. 
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i] + " , ");
		}
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에 
		score[3] = 100; // 값을 대입한다.
		System.out.println(Arrays.toString(iArr1)); // 값들이 나옴
		System.out.println(Arrays.toString(iArr2));
		System.out.println(iArr1); // 주소값이 나옴
		System.out.println(iArr2); // 
		System.out.println(chArr); // char는 내용을 찍어준다
		
		
		System.out.println("score[0]"+score[0]); // 100
		System.out.println("score[1]"+score[1]); // 100
		System.out.println("score[2]"+score[2]); // 100
		System.out.println("score[3]"+score[3]); // 100
		System.out.println("score[4]"+score[4]); // 100
		
		int value = score[3];
		System.out.println(value); // 100
		
		System.out.println(score); // 주소값이 나온다. int@주소값
		char[] ch = {'A','B','C','D'};
		System.out.println(ch); // ABCD 캐릭터배열만 값들이 출력한다. println기능으로 인해서 
		
		
		
	}
}

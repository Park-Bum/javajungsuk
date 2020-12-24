package _ch05;

import java.util.Arrays;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		// 모든요소를 출력하려면 배열의 요소를 순서대로 하나씩 출력한다. 	
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}	
		average = sum / (float)score.length; // 계산 결과를 float로 얻기 위해서 형변환
		//float    int     float 
		
		System.out.println("총점 : " + sum); // 478 
		System.out.println("평균 : " + average); // 95.6	
		// 배열 score 의 모든 요소를 출력한다. Arrays는 배열과 관련된 
		System.out.println(Arrays.toString(score));  // 배열을 문자열로 반환해준다. 문자열을 출력해준다.
		
	}
}

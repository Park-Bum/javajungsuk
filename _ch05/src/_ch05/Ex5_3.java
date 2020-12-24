package _ch05;
//배열의 최대값과 최소값 구하기

public class Ex5_3 {
	public static void main(String[] args) {
	
		int[] score = {52,39,89,29,60};
		
		int max = score[0]; // 52로 초기화 
		int min = score[0]; 
		
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) { // 52 < 39 false 
				max = score[i];
			} else if(min > score[i]) { // 52 > 39 
				min = score[i]; // 39가 min에 대입됨 
			}
		}
		System.out.println("최대값 > " + max);
		System.out.println("최소값 > " + min);
	}
}

package _ch05;
//�迭�� �ִ밪�� �ּҰ� ���ϱ�

public class Ex5_3 {
	public static void main(String[] args) {
	
		int[] score = {52,39,89,29,60};
		
		int max = score[0]; // 52�� �ʱ�ȭ 
		int min = score[0]; 
		
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) { // 52 < 39 false 
				max = score[i];
			} else if(min > score[i]) { // 52 > 39 
				min = score[i]; // 39�� min�� ���Ե� 
			}
		}
		System.out.println("�ִ밪 > " + max);
		System.out.println("�ּҰ� > " + min);
	}
}

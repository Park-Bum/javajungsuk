package _ch05;

import java.util.Arrays;

public class Ex5_1_tmp {
	public static void main(String[] args) {
		String[] str = {"����","����","��"}; // 0�϶� ���� 1�϶� ���� 2�ϋ� ��
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<10; i++) {	
			int tmp = (int)(Math.random()*3); // 0 ~ 2 	
			System.out.println(str[tmp]);
		}
	}
}

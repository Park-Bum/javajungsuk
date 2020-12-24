package _ch05;

import java.util.Arrays;

public class Ex5_1_tmp {
	public static void main(String[] args) {
		String[] str = {"가위","바위","보"}; // 0일때 가위 1일때 바위 2일떄 보
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<10; i++) {	
			int tmp = (int)(Math.random()*3); // 0 ~ 2 	
			System.out.println(str[tmp]);
		}
	}
}

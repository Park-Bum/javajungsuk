package _ch05;

import java.util.Arrays;

public class Ex5_4 {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<50; i++) {
			int n = (int)(Math.random()*10);
			int tmp = arr[0];
			arr[0] = arr[n]; // 난수의값은 앞으로 전달
			arr[n] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		
	}
}

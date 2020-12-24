package _ch05;

import java.util.Arrays; // ctrl+shift+o 자동으로 임포트 문을 추가해준다. 

public class Ex5_tmp {
	public static void main(String[] args) {
		/*//index 범위 : 0~9
		int[] arr = new int[10]; // 길이가 5인 int배열  arr을 생성
		System.out.println("arr.length = " + arr.length); // arr.length = 5 // 코드 변경에 유리하다
		
		for(int i=0; i<arr.length;i++) { // index범위를 벗어나지않기 위해 arr.length 
			System.out.println("arr["+i+"]="+arr[i]);*/
		
		int[] iArr = {100,95,80,70,60}; 
		System.out.println(iArr);
		System.out.println(Arrays.toString(iArr));
			
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]); 
		}			
		System.out.println(Arrays.toString(iArr));
	}
}


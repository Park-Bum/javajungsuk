package _ch05;

import java.util.Arrays; // ctrl+shift+o �ڵ����� ����Ʈ ���� �߰����ش�. 

public class Ex5_tmp {
	public static void main(String[] args) {
		/*//index ���� : 0~9
		int[] arr = new int[10]; // ���̰� 5�� int�迭  arr�� ����
		System.out.println("arr.length = " + arr.length); // arr.length = 5 // �ڵ� ���濡 �����ϴ�
		
		for(int i=0; i<arr.length;i++) { // index������ ������ʱ� ���� arr.length 
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


package _ch04;

public class Ex4_8 {
	public static void main(String[] args) {
		int i=1; // scope 범위는 좁을수록 좋다  변수의 값이 잘못됐을때 확인하는게 많으니까
			   // 선언위치부터 선언된 블록의 끝까지 
		int j;
		/*for (int i = 1; i <= 10; i+=2) { // 1,3,5,7,9 홀수만
			System.out.println("Hello");
		}*/
		/*for(int i=1; i<=10; i*=2) { // 1,2,4,8
			System.out.println("Hello");
		}*/
		
		/*for(int i = 1; i <= 10; i++) { // 1부터 10까지 1씩 증가 
			System.out.println(i);
		}*/
		
		/*for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}*/
		
		/*for (i = 1 ,j = 10; i <= 10; i++ ,j--) {
			System.out.println("i = " + i + " j = " + j);		
		}*/
		
		for(;true;) { // 조건식을 생략하면 , true로 간주되어서 무한반복문이 된다.
			System.out.println("i = " + i);
		}
//		System.out.println(i); i 오류가 생긴다. 
	}
}

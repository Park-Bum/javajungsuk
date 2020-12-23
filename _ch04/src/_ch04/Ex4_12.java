package _ch04;

public class Ex4_12 {
	public static void main(String[] args) {
		
		
		int i = 5; // 반복할 횟수를 넣는다.
		
		while(i!=0) { // 1씩감소 0이 될때까지 
			i--; // 증감식을 해줘야 무한반복에 벗어날수 있다.
			System.out.println(i + " I can do it.");
		}
	} // main 끝
}

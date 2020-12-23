package _ch04;

public class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0; i <= 10; i++) {
			if(i%3==0)    // 3으로 나누어 떨어지는 경우 건너뛴다. 
				continue; // 자신이 속한 반복문 끝으로 이동 
						  // 다음 반복으로 넘어간다. 
			System.out.println(i);
		} //끝으로가서  다음 증감식으로 이동한다. 
	}
}

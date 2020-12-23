package _ch03;

public class Ex3_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = -8;
		
		System.out.printf("%d을 %d로 나누면 , %n",x,y); 
		System.out.printf("몫은 %d 이고, 나머지는 %d 입니다.%n",x / y , x % y);
		// 1 , 2
		// 나누는 피 연산자는 0이 아닌 정수만 허용한다.(부호는 무시됨)
		// 즉 10을 -8로 나누어도 몫 나머지는 똑같다 
		
	}
}

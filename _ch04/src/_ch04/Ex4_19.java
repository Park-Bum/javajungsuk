package _ch04;
/* 이름붙은 반복문
  반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.*/

public class Ex4_19 {
	public static void main(String[] args) {		
	Loop : for(int i = 2; i <= 9; i++) {
	// for문에 Loop1이라는 이름을 붙였다.	
			for(int j = 1; j <= 9; j++) {
				if(j==5)
					break Loop; // 이름  둘 이상의 반복문을 벗어나기 위해서 반복문에 이름을붙여준다.
/*					break;
 * 					continue Loop; 도 있는데 쓸일이 거의없다.
					continue;*/
					System.out.println(i+"*"+j+"="+i*j);
			} // end of for i 
		System.out.println();	
		} // end of Loop1
	}
}

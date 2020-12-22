package _ch03;

public class Ex3_2 {
	public static void main(String[] args) {
		
		int i = 5 , j = 0;
		
		j = i++; // 후위형
		System.out.println("j=i++; 실행 후 , i = " + i + ", j="+j); // i = 5 , j = 6
		                                                   
		i=5;
		j=0;
		
		j = ++i; // i = 6 , j = 6 
		System.out.println("j=++i; 실행 후 , i = " + i + ", j = " + j);
		
		
	}
}

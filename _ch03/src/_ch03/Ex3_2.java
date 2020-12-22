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
		
		
		byte b = 100; // 자동형변환 묵시적 형변환  
		byte b3 = (byte)1000; // 값손실이 있기에 byte 수동형변환 
		
		int i2 = 100;
		byte b2 =(byte)i2; // int타입 변수는 byte타입에 대입할때 수동 형변환 
		
		
		float f = (float)3.4d;
		
		float a = 1;
		int b4 = 5;
		System.out.println(a + b4);// float + int = 큰쪽인 float 
		
		
	}
}

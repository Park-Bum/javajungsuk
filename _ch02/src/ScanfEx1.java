import java.util.Scanner; // import문 추가  *는 모든클래스를 사용한다.

public class ScanfEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*int num = scanner.nextInt(); // 정수 
		int num2 = scanner.nextInt();
		System.out.println(num); 
		System.out.println(num2);*/
		
	String input = scanner.nextLine(); 
	// 라인단위  실수,문자열,정수 섞여있을때  문자열들을 -> 숫자열로 
	int num1 =Integer.parseInt(input);	
		System.out.println(num1);
			
	 String str = Integer.toString(num1);
	 	System.out.println(str);
	 	
	 	float num5 = scanner.nextFloat();
	 	
	 	
	 	
	 	scanner.close(); // 스캐너를 닫아준다. 
	}
}

import java.util.Scanner; // import�� �߰�  *�� ���Ŭ������ ����Ѵ�.

public class ScanfEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*int num = scanner.nextInt(); // ���� 
		int num2 = scanner.nextInt();
		System.out.println(num); 
		System.out.println(num2);*/
		
	String input = scanner.nextLine(); 
	// ���δ���  �Ǽ�,���ڿ�,���� ����������  ���ڿ����� -> ���ڿ��� 
	int num1 =Integer.parseInt(input);	
		System.out.println(num1);
			
	 String str = Integer.toString(num1);
	 	System.out.println(str);
	 	
	 	float num5 = scanner.nextFloat();
	 	
	 	
	 	
	 	scanner.close(); // ��ĳ�ʸ� �ݾ��ش�. 
	}
}


public class VarEx1 {

	public static void main(String[] args) {
		System.out.println("4+2");
		// ��Ŭ�� -> �� -> �ڹ� ���ø����̼� 
		final int score;
		score = 100;
//		score = 200; ���δ��� �ּ� ctrl + /
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; //8����,10������ 8
		int hex = 0x10; // 16����, 10������ 16
		
		long l = 10_000_000_000L;
		System.out.println(oct); // 8
		System.out.println(hex); // 16
		System.out.println(score); 
		// ���������� �б����� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�. 
		System.out.println(power);
	
		float f = 3.14f;
		double d = 3.14f; // ���̻� d ���� ���� 
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'A'; //Ȧ����ǥ�� �ݵ�� �ϳ��ǹ��ڸ� ���;���
		int i = ch;
		System.out.println(i); // 65
	
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		System.out.println(""+7+7); // ���ڷ�  77
		System.out.println(7+7+""); // 14 
		/*System.out.println(6+3); // ����
		System.out.println(6-3); // ����
		System.out.println(6*3); // ����
		System.out.println(6/3); // ������
		 */	
		// ���� ������ �ٲ��ֱ� ����� �׷��� ���� ���
		int a = 4 , b2 = 2;
		System.out.println(a+b2);
		System.out.println(a-b2);
		System.out.println(a*b2);
		System.out.println(a/b2);
		
		
		// ctrl+space �ڵ��ϼ�
	    // ctrl+alt+shift+down ����� ���� 
		// Alt+Shift+A �÷��������(���) 
		// print() - ��� �Ŀ� �ٹٲ��� ����
		// println() - ��� �Ŀ� �ٹٲ��� �Ѵ�. 
		System.out.println(5+3); // ����
		System.out.println(5-3); // ����
		System.out.println(5*3); // ����
		System.out.println(5/3); // ������
		System.out.print("Hello"); 
		// println �ٹٲ��̴�.
	}
}

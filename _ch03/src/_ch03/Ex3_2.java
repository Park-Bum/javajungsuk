package _ch03;

public class Ex3_2 {
	public static void main(String[] args) {
		
		int i = 5 , j = 0;	
		j = i++; // ������
		System.out.println("j=i++; ���� �� , i = " + i + ", j="+j); // i = 5 , j = 6
		                                                   
		i=5;
		j=0;	
		j = ++i; // i = 6 , j = 6 
		System.out.println("j=++i; ���� �� , i = " + i + ", j = " + j);
				
		byte b = 100; // �ڵ�����ȯ ������ ����ȯ  
		byte b3 = (byte)1000; // ���ս��� �ֱ⿡ byte ��������ȯ 
		
		int i2 = 100;
		byte b2 =(byte)i2; // intŸ�� ������ byteŸ�Կ� �����Ҷ� ���� ����ȯ 	
		float f = (float)3.4d;
		
		// ����Ÿ������ ����Ҽ��ְ� �� Ÿ������ ������� ���´�.
		float a = 1;
		int i3 = 5;
		System.out.println(a + i3);// float + int = ����� ū����  float 
		
		double d = 1.5;
		System.out.println(a + d); // float + double = double 
		
		// �ǿ������� Ÿ���� int���� ���� Ÿ���̸� int�� ��ȯ�Ѵ�.
		byte by = 1;
		short sh = 1;
		short sh2 = 2;
		int love = by + sh; // byte + short = int �̴�. 
		System.out.println(love); // 2

		// char - char = int  ����-'0' = ����
		char ch1 = '2'; // 50
		char ch2 = '0'; // 48
		System.out.println(ch1 - ch2); // 2 
		
		
	}
}

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
		
		float a = 1;
		int b4 = 5;
		System.out.println(a + b4);// float + int = ū���� float 
		
		
	}
}


public class Ex2_12 {
	public static void main(String[] args) {
		// ���ڿ�3�� ����3���� �ٲٷ��� charAt
	
		/*String str = "3";
		System.out.println("3".charAt(0) - '0'); // 3   51-48=3
		System.out.println('3' - '0' + 1); // 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // 31
		System.out.println(3 + '0'); // 51   0�� ���ڷ� 48
		*/
		// ���ڴ� ���ڳ��� ������ ���� , ���ڿ� charAt ���ڷ� ��ȯ�� ���� ���� ����
		// ���ڿ��� ���� �����ϸ� ���ڿ�  , ���ڿ��� Integer.parseInt ��Ʈ�κ�ȯ�� �������� ���갡��
		String str = "3";
		System.out.println(str.charAt(0) - '3'); // 51 - 51
		System.out.println('3' - '0' + 1); // 51 - 48 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1 ); // 31
		System.out.println( 3 + '0'); // 51
		
	}
}

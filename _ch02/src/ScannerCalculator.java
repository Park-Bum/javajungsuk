import java.util.Scanner;

public class ScannerCalculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Á¤¼ö1¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		int num1 = s.nextInt();
		System.out.println("Á¤¼ö2¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		int num2 = s.nextInt();

		int sum = num1 + num2;
		int min = num1 - num2;
		int div = num1 / num2;
		int gop = num1 * num2;
		
		System.out.printf("ÇÕ %d –E¼À %d °ö¼À %d ³ª´°¼À %d",sum,min,gop,div);

		s.close();
	}
}

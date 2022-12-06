import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		// Phương trình bậc nhất ax + b = 0
		/*
		 * nếu a = 0 nếu b = 0 => Pt vô số nghiệm nếu b !=0 => Pt vô nghiệm nếu a!=0 có
		 * nghiệm x=-b/a
		 */

		double a, b, x;
		Scanner nguyen = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = nguyen.nextDouble();
		System.out.println("Nhập b: ");
		b = nguyen.nextDouble();
		if (a == 0) 
		{
			if (b == 0) 
			{
				System.out.println("Phương trình vô số nghiệm");
			} else 
			{
				System.out.println("Phương trình vô nghiệm");
			}
		} else 
		{
			x = -b / a;
			System.out.println("Phương trình có nghiệm là: " + x);
		}

	}
}

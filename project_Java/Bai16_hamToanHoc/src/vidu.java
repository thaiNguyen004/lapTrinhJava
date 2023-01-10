import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		//Lớp Math và các hàm toán học
				// E:  cơ số logarit (2.71828)
				// PI: giá trị đại diện cho pi(3.14159)
				//max(double a, double b)
				//min(double a, double b)
				//random() lấy ra 1 số ngẫu nhiên từ 0.0 -> 1.0
				{
				Scanner nguyen = new Scanner(System.in);
				double a,b;
				System.out.println("Nhập vào a: ");
				a = nguyen.nextDouble();
				System.out.println("Nhập vào b: ");
				b = nguyen.nextDouble();
				
				// Hàm lấy giá trị tuyệt đối
				System.out.println("|a| ="+Math.abs(a));
				
				//Hàm tìm min
				System.out.println("Min(a,b)= "+Math.min(a, b));
				
				//Hàm tìm max
				System.out.println("Max(a,b)= "+Math.max(a, b));
				
				//Hàm tìm  ceil
				System.out.println("ceil(a)= "+Math.ceil(a));
				
				//Hàm tìm floor
				System.out.println("floor(a)= "+Math.floor(a));
				
				//Hàm căn bậc hai
				System.out.println("sqrt(a)= "+Math.sqrt(a));
				
				//Hàm a^b
				System.out.println("pow(a,b)"+Math.pow(a,b));
				}

	}
	
}
import java.util.Scanner;

public class ViDU {
	public static void main(String[] args) {
		int a,b;
		
		//Nhập dữ liệu 
		Scanner nguyen =new Scanner(System.in);
		a=nguyen.nextInt();
		b=nguyen.nextInt();
		
		int tong=a+b;
		System.out.println(a+"+"+b+"="+tong);
		
		int hieu=a-b;
		System.out.println(a+"-"+b+"="+hieu);
		
		float thuong=(float)a/b;
		System.out.println(a+"/"+b+"="+thuong);
		
		int nhan=a*b;
		System.out.println(a+"*"+b+"="+nhan);
		
		int chialaydu=a%b;
		System.out.println(a+"%"+b+"="+chialaydu);
	}
}

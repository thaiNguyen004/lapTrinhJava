import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		Scanner nguyen = new Scanner(System.in);
		int a,b;
		System.out.println("Nhập a: ");
		a=nguyen.nextInt();
		System.out.println("Nhập b: ");
		b=nguyen.nextInt();
		//Xuất kết quả so sánh
		
		System.out.println(a+"=="+b+" :"+(a==b));
		System.out.println(a+"!="+b+" :"+(a!=b));
		System.out.println(a+"<"+b+" :"+(a<b));
		System.out.println(a+">"+b+" :"+(a>b));
		
		System.out.println("----------");
		System.out.println("Cả hai số là số chẵn: "+(a%2==0&&b%2==0));
		System.out.println("Một trong hai số là số chẵn: "+(a%2==0||b%2==0));
	}
}

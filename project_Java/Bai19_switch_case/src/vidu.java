import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so nguyen tu 0 den 8");
		n=sc.nextInt();
		switch(n)
		{
		case 2:
		{
			System.out.println("Thu hai");
			break;
		}
		case 3:
		{
			System.out.println("Thu ba");
			break;
		}
		case 4:
		{
			System.out.println("Thu tu");
			break;
		}
		case 5:
		{
			System.out.println("Thu nam");
			break;
		}
		case 6:
		{
			System.out.println("Thu sau");
			break;
		}
		case 7:
		{
			System.out.println("Thu bay");
			break;
		}
		case 8:
		{
			System.out.println("Chu nhat");
			break;
		}
		default:
		{
			System.out.println("Nhap du lieu sai");
		}
		}
	}
}

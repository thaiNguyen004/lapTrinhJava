import java.util.Scanner;

public class Try {
public static void main(String[] args) {
//	try_catch_finally

	Scanner sc = new Scanner(System.in);
	int n=0;
	try
	{
		System.out.println("Nhập vào số nguyên");
		n=sc.nextInt();
	}catch(Exception e)
	{
		System.out.println("Nhập dữ liệu không đúng");
		e.printStackTrace();
	}finally
	{
		System.out.println("Finally");
	}
	System.out.println("Giá trị nhập: "+n);
	System.out.println("Kết thúc chương trình");
}
}

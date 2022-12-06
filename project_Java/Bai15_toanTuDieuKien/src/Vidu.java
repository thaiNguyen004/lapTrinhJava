import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		//(boolean-expression)?if-true-this:if-false-this;
		Scanner nguyen =new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a=nguyen.nextInt();
		String ketQua = (a%2==0)?"số chẵn":"số lẻ";
		System.out.println(a+" là "+ketQua);
		
	}
}

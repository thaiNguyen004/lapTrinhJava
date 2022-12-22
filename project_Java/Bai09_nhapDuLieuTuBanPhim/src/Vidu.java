/**
 * Nhập dữ liệu từ bàn phím
 */
import java.util.Scanner;

public class Vidu {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Ho va ten: ");
		String hoVaTen=sc.nextLine();
		System.out.println("MSSV: ");
		String mssv = sc.nextLine();
		System.out.println("Hoc gioi khong?: ");
		Boolean hocGioi=sc.nextBoolean();
		
		System.out.println("--------");
		System.out.println("Ho ten: "+hoVaTen);
		System.out.println("MSSV: "+mssv);
		System.out.println(hocGioi);
	}
	
	

}
}

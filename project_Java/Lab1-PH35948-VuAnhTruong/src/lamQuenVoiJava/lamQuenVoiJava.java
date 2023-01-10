package lamQuenVoiJava;

import java.util.Scanner;

public class lamQuenVoiJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String name = sc.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		Double diem = sc.nextDouble();
		System.out.println("<<"+name+">>"+" <<"+diem+">>");
		
		System.out.print("Nhập chiều dài: ");
		Double chieuDai = sc.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		Double chieuRong = sc.nextDouble();
		Double chuVi = (chieuDai+chieuRong)*2;
		Double dienTich = chieuDai*chieuRong;
		System.out.println("Chu vi: "+chuVi);
		System.out.println("Diện tích: "+dienTich);
		System.out.println("Cạnh nhỏ của hình chữ nhật = "+Math.min(chieuDai, chieuRong));
		
		System.out.print("Nhập cạnh của khối lập phương: ");
		Double canh = sc.nextDouble();
		Double theTich = canh*canh*canh;
		System.out.println("Thể tích = "+theTich);
		System.out.println("Nhập vào hệ số của phương trình bậc 2");
		System.out.print("Nhập a: ");
		Double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		Double b = sc.nextDouble();
		System.out.print("Nhập c: ");
		Double c = sc.nextDouble();
		Double delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("Delta = "+delta);
	}
}

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		//Bài 49
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("--------");
		
		//1 Ham length()
		System.out.println(s.length());
		
		//2 Ham charAT(vi_tri)
		int doDai = s.length();
		for(int i = 0;i < doDai;i++)
		{
			System.out.println("Vi tri "+i+" la: "+s.charAt(i));
		}
		
		//Ham getChars(vi_tri_bat_dau, vi_tri_ket_thuc,
		//mang_luu_du_lieu, vi_tri_bat_dau_luu_cua_mang)
		char[] arrChar = new char[100];
		s.getChars(2, 5, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("Giá trị của mảng tại "+i+" là "+arrChar[i]);
		}
		
		byte[] arrByte = s.getBytes();
		for (byte b : arrByte) {
			System.out.println(b);
		}
		
		//Bài 50
		String s1 = "Nguyen.vn";
		String s2 = "nguyen.vn";
		String s3 = "Nguyen.vn";
		//So sánh hai chuỗi giống nhau
		//Hàm equals => =>Phân biệt chữ hoa chữ thường
		
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equals s3: "+s1.equals(s3));
		
		//Hàm equalsIgnoreCase => Không phân biệt chữ hoa chữ thường
		System.out.println("s1 equals s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3: "+s1.equalsIgnoreCase(s3));
		
		//So sánh lớn hơn
		//Hàm copareTo => Phân biệt hoa/thường
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		System.out.println("sv1 compare sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compare sv3: "+sv1.compareTo(sv3));
		System.out.println("sv1 compare sv4: "+sv1.compareTo(sv4));
		
		//Hàm compareToIgnoreCase=> Không phân biệt hoa/thường
		
		String sv_1 = "Nguyễn Văn A";
		String sv_2 = "Nguyễn Văn b";
		String sv_3 = "Nguyễn Văn";
		String sv_4 = "Nguyễn Văn a";
		System.out.println("sv1 compare sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compare sv3: "+sv1.compareTo(sv3));
		System.out.println("sv1 compare sv4: "+sv1.compareTo(sv4));
		
		//Hàm regionMatches => So sánh một đoạn
		String r1 = "Nguyên.vn";
		String r2 = "uyêN.v";
		boolean check = r1.regionMatches(2, r2, 0, 6);
//		boolean check = r1.regionMatches(false,2, r2, 0, 6);
//		boolean check = r1.regionMatches(true,2, r2, 0, 6);
		/*Lưu ý: regionMatches false: có phân biệt chữ hoa/thường
		         regionMatches true: Không phân biệt chữ hoa/thường
		*/  
		System.out.println(check);
		
		//Hàm starWith => Hàm kiểm tra chuỗi bắt đầu bằng...
		
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("038"));
		
		//Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng...
		String tenFile = "a picture.JPG";
		String tenFile2 = "Hoc Java.PDF";
		
		if(tenFile.endsWith(".JPG"))
		{
			System.out.println("Là hình ảnh");
		}else if(tenFile.endsWith(".PDF"))
		{
			System.out.println("là file PDF");
		}
		if(tenFile2.endsWith(".JPG"))
		{
			System.out.println("Là hình ảnh");
		}else if(tenFile2.endsWith(".PDF"))
		{
			System.out.println("Là file PDF");
		}
		
		//Bài 51
		String s11 = "Xin chào cô chú, xin chào các bạn, Xin chào";
		String s22 = "Xin chào";
		String s33 = "Xin chào 123";
		char c1 = 'ô';
		//Hàm indexOf
		System.out.println("Vị trí của s2 trong s1: "+s11.indexOf(s22));
		System.out.println("Vị trí của s2 trong s1: "+s11.indexOf(s33));
		
		//Sử dụng vị trí bắt đầu
		System.out.println("vị trí của s2 trong s1: "+s11.indexOf(s22, 2));
		//Tìm kiếm char
		
		System.out.println("vị trí của c1 trong s1: "+s11.indexOf(c1));
		System.out.println("vị trí của c1 trong s1: "+s11.indexOf(c1,20));
		
		//Hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println("vị trí của s2 trong s1: "+s11.lastIndexOf(s22));
		
		//tenFile = "Baitap.excel.lop12.xls"
		
		
		//Bài 52 
		String S1 = "nGuyEn";
		String S2 = ".Vn";
		String S3 = S1 + S2;
		System.out.println("String s3: "+S3);
		//Hàm concat
		String S4 = S1.concat(S2);
		System.out.println("String s4: "+S4);
		//Hàm replace => thay thế 
		
		String S5 = "Nguyen.vn";
		String S6 = S5.replaceAll("Nguyen", "ThaiNguyen");
		System.out.println(S6);
		//Hàm toLowereCase => chuyển về viết thường
		//Hàm toUpperCase => chuyển về viết hoa
		
		String S7 = S3.toLowerCase();
		String S8 = S3.toUpperCase();
		System.out.println("S7: "+S7);
		System.out.println("S8: "+S8);
		
		//Hàm trim => xóa khoảng trắng dư thừa ở đầu chuỗi
		
		String S9 = " Xin chào các bạn, mình là Nguyên";
		System.out.println(S9.trim());
		
		//Hàm toCharArray() => biến một chuỗi thành một mảng các kí tự
		
		//Hàm subString() => cắt chuỗi con
		
		String S10 = "Xin chào các bạn, mình là Nguyên";
		String S11 = S10.substring(9);
		System.out.println(S11);
		
		String S12 = S10.substring(9,15);
		System.out.println(S12);
	}
}

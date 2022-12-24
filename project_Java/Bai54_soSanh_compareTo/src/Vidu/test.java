package Vidu;

public class test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyễn Thái Nguyên");
		SinhVien sv2 = new SinhVien("Nguyễn Hữu Phước");
		SinhVien sv3 = new SinhVien("Nguyễn Thiên An");
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
		System.out.println(sv3.compareTo(sv2));
		
		
	}
}

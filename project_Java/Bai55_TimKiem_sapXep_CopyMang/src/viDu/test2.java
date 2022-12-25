package viDu;

import java.lang.reflect.Array;
import java.util.Arrays;

import viDu.SinhVien;

public class test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyễn Thái Nguyên");
		SinhVien sv2 = new SinhVien("Nguyễn Hữu Phước");
		SinhVien sv3 = new SinhVien("Nguyễn Thiên An");
		SinhVien sv4 = new SinhVien("Vũ Tiến Vinh");
		SinhVien[] a_sv = new SinhVien []{sv1, sv2, sv3};
		
		System.out.println("Ban đầu: "+Arrays.toString(a_sv));
		//Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sắp xếp: "+Arrays.toString(a_sv));
		
		
		//Tìm kiếm
		System.out.println("Tìm kiếm An: "+Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm An: "+Arrays.binarySearch(a_sv, sv4));
	}
}

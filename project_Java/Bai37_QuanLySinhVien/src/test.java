
public class test {
	public static void main(String[] args) {
		Lop lop1 = new Lop("Com108", "Lập Trình Java");
		ngaySinh ngaySinh1 = new ngaySinh(11, 03, 2004);
		SinhVien sinhvien1 = new SinhVien("PH33935", "Nguyễn Thái Nguyên", ngaySinh1, 9.8, lop1);
		
		Lop lop2 = new Lop("Com108", "Lập Trình Java");
		ngaySinh ngaySinh2 = new ngaySinh(13, 05, 2004);
		SinhVien sinhvien2 = new SinhVien("PH33912", "Nguyễn Thị Thanh Vân", ngaySinh2, 7.8, lop2);
		
		Lop lop3 = new Lop("Com108", "Lập Trình Java");
		ngaySinh ngaySinh3 = new ngaySinh(11, 03, 2004);
		SinhVien sinhvien3 = new SinhVien("PH33465", "Hồ Ngọc Hải", ngaySinh3, 9.2, lop3);
		
		System.out.println("Sinh Viên 1: "+sinhvien1.layTenKhoa());
		System.out.println("Sinh Viên 2: "+sinhvien2.layTenKhoa());
		System.out.println("Sinh Viên 3: "+sinhvien3.layTenKhoa());
		
		System.out.println("Sinh viên 1(đạt): "+sinhvien1.kiemTraThiDat());
		System.out.println("Sinh viên 2(đạt): "+sinhvien2.kiemTraThiDat());
		System.out.println("Sinh viên 3(đạt): "+sinhvien3.kiemTraThiDat());
		
		System.out.println("Sinh viên 1 cùng ngày sinh với SV2: "+sinhvien1.kiemTraCungNgaySinh(sinhvien2));
		System.out.println("Sinh viên 1 cùng ngày sinh với SV3: "+sinhvien1.kiemTraCungNgaySinh(sinhvien3));
	}
}

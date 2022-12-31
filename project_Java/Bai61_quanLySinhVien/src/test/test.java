package test;

import java.util.Scanner;

import code.danhSachSinhVien;
import code.sinhVien;

public class test {
	public static void main(String[] args) {
		danhSachSinhVien dssv = new danhSachSinhVien();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		
		do
		{
			System.out.println("1. Thêm sinh viên vào danh sách\r\n"
					+ "2. In danh sách sinh viên ra màn hình\r\n"
					+ "3. Kiểm tra danh sách có rỗng hay không \r\n"
					+ "4. Lấy ra số lượng sinh viên trong danh sách\r\n"
					+ "5. Làm rỗng danh sách sinh viên\r\n"
					+ "6. Kiểm tra sinh viên có tồn tại trong danh sách dựa trên mã sinh viên \r\n"
					+ "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên \r\n"
					+ "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím\r\n"
					+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp\r\n"
					+ "0. Thoát khỏi chương trình\r\n"
					+ "");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhập mssv: ");String msv = sc.nextLine();
				System.out.println("Nhập tên : ");String name = sc.nextLine();
				System.out.println("Nhập tuoi: ");int tuoi = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");double diemTrungbinh = sc.nextDouble();
				sinhVien sv = new sinhVien(msv, name, tuoi, diemTrungbinh);
				dssv.themSinhVien(sv);			
			}else if(luaChon == 2)
			{
				dssv.inSinhVien();
			}else if(luaChon == 3)
			{
				System.out.println(dssv.kiemTraRong());
			}else if(luaChon == 4)
			{
				System.out.println("Số lượng sinh viên: "+dssv.soLuongSinhVien());
			}else if(luaChon == 5)
			{
				dssv.lamRongDanhSach();
			}else if(luaChon == 6)
			{
				String msv = sc.nextLine();
				sinhVien sv = new sinhVien(msv);
				System.out.println(dssv.kiemTraTonTai(sv));
			}else if(luaChon == 7)
			{
				System.out.println("Nhập mã số sinh viên: ");String mssv = sc.nextLine();
				sinhVien sv = new sinhVien(mssv);
				dssv.xoaMotSinhVien(sv);
			}else if(luaChon == 8)
			{
				System.out.println("Nhập tên cần tìm: ");
				String ten = sc.nextLine();
				dssv.timKiemSinhVien(ten);
			}else if(luaChon == 9)
			{
				dssv.sapXepGiamDan();
				dssv.inSinhVien();
			}
		}while(luaChon!=0);
	}
}

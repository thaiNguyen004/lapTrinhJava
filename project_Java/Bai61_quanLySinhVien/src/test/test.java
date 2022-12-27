package test;

import java.util.Scanner;

import main.danhSachSinhVien;
import main.sinhVien;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		danhSachSinhVien dssv = new danhSachSinhVien();
		int luaChon = 0;
		do
		{
			System.out.println("Menu - - - - - - -");
			System.out.println(
					"1. Thêm sinh viên vào danh sách.\n"
				   +"2. In danh sách sinh viên ra màn hình\n"
				   +"3. Kiểm tra danh sách có rỗng hay không\n"
				   +"4. Lấy ra số lượng sinh viên trong danh sách\n"
				   +"5. Làm rỗng danh sách sinh viên\n"
				   +"6. Kiểm tra sinh viên có tồn tại trong danh sách dựa trên mã sinh viên\n"
				   +"7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n"
				   +"8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím\n"
				   +"9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp\n"
				   +"0. Thoát khỏi chương trình"
				   );
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhập mã sinh viên: ");String maSinhVien = sc.nextLine();
				System.out.println("Nhập họ và tên: ");String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh : ");int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");double diemTrungBinh = sc.nextDouble();
				sinhVien sv = new sinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				
				
			}else if(luaChon == 2)
			{
				System.out.println("In danh sách sinh viên ra màn hình");
				dssv.inDanhSachSinhVien();
			}else if(luaChon == 3)
			{
				System.out.println("Kiểm tra danh sách có rỗng hay không");
				System.out.println(dssv.kiemTraDanhSachRong());
			}else if(luaChon == 4)
			{
				System.out.println("Lấy ra số lượng sinh viên trong danh sách");
				System.out.println(dssv.laySoLuongSinhVien());
			}else if(luaChon == 5)
			{
				dssv.lamRongDanhSach();
			}else if(luaChon == 6)
			{
				System.out.println("Nhập mã sinh viên: ");String maSinhVien = sc.nextLine();
				sinhVien sv = new sinhVien(maSinhVien);
				System.out.println("True or False: "+dssv.kiemTraTonTai(sv));
			}else if(luaChon == 7)
			{
				System.out.println("Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên");
				System.out.println("Nhập mã sinh viên: ");String maSinhVien = sc.nextLine();
				sinhVien sv = new sinhVien(maSinhVien);
				dssv.xoaSinhVien(sv);
			}else if(luaChon == 8)
			{
				System.out.println("Nhập tên: ");String tenNhapVao = sc.nextLine();
				System.out.println("Kết quả tìm kiếm");
				dssv.timSinhVien(tenNhapVao);
			}else if(luaChon == 9)
			{
				dssv.sapXepGiamDan();
				dssv.inDanhSachSinhVien();
			}
				
			
			
		}while(luaChon!=0);
	}
}

package main;

import java.io.File;
import java.util.Scanner;

public class runcode {
	public static void main(String[] args) {
		danhSachSinhVien dssv = new danhSachSinhVien();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do
		{
			System.out.println("----MENU----");
			System.out.println(""
					+ "1. Thêm sinh viên\r\n"
					+ "2. In danh sách sinh viên ra màn hình\\r\\n\"\r\n"
					+ "3. Kiểm tra danh sách có rỗng hay không \\r						4. Lấy ra số lượng sinh viên trong danh sách\\r\\n\"\r\n"
					+ "4. Làm rỗng danh sách sinh viên\\r\\n\"\r\n"
					+ "	5. Kiểm tra sinh viên có tồn tại trong danh sách dựa trên mã sinh viên \\r\\n\"\r\n"
					+ "	6. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên \\r\\n\"\r\n"
					+ "	7. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím\\r\\n\"\r\n"
					+ "	8. Xuất ra danh sách sinh viên có điểm từ cao đến thấp\\r\\n\"\r\n"
					+ "	9. Lưu danh sách sinh viên xuống tập tin.\\n\"\r\n"
					+ "	10. Đọc danh sách sinh viên từ tập tin\\n\"\r\n"
					+ "	0. Thoát khỏi chương trình\\r\\n\r\n"
					+ "\r\n"
					+ "");
			System.out.print("Nhập lựa chọn: "); luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhập tên sinh viên: ");
				String tenSinhVien = sc.nextLine();
				System.out.println("Nhập mã số sinh viên: ");
				String mssv  = sc.nextLine();
				System.out.println("Nhập điểm trung bình: ");
				double diemTB = sc.nextDouble();
				sinhVien sv = new sinhVien(tenSinhVien, mssv, diemTB);
				dssv.themSinhVien(sv);
			}else if(luaChon == 2)
			{
				System.out.println("Danh sách sinh viên");
				dssv.inSinhVien();
			}else if(luaChon == 3)
			{
				System.out.println("Danh sách sinh viên có rỗng không: "+dssv.kiemTraRong());
			}
			else if(luaChon == 4)
			{
				dssv.lamRongdssv();
			}else if(luaChon == 5)
			{
				String maSinhVien = sc.nextLine();
				sinhVien msv = new sinhVien(maSinhVien);
				System.out.println("Sinh viên có tồn tại không: "+dssv.kiemTraTonTai(msv));
			}else if(luaChon == 6)
			{
				String maSinhVien = sc.nextLine();
				sinhVien msv = new sinhVien(maSinhVien);
				dssv.xoaSinhVien(msv);
			}else if(luaChon == 7)
			{
				String ten = sc.nextLine();
				dssv.timKiemSinhVien(ten);
			}else if(luaChon == 8)
			{
				dssv.sapXepSinhVien();
			}
			else if(luaChon == 9)
			{
				System.out.println("Nhập đường dẫn: ");
				String file = sc.nextLine();
				File f = new File(file);
				dssv.nhapSinhVienVaoFile(f);			
			}else if(luaChon == 10)
			{

				System.out.println("Nhập đường dẫn: ");
				String file = sc.nextLine();
				File f = new File(file);
				dssv.indanhSachTuFile(f);
			}
		}while(luaChon!=0);
	}
}

package main;

import java.io.File;
import java.util.Scanner;

public class Vidy {
	
	File file;
	
	
	public Vidy(String tenFile ) {
		
		this.file = new File(tenFile);
	}
	public boolean kiemTraThucThi()
	{
		//Kiểm tra file liệu có thể thực thi không
		return this.file.canExecute();
	}
	public boolean kiemTraDoc()
	{
		return this.file.canRead();
	}
	public boolean kiemTraGhi()
	{
		return this.file.canWrite();
	}
	public void inDuongDan()
	{
		System.out.println(this.file.getAbsolutePath());
	}
	public void inTen()
	{
		System.out.println(this.file.getName());
	}
	public void kiemTraLaThuMucHoacTapTin()
	{
		if(this.file.isDirectory())
		{
			System.out.println("Đây là thư mục");
		}else if(this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}
	public void inDanhSachFileCon()
	{
		if(this.file.isDirectory())
		{
			File[] fileCon = this.file.listFiles();
			for (File file : fileCon) {
				System.out.println(file.getAbsolutePath());
			}
			
		}else if(this.file.isFile()) {
			System.out.println("Đây là tập tin, không thể có file con");
		}
	}
	public void inCayThuMuc()
	{
		this.inChiTietCayThuMuc(this.file, 1);
	}
	public void inChiTietCayThuMuc(File f, int level)
	{
//		System.out.print("|");
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
			
		}
		System.out.print("|_");
		System.out.println(f.getName());
		if(f.canRead()&&f.isDirectory())
		{
			File[] fileCon = f.listFiles();
			for (File fx : fileCon) {
				inChiTietCayThuMuc(fx, level+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên file");
		String tenFile = sc.nextLine();
		Vidy vd = new Vidy(tenFile);
		int luaChon =0;
		do
		{
			System.out.println("Menu-------");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên: ");
			System.out.println("6. Kiểm tra file là tập tin hoặc thư mục : ");
			System.out.println("7. In ra danh sách file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.println("Kiểm tra file thực thi: "+vd.kiemTraThucThi());
				break;
			case 2:
				System.out.println("Kiểm tra file có thể đọc: "+vd.kiemTraDoc());
				break;
			case 3:
				System.out.println("Kiểm tra file có thể ghi: "+vd.kiemTraDoc());
				break;
			case 4:
				vd.inDuongDan();
				break;
			case 5:
				vd.inTen();
				break;
			case 6:
				vd.kiemTraLaThuMucHoacTapTin();
				break;
			case 7:
				vd.inDanhSachFileCon();
				break;
			case 8:
				vd.inCayThuMuc();;
				break;
			default:
				break;
			}
		}while(luaChon !=0);
	}
}

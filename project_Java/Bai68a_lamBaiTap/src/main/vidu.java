package main;

import java.io.File;
import java.util.Scanner;

public class vidu
{
	File file;
	
	public vidu(String file) {
		this.file = new  File(file);
	}
	public void taoCayThuMuc()
	{
		testtaoCayThuMuc(this.file, 1);
	}
	public void testtaoCayThuMuc(File f, int level)
	{
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.print("\\:");
		System.out.println(f.getName());
		if(f.canRead()&&f.isDirectory())
		{
			File[] FileCon = f.listFiles();
			for (File phiphai : FileCon) {
				testtaoCayThuMuc(phiphai,level+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner nhapDuLieu = new Scanner(System.in);
		System.out.println("Nhap src: ");String src = nhapDuLieu.nextLine();
		vidu vd = new vidu(src);
		System.out.println("Cây thư mục: ");
		vd.taoCayThuMuc();
		
		
	}
}
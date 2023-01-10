package main;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

public class ViduXoaFile {
	public static void xoaFile(File fx)
	{
		if(fx.isFile())
		{
			System.out.println("Đã xóa: "+fx.getAbsolutePath());
			fx.delete();
		}else if(fx.isDirectory())
		{
			File[] fileCon = fx.listFiles();
			for (File file : fileCon) {
				xoaFile(file);
			}
			System.out.println("Đã xóa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}
	public static void xoaFile2(File f)
	{
		Path p = f.toPath();
		if(f.isFile())
		{
			try {
				Files.deleteIfExists(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}else if(f.isDirectory())
		{
			File[] fileCon = f.listFiles();
			for (File file : fileCon) {
				xoaFile2(file);
			}
			try {
				Files.deleteIfExists(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}
	}
	public static void main(String[] args) {
		File f0 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai69_XoaFileVaThuMuc\\F0");
		File f0_1 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai69_XoaFileVaThuMuc\\F0_1");
		File f_vidu = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai69_XoaFileVaThuMuc\\Vidu.txt");
////		f0.delete(); // không được vì có tập tin con bên trong
////		f0.deleteOnExit();// không được vì có tập tin con bên trong
//		f0_1.deleteOnExit();//xóa được vì là thư mục rỗng
//		f_vidu.deleteOnExit(); // xóa được vì là tập tin
//		
//		System.out.println(f0_1.delete());
//		ViduXoaFile.xoaFile(f0);
		
		//Sử dụng class Files xóa tập tin và thư mục
		Path p = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_Vidu = f_vidu.toPath();
		try {
			xoaFile2(f0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_Vidu);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}

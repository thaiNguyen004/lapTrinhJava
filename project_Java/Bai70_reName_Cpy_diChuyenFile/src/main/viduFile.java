package main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class viduFile {
	public static void copyAll(File f1, File f2)
	{
		try {
			Files.copy(f1.toPath(), f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(f1.isDirectory())
		{
			File[] fileCon = f1.listFiles();
			for (File phiphai : fileCon) {
				File file_new = new File(f2.getAbsoluteFile()+"\\"+phiphai.getName());
				copyAll(phiphai, file_new);
			}
 		}
	}
	public static void main(String[] args) {
		File f0 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai70_reName_Cpy_diChuyenFile\\File_1.txt");
		File f1 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai70_reName_Cpy_diChuyenFile\\File_2.txt");
		File f2 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai70_reName_Cpy_diChuyenFile\\File_xyz.txt");
		//1. Thay đổi tên tập tin hoặc thư mục
		//Sử dụng File để thay đổi
//		f0.renameTo(f1);
		
		//Sử dụng Files để đổi tên
		try {
			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//2. Di chuyển file
		File f0_f2 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai70_reName_Cpy_diChuyenFile\\f0\\File_xyz.txt");
		try {
			Files.move(f2.toPath(), f0_f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//3. Copy_file
		File f_0 = new File("N:\\\\Github\\\\lapTrinhJava\\\\project_Java\\\\Bai70_reName_Cpy_diChuyenFile\\\\f0");
		File f_0_copy = new File("N:\\\\Github\\\\lapTrinhJava\\\\project_Java\\\\Bai70_reName_Cpy_diChuyenFile\\\\f0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		viduFile.copyAll(f_0, f_0_copy);
	}
	
	
	
}

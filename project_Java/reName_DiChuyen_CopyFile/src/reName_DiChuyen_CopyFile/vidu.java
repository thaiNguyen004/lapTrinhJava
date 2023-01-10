package reName_DiChuyen_CopyFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class vidu {
	public static void copyFileAll(File f1, File f2)
	{
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(f1.isDirectory())
		{
			File[] FileCon = f1.listFiles();
			for(File file:FileCon)
			{
				File file_new = new File(f2.getAbsoluteFile()+"\\"+file.getName());
				copyFileAll(file, file_new);
			}
		}
	}
	public static void main(String[] args) {
		//đổi tên và di chuyển file
//		File file_0 = new File("C:\\Users\\thain\\OneDrive\\Máy tính\\File_0");
//		File file_1 = new File("C:\\Users\\thain\\OneDrive\\Máy tính\\File");
//		try {
//			Files.move(file_0.toPath(), file_1.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		// Sử dụng File
//		File file = new File("C:\\Users\\thain\\OneDrive\\Máy tính\\File\\File_2\\File_3");
//		File file_new = new File("C:\\Users\\thain\\OneDrive\\Máy tính\\File\\File_2\\File_ba");
//		file.renameTo(file_new);
		
		//Di chuyển file
//		File file1 = new File("C:\\\\Users\\\\thain\\\\OneDrive\\\\Máy tính\\\\File\\File_3");
//		File file2 = new File("C:\\\\Users\\\\thain\\\\OneDrive\\\\Máy tính\\\\File\\File_2\\\\File_3");
//		try {	
//			Files.move(file1.toPath(),file2.toPath(),StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		File f1 = new File("C:\\\\Users\\\\thain\\\\OneDrive\\\\Máy tính\\\\File\\\\File_2");
		File f2 = new File("C:\\\\Users\\\\thain\\\\OneDrive\\\\Máy tính\\\\File\\\\File_new");
		vidu.copyFileAll(f1, f2);
		
	}
}

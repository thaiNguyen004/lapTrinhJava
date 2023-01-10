package main;

import java.io.File;
import java.io.IOException;

public class viduTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		File folder1 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai67_TaoTapTin");
		File folder2 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai67_TaoTapTin1");
		//Kiểm tra thư mục có tồn tại không
		System.out.println("Kiểm tra tồn tại: "+folder1.exists());
		System.out.println("Kiểm tra tồn tại: "+folder2.exists());
		
		//Tạo thư mục - mkdir() tạo một thư mục
		File f1 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai67_TaoTapTin\\directory1");
		f1.mkdir();
		//mkdirs() tạo nhiều thư mục
		File f2 = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai67_TaoTapTin\\directory1\\directory2\\directory3\\directory4");
		f2.mkdirs();
		
		//Tạo tập tin có phần mở rộng: .exe, .txt, .doc, .xls
		File file1 = new File("N:\\\\Github\\lapTrinhJava\\project_Java\\Bai67_TaoTapTin\\directory1\\Vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//Không có quyền tạo tập tin
			//Ổ cứng bị đầy
			//Đường dẫn bị sai
			e.printStackTrace();
		}
		
		
	}
}

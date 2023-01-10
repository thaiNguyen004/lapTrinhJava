package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ghiDoiTuong{ 
	public static void main(String[] args) {
		try {
			File file = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai73_ghiDoiTuongXuongFile\\file.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			sinhVien sv = new sinhVien("001", "Nguyễn Thái Nguyên", 2000, 8);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

package main;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
public class viduDocDoiTuong {
	public static void main(String[] args) {
		try {
			File file = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai73_ghiDoiTuongXuongFile\\file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			sinhVien sv = (sinhVien) ois.readObject();
			System.out.println(sv);
			System.out.println(sv.getDiemTrungBinh());
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}	

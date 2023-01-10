package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class danhSachSinhVien {
	private ArrayList<sinhVien> danhSach;

	public danhSachSinhVien(ArrayList<sinhVien> danhSach) {
		super();
		this.danhSach = danhSach;
	}
	public danhSachSinhVien()
	{
		this.danhSach = new ArrayList<sinhVien>();
	}
	
	//1 Thêm sinh viên vào danh sách
	
	public void themSinhVien(sinhVien sv)
	{
		this.danhSach.add(sv);
	}
	
	//2. In danh sách sinh viên ra màn hình

	public void inSinhVien()
	{
		for (sinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}
	//3. Kiểm tra danh sách có rỗng hay không 
	public boolean kiemTraRong()
	{
		return danhSach.isEmpty();
	}
	
	//4. Lấy ra số lượng sinh viên trong danh sách
	public int soLuongSinhVien()
	{
		return danhSach.size();
	}
	
	//5. Làm rỗng danh sách sinh viên
	public void lamRongDanhSach()
	{
		danhSach.removeAll(danhSach);
	}
	//6. Kiểm tra sinh viên có tồn tại trong danh sách dựa trên mã sinh viên 
	public boolean kiemTraTonTai(sinhVien msv)
	{
		return danhSach.contains(msv);
	}
	//7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
	public void xoaMotSinhVien(sinhVien sv)
	{
		danhSach.remove(sv);
	}
	//8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
	public void timKiemSinhVien(String ten)
	{
		for (sinhVien sinhVien : danhSach) {
			if(sinhVien.getTenSinhVien().indexOf(ten)>=0)
			{
				System.out.println(sinhVien);
			}
		}
	}
	//9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sapXepGiamDan()
	{
		Collections.sort(danhSach, new Comparator<sinhVien>() {

			@Override
			public int compare(sinhVien sv, sinhVien sv2) {
				// TODO Auto-generated method stub
				if(sv.getDiemTrungBinh()<sv2.getDiemTrungBinh())
				{
					return 1;
				}else if(sv.getDiemTrungBinh()>sv2.getDiemTrungBinh())
				{
					return -1;
				}else 
				{
					return 0;
				}
			}
		});
		
	}
	//10. Ghi xuống file
	public void ghiDoiTuong(File file)
	{
			try {
				OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				for(sinhVien sinhvien: danhSach)
				{
					oos.writeObject(sinhvien);
				}
				oos.flush();
				oos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	public void docDuLieuTuFile(String tenFile) {
		try {
			InputStream is = new FileInputStream(tenFile);
			ObjectInputStream ois = new ObjectInputStream(is);
			sinhVien sv = null;
			while(true)
			{
				Object obj = ois.readObject();
				if(obj!=null)
				{
					sv = (sinhVien) obj;
					this.danhSach.add(sv);
				}else {
					break;
				}
			}
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	
}

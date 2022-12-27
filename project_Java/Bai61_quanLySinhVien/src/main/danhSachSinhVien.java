package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhSachSinhVien {
	private ArrayList<sinhVien> danhSach;

	public danhSachSinhVien(ArrayList<sinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public danhSachSinhVien() {
		this.danhSach = new ArrayList<sinhVien>();
	}
	
	//1
	public void themSinhVien(sinhVien sv)
	{
		this.danhSach.add(sv);
	}
	
	//2
	public void inDanhSachSinhVien()
	{
		for (sinhVien sinh_Vien : danhSach) {
			System.out.println(sinh_Vien);
		}
	}
	
	//3 Kiểm tra danh sách có rỗng không
	public boolean kiemTraDanhSachRong()
	{
		return this.danhSach.isEmpty();
	}
	
	//4 Lấy số lượng 
	public int laySoLuongSinhVien()
	{
		return this.danhSach.size();
	}
	
	//5 Hàm làm rỗng  dssv
	public  void lamRongDanhSach()
	{
		this.danhSach.removeAll(danhSach);
	}
	//6 Kiểm tra sinh viên có tồn tại hay không bằng mssv
	public boolean kiemTraTonTai(sinhVien sv)
	{
		return this.danhSach.contains(sv);
	}
	//7 Xóa 1 sinh viên ra khỏi danh sách bằng mssv
	public void xoaSinhVien(sinhVien sv)
	{
		this.danhSach.remove(sv);
	}
	
	//8 Tìm sinh viên
	public void timSinhVien(String ten)
	{
		for (sinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0)
			{
				System.out.println(sinhVien);
			}
		}
	}
	
	//9 Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sapXepGiamDan()
	{
		Collections.sort(this.danhSach, new Comparator<sinhVien>() {

			@Override
			public int compare(sinhVien o1, sinhVien o2) {
				// TODO Auto-generated method stub
				if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh())
				{
					return 1;
				}else if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh())
				{
					return -1;
				}else
				{
					return 0;
				}
			}
		});
	}
}

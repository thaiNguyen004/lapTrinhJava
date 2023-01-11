package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class danhSachSinhVien {
	private ArrayList<sinhVien> danhSachSinhVien;

	public danhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<sinhVien>();
	}

	/**
	 * @return the danhSachSV
	 */
	public ArrayList<sinhVien> getDanhSachSV() {
		return danhSachSinhVien;
	}

	/**
	 * @param danhSachSV the danhSachSV to set
	 */
	public void setDanhSachSV(ArrayList<sinhVien> danhSachSV) {
		this.danhSachSinhVien = danhSachSV;
	}
	public void themSinhVien(sinhVien sv)
	{
		this.danhSachSinhVien.add(sv);
	}
	public void inSinhVien()
	{
		for(sinhVien sv: danhSachSinhVien)
		{
			System.out.println(sv.toString());
		}
	}
	public boolean kiemTraRong()
	{
		return danhSachSinhVien.isEmpty();
	}
	public int layRaSoLuongSinhVien()
	{
		return danhSachSinhVien.size();
	}
	public boolean lamRongdssv()
	{
		return danhSachSinhVien.removeAll(danhSachSinhVien);
	}
	public boolean kiemTraTonTai(sinhVien msv)
	{
		return danhSachSinhVien.contains(msv);
	}
	public boolean xoaSinhVien(sinhVien msv)
	{
		return danhSachSinhVien.remove(msv);
	}
	public void timKiemSinhVien(String ten)
	{
		for(sinhVien sv: danhSachSinhVien)
		{
			sv.getTenSinhVien().trim();
			int vitri = sv.getTenSinhVien().lastIndexOf(" ");
			if(sv.getTenSinhVien().indexOf(ten,vitri+1)>=0)
			{
				System.out.println(sv.toString());
			}
		}
	}
	
	public void sapXepSinhVien()
	{
		Collections.sort(danhSachSinhVien, new Comparator<sinhVien>() {

			@Override
			public int compare(sinhVien o1, sinhVien o2) {
				// TODO Auto-generated method stub
				if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh())
				{
					return -1;
				}else if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh())
				{
					return 1;
				}else {
					return 0;
				}
			}
			
		});
	}
	public void nhapSinhVienVaoFile(File file)
	{
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for(sinhVien sv : danhSachSinhVien)
			{
				oos.writeObject(sv);
			}
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void indanhSachTuFile(File file)
	{
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream iis = new ObjectInputStream(is);
			sinhVien sv = null;
			while(true)
			{
				Object obj = iis.readObject();
				if(obj != null)
				{
					sv = (sinhVien) obj;
					danhSachSinhVien.add(sv);
				}else {
					break;
				}
			}
			iis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

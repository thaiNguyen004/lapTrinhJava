package main;

import java.io.Serializable;

public class sinhVien implements Serializable{
	private String maSinhVien;
	private String tenSinhVien;
	private int tuoi;
	private double diemTrungBinh;
	public sinhVien(String maSinhVien, String tenSinhVien, int tuoi, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.tuoi = tuoi;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public sinhVien(String maSinhVien) {
		super();
		this.maSinhVien = maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", tuoi=" + tuoi
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhVien other = (sinhVien) obj;
		if (maSinhVien == null) {
			if (other.maSinhVien != null)
				return false;
		} else if (!maSinhVien.equals(other.maSinhVien))
			return false;
		return true;
	}

	
	
}

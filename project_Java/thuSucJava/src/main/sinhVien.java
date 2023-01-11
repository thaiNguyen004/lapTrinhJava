package main;

import java.io.Serializable;

public class sinhVien implements Serializable {
	private String tenSinhVien;
	private String mssv;
	private double diemTrungBinh;
	public sinhVien(String tenSinhVien, String mssv, double diemTrungBinh) {
		super();
		this.tenSinhVien = tenSinhVien;
		this.mssv = mssv;
		this.diemTrungBinh = diemTrungBinh;
	}
	public sinhVien(String mssv) {
		super();
		this.tenSinhVien = tenSinhVien;
		this.mssv = mssv;
		this.diemTrungBinh = diemTrungBinh;
	}
	/**
	 * @return the tenSinhVien
	 */
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	/**
	 * @param tenSinhVien the tenSinhVien to set
	 */
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	/**
	 * @return the mssv
	 */
	public String getMssv() {
		return mssv;
	}
	/**
	 * @param mssv the mssv to set
	 */
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	/**
	 * @return the diemTrungBinh
	 */
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	/**
	 * @param diemTrungBinh the diemTrungBinh to set
	 */
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "sinhVien [tenSinhVien=" + tenSinhVien + ", mssv=" + mssv + ", diemTrungBinh=" + diemTrungBinh + "]";
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
		if (mssv == null) {
			if (other.mssv != null)
				return false;
		} else if (!mssv.equals(other.mssv))
			return false;
		return true;
	}
		
	
}

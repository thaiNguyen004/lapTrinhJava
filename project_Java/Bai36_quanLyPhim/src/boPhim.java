
public class boPhim {
	private String tenPhim;
	private int namSanXuat;
	private hangSanXuat hangSanXuat;
	private double giaVe;
	private ngayChieu ngayChieu;
	public boPhim(String tenPhim, int namSanXuat, hangSanXuat hangSanXuat, double giaVe, ngayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public hangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(hangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public ngayChieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(ngayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public boolean kiemTraGiaVeReHon(boPhim phim_other)
	{
		return this.giaVe<phim_other.giaVe;
	}
	public String layTenHangSanXuat()
	{
		return hangSanXuat.getTenHang();
	}
	public double giaSauKhiGiamGia(double x)
	{
		return this.giaVe*(1-x/100);
	}
	
	
}

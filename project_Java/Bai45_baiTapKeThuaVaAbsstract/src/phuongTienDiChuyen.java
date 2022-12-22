
public abstract class phuongTienDiChuyen {
	protected String loaiPhuongTien;
	hangSanXuat hangSanXuat;
	public phuongTienDiChuyen(String loaiPhuongTien, hangSanXuat hangSanXuat) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public hangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(hangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String layTenHang()
	{
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public void batDau()
	{
		System.out.println("Bat dau");
	}
	public void tangToc()
	{
		System.out.println("Tang Toc");
	}
	public void dungLai()
	{
		System.out.println("Dung Lai");
	}
	public abstract double layVanToc();
	

}
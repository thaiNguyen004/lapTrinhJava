
public class MayTinh {
	private hangSanXuat hang;
	private ngay ngaysx;
	private double giaBan;
	private double soThangBaoHanh;
	public MayTinh(hangSanXuat hang, ngay ngaysx, double giaBan, double soThangBaoHanh) {
		this.hang = hang;
		this.ngaysx = ngaysx;
		this.giaBan = giaBan;
		this.soThangBaoHanh = soThangBaoHanh;
	}
	public hangSanXuat getHang() {
		return hang;
	}
	public void setHang(hangSanXuat hang) {
		this.hang = hang;
	}
	public ngay getNgaysx() {
		return ngaysx;
	}
	public void setNgaysx(ngay ngaysx) {
		this.ngaysx = ngaysx;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getSoThangBaoHanh() {
		return soThangBaoHanh;
	}
	public void setSoThangBaoHanh(double soThangBaoHanh) {
		this.soThangBaoHanh = soThangBaoHanh;
	}
	
	public boolean kiemTraGiaThapHon(MayTinh mt_other)
	{
		return this.giaBan<mt_other.giaBan;
	}
	public String layTenQuocGia()
	{
		return this.hang.layTenQuocGia();
	}
}

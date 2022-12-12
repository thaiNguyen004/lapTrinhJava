
public class hangSanXuat {
	private String tenHang;
	private quocGia quocgia;
	public hangSanXuat(String tenHang, quocGia quocgia) {
		super();
		this.tenHang = tenHang;
		this.quocgia = quocgia;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public quocGia getQuocgia() {
		return quocgia;
	}
	public void setQuocgia(quocGia quocgia) {
		this.quocgia = quocgia;
	}
	public String layTenQuocGia() {
		// TODO Auto-generated method stub
		return quocgia.getTenQuocGia();
	}
	
}

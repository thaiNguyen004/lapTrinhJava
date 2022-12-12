
public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatBan;
	private tacGia tacGia;
	
	public Sach(String tenSach, double giaBan, int namXuatBan, tacGia tacGia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}
	
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public tacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(tacGia tacGia) {
		this.tacGia = tacGia;
	}
	
	public void inTenSach()
	{
		System.out.println("Tên sách: "+this.tenSach);
	}
	public boolean kiemTraCungNam(Sach sach_other)
	{
		return (this.namXuatBan==sach_other.namXuatBan);
	}
	public double giaSauKhiGiam(double x)
	{
		return this.giaBan*(1-x/100);
	}
}

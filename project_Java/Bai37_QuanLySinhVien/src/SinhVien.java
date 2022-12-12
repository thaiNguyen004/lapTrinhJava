
public class SinhVien {
	private String maSinhVien;
	private String hoVaTen;
	private ngaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop Lop;
	public SinhVien(String maSinhVien, String hoVaTen, ngaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		Lop = lop;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public ngaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(ngaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public Lop getLop() {
		return Lop;
	}
	public void setLop(Lop lop) {
		Lop = lop;
	}
	public String layTenKhoa()
	{
		return this.Lop.getTenKhoa();
	}
	public boolean kiemTraThiDat()
	{
//		if(this.diemTrungBinh>=8)
//		{
//			System.out.println("Học sinh giỏi");
//		}else if(this.diemTrungBinh>=6.5)
//		{
//			System.out.println("Học sinh khá");
//		}else if(this.diemTrungBinh>=5)
//		{
//			System.out.println("Học sinh trung bình");
//		}else if(this.diemTrungBinh>=3)
//		{
//			System.out.println("Học sinh yếu");
//		}else
//		{
//			System.out.println("Học sinh kém");
//		}
		
		return(this.diemTrungBinh>=5);
	}
	public boolean kiemTraCungNgaySinh(SinhVien sinhvien_other)
	{
		if(this.ngaySinh.getNgay()!=sinhvien_other.ngaySinh.getNgay())
			return false;
		if(this.ngaySinh.getThang()!=sinhvien_other.ngaySinh.getThang())
			return false;
		if(this.ngaySinh.getNam()!=sinhvien_other.ngaySinh.getNam())
			return false;
		return true;
	}
	
}

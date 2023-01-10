
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien;
	private double khoiLuong;
	public double abc;
	
	public HoaDonCaPhe(String ten, double gia, double khoiLuong)
	{
		this.tenLoaiCaPhe=ten;
		this.giaTien=gia;
		this.khoiLuong=khoiLuong;
	}
	
	public double tinhTongTien()
	{
		return this.khoiLuong*this.giaTien;
	}
	public boolean kiemTraKhoiLuongLonHon(double KL)
	{
		return (this.khoiLuong>KL);
	}
	public boolean kiemTraTongTienLonHon500K()
	{
		return(this.tinhTongTien()>500000);
	}
	public double giamGia(double x)
	{
		if(this.tinhTongTien()>500000)
		{
			return (x/100)*this.tinhTongTien();
		}else
		{
			return 0;
		}
	}
	public double giaSauKhiGiam(double x)
	{
		return this.tinhTongTien()-this.giamGia(x);
	}
}

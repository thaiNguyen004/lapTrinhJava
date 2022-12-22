
public class mayBay extends phuongTienDiChuyen {
	private String loaiNhienLieu;

	

	public mayBay(String loaiPhuongTien, hangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
    public void CatCanh()
    {
    	System.out.println("Cat canh");
    }
	public void HaCanh()
	{
		System.out.println("Ha canh");
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 800;
	}
	
}

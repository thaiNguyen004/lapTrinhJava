package viDu;

public class SinhVien implements Comparable<SinhVien> {
//	private int maSinhVien;
	private String hoVaTen;
//	private String tenLop;
//	private double diemTB;
	public SinhVien(String hoVaTen) {
		super();
		this.hoVaTen = hoVaTen;
	}
	
	
    public String getHoVaTen() {
		return hoVaTen;
	}


	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTen()
	{
		String Ten = this.hoVaTen;
		Ten.trim();
		if(Ten.indexOf(" ")>0)
		{
			int vitri = Ten.lastIndexOf(" ");
			return Ten.substring(vitri+1);
		}
		else {
			return Ten;
		}
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}

	@Override
	public String toString() {
		return "SinhVien [hoVaTen=" + hoVaTen + "]";
	}

	

    
	
	
}

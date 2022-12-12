
public class conNguoi {
	private String hoVaTen;
	private int NamSinh;
	public conNguoi(String hoVaTen, int namSinh) {
		this.hoVaTen = hoVaTen;
		NamSinh = namSinh;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}
	public void an()
	{
		System.out.println("Măm Măm");
	}
	public void uong()
	{
		System.out.println("Ực ực");
	}
	public void ngu()
	{
		System.out.println("Khò Khò");
	}
}	


public class hocSinh extends conNguoi {
	private String tenLop, tenTruong;

	public hocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
		super(hoVaTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}
	public void lamBaiTap()
	{
		System.out.println(",,,,,");
	}
}

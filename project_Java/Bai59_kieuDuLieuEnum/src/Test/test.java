package Test;

public class test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb_m = new ThoiKhoaBieu(Day.Monday, "Toán Lý Hóa");
		ThoiKhoaBieu tkb_t = new ThoiKhoaBieu(Day.Tuesday, "Văn Sử Địa");
		ThoiKhoaBieu tkb_w = new ThoiKhoaBieu(Day.Wednesday, "Tin GDCD Văn");
		ThoiKhoaBieu tkb_th = new ThoiKhoaBieu(Day.Thurday, "Toán Hóa Anh");
		ThoiKhoaBieu tkb_f = new ThoiKhoaBieu(Day.Friday, "Văn Thể Toán");
		ThoiKhoaBieu tkb_sa = new ThoiKhoaBieu(Day.Saturday, "Địa Sử Công nghệ");
		
		System.out.println(tkb_f);
		
		int x = Month.Jenuary.soNgay();
		System.out.println(x);
		
	}
}

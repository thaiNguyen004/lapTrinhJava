
public class Main {
public static void main(String[] args) {
	HoaDonCaPhe hd1 =new HoaDonCaPhe("Cà Phê Trung Nguyên",100000,1);
	System.out.println("Giá tiền: "+hd1.tinhTongTien());
	System.out.println("Kiểm tra khối lượng  > 2kg "+hd1.kiemTraKhoiLuongLonHon(2));
	System.out.println("Kiểm tra khối lượng  > 1kg "+hd1.kiemTraKhoiLuongLonHon(1));
	System.out.println("kiemTraTongTienLonHon500K "+hd1.kiemTraTongTienLonHon500K());
	System.out.println("Giảm giá: "+hd1.giamGia(10));
	System.out.println("Giá cuối: "+hd1.giaSauKhiGiam(10));
	
	HoaDonCaPhe hd2 =new HoaDonCaPhe("Cà Phê Trung Nguyên",100000,8);
	System.out.println("Giá tiền: "+hd2.tinhTongTien());
	System.out.println("Kiểm tra khối lượng  > 2kg "+hd2.kiemTraKhoiLuongLonHon(2));
	System.out.println("Kiểm tra khối lượng  > 1kg "+hd2.kiemTraKhoiLuongLonHon(1));
	System.out.println("kiemTraTongTienLonHon500K "+hd2.kiemTraTongTienLonHon500K());
	System.out.println("Giảm giá: "+hd2.giamGia(10));
	System.out.println("Giá cuối: "+hd2.giaSauKhiGiam(10));
	
}
}

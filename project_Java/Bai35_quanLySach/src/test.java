
public class test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(11, 03, 2004);
		tacGia tacGia1 = new tacGia("Nguyễn Thái Nguyên", ngay1);
		Sach sach1 = new Sach("Lập trình Java", 79.700, 2021, tacGia1);
		
		Ngay ngay2 = new Ngay(22, 01, 1986);
		tacGia tacGia2 = new tacGia("Nguyễn Văn A", ngay2);
		Sach sach2 = new Sach("Lập trình C", 69.700, 1992, tacGia2);
		
		Ngay ngay3 = new Ngay(21, 07, 1999);
		tacGia tacGia3 = new tacGia("Nguyễn Thái Nguyên", ngay3);
		Sach sach3 = new Sach("Lập trình C#", 79.700, 2021, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		System.out.println("NXB sach1 = NXB sach2 "+sach1.kiemTraCungNam(sach2));
		System.out.println("NXB sach1 = NXB sach3 "+sach1.kiemTraCungNam(sach3));
		System.out.println("Giá sach1 sau khi giảm: "+sach1.giaSauKhiGiam(30));
		System.out.println("Giá sach2 sau khi giảm: "+sach2.giaSauKhiGiam(30));
		System.out.println("Giá sach3 sau khi giảm: "+sach3.giaSauKhiGiam(30));
	}
}


public class test {
	public static void main(String[] args) {
		ngay ngay1 = new ngay(12, 3, 2023);
		ngay ngay2 = new ngay(11, 3, 2022);
		ngay ngay3 = new ngay(4, 3, 2024);
		
		quocGia quocGia1 = new quocGia("VN", "Việt Nam");
		quocGia quocGia2 = new quocGia("USA", "Hoa Kỳ");
		quocGia quocGia3 = new quocGia("TQ", "Trung Quốc");
		
		
		hangSanXuat hang1 = new hangSanXuat("LAP Việt Nam", quocGia1);
		hangSanXuat hang2 = new hangSanXuat("MACBOOK", quocGia2);
		hangSanXuat hang3 = new hangSanXuat("LAP Trung Quốc", quocGia3);
		
		
		MayTinh mt1 = new MayTinh(hang1, ngay1, 1200, 12);
		MayTinh mt2 = new MayTinh(hang2, ngay2, 2700, 12);
		MayTinh mt3 = new MayTinh(hang3, ngay3, 1200, 12);
		
		
		System.out.println("MT1 < MT2: "+mt1.kiemTraGiaThapHon(mt2));
		System.out.println("MT1 < MT3: "+mt1.kiemTraGiaThapHon(mt3));
		
		System.out.println("quốc gia 1: "+mt1.layTenQuocGia());
		System.out.println("quốc gia 2: "+mt2.layTenQuocGia());
		System.out.println("quốc gia 3: "+mt3.layTenQuocGia());
	}
}


public class test {
	public static void main(String[] args) {
		ngayChieu ngaychieuPhim1 = new ngayChieu(12, 12, 2022);
		hangSanXuat hangPhim1 = new hangSanXuat("Việt Nam network", "Việt Nam");
		boPhim phim1 = new boPhim("Bố Già", 2021, hangPhim1, 250000, ngaychieuPhim1);
		ngayChieu ngaychieuPhim2 = new ngayChieu(10, 10, 2022);
		hangSanXuat hangPhim2 = new hangSanXuat("Anime Japan", "Japan");
		boPhim phim2 = new boPhim("Boruto Movie", 2022, hangPhim2, 180000, ngaychieuPhim2);
		ngayChieu ngaychieuPhim3 = new ngayChieu(11, 03, 2021);
		hangSanXuat hangPhim3 = new hangSanXuat("Film Korea", "Hàn Quốc");
		boPhim phim3 = new boPhim("Squid Game", 2022, hangPhim3, 280000, ngaychieuPhim3);
		
		System.out.println("Giá vé phim "+phim1.getTenPhim()+" có rẻ hơn phim "+phim3.getTenPhim()+" không: "+ phim1.kiemTraGiaVeReHon(phim3));
		System.out.println("Giá vé phim "+phim1.getTenPhim()+" có rẻ hơn phim "+phim2.getTenPhim()+" không: "+ phim1.kiemTraGiaVeReHon(phim2));
		phim1.layTenHangSanXuat();
		phim2.layTenHangSanXuat();
		phim3.layTenHangSanXuat();
		System.out.println("Giá phim "+phim1.getTenPhim()+" sau khi khuyến mãi 15%: "+phim1.giaSauKhiGiamGia(15));
		System.out.println("Giá phim "+phim2.getTenPhim()+" sau khi khuyến mãi 35%: "+phim2.giaSauKhiGiamGia(15));
		System.out.println("Giá phim "+phim3.getTenPhim()+" sau khi khuyến mãi 25%: "+phim3.giaSauKhiGiamGia(15));


		
	}
}

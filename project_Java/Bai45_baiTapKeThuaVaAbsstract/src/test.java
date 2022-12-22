
public class test {
	public static void main(String[] args) {
		hangSanXuat hang1 = new hangSanXuat("Viet Nam Airline", "Viet Nam");
		hangSanXuat hang2 = new hangSanXuat("Lamborgini", "Germanny");
		hangSanXuat hang3 = new hangSanXuat("XedapVietNam", "VierNam");
		
		phuongTienDiChuyen pt1 = new mayBay("May bay", hang1, "Truong hai");
		phuongTienDiChuyen pt2 = new XeOTo("O To", hang2, "Dau");
		phuongTienDiChuyen pt3 = new XeDap("Xe Dap", hang3);
		
		System.out.println("Lay hang san xuat: ");
		System.out.println("Phuong tien 1: "+pt1.layTenHang());
		
		pt1.batDau();
		 
		System.out.println("Van toc phuong tien 1: "+pt1.layVanToc());
		System.out.println("Van toc phuong tien 2: "+pt2.layVanToc());
		System.out.println("Van toc phuong tien 3: "+pt3.layVanToc());
		
}
}

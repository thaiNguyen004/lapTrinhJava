
public class test {
	public static void main(String[] args) {
		toaDo td1 = new toaDo(5, 5);
		toaDo td2 = new toaDo(7, 9);
		toaDo td3 = new toaDo(12, 1);
		
//		Shape h = new Shape(td1);
		Shape h = new point(td1);
		Shape h2 = new Circle(td2,10);
		Shape h3 = new hinhChuNhat(td3, 12, 20);
		
		System.out.println("Diện tích 1 điểm: "+h.tinhDienTich());
		System.out.println("Diện tích hình tròn: "+h2.tinhDienTich());
		System.out.println("Diện tích hình chữ nhật: "+h3.tinhDienTich());
	}
}

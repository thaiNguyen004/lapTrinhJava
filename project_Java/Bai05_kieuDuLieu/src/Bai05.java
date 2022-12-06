
/*
	Kiểu dữ liệu 
	1. Kiểu dữ liệu nguyên thủy
	a,số nguyên
	 	byte: 1 byte
	 	short: 2bytes
	 	int:  4 bytes
	 	long: 8 bytes
	b, số thực
		float: 4 bytes
		double: 8 bytes
		boolean: 1 bit (đúng/sai)
	c, kí tự
		char: 2 bytes
	
	2. Kiểu dữ liệu đối tượng
		String: chuỗi
		Array: mảng
		Double: số thực
	*/
	
public class Bai05 {
	public static void main(String[] args) {
		String tenSach ="Lap trinh Java";
		int namXuatBan=2021;
		double giaTien=15.5;
		boolean conSach=true;
		char maKho='M';
		System.out.println("Ten sach: "+tenSach);
		System.out.println("Nam: "+namXuatBan);
		System.out.println("Gia: "+giaTien);
		System.out.println("Con sach: "+conSach);
		System.out.println("Ma kho: "+maKho);
	}
}

public class test{
	public static void main(String[] args) {
		MyDate md1 = new MyDate(11,03,2004);
		MyDate md2 = new MyDate(11,03,2004);
		System.out.println("Ngay: "+md1.getNgay());
		System.out.println("Thang: "+md1.getThang());
		System.out.println("Nam: "+md1.getNam());
		md1.setNgay(32);
		System.out.println("Ngay: "+md1.getNgay());
		
		
		System.out.println(md1);
		
		int a =10;int b =10;
		System.out.println("a==b: "+md1.equals(md2));
		
		//hascode
		System.out.println("Hascode md1: "+md1.hascode());
	}
}

public class test {
	public static void main(String[] args) {
		MyDate md = new MyDate(31, 1, 2021);
		System.out.println("day: "+md.getDay());
		md.setDay(50);
		System.out.println("day: "+md.getDay());
		System.out.println("Month: "+md.getMonth());
		md.setMonth(11);
		System.out.println("Month: "+md.getMonth());
		System.out.println("Year: "+md.getYear());
		md.setYear(2004);
		System.out.println("Year: "+md.getYear());
	}
}

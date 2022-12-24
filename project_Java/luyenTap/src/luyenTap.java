
public class luyenTap {
	public static void main(String[] args) {
		String s1 = "Nguyen Thai Nguyen";
		//#1
		System.out.println("Length của s1: "+s1.length());
		
		//#2
		for (int i = 0; i < s1.length(); i++) {
			System.out.println("Kí tự "+i+": "+s1.charAt(i));
		}
		
		//#3
		char[] s1_gc = new char[20];
		s1.getChars(7, 11, s1_gc, 0);
		for (int i = 0; i < 11-7; i++) {
			System.out.print(s1_gc[i]);
		}
		
		//#4
		System.out.println();
		byte[] s1_byte = s1.getBytes();
		System.out.println("Giá trị byte ở vị trí 0: "+s1_byte[0]);
		
		
		//#5
		String s2_eq_1 = "today";
		String s2_eq_2 = "Today";
		String s2_eq_3 = "today";
		System.out.println("Có phân biệt chữ hoa chữ thường!!!");
		System.out.println("s2_eq_1 = s2_eq_2? "+s2_eq_1.equals(s2_eq_2));
		System.out.println("s2_eq_1 = s2_eq_3? "+s2_eq_1.equals(s2_eq_3));
		//#6
		System.out.println("Không phân biệt chữ hoa chữ thường!!!");
		System.out.println("s2_eq_1 = s2_eq_2? "+s2_eq_1.equalsIgnoreCase(s2_eq_2));
		System.out.println("s2_eq_1 = s2_eq_3? "+s2_eq_1.equalsIgnoreCase(s2_eq_3));
		
		//#7
		String s3_1 = "an";
		String s3_2 = "Bình";
		String s3_3 = "Nguyên";
		
		System.out.println(s3_1.compareTo(s3_2));
		System.out.println(s3_3.compareTo(s3_1));
		
		//#8 
		System.out.println(s3_1.compareToIgnoreCase(s3_2));
		System.out.println(s3_3.compareToIgnoreCase(s3_1));
		
		
		//#9 
		String s4 = "nguyenntph33935@fpt.edu.vn";
		String s4_rm = "33935";
		System.out.println("33935: "+s4.regionMatches(true,10, s4_rm, 0, 5));
		
		//#10
		System.out.println("33935: "+s4.regionMatches(false,10, s4_rm, 0, 5));
		
		//#11
		
		String s5 = "PH33935";
		String s5_1 = "PH";
		System.out.println(s5.startsWith(s5_1));
		System.out.println(s5.startsWith("PO"));
		
		//#12
		String s6 = "picture1.jpg";
		String s7 = "picture2.pdf";
		System.out.println(s6.endsWith("jpg"));
		System.out.println(s7.endsWith("jp.g"));
		
		//#13
		String s8 = "nguyenntsss004@gmail.com";
		System.out.println(s8.indexOf("gmail",16));
		
		//#14
		System.out.println(s8.lastIndexOf("com"));
		
		
		String c1 = "Thái ";
		String c2 = "Nguyên";
		
		//#15
		String c3 = c1.concat(c2);
		System.out.println(c3);
		
		//#16
		System.out.println(c1.replace("Thái", "Nguyễn Thái"));
		
		//#17
		String c4 = "Xin chào các bạn, tôi xin tự giới thiệu tôi tên là Nguyễn Thái Nguyên."
				+ " Tôi được sinh ra và lớn lên ở Phú Thọ ";
		String c5 = c4.substring(71);
		System.out.println(c5);
		
		//#18
		String c6 = c5.toLowerCase();
		String c7 = c5.toUpperCase();
		System.out.println(c6);
		System.out.println(c7);
		
	}
}

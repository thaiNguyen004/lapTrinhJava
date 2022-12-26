package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		//Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("TEST");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Trước khi chạy for: "+t1);
		System.out.println("Sau khi chạy for: "+t2);
		System.out.println("Thời gian: "+(t2-t1)+"mls");
		System.out.println("Thời gian: "+(t2-t1)/1000+"s");
		
		//TimeUnit
		System.out.println("3000 năm = "+TimeUnit.DAYS.toHours(3000*365));
		System.out.println("25h = "+TimeUnit.HOURS.toSeconds(25)+"s");
		//giaay chuyen sang ngay
		
		
		//Date
		Date d = new java.sql.Date(System.currentTimeMillis());
		System.out.println("Date d = new java.sql.Date(System.currentTimeMillis());");
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar c = Calendar.getInstance();");
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		//Tăng thêm add Trừ bớt roll
		c.add(Calendar.HOUR, 10);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 5);
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		//DateFormat
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
	}
}

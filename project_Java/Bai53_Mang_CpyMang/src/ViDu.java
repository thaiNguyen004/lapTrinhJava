import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		//Kiểu nguyên thủy
		int [] mang1 = {1,2,3};
		
		//Copy mảng
		int [] mang1_a = mang1;
		mang1_a[0]=100;
		System.out.println("Mang1: "+Arrays.toString(mang1));
		System.out.println("Mang1_a: "+Arrays.toString(mang1_a));
		
		//Copy mảng 1 dùng clone 
		int [] mang1_b = mang1.clone();
		mang1[0]=50;
		System.out.println("Mang1_b: "+Arrays.toString(mang1_b));
		
		//Copy mảng 1 dùng hàm System.arraycopy
	
		int [] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0]= 999;
		System.out.println("Mang 1_c: "+Arrays.toString(mang1_c));
		
		//Kiểu đối tượng
		String[] mang2 = {"Nguyen",".vn"};
		
		String[] mang2_a = mang2;
		mang2_a[0]="Thai Nguyen";
		System.out.println("Mang2: "+Arrays.toString(mang2));
		System.out.println("Mang2_a: "+Arrays.toString(mang2_a));
		
		String[] mang2_b = mang2.clone();
		mang2_b[1] = ".com";
		System.out.println("Mang2: "+Arrays.toString(mang2));
		System.out.println("Mang2_b: "+Arrays.toString(mang2_b));
		
		String[] mang2_c = new String[1];
		System.arraycopy(mang2, 0, mang2_c, 0, 1);
		mang2_c[0] = "Nguyen Thai Nguyen";
		System.out.println("Mang2: "+Arrays.toString(mang2));
		System.out.println("Mang2_c: "+Arrays.toString(mang2_c));
		
	}
}

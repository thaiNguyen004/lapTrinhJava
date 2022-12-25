package viDu;
import java.util.Collection;
import java.util.Arrays;


public class test {
	public static int[] reverse(int[] x)
	{
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = rs.length - 1; i >=0; i--) {
			rs[i] = x[index];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		//Hàm sắp xếp tăng dần
		
		System.out.println("a ban đầu: "+Arrays.toString(a));
//		Arrays.sort(a);
		Arrays.sort(a);
		System.out.println("a sắp xếp tăng dần: "+Arrays.toString(a));
		
		a = test.reverse(a);
		System.out.println("a sắp xếp giảm dần: "+Arrays.toString(a));
		
		
		//Hàm tìm kiem
		
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
		
		//Hàm điền giá trị
		
		Arrays.fill(b, 5);
		System.out.println("b sau khi điền giá trị: "+Arrays.toString(b));
		
	}
}

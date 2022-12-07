import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] mang1;
//		
		mang1=new float[10];
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("Nhập giá trị thứ "+i);
			mang1[i]=sc.nextFloat();
		}
		for (int i = 0; i < mang1.length; i++) {
			System.out.println("mang1["+i+"] ="+mang1[i]);
		}
		float mang2[];
		mang2=new float[] {1,2,3,4,5};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println("mang2["+i+"]: "+mang2[i]);
		}
		
	}
}

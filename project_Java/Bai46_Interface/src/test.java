
public class test {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhCasioFX570 mfx570 = new MayTinhCasioFX570();	
		
		System.out.println("5+3 = "+mfx500.cong(5, 3));
		System.out.println("4*5 = "+mfx570.nhan(4, 5));
		System.out.println("4/0 = "+mfx500.chia(4, 0));
		
		System.out.println("Test câu b");
		double[] arr = new double [] {5,4,6,3,7,2,8};
		double [] arr2 = new double[] {5,4,6,3,7,2,8};
		
		SapXepChen sxchen = new SapXepChen();
		sapXepChon sxchon = new sapXepChon();
//		sxchen.sapXepTang(arr);
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		sxchon.sapXepTang(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println("Test câu c");
		phanMemMayTinh pmmt = new phanMemMayTinh();
		System.out.println("3+5 = "+pmmt.cong(3, 5));
		double [] arr3 = new double[] {5,3,2,4,1};
		pmmt.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}

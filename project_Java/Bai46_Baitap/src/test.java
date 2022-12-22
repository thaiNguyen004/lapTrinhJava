
public class test {
	public static void main(String[] args) {
		Casio580FXPLUS casio = new Casio580FXPLUS();
		sapXepChon sapxep = new sapXepChon();
		FULl full = new FULl();
		System.out.println("100+200= "+full.cong(100, 200));
		
		double[] arr = new double[] {5,4,6,2,8,0,1};
		full.sapxepGiam(arr);
		double[] arr2 = new double[] {5,4,6,2,8,0,1};
		full.sapxepTang(arr2);
		System.out.println("Sắp xếp giảm");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Sắp xếp tăng");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}

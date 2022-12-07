public class LenhReturn {
	public static void main(String[] args) {
		System.out.println("BẢNG CỬU CHƯƠNG");
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Bảng cửu chương "+i);
			for (int j = 1; j <= 10; j++) 
			{
				if(i<5)
					return; //kết thúc một chương trình void
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("-------------");
		}
		System.out.println("Ket thuc");
	}
}

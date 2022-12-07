
public class vidu {
	public static void main(String[] args) {
		System.out.println("BẢNG CỬU CHƯƠNG");
		
		nguyen:for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Bảng cửu chương "+i);
			for (int j = 1; j <= 10; j++) 
			{
				if(i<5)
					continue nguyen;
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println("-------------");
		}
		System.out.println("Ket thuc");
	}
}

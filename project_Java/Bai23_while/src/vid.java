import java.util.Scanner;

public class vid {
	public static void main(String[] args) {
//		//Giống C
		int tong=0;
		int i=0;
		while(i<=100)
		{
			tong+=i;
			i++;
		}
		System.out.println("Tong tu 0 den 100 = "+tong);
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Vui lòng nhập n ( điều kiện n>0 ): ");
			n=sc.nextInt();
		}while(n<=0);
		
//		
		int j=0;
		while(true)
		{
			System.out.println(i);
			j++;
			if(j==10)
			{
				break;
			}
		}
	}
}

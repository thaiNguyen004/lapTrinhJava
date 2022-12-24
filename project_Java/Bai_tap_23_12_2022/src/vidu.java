import java.util.Scanner;

public class vidu {
	int hang;
	int cot;
	int [][] matrix = new int[100][100];
	public vidu(int hang, int cot) {
		super();
		this.hang = hang;
		this.cot = cot;
	}
	Scanner sc = new Scanner(System.in);
	public void nhapMaTran()
	{
		for (int i = 0; i <= this.hang ; i++) {
			for (int j = 0; j <= this.cot; j++) {
				System.out.print("matrix["+i+"] ["+j+"]");
				this.matrix[i][j] = sc.nextInt();
				
			}
		}
	}
	public void xuatMaTran()
	{
		for (int i = 0; i <= this.hang; i++) {
			for (int j = 0; j <= this.cot; j++) {
				System.out.println("matrix["+i+"] ["+j+"] = "+this.matrix[i][j]);
			}
		}
	}
//	public void doiViTri()
//	{
//		int matrix_1[][] = this.matrix;
//			for (int j = 0; j <= this.cot; j++) {
//					int temp;
//					temp = matrix_1[0][j].clone();
//					this.matrix[0][j] = this.matrix[1][j];
//					this.matrix[1][j] = temp;
//			}
//	}
	public void hangCoNhieuSNT()
	{
		int max = 0;
		
		for (int i = 0; i <= this.hang ; i++) {
			for (int j = 0; j <= this.cot; j++) {
				int soLuongSNT = 0;
				for (int j2 = 2; j2 < this.matrix[i][j]; j2++) {
					int count = 1;
					if(this.matrix[i][j]%j2==0)
					{
						count = 0;
						break;
					}
					if(count ==1) {
						soLuongSNT++;
					}
					
				}
				if(max<soLuongSNT) {
					max = i;
				}
			}
		}
		System.out.println("Hang co SNT nhieu nhat: "+max);
	}
	
}

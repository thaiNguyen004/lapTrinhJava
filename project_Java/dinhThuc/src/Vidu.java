import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		
		mod mod = new mod();
		Scanner sc = new Scanner(System.in);
		int numColumns = 3;
		int[][] transpose = new int[4][4];
		for (int i = 0; i < numColumns ; i++) 
		{
			
			for (int j = 0; j < numColumns; j++) 
			{ 
				System.out.print("x["+i+"]["+j+"]: ");
				transpose[i][j] = sc.nextInt();
			}
		}
		
		int vitri_dautien_cua_mang = 0;
		int tong_1 = 0;
		for (int i = 0; i < 3; i++) {
			int nhan_tam = 1;
			for (int j = 0; j < 3; j++) {
				nhan_tam*=transpose[mod.mods(vitri_dautien_cua_mang+j, numColumns)][mod.mods(i+j, numColumns)];
			}
			tong_1+=nhan_tam;
		}
		
		int tong_2 = 0;
		for (int i = 0; i < 3; i++) {
			int nhan_tam = 1;
			for (int j = 0; j < 3; j++) {
				nhan_tam*=transpose[mod.mods(vitri_dautien_cua_mang+j, numColumns)][mod.mods(i-j, numColumns)];
			}
			tong_2+=nhan_tam;
		}
		
		int det = tong_1 - tong_2;
		System.out.println("det = "+det);
	}
}

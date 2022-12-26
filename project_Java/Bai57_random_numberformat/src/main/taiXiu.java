package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi sẽ có quyền đặt cược số tiền
 * ít hơn số tiền mình đang có.
 * 
 * Luật chơi:
 * Có 3 viên súc sắc. Mỗi viên súc sắc có 6 mặt có giá trị từ 1 - 6
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + xx2 + xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua
 * 2. Nếu tổng = (4-10)    => xỉu => nếu người chơi đặt xỉu win ngược lại losed
 * 2. Nếu tổng = (11-17)   => tài => nếu người chơi đặt tài win ngược lại losed */
public class taiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("en","US");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		int luaChon = 1;
		do
		{
			System.out.println("-----------Mời bạn lựa chọn------------");
			System.out.println("Chọn (1) để tiếp tục chơi.");
			System.out.println("Chọn phím (bất kỳ) để thoát.");
			luaChon = sc.nextInt();
			if(luaChon == 1)
			{
				
				//Đặt cược
				System.out.println("-----------Bắt đầu chơi------------");
				System.out.println("Tài khoản của bạn: "+numf.format(taiKhoanNguoiChoi)+"  bạn muốn cược bao nhiêu? ");
				double datCuoc;
				do {
					System.out.println("Đặt cược (0< số tiền <"+numf.format(taiKhoanNguoiChoi)+")");
					datCuoc = sc.nextDouble();
				}while(datCuoc <=0 || datCuoc>taiKhoanNguoiChoi);
				int luaChonTaiXiu = 0;
				do {
					System.out.println("Chọn 1 <-> Tài hoặc 2 <-> Xỉu");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu!=1 && luaChonTaiXiu!=2);
				
				//Tung súc sắc
				Random xucsac1 = new Random();
				Random xucsac2 = new Random();
				Random xucsac3 = new Random();
				
				int giatri_1 = xucsac1.nextInt(5)+1;
				int giatri_2 = xucsac2.nextInt(5)+1;
				int giatri_3 = xucsac3.nextInt(5)+1;
				int tong = giatri_1+giatri_2+giatri_3;
				//Tính toán kết quả
				System.out.println("Kết quả: "+giatri_1+" - "+giatri_2+" - "+giatri_3);
				if(tong==3||tong==18)
				{
					System.out.println("Tổng là: "+tong+" => Bạn đã thua");
					taiKhoanNguoiChoi-=datCuoc;
					System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
				}else if(tong>=4 && tong<=10)
				{
					System.out.println("Tổng là: "+tong+" => Xỉu");
					if(luaChon == 2)
					{
						System.out.println("Bạn đã thắng cược");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
					}else
					{
						System.out.println("Bạn đã thua cược");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
					}
				}else
				{
					System.out.println("Tổng là: "+tong+" => Tài");
					if(luaChon == 1)
					{
						System.out.println("Bạn đã thắng cược");
						taiKhoanNguoiChoi+=datCuoc;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
					}else
					{
						System.out.println("Bạn đã thua cược");
						taiKhoanNguoiChoi-=datCuoc;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi));
					}
				}
			}
		}while(luaChon==1);
	}
}

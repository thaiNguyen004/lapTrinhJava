package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	public RutThamTrungThuong_HashSet() {
		
	}
	public boolean themPhieuDuThuong(String giaTri)
	{
		return this.thungPhieuDuThuong.add(giaTri);
	}
	public boolean xoaPhieu(String giaTri)
	{
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	public boolean kiemTraPhieuTonTai(String giaTri)
	{
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	public void xoaTatCaPhieuDuThuong()
	{
		this.thungPhieuDuThuong.clear();
	}
	public int laySoLuong()
	{
		return this.thungPhieuDuThuong.size();
	}
	public String rutThamTrungThuong()
	{
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua =  (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	public void inTatCa()
	{
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	public static void main(String[] args) {
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do
		{
			System.out.println("-----------------");
			System.out.println("MENU");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2. Xóa đi một mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại không");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng");
			System.out.println("5. Kiểm tra số phiếu");
			System.out.println("6. Rút thăm trúng thưởng");
			System.out.println("7. In ra tất cả các phiếu");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1 || luaChon == 2 || luaChon ==3)
 			{
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				if(luaChon ==1)
				{
					rt.themPhieuDuThuong(giaTri);
				}
				else if(luaChon == 2)
				{
					rt.xoaPhieu(giaTri);
				}else
				{
					System.out.println("Tồn tại: "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luaChon == 4)
			{
				rt.xoaTatCaPhieuDuThuong();
			}else if(luaChon ==5)
			{
				System.out.println("Số phiếu: "+rt.laySoLuong());
			}else if(luaChon == 6)
			{
				System.out.println("Mã số trúng thưởng: "+rt.rutThamTrungThuong());
				
			}else if(luaChon == 7) {
				System.out.println("Các mã phiếu dự thưởng là: ");
				rt.inTatCa();
			}
		}while(luaChon!=0);
	}
	
}

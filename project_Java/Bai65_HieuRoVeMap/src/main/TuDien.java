package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> data = new TreeMap<>(); 
//	private Map<String , String> data = new HashMap<>(); 
	
	public String themTu(String tuKhoa, String yNghia)
	{
		return this.data.put(tuKhoa, yNghia);
	}
	public String xoaTu(String tuKhoa)
	{
		return this.data.remove(tuKhoa);
	}
	public String traTu(String tuKhoa)
	{
		String yNghia = this.data.get(tuKhoa);
		return yNghia;
	}
	
	public void inTuKhoa()
	{
		Set<String> tatCaTuKhoa = this.data.keySet();
		System.out.println(Arrays.toString(tatCaTuKhoa.toArray()));
	}
	public int laySoLuong()
	{
		return this.data.size();
	}
	
	public void xoaTatCa()
	{
		this.data.clear();
	}
	public static void main(String[] args) {
		TuDien td = new TuDien();
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		do
		{
			System.out.println("------------------------");
			System.out.println("Menu");
			System.out.println("Tra Từ điển Anh - Việt\n"
					+ "1. Thêm từ (Từ Khóa, Ý Nghĩa) \n"
					+ "2. Xóa Từ\n"
					+ "3. Tìm ý nghĩa của từ khóa - Tra từ\n"
					+ "4. In ra danh sách từ khóa\n"
					+ "5. In ra số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "0. Thoát\n");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1)
			{
				System.out.println("Nhập từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập ý nghĩa: ");
				String yNghia = sc.nextLine();
				td.themTu(tuKhoa, yNghia);
			}else if(luaChon == 2 || luaChon == 3)
			{
				String tuKhoa = sc.nextLine();
				if(luaChon == 2)
				{
					td.xoaTu(tuKhoa);
				}else 
				{
					System.out.println("Ý Nghĩa: "+tuKhoa);
				}
			}else if(luaChon == 4)
			{
				td.inTuKhoa();
			}else if(luaChon == 5)
			{
				System.out.println("Số lượng từ khóa: "+td.laySoLuong());
			}else if(luaChon == 6)
			{
				td.xoaTatCa();
			}
		}while(luaChon!=0);
	}
}

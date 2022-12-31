package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<>();
		
		//stackChuoi.push("giatri"); => đưa giá trị vào
		//stackChuoi.pop() = > lấy giá trị ra, xóa khỏi stack luôn
		
		//stackChuoi.peek() => lấy giá trị ra nhưng không xóa
		//stackChuoi.clear() => xóa tất cả các phần tử trong stack
		//stackChuoi.contains("giatri") => xác định giá trị có tồn tại trong stack không
		//stackChuoi.size() => lây ra độ dài stack
		
		//Ví dụ đảo ngược chuỗi
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		//TITV
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
		System.out.println("Nhập vào kí tự : ");
		String kitu = sc.nextLine();
		System.out.println(stackChuoi.contains(kitu));
		
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		
		
		//
		Stack<Integer> stackSoDu = new Stack<>();
		System.out.println("\nNhập 1 số nguyên dương: ");
		int x = sc.nextInt();
		while(x>0)
		{
			int soDu = x%2;
			System.out.println(soDu);
			stackSoDu.push(soDu);
			x/=2;
		}
		int n = stackSoDu.size();
		for (int i = 0; i < n ; i++) {
			System.out.print(stackSoDu.pop());
		}
		System.out.printf("số %d",3);
		
	}
	
}

package main;

import java.util.ArrayDeque;
public class Deque {
	public static void main(String[] args) {
		java.util.Deque<String> danhSach = new ArrayDeque<String>();
		
		danhSach.offer("Nguyên 1");
		danhSach.offerLast("Nguyên 4");
		danhSach.offer("Nguyên 2");
		danhSach.offer("Nguyên 3");
		danhSach.offerFirst("Nguyên 0");
		
		while(true)
		{
			String ten = danhSach.pollLast();
			if(ten == null)
				break;
			System.out.println(ten);
		}
		
	}
}

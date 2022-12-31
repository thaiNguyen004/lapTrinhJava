package main;

import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
		java.util.Queue<String> danhSach = new LinkedList<String>();
		danhSach.offer("Nguyên 1");
		danhSach.offer("Nguyên 2");
		danhSach.offer("Nguyên 3");
		while(true)
		{
			String ten = danhSach.poll();
			//peek không xóa
			if(ten == null)
			break;
			System.out.println(ten);
			
		}
		
	}
	
}

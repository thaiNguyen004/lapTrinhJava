package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
	public static void main(String[] args) {
		Queue<String> danhSachUuTien = new PriorityQueue<String>();
		danhSachUuTien.offer("Nguyễn Văn B");
		danhSachUuTien.offer("Nguyễn Văn F");
		danhSachUuTien.offer("Nguyễn Văn A");
		while(true)
		{
			String ten = danhSachUuTien.poll();
			if(ten == null)
				break;
			System.out.println(ten);
		}
	}
}

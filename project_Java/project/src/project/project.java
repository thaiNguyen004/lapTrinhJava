package project;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner vidu = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số nguyên n: ");
		n = vidu.nextInt();
		System.out.println("Các giá trị lẻ từ 1-n: ");
		for (int i = 1; i <= n; i++) 
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("Có "+count+" số chẵn từ 0-n");
	}
}

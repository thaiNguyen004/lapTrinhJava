package main;

import java.io.PrintWriter;

public class ViduGhiText {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("N:\\Github\\lapTrinhJava\\project_Java\\Bai71_GhiText\\file.txt", "UTF-8");
			pw.println("Xin chào mình là Nguyên");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(" ");
			pw.print(" là số PI");
			pw.println();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

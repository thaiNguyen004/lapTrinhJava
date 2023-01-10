package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViduDocText {
	public static void main(String[] args) {
		//Cách 1
//		File f = new File("N:\\Github\\lapTrinhJava\\project_Java\\Bai72_docFile\\file.txt");
//		try {
//			BufferedReader bf = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//			String line = null;
//			while(true)
//			{
//				line = bf.readLine();
//				if(line==null)
//				{
//					break;
//				}else {
//					System.out.println(line);
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		//Cách 2
		File f2 = new File("N:\\\\Github\\\\lapTrinhJava\\\\project_Java\\\\Bai72_docFile\\\\file.txt");
		try {
			List<String> allTextInFile = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for(String line : allTextInFile )
			{
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
				
	}
}

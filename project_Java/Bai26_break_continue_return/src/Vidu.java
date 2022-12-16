
public class Vidu {
public static void main(String[] args) {
	//Trường hợp không sử dụng label
	
//		int out, in=0;
//		for (out = 0; out < 10; out++) 
//		{
//			for (in = 0; in< 10; in++) 
//			{
//				if(in==5)
//				{
//					break;
//				}
//			}
//			System.out.println("out = "+out+"in = "+in);
//		}
//		System.out.println("out = "+out+"in = "+in);
//	
	
	//Trường hợp có sử dụng label
//	int out, in=0;
//	outer: for (out = 0; out < 10; out++) 
//	{
//		for (in = 0; in< 10; in++) 
//		{
//			if(in==5)
//			{
//				break outer;
//			}
//		}
//		System.out.println("out = "+out+"in = "+in);
//	}
//	System.out.println("out = "+out+"in = "+in);
	
	
	
//	//Continue
//	//Trường hợp không sử dụng label
//	
//	int max=100;
//	for (int i = 0; i < max; i++) {
//		if(i<50)
//		continue;//continue sẽ bỏ qua các câu lệnh bên dưới 
//		//và tiếp tục vòng for
//		System.out.println(i);
//	}
	
	//Continue
		//Trường hợp có sử dụng label
	/**
	 * continue sẽ bỏ qua các câu lệnh ở bên dưới cùng  cấp và đi
	 * đến vị trí label 
	 */
	loop: for (int j = 0; j < 10; j++) 
	{
		int max=100;
		for (int i = 0; i < max; i++)
		{
			if(i<50)
			continue loop;
			System.out.println(i);
		}
		System.out.println("ab");
	}
	System.out.println("Kết thúc");
	
	
}
}

package Code;

public class Sub_Info extends Info {
	public void method()
	{
//		super.a => Không truy cập được
		super.b = 2; //Truy cập được vì chung 1 gói
		super.c = 3;
		super.d = 4;
		
		
	}
}

package Code;

public class vidu {
	private Info infor;
	public void method()
	{
//		this.infor.a KHÔNG TRUY XUẤT ĐƯỢC
		this.infor.b = 2;
		this.infor.c = 3;
		this.infor.d = 4;
	}
}
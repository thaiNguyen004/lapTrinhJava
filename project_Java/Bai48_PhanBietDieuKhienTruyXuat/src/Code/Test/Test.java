package Code.Test;

import Code.Info;

public class Test {
	private Info infor;
	public void method()
	{
//		this.infor.a => Không truy cập được
//		this.infor.b => Không cùng 1 package nên không truy cập được
//		this.infor.c 
		this.infor.d = 4;
	}
}

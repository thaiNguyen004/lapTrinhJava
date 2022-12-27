package Test;

public enum Month {
	Jenuary(31),
	February(29),
	Match(31),
	April(30),
	May(31),
	June(30),
	July(31),
	Augest(31),
	September(30),
	November(31),
	Octorber(30),
	December(31);
	private final int soNgay;
	Month(int soNgay)
	{
		this.soNgay = soNgay;
	}
	public int soNgay()
	{
		return soNgay;
	}
}

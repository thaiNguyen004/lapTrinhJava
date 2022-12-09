public class MyDate{
	//1
	private int ngay;
	private int thang;
	private int nam;
	//2 contructor
	public MyDate(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	//1 get and set
	//2 toString
	//3 equals and hascode
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		if(ngay>=1&&ngay<=31)
		{
			this.ngay = ngay;
		}
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		if(thang>=1&&thang<=12)
		{
			this.thang = thang;
		}
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		if(nam>=1)
		{
			this.nam = nam;
		}
	}
	
	@Override
	public String toString() 
	{
		return this.ngay+" / "+this.thang+" / "+this.nam;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if(this.ngay!=other.ngay)
			return false;
		if(this.thang!=other.thang)
			return false;
		if(this.nam!=other.nam)
			return false;
		return true;
	}
	
	//hascode
	
	public int hascode()
	{
		final int a=31;
		int b = 1;
		b= a*b+this.ngay;
		b= a*b+this.thang;
		b= a*b+this.nam;
		return b;
	}
	
	
	
	
	
}
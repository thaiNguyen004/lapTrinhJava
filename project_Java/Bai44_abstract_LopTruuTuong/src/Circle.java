
public class Circle extends Shape{

	private double r;
	public Circle(toaDo toado) {
		super(toado);
		// TODO Auto-generated constructor stub
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle(toaDo toado, double r) {
		super(toado);
		this.r = r;
	}
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r;
	}
	
}


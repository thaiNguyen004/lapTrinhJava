
public abstract class Shape {
	protected toaDo toado;

	public Shape(toaDo toado) {
		this.toado = toado;
	}

	public toaDo getToado() {
		return toado;
	}

	public void setToado(toaDo toado) {
		this.toado = toado;
	}
	public abstract double tinhDienTich();
	
}


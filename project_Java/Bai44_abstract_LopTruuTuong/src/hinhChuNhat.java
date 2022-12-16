
public class hinhChuNhat extends Shape{
	private double chieuRong, chieuCao;

	public hinhChuNhat(toaDo toado, double chieuRong, double chieuCao) {
		super(toado);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuRong*this.chieuCao;
	}
	
	
	
}

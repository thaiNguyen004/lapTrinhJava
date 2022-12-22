
public class phanMemMayTinh implements MayTinhBoTuiInterface,SapxepInterface{

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	//--------------------------------------
	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
				int n = arr.length;
				int i, j, min_idx;
				for (i = 0; i < n - 1; i++) {
					min_idx = i;
					for (j = i + 1; j < n; j++)
						if (arr[j] < arr[min_idx])
							min_idx = j;
					double temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i] = temp;
				}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
				int n = arr.length;
				int i, j, min_idx;
				for (i = 0; i < n - 1; i++) {
					min_idx = i;
					for (j = i + 1; j < n; j++)
						if (arr[j] < arr[min_idx])
							min_idx = j;
					double temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i] = temp;
				}
	}
	
}

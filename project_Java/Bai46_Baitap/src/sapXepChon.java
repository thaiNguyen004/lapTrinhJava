
public class sapXepChon implements sapXep{

	@Override
	public void sapxepTang(double[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[i])
				{
					double temp;
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}

	@Override
	public void sapxepGiam(double[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i])
				{
					double temp;
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
}

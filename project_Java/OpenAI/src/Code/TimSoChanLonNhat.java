package Code;

public class TimSoChanLonNhat {
	
	int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	public TimSoChanLonNhat() {
		// TODO Auto-generated constructor stub
		
	}

	public int timSoChanLonNhat()
	{
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        if (array[i][j] % 2 == 0 && array[i][j] > max) {
		            max = array[i][j];
		        }
		    }
		}
		return max;
	}
}

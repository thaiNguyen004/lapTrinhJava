
public class dinhThuc {
	public dinhThuc()
	{}
	public static double determinant3x3(double[][] matrix) {
	    double result = 0;
	    
	    result += matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
	    result -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
	    result += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
	    
	    return result;
	}

}

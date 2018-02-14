public class PascalsTriangle {
	private int rows;
	public PascalsTriangle(int rows) {
		this.rows = rows;
	}
	public int getElement(int n, int k) {
		int nCk;
		n--;
		k--;
		
		if (n<0 || k<0) {
			try {
				throw new TriangleException("The number of rows or columns must be at least 1.");
			} catch (TriangleException e) {
				e.printStackTrace();
			}
			return -1;
		}
		
		if (k>n) {
			try {
				throw new TriangleException("The number of columns cannot exceed the number of rows.");
			} catch (TriangleException e) {
				e.printStackTrace();
			}
			return -1;
		}
		
		nCk = factorial(n)/(factorial(k)*factorial(n-k));
		return nCk;
	}
	
	public int factorial(int number) {
		int value = 1;
		int factorial = 1;
		if (number>=0) {
			for(int i=1;i<=number;i++) {
				factorial = factorial*i;
				if (i==number) {
					value = factorial;
				}
			}
		} else {
			try {
				throw new TriangleException("No negative numbers.");
			} catch (TriangleException e) {
				e.printStackTrace();
			}
		}
		return value;
	}
	
	public String showTriangle() {
		String triangle = "";
		for (int n = 0; n <= rows; n++) {
			for(int j=0;j<=rows-n;j++) {
	             triangle += " ";
	         }
	           for (int k = 1; k <= n; k++) {
	        	   triangle += getElement(n, k) + " ";
	           }
	           triangle += "\n";
	       }
		return triangle;
	}
}

public class Multi {

    public static void main (String[] argv) 
    {
	// Initialization
	int[][] A = {
	    {12, 1, 14, 7},
	    {13, 8, 11, 2},
	    {3, 10, 5, 16},
	    {6, 15, 4, 9}
	};

	rowMax (A);
	columnMax (A);
	diagonalMax (A);
    }

    static void rowMax (int[][] A)
    {
	for (int i=0; i < A.length; i++) {
	    int[] temp = new int [A[i].length];
	    for (int j=0; j < A[i].length; j++) {
		temp[j] = A[i][j];
	    }
	    int max = computeMax (temp);
	    System.out.println ("Max in row " + i + " = " + max);
	}
    }

    static void columnMax (int[][] A)
    {
	for (int i=0; i < A[0].length; i++) {
	    int[] temp = new int [A.length];
	    for (int j=0; j < A.length; j++) {
		temp[j] = A[j][i];
	    }
	    int max = computeMax (temp);
	    System.out.println ("Max in column " + i + " = " + max);
	}
    }

    static void diagonalMax (int[][] A)
    {
	int[] temp = new int [A.length];
	for (int i=0; i < A.length; i++) {
	    temp[i] = A[i][i];
	}
	int max = computeMax (temp);
	System.out.println ("Max accross diagonla #1: " + max);

	temp = new int [A.length];
	for (int i=0; i < A.length; i++) {
	    temp[i] = A[i][A[0].length-1-i];
	}
	max = computeMax (temp);
	System.out.println ("Max accross diagonla #2: " + max);


    } 

    static int computeMax (int[] temp)
    {
	int max = temp[0];

	for (int i=1; i < temp.length; i++) {
	    if (temp[i] > max) {
		max = temp[i];
	    }
	}
	
	return max;
    }

}

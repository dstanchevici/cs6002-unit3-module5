import java.util.*;

public class JoinThenSort {

    public static void main (String[] argv)
    {
	int[] dataSet1 = {1, 3, 5, 7, 9};
	int[] dataSet2 = {0, 2, 4, 6, 8, 10, 12};
	int[] biggerSet = concatenate (dataSet1, dataSet2);
	System.out.println (Arrays.toString(biggerSet));
	// biggerSet now has {1,3,5,7,9,0,2,4,6,8,10,12}
	sort (biggerSet);
	System.out.println (Arrays.toString(biggerSet));
    }

    static int[] concatenate (int[] A, int[] B)
    {
	int[] C = new int [A.length+B.length];
	int cInd = 0;
	for (int i=0; i < A.length; i++) {
	    C[cInd++] = A[i];
	}

	for (int i=0; i < B.length; i++) {
	    C[cInd++] = B[i];
	}
	return C;
    }

    static void sort (int[] A)
    {
	// Selection sort
	for (int i=0; i < A.length-1; i++) {
	    int indOfMin = i;
	    for (int j=i+1; j < A.length; j++) {
		if (A[j] < A[indOfMin]) {
		    indOfMin = j;
		}
	    }
	    int temp = A[i];
	    A[i] = A[indOfMin];
	    A[indOfMin] = temp;
	}
    }

}

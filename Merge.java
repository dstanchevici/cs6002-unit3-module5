import java.util.*;

public class Merge {

    public static void main (String[] argv)
    {
	int[] A = {1, 3, 5, 7, 9};
	int[] B = {0, 2, 4, 6, 8};
	System.out.println (Arrays.toString(merge(A,B)));

	int[] A2 = {1, 3, 5, 7, 9};
	int[] B2 = {0, 2, 4, 6, 8, 10, 12};
	System.out.println (Arrays.toString(merge(A2,B2)));
    }

    static int[] merge (int[] A, int[] B)
    {
	int aInd = 0;
	int bInd = 0;

	int[] C = new int [A.length+B.length];
	for (int i=0; i < C.length; i++) {
	    if (aInd >= A.length) {
		if (bInd >= B.length) {
		    break;
		}
		else {
		    C[i] = B[bInd++];
		}
	    }
	    else if (bInd >= B.length) {
		if (aInd >= A.length) {
		    break;
		}
		else {
		    C[i] = A[aInd++];
		}
	    }
	    else {
		if (A[aInd] < B[bInd]) {
		    C[i] = A[aInd++];
		}
		else {
		    C[i] = B[bInd++];
		}
	    }	

	} // end-of-for

	return C;
    }

}

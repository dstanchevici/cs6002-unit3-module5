import java.util.*;

public class DuplicateRemoval {

    public static void main (String[] argv)
    {
	int[] A = {3, 2, 1, 1, 3, 1, 2, 4, 5, 4, 6, 2, 2};
	int[] B = removeDuplicates (A);
	System.out.println (Arrays.toString(B));
    }

    static int[] removeDuplicates (int[] A)
    {
	ArrayList<Integer> C = new ArrayList<> ();

	for (int i=0; i < A.length - 1; i++) {
	    for (int j=i+1; j < A.length; j++) {
		if ( (A[i] == A[j]) && (!C.contains(A[i])) ) {
		    C.add (A[i]);
		    break;
		} 
	    }
	}

	int[] B = new int [C.size()];
	int bInd = 0;
	for (int element: C) {
	    B[bInd++] = element;
	}

	return B;
       
    } // end-removeDuplicates

} // end-DuplicateRemoval

import java.util.*;

public class MergeRange {
    public static void main (String[] argv)
    {
	// Test #1:
	int[] A = {1, 3, 5, 7, 2, 4, 8, 10};
	mergeRange (A, 1, 4, 5);
	System.out.println (Arrays.toString(A));

	// Test #2:
	int[] A2 = {1, 3, 2, 4};
	mergeRange (A2, 0, 2, 3);
	System.out.println (Arrays.toString(A2));

	// Test #3:
	int[] A3 = {1, 2, 5, 7, 9, 4, 6, 8, 10}; 
	mergeRange (A3, 2, 5, 7);
	System.out.println (Arrays.toString(A3));

    }
    
    static void mergeRange (int[] data, int L, int R, int E)
    {
	// 1. Create the merge space:
	int[] mergeSpace = new int [E-L+1];

	// 2. Use two cursors, one for the left side subarray, and
	//    the other for the right side subarray.
	int leftCursor = L;
	int rightCursor = R;

	// 3. Fill the merge space by one by one, selecting from the 
	//    correct subarray
	for (int i=0; i < mergeSpace.length; i++) {


	    // If the leftCursor is past its limit, merge from the right:
	    if (leftCursor >= R) {
		if (rightCursor <= E) {
		    mergeSpace[i] = data[rightCursor++];
		}
	    }
	    else if (rightCursor > E) {
		//If right side is past its limit, merge only from left: 
		if (leftCursor < R) {
		    mergeSpace[i] = data[leftCursor++];
		}
	    }
	    else if (data[leftCursor] <= data[rightCursor]) {
		// Otherwise, if the leftCursor element is less, move it: 
		mergeSpace[i] = data[leftCursor++];
	    }
	    else {
		// Move from right: 
		mergeSpace[i] = data[rightCursor++];
	    }
	}
 
	// 4. Copy back into original array: 
	for (int i=0; i < mergeSpace.length; i++)
	    data[L+i] = mergeSpace[i];
    }

}

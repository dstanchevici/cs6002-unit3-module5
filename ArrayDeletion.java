
import java.util.*;

public class ArrayDeletion {

    public static void main (String[] argv)
    {
	// Some data:
	int[] A = {1, 3, 5, 7, 9, 11};

	// Remove the element at position 1.
	int k = 1;
	int[] B = remove (A, k);
	System.out.print ( Arrays.toString(B) );
    }

    static int[] remove (int[] B, int k)
    {
	int[] C = new int [B.length-1];
	int cInd = 0;
	for (int element: B) {
	    if ( element != k) {
		C[cInd++] = element;
	    }
	}
	return C;
    }

}

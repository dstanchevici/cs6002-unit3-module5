// Unit 3, module 5

import java.util.*;

public class FunctionExample2 {

    public static void main (String[] argv)
    {
	int[] X = {1, 2, 3};
	int[] Y = {4, 5, 6};
	int[] Z = sum (sum(X,Y), Y);
	String s = Arrays.toString (Z);
	System.out.println (s);

	System.out.println (Arrays.toString(sum(sum(X,Y),Y)));
    }

    static int[] sum (int[] A, int[] B)
    {
	int[] Z = new int [A.length + B.length];
	int zInd = 0;

	for (int i=0; i < A.length; i++) {
	    Z[zInd++] = A[i];
	}

	for (int i=0; i < B.length; i++) {
	    Z[zInd++] = B[i];
	}

	return Z;

    }

}

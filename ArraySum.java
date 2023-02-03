
public class ArraySum {

    public static void main (String[] argv)
    {
	// Some data:
	int[] A = {1, 3, 5, 7, 9, 11};
	
	int sum = 0;

	for (int element: A) {
	    sum += element;
	}

	System.out.println ("sum=" + sum);
    }

}


public class MyFunctionExample {

    public static void main (String[] argv)
    {
	// A telestich
	String[] lines = {
	    "Stands so high",
	    "Huge hooves too",
	    "Waits for",
	    "Harness and reins",
	    "Eager to leave"
	};

	// Extract the last letter of each string and join those letters.
	System.out.println ("Telestich: " + lastLetters(lines));
    }

    static String lastLetters (String[] lines)
    {
	String s = "";

	for (int i=0; i < lines.length; i++) {
	    s += lines[i].charAt (lines[i].length()-1);
	}

	return s;
    }


}

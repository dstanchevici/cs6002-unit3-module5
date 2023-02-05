// Unit 3, Module 5

public class FunctionExample {

    public static void main (String[] argv)
    {
	int x=1, y=2;

	int w = add (incr(x), incr(y));
	System.out.println (w);
	System.out.println ("-------------");

	int z = add(incr(add(incr(x),y)),incr(x));
	System.out.println (z);
	System.out.println ("-------------");

	System.out.println (incr(incr(incr(x))));
	System.out.println ("-------------");
    }

    static int incr (int a){
	System.out.println ("incr(" + a + ")=" + (a+1));
	return a+1;
    }

    static int add (int a, int b)
    {
	System.out.println ("add(" + a + "," + b + ")=" + (a+b));
	return a+b;
    }

}

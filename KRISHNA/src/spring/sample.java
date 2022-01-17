
public class sample 
{
	int i = 10;				// Instance Variable
	static int j = 20;		// Static Variable
	public static void main(String[] args) 
	{
		int l = 30;			// Local Variable
		System.out.println(l);
		
		sample h  = new sample();
		System.out.println(h.i);
		System.out.println(j);
		
	}
}

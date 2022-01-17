class add 
{
	public static void main(String[] args) 
	{
		int i = 10;   // Local Variables 
		int j = 20;  
		System.out.println(i+j);
	}

}

class add2
{
	int k = 10;	// Static Variables
	int l = 29;

	public static void main(String[] args) 
	{
		add2 a = new add2();
		System.out.println(a.k+a.l);
	}
}


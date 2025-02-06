class WideningShort 
{
	public static void main(String[] args) 
	{
		// byte<short<int<long<float<double
	//             char
        short a = 96;
	
		System.out.println(a);
		int b = a;
		System.out.println(b);
		//char c = a;   - possible lossy conversion
		long c = a;
		System.out.println(c);
		float d = a;
		System.out.println(d);
		double f = a;
		System.out.println(f);
	}
}

class WideningInt 
{
	public static void main(String[] args) 
	{
		// byte<short<int<long<float<double
	//             char
        
		int b = 50;
		System.out.println(b);
		//char c = b;   - possible lossy conversion
		long c = b;
		System.out.println(c);
		float d = b;
		System.out.println(d);
		double f = b;
		System.out.println(f);
	}
}

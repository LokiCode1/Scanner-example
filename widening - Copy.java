class WideningByte 
{
	// byte<short<int<long<float<double
	//             char
	public static void main(String[] args) 
	{
		byte a = 10;
		
		System.out.println(a);
		int b = a;
		System.out.println(b);
		short c = a;
		System.out.println(c);
		long l = a;
		System.out.println(l);
		//char e = a;    - possible lossy conversion
		float e = a;
		System.out.println(e);
		double f = a;
		System.out.println(f);
	}
}

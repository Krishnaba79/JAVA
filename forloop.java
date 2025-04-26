class ForLoop
{
	public static void main(String[] args)
	{ 
		char[] vowels={'a','e','i','o','u'};
		//for(int i=0;i<vowels.length;++i)
		for(char item:vowels)
		{
			System.out.println(vowels[item]);
		}
	}
}
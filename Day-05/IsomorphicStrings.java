// Isomorphic Strings: Two strings are isomorphic if each character in the first string maps to exactly one unique character in the second string, maintaining the same pattern.

//Example: "paper" and "title" : true

class IsomorphicStrings
 {
    public static void main(String[] args) 
	{
		String s1="paper";
		String s2="title";

		if(s1.length() != s2.length())
		{
			System.out.println(false);
			return;
		}

		int[] map1 = new int[256];
		int[] map2 = new int[256];

		for(int i = 0; i < s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if(map1[c1] != map2[c2])
			{
				System.out.println(false);
				return;
			}

			map1[c1]=i+1;
			map2[c2]=i+1;
		}

		System.out.println(true);
	}
}

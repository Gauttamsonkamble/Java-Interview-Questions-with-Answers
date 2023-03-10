package com.developercorners.string;

// Count the character in string 

public class CharacterCount {

	public static void main(String[] args) {
		
		String name = "Gauttam";
		
		int count = 0;
		
		char ch[] = name.toCharArray();
		
		for( int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		
		System.out.println("Character Count = "+count);
		

	}

}

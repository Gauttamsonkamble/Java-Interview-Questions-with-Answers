package com.developercorners.string;

public class FindVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gauttam";
		
		int VowelsCount = 0;
		
		char ch[] = name.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				VowelsCount++;
				System.out.println(ch[i]);
			}
		}
		
		System.out.println("Vowels Count = "+VowelsCount);
	}

}

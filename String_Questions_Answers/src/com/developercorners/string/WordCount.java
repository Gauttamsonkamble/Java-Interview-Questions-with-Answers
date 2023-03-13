package com.developercorners.string;

//Count the words in String 
public class WordCount {

	public static void main(String[] args) {
		
		String str = "Hi my name is Gauttam";
		
		int count = 1;
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		
		System.out.println("Word Count = "+count);
	}

}

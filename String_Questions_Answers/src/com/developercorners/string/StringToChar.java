package com.developercorners.string;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gauttam";
		System.out.println(name);
		
		char ch[] = name.toCharArray();
		
		//for each loop
		for(char c: ch)
		{
			System.out.println(c);
		}
		
		//simple for loop
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}

	}

}

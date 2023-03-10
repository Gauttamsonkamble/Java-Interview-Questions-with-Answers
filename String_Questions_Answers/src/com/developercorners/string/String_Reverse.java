package com.developercorners.string;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Gauttam";
		
		String str = "";
		
		for(int i= name.length()-1;i>=0;i--)
		{
			str = str + name.charAt(i);
			
		}
		
		System.out.println(str);
	}

}

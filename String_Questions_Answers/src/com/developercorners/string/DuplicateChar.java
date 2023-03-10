package com.developercorners.string;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Gauttam";
		
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(j));
				}
			}
		}

	}

}

package com.developercorners.string;

public class CountDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gauttam";
		
		int count = 0;
		
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1; j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count++;
					System.out.println(name.charAt(j));
				}
			}
		}
		
		System.out.println(count);

	}

}

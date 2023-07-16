package com.developerCorners.interviewQuestions;

public class ReverseString {
	
	public static void main(String args[])
	{
		//1 . Using String Builder class
		System.out.println("****** String Builder Class ***********\n");
		
		StringBuilder sb = new StringBuilder("Gauttam");
		
		System.out.println("Reverse String :" + sb.reverse());
		
		//************************************************
		
		
		StringBuilder sb2 = new StringBuilder();
		
		String name = "DeveloperCorners";
		
		sb2.append(name);
		
		StringBuilder reverseString = sb2.reverse();
		
		System.out.println("\nReverse String :"+ reverseString);
		
		//**********************************************************
		
		// 2. Using StringBuffer Class
		
		System.out.println("\n****** String Buffer Class ***********\n");
		
		
		StringBuffer sbf = new StringBuffer("Gauttam");
		
		System.out.println("Reverse String : "+ sbf.reverse());
		
		//***********************************************************
		
		StringBuffer sbf2 = new StringBuffer();
		
		String name2 = "DeveloperCorners";
		sbf2.append(name2);
		
		StringBuffer reverseString2 = sbf2.reverse();
		
		System.out.println("\nReverse String : "+reverseString2);
		
	}

}


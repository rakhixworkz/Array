package com.xworkz.Array;

public class CountWord {

	public static void main(String[] args) {
		String str = "persuing training at xworkz"; 
		
		int count = 1;
		
		for(int i=0; i<str.length() - 1; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of words in a string is :" +count);
	}

}

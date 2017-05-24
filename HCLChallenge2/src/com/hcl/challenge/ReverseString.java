package com.hcl.challenge;

import java.util.Scanner;

/**
 * 
 *  @author Gangareddy
 *
 *Reversing a string without using reverse function.
 */

public class ReverseString {
	
	private static Scanner scanerInputString;

	static String reverseStringInput(String inputString)
	{

		char[] originalStrToChar = inputString.toCharArray();
		char[] reverseStrToChar = new char[originalStrToChar.length];
		int j = 0;
		for (int i = originalStrToChar.length-1; i >=0; i--)
		{
			reverseStrToChar[j++] = originalStrToChar[i];
		}
		return new String(reverseStrToChar);
	}

	public static void main(String args[])
	{
		scanerInputString = new Scanner(System.in);
		String inputValue = scanerInputString.nextLine();
		System.out.print(reverseStringInput(inputValue));
	}

}

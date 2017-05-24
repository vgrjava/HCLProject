package com.hcl.challenge;
/**
 * 
 * 
 * @author Gangareddy
 *
 *
 */

import java.util.Scanner;

/**
 * @author Gangareddy
 */
public class Palindrome
{

	private static Scanner scanner;

	static String Palindrome(String s)
	{

		char[] originalStrToChar = s.toCharArray();
		char[] reverseStrToChar = new char[originalStrToChar.length];
		int j = 0;
		for (int i = originalStrToChar.length-1; i >=0; i--)
		{
			reverseStrToChar[j++] = originalStrToChar[i];
		}
		return new String(reverseStrToChar);
	}

	static boolean checkPalindrome(String s)
	{
		if(s.equals(Palindrome(s)))
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String args[])
	{
		scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.print(Palindrome(input));
		System.out.println("The String is Palindrome :"+checkPalindrome(input));
	}

}

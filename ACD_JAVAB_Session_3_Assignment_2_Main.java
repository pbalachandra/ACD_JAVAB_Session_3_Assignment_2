package session3;

import java.util.Scanner;

public class ACD_JAVAB_Session_3_Assignment_2_Main 
{
	public static void main(String[] args) 
	{
		int num;
		boolean prime;
		Scanner s = new Scanner(System.in);
		System.out.println("To check whether a given Number is Prime or Not");
		System.out.println("-----------------------------------------------");
		System.out.print("Enter a Number : ");
		num = s.nextInt();
		s.close();
		prime = true;
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{	
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}

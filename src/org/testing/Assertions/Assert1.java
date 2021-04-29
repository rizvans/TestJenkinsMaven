package org.testing.Assertions;

public class Assert1 
{
	public static void assertion1(String expected, String actual)
	{
		if (expected.equals(actual))
		{
			System.out.println("Assertion has been passed");
		}
		else
		{
			System.out.println("Assertion has been failed");
		}
	}

}

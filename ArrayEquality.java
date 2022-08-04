//Write a program to check the equality of two arrays

import java.util.Arrays;

public class ArrayEquality 
{
	public static void main(String[] args)
	{
		
		int a[] ={12,45,67};
		int b[] ={12,45,67};
		
		boolean result = Arrays.equals(a,b);
		if(result == true)
		{
			System.out.println("Two arrays are equal");
		}else
		{
		System.out.println("Two arrays are not equal");
		}
	}
}
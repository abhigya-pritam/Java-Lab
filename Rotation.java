//Write a program to perform cyclic rotation

import java.util.Arrays;
 public class Rotation
 {
	 public static void main(String[] args)
	 {
		 int[] a = {1,2,3,4,5};
		 int n = 5;
		 int last,i;
		 System.out.println("The original array is;");
		 for(i=0;i<n;++i)
			 System.out.println(a[i]+ "");
		 last = a[n-1];
		 for(i=n-1;i>0;i--)
			 a[i] = a[i-1];
		 a[0] =last;
		 System.out.println("\nThe rotated array is:");
		 for(i=0;i<n;++i)
			 System.out.println(a[i]+ "");
	 }
 }
//Write a program to display the cubes of the given numbers.
import java.util.Scanner;
 public class Cube
 {
	 public static void main(String[] args)
	 {
		 int n;
		 System.out.println("Enter a number:");
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 for (int i=1; i<=n; i++)
		 {
			 System.out.println("Number is:" +i+ "and cube of the number" +i+ "is:" +(i*i*i));
		 }
	 }
 }
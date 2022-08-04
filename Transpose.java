//Write a program tofind the transpose of the matrix
import java.util.Arrays;

public class Transpose
{
	public static void main(String[] args)
	{
		int originalArray[][] = {{1,2,3},{3,4,5},{5,6,7}};
		
		System.out.println("Print the original matrix;");
		for(int i=0;i<3;i++){
			for(int j=0; j<3;j++)
			{
				System.out.println(originalArray[i][j]+"");
			}
			System.out.println();
		}
		
		int transposeArray[][] = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				transposeArray[i][j] = originalArray[j][i];
			}
		}
		System.out.println("Printing matrix after the transpose;");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
			{
			System.out.println(transposeArray[i][j]+"");
			}
			System.out.println();
		}
	}
}
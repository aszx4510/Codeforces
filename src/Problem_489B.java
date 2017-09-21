import java.util.Arrays;
import java.util.Scanner;

public class Problem_489B 
{
	// B. BerSU Ball
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] array1 = new int[n];
		for(int i = 0; i < n; i++)
		{
			array1[i] = input.nextInt();
		}
		int m = input.nextInt();
		int[] array2 = new int[m];
		for(int i = 0; i < m; i++)
		{
			array2[i] = input.nextInt();
		}
		
		// sort
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int firstIndex = 0;
		int secondIndex = 0;
		int count = 0;
		while(firstIndex < n && secondIndex < m)
		{
			if(Math.abs(array1[firstIndex] - array2[secondIndex]) <= 1)
			{
				firstIndex++;
				secondIndex++;
				count++;
			}
			else if(array1[firstIndex] > array2[secondIndex])
			{
				secondIndex++;
			}
			else
			{
				firstIndex++;
			}
		}
		System.out.println(count);
	}
}

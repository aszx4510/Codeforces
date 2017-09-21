import java.math.BigInteger;
import java.util.Scanner;

public class Problem_489C 
{
	// C. Given Length and Sum of Digits...
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int sum = input.nextInt();
		int origin = sum;
		boolean check = false;
		if(sum == 0 && m != 1)
		{
			check = true;
		}
		
		int[] minDigit = new int[m];
		int[] maxDigit = new int[m];
		
		// min
		if(sum > 0)
		{
			minDigit[0] = 1;
			sum--;
		}
		int minIndex = m - 1;
		while(sum > 0)
		{
			if(minDigit[minIndex] == 9)
			{
				if(minIndex == 0)
				{
					check = true;
					break;
				}
				minIndex--;
			}
			minDigit[minIndex]++;
			sum--;
		}
		
		// max
		sum = origin;
		int maxIndex = 0;
		while(sum > 0)
		{
			if(maxDigit[maxIndex] == 9)
			{
				if(maxIndex == m - 1)
				{
					check = true;
					break;
				}
				maxIndex++;
			}
			maxDigit[maxIndex]++;
			sum--;
		}
		
		if(check)
		{
			System.out.println("-1 -1");
		}
		else
		{
			for(int i = 0; i < m; i++)
			{
				System.out.print(minDigit[i]);
			}
			System.out.print(" ");
			for(int i = 0; i < m; i++)
			{
				System.out.print(maxDigit[i]);
			}
			System.out.println();
		}
	}
}

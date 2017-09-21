import java.util.Scanner;

public class Problem_500C 
{
	// C. New Year Book Reading
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] w = new int[n];
		for(int i = 0; i < n; i++)
		{
			w[i] = input.nextInt();
		}
		int[] day = new int[m];
		for(int i = 0; i < m; i++)
		{
			day[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i = m - 1; i > 0; i--)
		{
			boolean[] appear = new boolean[n];
			int index = i - 1;
			while(index > -1 && day[index] != day[i])
			{
				if(!appear[day[index] - 1])
				{
					sum += w[day[index] - 1];
					appear[day[index] - 1] = true;
				}
				index--;
			}
		}
		System.out.println(sum);
	}
}

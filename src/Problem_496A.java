import java.util.Scanner;

public class Problem_496A 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] gap = new int[n - 1];
		
		int now = -1;
		int previous = -1;
		int min = 999999;
		int max = 0;
		for(int i = 0; i < n; i++)
		{
			if(i != 0)
			{
				previous = now;
			}
			now = input.nextInt();
			if(i != 0)
			{
				gap[i - 1] = now - previous;
				if(gap[i - 1] > max)
				{
					max = gap[i - 1];
				}
			}
		}
		
		for(int i = 1; i < gap.length; i++)
		{
			if(gap[i - 1] + gap[i] < min)
			{
				min = gap[i - 1] + gap[i];
			}
		}
		if(min <= max)
		{
			System.out.println(max);
		}
		else
		{
			System.out.println(min);
		}
	}
}

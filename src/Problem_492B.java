import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_492B 
{
	// B. Vanya and Lanterns
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int l = input.nextInt();
		
		int[] location = new int[n];
		for(int i = 0; i < location.length; i++)
		{
			location[i] = input.nextInt();
		}
		Arrays.sort(location);
		
		double radius = 0;
		for(int i = 0; i < location.length; i++)
		{
			if(i == 0)
			{
				if(location[i] != 0)
				{
					radius = Math.max(radius, (double)(location[i] - 0));
				}
				else
				{
					// do nothing
				}
			}
			else if(i == n - 1 && location[i] != l)
			{
				radius = Math.max(radius, (double)(l - location[i]));
			}
			else
			{
				radius = Math.max(radius, (double)(location[i] - location[i - 1]) / 2);
			}
		}
		
		if(n == 1)
		{
			radius = Math.max(location[0] - 0, l - location[0]);
		}
		
		System.out.println(new DecimalFormat("#.0000000000").format(radius));
	}
}

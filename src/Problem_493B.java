import java.util.Scanner;

public class Problem_493B 
{
	// B. Vasya and Wrestling
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max = -1;
		boolean side = false; // true = first, false = second
		long sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			int number = input.nextInt();
			
			if(Math.abs(number) >= max)
			{
				max = Math.abs(number);
				if(number > 0)
				{
					side = true;
				}
				else
				{
					side = false;
				}
			}
			
			sum += number;
		}
		
		if(sum > 0)
		{
			System.out.println("first");
		}
		else if(sum < 0)
		{
			System.out.println("second");
		}
		else
		{
			if(side)
			{
				System.out.println("first");
			}
			else
			{
				System.out.println("second");
			}
		}
	}
}

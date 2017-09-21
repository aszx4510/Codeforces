import java.util.Scanner;

public class Problem_588B
{
	public static void main(String[] arsg)
	{
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long answer = 1;
		
		for(long i = 2; i * i <= n; i++)
		{
			if(n % i == 0)
			{
				answer *= i;
				while(n % i == 0)
				{
					n /= i;
				}
			}
		}
		answer *= n;
		System.out.println(answer);
	}
}

import java.util.Scanner;

public class Problem_715A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		long n = input.nextInt();

		for(long i = 1; i < n + 1; i++)
		{
			if(i == 1)
			{
				System.out.println(2);
			}
			else
			{
				System.out.println(i * (i + 1) * (i + 1) - (i - 1));
			}
		}
		
		// i don't know why this can't work on Java, but it's right for Python
		/*
		long temp = 2;
		for(long i = 1; i < n + 1; i++)
		{
			long target = i * (i + 1);
			long answer = (long) ((Math.pow(target, 2) - temp) / i);
			System.out.println(answer);
			temp = target;
		}*/
	}
}

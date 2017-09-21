import java.util.Scanner;

public class Problem_669A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n == 1)
		{
			System.out.println("1");
		}
		else if(n == 2)
		{
			System.out.println("1");
		}
		else
		{
			if(n % 3 == 0)
			{
				System.out.println(n / 3 * 2);
			}
			else
			{
				System.out.println(n / 3 * 2 + 1);
			}
		}
	}
}

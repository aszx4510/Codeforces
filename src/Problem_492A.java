import java.util.Scanner;

public class Problem_492A 
{
	// A. Vanya and Cubes
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int level = 0;
		int index = 1;
		int sum = 0;
		while(n > 0)
		{
			sum += index;
			index++;
			if(n - sum < 0)
			{
				break;
			}
			else
			{
				n -= sum;
				level++;
			}
		}
		
		System.out.println(level);
	}
}

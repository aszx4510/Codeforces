import java.util.Scanner;

public class Problem_485A 
{
	// A. Factory
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		long a = input.nextLong();
		int m = input.nextInt();
		
		// Pigeonhole principle
		int count = 0;
		boolean check = false;
		while(count < m)
		{
			long temp = a % m;
			
			if(temp == 0)
			{
				System.out.println("Yes");
				check = true;
				break;
			}
			
			a += temp;
			System.out.println(a);
			count++;
		}
		
		if(!check)
		{
			System.out.println("No");
		}
	}
}

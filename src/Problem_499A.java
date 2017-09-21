import java.util.Scanner;

public class Problem_499A 
{
	// A. Watching a movie
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();
		
		
		int now = 1;
		int total = 0;
		for(int time = 0; time < n; time++)
		{
			//System.out.println("new time and now=" + now);
			
			int start = input.nextInt();
			int end = input.nextInt();
			
			while(now + x <= start)
			{
				now += x;
			}
			
			while(now <= end)
			{
				//System.out.println("++ now=" + now);
				now++;
				total++;
			}
		}
		System.out.println(total);
	}
}

import java.util.Scanner;

public class Problem_500A 
{
	// A. New Year Transportation
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int t = input.nextInt();
		int[] a = new int[n]; // 0 doesn't use
		for(int i = 1; i < n; i++)
		{
			a[i] = input.nextInt();
		}
		
		int index = 1;
		boolean check = false;
		while(index <= n && !check)
		{
			if(index == t)
			{
				check = true;
				System.out.println("YES");
				break;
			}
			if(index == n)
			{
				break;
			}
			index += a[index];
		}
		if(!check)
		{
			System.out.println("NO");
		}
	}
}

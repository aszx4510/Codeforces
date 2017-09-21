import java.util.Scanner;

public class Problem_578B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int x = input.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = input.nextInt();
		}
		
		long mul = 1;
		while(k > 0)
		{
			mul *= x;
			k--;
		}
		
		int[] prefix = new int[n + 1];
		int[] suffix = new int[n + 1];
		
		// prefix[i] = a[0] | ... | a[i - 1]
		for(int i = 1; i < prefix.length; i++)
		{
			prefix[i] = prefix[i - 1] | a[i - 1];
		}
		
		// suffix[i] = a[n - 1] | ... | a[i]
		for(int i = n - 1; i >= 0; i--)
		{
			suffix[i] = suffix[i + 1] | a[i];
		}
		
		long answer = 0;
		for(int i = 0; i < a.length; i++)
		{
			answer = Math.max(answer, prefix[i] | (a[i] * mul) | suffix[i + 1]);
		}
		System.out.print(answer);
	}
}

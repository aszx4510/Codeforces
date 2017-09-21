import java.util.Scanner;

public class Problem_489A
{
	// A. SwapSort
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] data = new int[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = input.nextInt();
		}
		
		String answer = "";
		int count = 0;
		
		for(int i = n - 1; i > 0; i--)
		{
			// find max
			int index = -1;
			int max = Integer.MIN_VALUE;
			for(int k = 0; k <= i; k++)
			{
				if(data[k] > max)
				{
					max = data[k];
					index = k;
				}
			}
			
			if(index != i)
			{
				int temp = data[index];
				data[index] = data[i];
				data[i] = temp;
				answer = answer + index + " " + i + "\n";
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(answer);
	}
}
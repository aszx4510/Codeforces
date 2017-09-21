import java.util.Scanner;

public class Problem_484B 
{
	// B. Maximum Value
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		boolean[] appear = new boolean[1000100];
		for(int i = 0; i < n; i++)
		{
			appear[input.nextInt()] = true;
		}
		
		int[] pre = new int[1000100];
		pre[0] = 0;
		for(int i = 1; i < pre.length; i++)
		{
			if(appear[i])
			{
				pre[i] = i;
			}
			else
			{
				pre[i] = pre[i - 1];
			}
		}
		
		int maxMod = 0;
		for(int i = 2; i < appear.length; i++) // start at 2
		{
			if(appear[i])
			{
				for(int j = i * 2 - 1; j < appear.length; j++)
				{
					/*
					if(appear[j])
					{
						//System.out.println("j=" + j + " i=" + i);
						maxMod = Math.max(maxMod, pre[j] % i);
						//System.out.println("nowMax=" + maxMod);
					}*/
					maxMod = Math.max(maxMod, pre[j] % i);
				}
				maxMod = Math.max(maxMod, pre[1000099] % i);
			}
		}
		
		
		/*
		int[] data = new int[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = input.nextInt();
		}
		
		// sort
		for(int i = n - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(data[j] > data[j + 1])
				{
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		
		int maxMod = 0;
		for(int i = n - 1; i > 0; i--)
		{
			for(int j = i - 1; j > -1; j--)
			{
				maxMod = Math.max(maxMod, data[i] % data[j]);
				if(maxMod >= data[j])
				{
					j = 0;
				}
			}
		}
		*/
		System.out.println(maxMod);
	}
}

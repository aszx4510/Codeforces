import java.util.Scanner;

public class Problem_500B 
{
	// B. New Year Permutation
	
	public int[] p;
	public int[][] a;
	
	public static void main(String[] args)
	{
		Problem_500B main = new Problem_500B(); 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		main.p = new int[n];
		for(int i = 0; i < n; i++)
		{
			main.p[i] = input.nextInt();
		}
		input.nextLine(); // fucking line
		main.a = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			String line = input.nextLine();
			for(int j = 0; j < n; j++)
			{
				main.a[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		
		while(main.check());
		for(int i = 0; i < n; i++)
		{
			System.out.print(main.p[i] + " ");
		}
	}
	
	public boolean check()
	{
		boolean change = false;
		for(int i = 0; i < p.length; i++)
		{
			int changeIndex = -1;
			int min = p[i];
			for(int j = i + 1; j < p.length; j++)
			{
				if(a[i][j] == 1 && p[j] < min)
				{
					min = p[j];
					changeIndex = j;
					change = true;
				}
			}
			if(changeIndex > 0)
			{
				int temp = p[i];
				p[i] = p[changeIndex];
				p[changeIndex] = temp;
			}
		}
		return change;
	}
}

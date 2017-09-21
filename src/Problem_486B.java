import java.util.Scanner;


public class Problem_486B 
{
	// B. OR in Matrix
	/*
	 * 
	 * 
	 *  doesn't complete
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] matrixA = new int[m][n];
		int[][] matrixB = new int[m][n];
		int[][] matrixC = new int[m][n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				matrixB[i][j] = input.nextInt();
				matrixA[i][j] = 1; // initialization
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(matrixB[i][j] == 0)
				{
					for(int k = 0; k < m; k++)
					{
						matrixA[k][j] = 0;
					}
					for(int k = 0; k < n; k++)
					{
						matrixA[i][k] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(matrixA[i][j] == 1)
				{
					for(int k = 0; k < m; k++)
					{
						matrixC[k][j] = 1;
					}
					for(int k = 0; k < n; k++)
					{
						matrixC[i][k] = 1;
					}
				}
			}
		}
		
		boolean check = true;
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(matrixB[i][j] != matrixC[i][j])
				{
					check = false;
				}
			}
		}
		
		if(check)
		{
			System.out.println("YES");
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(matrixA[i][j] + " ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("NO");
		}
	} // end of method main
}

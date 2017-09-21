import java.util.Scanner;

public class Problem_586B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int house = input.nextInt();
		int[] topStreet = new int[house - 1];
		int[] bottomStreet = new int[house - 1];
		int[] avenue = new int[house];
		for(int i = 0; i < topStreet.length; i++)
		{
			topStreet[i] = input.nextInt();
		}
		for(int i = 0; i < bottomStreet.length; i++)
		{
			bottomStreet[i] = input.nextInt();
		}
		for(int i = 0; i < avenue.length; i++)
		{
			avenue[i] = input.nextInt();
		}
		// end of reading data
		
		int[][] distance1 = new int[house][2];
		int[][] distance2 = new int[house][2];
		distance1[house - 1][0] = distance1[house - 1][1] + avenue[house - 1]; // initialize
		int cross = house - 1;
		
		for(int i = house - 2; i > -1; i--)
		{
			for(int j = 1; j > -1; j--)
			{
				if(j == 1)
				{
					distance1[i][j] = distance1[i + 1][j] + bottomStreet[i]; // right-hand side
				}
				else
				{
					distance1[i][j] = distance1[i + 1][j] + topStreet[i]; // right-hand side
					
					int temp = distance1[i][j + 1] + avenue[i];
					if(temp < distance1[i][j]) // cross avenue
					{
						distance1[i][j] = temp;
						cross = i;
					}
				}
			}
		}
		
		distance2[0][1] = distance2[0][0] + avenue[0]; // initialize
		for(int i = 1; i < distance2.length; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(j == 0)
				{
					distance2[i][j] = distance2[i - 1][j] + topStreet[i - 1]; // left-hand side
				}
				else
				{
					distance2[i][j] = distance2[i - 1][j] + bottomStreet[i - 1]; // left-hand side

					
					int temp = distance2[i][j - 1] + avenue[i];
					if(temp < distance2[i][j] && i != cross) // cross avenue
					{
						distance2[i][j] = temp;
					}
				}
			}
		}

		System.out.println(distance1[0][0] + distance2[house - 1][1]);
	}
}

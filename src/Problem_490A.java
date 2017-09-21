import java.util.Scanner;

public class Problem_490A 
{
	// A. Team Olympiad
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int people = input.nextInt();
		
		int[] children = new int[people];
		for(int i = 0; i < children.length; i++)
		{
			children[i] = input.nextInt();
		}
		
		int[][] distribute = new int[people][3];
		int firstIndex = 0;
		int secondIndex = 0;
		int thirdIndex = 0;
		
		for(int i = 0; i < children.length; i++)
		{
			if(children[i] == 1)
			{
				distribute[firstIndex][0] = i + 1;
				firstIndex++;
			}
			else if(children[i] == 2)
			{
				distribute[secondIndex][1] = i + 1;
				secondIndex++;
			}
			else if(children[i] == 3)
			{
				distribute[thirdIndex][2] = i + 1;
				thirdIndex++;
			}
		}
		
		String answer = "";
		int count = 0;
		int index = 0;
		while(true)
		{
			if(distribute[index][0] != 0 && distribute[index][1] != 0 && distribute[index][2] != 0)
			{
				answer = answer + distribute[index][0] + " " + distribute[index][1] + " " + distribute[index][2] + "\n";
				count++;
				index++;
			}
			else
			{
				break;
			}
		}
		
		if(count != 0)
		{
			System.out.println(count);
			System.out.println(answer);
		}
		else
		{
			System.out.println(count);
		}
	}
}

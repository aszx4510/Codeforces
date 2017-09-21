import java.util.ArrayList;
import java.util.Scanner;

public class Problem_641A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		String garbage = input.nextLine(); // first time is garbage
		char[] direction = input.nextLine().toCharArray();
		
		int[] distance = new int[n];
		for(int i = 0; i < distance.length; i++)
		{
			distance[i] = input.nextInt();
		}

		//start game
		boolean[] visited = new boolean[n];
		boolean finite = true;
		int index = 0;
		visited[index] = true;
		while(index < n && index >= 0)
		{
			index += direction[index] == '>' ? +distance[index] : -distance[index];
			
			if(!(index < n && index >= 0))
			{
				break;
			}
			
			if(visited[index])
			{
				finite = false;
				break;
			}
			visited[index] = true;
		}
		System.out.println(finite ? "FINITE" : "INFINITE");
		
		input.close();
	}
}

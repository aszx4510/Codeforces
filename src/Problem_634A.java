import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem_634A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Queue<Integer> before = new LinkedList<Integer>();
		int[] after = new int[200000];
		int index = 0;

		int n = input.nextInt();
		// first state
		for(int i = 0; i < n; i++)
		{
			int temp = input.nextInt();
			if(temp == 0)
			{
				continue;
			}
			
			before.offer(temp);
		}
		
		// second state
		boolean startCompare = false;
		boolean sameFlag = true;
		for(int i = 0; i < n; i++)
		{
			int temp = input.nextInt();
			
			if(temp == 0)
			{
				continue;
			}
			
			if(!startCompare && temp == before.peek())
			{
				startCompare = true;
			}
			
			if(!startCompare)
			{
				after[index] = temp;
				index++;
			}
			else
			{
				if(temp != before.poll())
				{
					sameFlag = false;
					break;
				}
			}
		}
		
		int i = 0;
		while(sameFlag && before.size() != 0)
		{
			if(before.poll() != after[i++])
			{
				sameFlag = false;
				break;
			}
		}
		
		if(sameFlag)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}



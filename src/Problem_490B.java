import java.util.Scanner;

public class Problem_490B 
{
	// B. Queue
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] map = new int[1000001];
		int[] firstNumber = new int[n];
		int[] count = new int[1000001]; // 0 doesn't use
		
		for(int i = 0; i < n; i++)
		{
			int index = input.nextInt();
			firstNumber[i] = index;
			map[index] = input.nextInt();
			
			count[index]++;
			count[map[index]]++;
		}
		
		int[] answer = new int[n];
		for(int i = 0; i < firstNumber.length; i++)
		{
			if(count[firstNumber[i]] == 1)
			{
				answer[0] = firstNumber[i];
				break;
			}
		}
		answer[1] = map[0];
		
		for(int i = 2; i < n; i++)
		{
			answer[i] = map[answer[i - 2]];
		}
		
		for(int i = 0; i < answer.length; i++)
		{
			System.out.print(answer[i] + " ");
		}
	} // end of method main
}

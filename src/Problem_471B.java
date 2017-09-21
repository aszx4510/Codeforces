import java.util.Scanner;


public class Problem_471B 
{
	// B. MUH and Important Things
	
	public static void main(String[] args)
	{
		Problem_471B main = new Problem_471B();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] data = new int[n];
		Task[] sortedData = new Task[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = input.nextInt();
			sortedData[i] = main.new Task(data[i], i + 1);
		}
		
		// sort
		for(int i = sortedData.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(sortedData[j].number > sortedData[j + 1].number)
				{
					Task temp = main.new Task(sortedData[j].number, sortedData[j].index);
					sortedData[j] = sortedData[j + 1];
					sortedData[j + 1] = temp;
				}
			}
		}
		
		boolean checkAnswer = false;
		boolean checkContinue = false;
		int nowNumber = sortedData[0].number;
		int count = 0;
		String answer = "";
		for(int i = 1; i < n; i++)
		{
			if(nowNumber == sortedData[i].number)
			{
				if(checkContinue && count < 3)
				{
					for(int k = 0; k < sortedData.length; k++)
					{
						if(k == i - 1)
						{
							answer = answer + sortedData[k + 1].index + " " + sortedData[k].index + " ";
						}
						else if(k == i)
						{
							// nothing
						}
						else
						{
							answer = answer + sortedData[k].index + " ";
						}
					}
					answer = answer + "\n";
					count++;
				}
				else
				{
					if(count < 3)
					{
						for(int k = 0; k < sortedData.length; k++)
						{
							if(k == i - 1)
							{
								answer = answer + sortedData[k + 1].index + " " + sortedData[k].index + " ";
							}
							else if(k == i)
							{
								// nothing
							}
							else
							{
								answer = answer + sortedData[k].index + " ";
							}
						}
						answer = answer + "\n";
						count++;
					}
					
					if(count < 3)
					{
						for(int k = 0; k < sortedData.length; k++)
						{
							answer = answer + sortedData[k].index + " ";
						}
						answer = answer + "\n";
						count++;
					}
				}
				
				checkContinue = true;
			}
			else
			{
				nowNumber = sortedData[i].number;
				checkContinue = false;
			}
		}

		if(count >= 3)
		{
			checkAnswer = true;
			System.out.println("YES");
			System.out.println(answer);
		}
		if(!checkAnswer)
		{
			System.out.println("NO");
		}
	} // end of method main
	
	public class Task
	{
		public int number;
		public int index;
		
		public Task(int number, int index)
		{
			this.number = number;
			this.index = index;
		}
	} // end inner class
}

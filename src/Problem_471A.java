import java.util.Scanner;

public class Problem_471A 
{
	// A. MUH and Sticks
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] data = new int[6];
		for(int i = 0; i < data.length; i++)
		{
			data[i] = input.nextInt();
		}
		
		for(int i = data.length - 1; i > 0; i--)
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
		
		int head;
		int body;
		int legs = data[0];
		
		if(legs == data[1] && legs == data[2] && legs == data[3])
		{
			head = data[4];
			body = data[5];
			if(body > head)
			{
				System.out.println("Bear");
			}
			else// if(body == head)
			{
				System.out.println("Elephant");
			}
		}
		else
		{
			legs = data[1];
			if(legs == data[2] && legs == data[3] && legs == data[4])
			{
				head = data[0];
				body = data[5];
				System.out.println("Bear");
			}
			else
			{
				legs = data[2];
				if(legs == data[3] && legs == data[4] && legs == data[5])
				{
					head = data[0];
					body = data[1];
					if(body > head)
					{
						System.out.println("Bear");
					}
					else// if(body == head)
					{
						System.out.println("Elephant");
					}
				}
				else
				{
					System.out.println("Alien");
				}
			}
		}
		
	}
} // end of class

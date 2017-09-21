import java.util.Scanner;

public class Problem_496B 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		input.nextLine(); // fucking line
		String number = input.nextLine();
		int[] gap = new int[digit - 1];
		for(int i = 0; i < gap.length; i++)
		{
			gap[i] = 100;
		}
		
		for(int k = 0; k < digit; k++)
		{
			boolean check = false;
			for(int i = 1; i < digit; i++)
			{
				int temp = Integer.parseInt("" + number.charAt(i)) - Integer.parseInt("" + number.charAt(0));
				if(temp < 0)
				{
					temp += 10;
				}

				if(check)
				{
					gap[i - 1] = temp;
				}
				else if(temp < gap[i - 1])
				{
					gap[i - 1] = temp;
					check = true;
				}
				else if(temp == gap[i - 1])
				{
					gap[i - 1] = temp;
				}
				else
				{
					break;
				}
			}
			number = number.substring(number.length() - 1) + number.substring(0, number.length() - 1);
		}
		
		System.out.print("0");
		for(int i = 0; i < gap.length; i++)
		{
			System.out.print(gap[i]);
		}
	}
}

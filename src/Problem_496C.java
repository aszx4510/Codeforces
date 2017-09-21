import java.util.Scanner;

public class Problem_496C 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		input.nextLine(); // fucking line
		String[] table = new String[row];
		for(int i = 0; i < row; i++)
		{
			table[i] = input.nextLine();
		}
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		int answer = 0;
		for(int i = 0; i < column; i++)
		{
			boolean check = true;
			for(int j = 1; j < row; j++)
			{
				int now = -1;
				int previous = -5;
				for(int k = 0; k < letters.length; k++)
				{
					if(String.valueOf(table[j - 1].charAt(i)).equals(letters[k]))
					{
						now = k;
					}
					
					if(String.valueOf(table[j].charAt(i)).equals(letters[k]))
					{
						previous = k;
					}
				}
				System.out.println("n and p " + now + " " + previous);
				if(previous - now < 0)
				{
					System.out.println("break");
					check = false;
					break;
				}
			}
			if(!check)
			{
				answer++;
			}
		}
		System.out.println(answer);
	}
}

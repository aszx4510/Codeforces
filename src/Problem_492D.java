import java.util.ArrayList;
import java.util.Scanner;

public class Problem_492D 
{
	// D. Vanya and Computer Game
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();
		int y = input.nextInt();
		
		ArrayList<String> mod = new ArrayList<String>();
		mod.add("index zero is nothing");
		
		double countX = 0;
		double countY = 0;
		while(countX < x && countY < y)
		{
			if((countX + 1) / x < (countY + 1) / y)
			{
				mod.add("Vanya");
				countX++;
			}
			else if((countX + 1) / x > (countY + 1) / y)
			{
				mod.add("Vova");
				countY++;
			}
			else if((countX + 1) / x == (countY + 1) / y)
			{
				mod.add("Both");
				mod.add("Both");
				countX++;
				countY++;
			}
		}
		mod.set(0, mod.get(mod.size() - 1));

		long health;
		for(int i = 0; i < n; i++)
		{
			health = input.nextLong();
			health %= (x + y);
			
			System.out.println(mod.get((int)health));
		}
	}
}

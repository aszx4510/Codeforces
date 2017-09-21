import java.util.Arrays;
import java.util.Scanner;


public class Problem_493A 
{
	// A. Vasya and Football
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String home = input.nextLine();
		String away = input.nextLine();
		//input.next(); // fucking line
		int n = input.nextInt();
		
		//System.out.print(n);
		
		Foul[] player = new Foul[200]; // team number *100 + player number, 0 and 100 doesn't use
		for(int i = 0; i < player.length; i++)
		{
			player[i] = new Foul(i);
		}
		for(int i = 0; i < n;i++)
		{
			int minute = input.nextInt();
			String team = input.next();
			int playerNumber = input.nextInt();
			String card = input.next();
			
			if(team.equals("a"))
			{
				playerNumber += 100;
			}
			
			if(card.equals("y"))
			{
				if(player[playerNumber].yellow == true)
				{
					player[playerNumber].red = true;
					player[playerNumber].minute = minute;
				}
				player[playerNumber].yellow = true;
			}
			else if(card.equals("r"))
			{
				player[playerNumber].red = true;
				player[playerNumber].minute = minute;
			}
		}
		
		Arrays.sort(player);
		
		int index = 0;
		while(player[index].minute != 100)
		{
			if(player[index].playerNumber / 100 == 1)
			{
				System.out.print(away + " ");
			}
			else
			{
				System.out.print(home + " ");
			}
			
			System.out.print((player[index].playerNumber % 100) + " " + player[index].minute + "\n");
			
			index++;
		}
	}
}

class Foul implements Comparable<Foul>
{
	int playerNumber;
	int minute;
	boolean yellow;
	boolean red;
	
	public Foul(int playerNumber)
	{
		this.playerNumber = playerNumber;
		minute = 100;
		yellow = false;
		red = false;
	}
	
	@Override
	public int compareTo(Foul other)
	{
		return this.minute - other.minute;
	}
}
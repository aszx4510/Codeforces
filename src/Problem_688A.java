import java.util.Scanner;

public class Problem_688A
{
	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
		
		int n = input.nextInt();
		int d = input.nextInt();
		
		//System.out.println("n is " + n + "\td is " + d);
		
		int answer = 0;
		int temp = 0;
		
		input.nextLine(); // garbage nextline()
		for(int i = 0; i < d; i++)
		{
			String day = input.nextLine();
			//System.out.println("day " + (i + 1) + "\t" + day + "\tday.indexOf(\"0\") is " + day.indexOf("0"));
			
			if(day.indexOf("0") >= 0) // at least one of opponents is absent
			{
				temp++;
				if(temp > answer)
				{
					//System.out.println("assign answer and temp is " + temp);
					answer = temp;
				}
			}
			else
			{
				temp = 0;
			}
		}
		
		System.out.println(answer);
	}
}

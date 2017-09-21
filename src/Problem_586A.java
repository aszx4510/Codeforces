import java.util.Scanner;

public class Problem_586A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean[] n = new boolean[input.nextInt()];
		int atSchool = 0;
		
		for(int i = 0; i < n.length + 1; i++)
		{
			if(i < n.length)
			{
				int temp = input.nextInt();
				if(temp == 1)
				{
					n[i] = true;
				}
			}
			
			if(i > 0)
			{
				if(n[i - 1]) // now index
				{
					atSchool++;
				}
				else
				{
					if(i> 1 && n[i - 2] && i < n.length && n[i])
					{
						atSchool++;
					}
				}
			}
		}
		System.out.println(atSchool);
	}
}

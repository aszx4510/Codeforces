import java.util.Arrays;
import java.util.Scanner;

public class Problem_492C 
{
	// C. Vanya and Exams
	
	public static void main(String[] args)
	{
		Problem_492C main = new Problem_492C();
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int r = input.nextInt();
		int avg = input.nextInt();
		
		//int[] grade = new int[n];
		//int[] cost = new int[n];
		Exam[] exams = new Exam[n];
		for(int i = 0; i < n; i++)
		{
			exams[i] = main.new Exam(input.nextInt(), input.nextInt());
			//grade[i] = input.nextInt();
			//cost[i] = input.nextInt();
		}
		
		Arrays.sort(exams);
		
		long sum = (long)n * (long)avg;
		for(int i = 0; i < n; i++)
		{
			sum -= exams[i].grade;
		}
		long essays = 0;
		
		for(int i = 0; i < exams.length && sum > 0; i++)
		{
			long need = Math.min(r - exams[i].grade, sum);
			sum -= need;
			essays += need * exams[i].cost;
		}
		
		/*  same code
		int index = 0;
		while(sum > 0 && index < n)
		{
			long need = Math.min(r - exams[index].grade, sum);
			sum -= need;
			essays += need * exams[index].cost;
			index++;
			
			if(exams[index].grade < r)
			{
				sum--;
				exams[index].grade++;
				essays += exams[index].cost;
			}
			else
			{
				index++;
			}
		}*/
		
		System.out.println(essays);
	}
	
	public class Exam implements Comparable<Exam>
	{
		int grade;
		int cost;
		
		public Exam(int grade, int cost)
		{
			this.grade = grade;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Exam another)
		{
			return (int) this.cost - another.cost;
		}
	}
}



import java.util.Arrays;
import java.util.Scanner;

public class Problem_493C 
{
	// C. Vasya and Basketball
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = input.nextInt();
		}
		
		n = input.nextInt();
		int[] b = new int[n];
		for(int i = 0; i < n; i++)
		{
			b[i] = input.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		int indexA = 0;
		int indexB = 0;
		int distanceA = 0;
		int distanceB = 0;
		int max = 0;
		int d = 0;

		int aSum = a.length * 3;
		int bSum = b.length * 3;
		max = aSum - bSum;

		System.out.println(max);
		int aPoint = aSum;
		int bPoint = bSum;
		
		if(a[indexA] >= b[indexB])
		{
			if(a[indexA] >= b[indexB])
			{
				int temp = b[indexB];
				do
				{
					indexB++;
					System.out.println("indexB is " + indexB);
				}while(indexB < b.length && b[indexB] != temp);
			}
			else
			{
				int temp = a[indexA];
				do
				{
					indexA++;
					System.out.println("indexA is " + indexA);
				}while(indexA < a.length && a[indexA] != temp);
			}
		}
		
		while(indexA < a.length || indexB < b.length)
		{
			//d = Math.min(a[indexA], b[indexB]);
			
			if((indexA * 2 + (a.length - indexA) * 3) - (indexB * 2 + (b.length - indexB) * 3) > max)
			{
				aPoint = indexA * 2 + (a.length - indexA) * 3;
				bPoint = indexB * 2 + (b.length - indexB) * 3;
				max = aPoint - bPoint;
			}
			
			if(a[indexA] >= b[indexB])
			{
				int temp = b[indexB];
				do
				{
					indexB++;
					System.out.println("indexB is " + indexB);
				}while(indexB < b.length && b[indexB] != temp);
			}
			else
			{
				int temp = a[indexA];
				do
				{
					indexA++;
					System.out.println("indexA is " + indexA);
				}while(indexA < a.length && a[indexA] != temp);
			}
		}
		System.out.println(aPoint + ":" + bPoint);
	}
}

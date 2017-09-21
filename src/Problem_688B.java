import java.util.Scanner;

public class Problem_688B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String origin = input.next();
		String reverse = new StringBuffer(origin).reverse().toString();
		System.out.println(origin + reverse);
	}
}

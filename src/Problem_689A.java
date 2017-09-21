import java.util.Scanner;

public class Problem_689A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine(); // garbage nextline
		String movement = input.nextLine();
		
		int[] x = {2, 1, 2, 3, 1, 2, 3, 1, 2, 3};
		int[] y = {4, 1, 1, 1, 2, 2, 2, 3, 3, 3};
		
		// left, up, right, down
		int[] directionX  = {-1, 0, 1, 0};
		int[] directionY  = {0, -1, 0, 1};
		
		boolean[] moveCorrect = new boolean[4];
		for(int i = 0; i < moveCorrect.length; i++) // initialize
		{
			moveCorrect[i] = true;
		}
		
		// each move direction
		for(int i = 0; i < directionX.length; i++)
		{
			for(int j = 0; j < movement.length(); j++)
			{
				int temp = Integer.parseInt(movement.charAt(j) + "");
				
				int moveX = x[temp] + directionX[i];
				int moveY = y[temp] + directionY[i];
				
				if(moveX > 3 || moveX < 1)
				{
					moveCorrect[i] = false;
					break;
				}
				
				if(moveY == 4 && (moveX <= 1 || moveX >= 3))
				{
					moveCorrect[i] = false;
					break;
				}
				
				if(moveY < 1 || moveY > 4)
				{
					moveCorrect[i] = false;
					break;
				}
			} // all characters
		} // four direction
		
		// print answer
		if(moveCorrect[0] || moveCorrect[1] || moveCorrect[2] || moveCorrect[3])
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}

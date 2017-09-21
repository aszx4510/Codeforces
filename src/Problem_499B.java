import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_499B 
{
	// B. Lecture
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		input.nextLine(); // fucking line
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
		for(int time = 0; time < m; time++)
		{
			String line = input.nextLine();
			String[] words = line.split(" ");
			map1.put(words[0], words[1]);
			map2.put(words[1], words[0]);
		}
		
		String line = input.nextLine();
		String[] words = line.split(" ");
		int length1 = -1;
		int length2 = -1;
		String w1 = "";
		String w2 = "";
		for(int i = 0; i < words.length; i++)
		{
			if(map1.containsKey(words[i]))
			{
				w1 = words[i];
				w2 = map1.get(words[i]);
			}
			else if(map2.containsKey(words[i]))
			{
				w1 = map2.get(words[i]);
				w2 = words[i];
			}

			length1 = w1.length();
			length2 = w2.length();
			if(length2 >= length1)
			{
				System.out.print(w1 + " ");
			}
			else
			{
				System.out.print(w2 + " ");
			}
		}
		System.out.println();
	}
}

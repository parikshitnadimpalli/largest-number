import java.util.*;
public class LargestNumber
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int n, max, i, j;

			System.out.println("Enter the number of integers to compare:");
			n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the integers to compare:");

			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			max = a[0];
			for (j = 0; j < n; j++)
			{
				if (a[j] >= max)
					max = a[j];
			}
			System.out.println("The maximum value from the given values is: " + max);
		}
}

public class Factorial
{
	public static void main(String[] args)
	{
		int factorial = 1;
		int i = 1;
		while(i < 10)
		{
			factorial = factorial * i;
			System.out.print(i + "!=" + factorial + ", ");
			i = i + 1;
		}

		System.out.println();
	}
}

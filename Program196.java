import java.util.*;

class Program196
{
	static int Addition(int x, int y)
	{
		return x+y;
	}

	public static void main(String arg[])
	{
		int no1,no2,ans;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		no1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		no2 = sobj.nextInt();
		
		ans = Addition(no1,no2);
		
		System.out.println("Addition is : "+ans);
	}
}
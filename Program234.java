// Array of any type : use length property	: ex - Arr.length
// For string use length() method : Ex = Str.length()
import java.util.*;

class Demo
{
	public void MaxWord(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		String stemp = null;
		int iMax = Arr[0].length();
		// Logic
		for(String s : Arr)
		{
			if(s.length() > iMax)
			{
				iMax = s.length();
				stemp = s;
			}
		}
		System.out.println("Longest word is : "+stemp);
	}
}

class Program234
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		dobj.MaxWord(str);
	}
}





































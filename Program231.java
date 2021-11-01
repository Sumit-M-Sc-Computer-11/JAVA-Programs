import java.lang.*;
import java.util.*;

class Demo
{
	public int WordCount(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		return Arr.length;
	}
}

class Program231
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		int ret = dobj.WordCount(str);
		System.out.println("number of words are : "+ret);
	}
}
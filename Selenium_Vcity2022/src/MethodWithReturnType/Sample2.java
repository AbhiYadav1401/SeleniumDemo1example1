package MethodWithReturnType;

public class Sample2 
{
	public static void main(String[] args) 
	{
		String s1 = convertNameToUpperCase("abhijeet");
		System.out.println(s1);
		int length = findLengthOfString("yadav");
		System.out.println(length);
	}
	
	
	public static String convertNameToUpperCase(String name)
	{
		String s1 = name.toUpperCase();
		return s1;
	}
	
	public static int findLengthOfString(String name)
	{
		int length = name.length();
		return length;
	}
			
}

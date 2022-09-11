package MethodWithReturnType;

public class Sample1 
{
	public static void main(String[] args) 
	{
		int num1 =10;
		int num2 =20;
		int num3 = addition(num1 , num2);
		System.out.println(num3);

			int mul =	multiplication(num1 , num2);
			System.out.println(mul);
	}
	public static int addition(int  a , int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public static int multiplication(int a , int b)
	{
		int mul = a*b;
		return mul;
	}
}

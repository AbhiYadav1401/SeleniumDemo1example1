package Locators;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example_By_id 
{
	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		PrintWriter pw = new PrintWriter(".file");
		pw.println();
		System.out.println("hello");
		Thread.sleep(4000);
	}
}

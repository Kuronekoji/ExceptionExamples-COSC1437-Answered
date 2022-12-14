package exceptionExamples;
import java.util.Scanner;

public class BasicDivisionTester {

	public static void main(String[] args) {
		int num1, num2, quotient;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1 = kbd.nextInt();
		num2 = kbd.nextInt();
		try 
		{
			quotient = safeDivide(num1, num2);
			System.out.println("The quotient is " + quotient);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		kbd.close();

	}

	public static int safeDivide(int num, int den) throws Exception 
	{
		if (den == 0)
			throw new Exception("Error! Can't divide by zero!");
		return num/den;
	}
	
}

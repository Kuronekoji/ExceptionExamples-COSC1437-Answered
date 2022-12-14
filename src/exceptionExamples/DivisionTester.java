package exceptionExamples;
import java.util.Scanner;

public class DivisionTester {

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
		catch (DivisionByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		kbd.close();

	}

	public static int safeDivide(int num, int den) throws DivisionByZeroException 
	{
		if (den == 0)
			throw new DivisionByZeroException();
		return num/den;
	}
	
}

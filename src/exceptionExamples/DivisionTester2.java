package exceptionExamples;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionTester2 {

	public static void main(String[] args) {

			int num1, num2, quotient;
			Scanner kbd = new Scanner(System.in);

			boolean correct = false;
			do
			{
				System.out.println("Enter two numbers: ");
				try 
				{
					num1 = kbd.nextInt();
					num2 = kbd.nextInt();
					quotient = safeDivide(num1, num2);
					System.out.println("The quotient is " + quotient);
					correct = true;
				}
				catch (DivisionByZeroException e)
				{
					System.out.println(e.getMessage());
				}
				catch (InputMismatchException e)
				{
					System.out.println("Not a valid number.");
					kbd.nextLine();
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			} while (!correct);
			kbd.close();
		}

		public static int safeDivide(int num, int den) throws DivisionByZeroException
		{
			if (den == 0)
				throw new DivisionByZeroException();
			return num/den;
		}


}

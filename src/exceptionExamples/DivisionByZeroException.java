package exceptionExamples;

public class DivisionByZeroException extends Exception
{
	public DivisionByZeroException()
	{
		super("Error: Division by Zero");
	}
	
	public DivisionByZeroException(String msg)
	{
		super(msg);
	}
	
}

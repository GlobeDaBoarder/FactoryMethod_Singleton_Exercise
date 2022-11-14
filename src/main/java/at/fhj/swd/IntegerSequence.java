package at.fhj.swd;

public class IntegerSequence
{
	/*
	 * Constructor
	 */
	private IntegerSequence() {}

	
	/*
	 * Attributes
	 */
	private static int value = 1;
	
	
	/*
	 * Operations
	 */
	public static int getNextValue()
	{
		return value++;
	}
	
	public static void setInitValue(int initValue)
	{
		if(initValue < 0)
			throw new IllegalArgumentException();
		
		value = initValue;
	}
}

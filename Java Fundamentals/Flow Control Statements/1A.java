public class Assignment1a 
{
	static String checkPosNeg(int x)
	{
		if (x > 0)
			return "Positive";
		else if (x < 0)
			return "Negative";
		else
			return "zero";
	}
    
	public static void main(String[] args)
	{
		int firstNumber = -12;
		System.out.println(firstNumber + " is " + checkPosNeg(firstNumber));
	}
}

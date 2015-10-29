public class RandomNumber
{
	public int GetANumber()
	{
		int randomNumber = 1 + (int) (Math.random() * 10);
		return randomNumber;
	}
}
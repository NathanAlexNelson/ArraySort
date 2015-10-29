
public class RanNum {
	public int GetANumber(int high)
	{
		int ranNum = 1 + (int) (Math.random() * high);
		return ranNum;
	}
}

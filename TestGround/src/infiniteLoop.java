import java.util.*;

public class infiniteLoop
{

	public static void main(String[] args)
	{
		int count = 10;
		while (count >= 1)
		{
			System.out.println(count);
			count = count - 1;
		}

	}
}

import java.util.ArrayList;
import java.util.List;

public class SILab2
{
	public List<String> function(List<String> list)
	{
		if (list.size() <= 0) // A
			throw new IllegalArgumentException("List length should be greater than 0"); // B

		List<String> numMines = new ArrayList<>();
		//        C        D
		for (int i = 0; i < list.size(); i++)
		{
			if (!list.get(i).equals("#")) // E
			{
				int num = 0;

				if (i - 1 >= 0 && list.get(i - 1).equals("#")) // F
					num++; // G
				if (i + 1 < list.size() && list.get(i + 1).equals("#")) // H
					num++; // I

				numMines.add(String.valueOf(num)); // J
			}  else
				numMines.add(list.get(i)); // K
		}
		return numMines; // L
	}
}


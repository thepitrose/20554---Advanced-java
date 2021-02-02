package a2016m833;

import java.util.HashMap;

public class bigest {
	
	public String getMaxKey (HashMap<String,? extends Shape>map)
	{
		if (map.size()==0)
		{
			return "";
		}
		
		int maxVal =0;
		String maxKey="";
		
		for (String key :map.keySet())
		{
			if(map.get(key).getArea()>maxVal)
			{
				maxVal=map.get(key).getArea();
				maxKey=key;
			}
		}
		
		return maxKey;
	}

}

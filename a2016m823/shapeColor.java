package a2016m823;

import java.awt.*;
import java.util.*;

public class shapeColor {
	
	public Shape searchShape (ArrayList <? extends Shape> arr, Color c)
	{
		for (int i=0; i<arr.size();i++)
		{
			if (arr.get(i).getColor()==c)
			{
				return arr.get(i);
			}
		}
		
		return null;
	}

}

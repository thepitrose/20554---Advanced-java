package b2017m923;

public class bob
{
public  static  <T extends Comparable<T>> boolean isSorted (T [] arr)
{
	if(arr.length<=1)
	{
		return true;
	}

	for(int i=0; i<arr.length-1;i++)
	{
		if(arr[i].compareTo(arr[i+1])>0)
		{
			return false;
		}
	}
	return true;
}
}
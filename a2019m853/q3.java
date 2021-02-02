package a2019m853;

import java.util.*;

public class q3 {
	public <T extends Comparable<T>,E> HashMap<T,E> grep( HashMap<T,E> map,T item)
	{
		HashMap<T,E> temp = new HashMap<T,E>();
		
		Set<T>keys=map.keySet();
		TreeSet<T> sortedKeys = new TreeSet<T>(keys);
		
		for (T key:sortedKeys) {
			if(key.compareTo(item)>0) {
				E ktemp = map.get(key);
				temp.put(key, ktemp);
			}
		}
		
		return temp;
		
		
	}
}

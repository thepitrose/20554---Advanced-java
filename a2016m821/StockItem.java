package a2016m821;

import java.util.*;

public class StockItem implements cloneable{
	private int number;
	private int quantity;
	
	public void setNumber(int newNumber) {
		number=newNumber;
	}
	public void setQuantity(int count) {
		quantity = count;
	}
	
	public Object clone() {
		StockItem obj = null;
		try {
			obj=(StockItem)super.clone();
		}
		catch (CloneNotSupportedException e) {}
		obj.number=number;
		obj.quantity=quantity;
		return (Object) obj;
	}
	
	
}

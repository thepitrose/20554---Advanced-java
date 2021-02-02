package m14;

public class Call <E>
{

private E content;
private Call <E> nextC;

//========================================

public Call (E data)
{
	content=data;
	nextC=null;
}


//========================================

public Call (E data, Call <E> next)
{
	content=data;
	nextC=next;
}
	
//========================================

public void setContent (E data)
{
	content=data;
}

//========================================

public E getContent ()
{
	return content;
}

//========================================

public void setNext (Call <E> next)
{
	nextC=next;
}


//========================================

public Call <E> getNext ()
{
	return nextC;
}

//========================================

}

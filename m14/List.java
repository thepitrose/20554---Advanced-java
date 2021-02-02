package m14;

public class List <E>
{

	private Call <E> head;
	private Call <E> tail;
	
	
//========================================
	
	public List()
	{
		head=null;
		tail=null;
	}

//========================================
	
	public Call <E> getHead ()
	{
		return head;
	}

	
//========================================
	
	public Call <E> getTail ()
	{
		return tail;
	}
	
//========================================

	public void add(E call)
	{
		

		if (this.head==null)
		{
			head= new Call <E> (call);
			tail=head;
		}
		else
		{
			tail.setNext(new Call <E> (call));
			tail=tail.getNext();
		}
		
	}
	
	
//========================================
	

	public Call <E> remove () throws EmptyListException
	{
		if (head==null)
		{
			throw new EmptyListException("list is empty");
		}
		
		Call <E> tamp = head;
		
		if (head==tail)
		{
			head=null;
			tail=null;
		}
		
		else
		{
			head=head.getNext();
		}
		

		return tamp;
	}
	
	
	
//========================================
	
	public String toString()
	{

		String tamp = "";
		Call <E> current = head;

		while ( current != null )
		{
			tamp += current.getContent() + "\t";
			current = current.getNext();
		}
		
		return tamp;
	}

	
//========================================
	
		public void  reverse (E call)
		{
			if (this.head==null)
			{
				head= new Call <E> (call);
				tail=head;
			}
			else
			{
				Call <E> tamp = head;
				head =  new Call <E> (call);
				head.setNext(tamp);		

			}

		}
	
	
}

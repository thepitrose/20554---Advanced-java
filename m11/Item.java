package m11;

import java.util.ArrayList;

public class Item {
    public String name;
    public double price;

    public ArrayList<Item> itemlist = new ArrayList<Item>();  //List of the structured products
    
    public void setme () {	
    Item item_one = new Item();   
    item_one.setName("bamba");
    item_one.setPrice(4.5);
    itemlist.add(item_one);
    
    Item item_two = new Item();   
    item_two.setName("cola");
    item_two.setPrice(3.5);
    itemlist.add(item_two);
    
    Item item_three = new Item();   
    item_three.setName("milk");
    item_three.setPrice(9.5);
    itemlist.add(item_three);
    
    Item item_four = new Item();   
    item_four.setName("apple");
    item_four.setPrice(6.0);
    itemlist.add(item_four);
    
    Item item_five = new Item();   
    item_five.setName("Banana");
    item_five.setPrice(3);
    itemlist.add(item_five);
       
    }
    
    public void setName (String id) //the class products
    {
        name=id;    
    }

    public String getName ()
    {
        return name;
    }

    public void setPrice (double money) 
    {
        price=money;  
    }

    public double getPrice () 
    {
        return price ;
    }

    public Item finditem(String index)
    {

        for (int i=0; i<itemlist.size(); i++)    
        {     
            if ((itemlist.get(i).getName()).equals(index))
            {   
             
            	return itemlist.get(i);  
            }
        }
        
        return itemlist.get(0);  
    }

    public void showitemlist()
    {
    	for (int i=0; i<itemlist.size(); i++)    
        {     
    	System.out.print(itemlist.get(i).getName()+ " , ");
        }
    	System.out.println(" ");  
    }
    
}

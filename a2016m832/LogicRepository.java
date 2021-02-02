package a2016m832;




import java.util.*;

public class LogicRepository {
	
	private ArrayList<Question>list = new  ArrayList<Question>();
	
	public LogicRepository()
	{
		
		//ArrayList<Question>list = new  ArrayList<Question>();
		
		Question xx = new Question ("true1",true);
		list.add(xx);
		
		 xx =new Question ("true2",true);
		list.add(xx);
		
		 xx = new Question ("false1",false);
		list.add(xx);
		
		 xx = new Question ("true1",true);
		list.add(xx);
		
		 xx =new Question ("true2",true);
		list.add(xx);
		
		 xx = new Question ("false1",false);
		list.add(xx);
		
		 xx = new Question ("true1",true);
		list.add(xx);
		
		 xx =new Question ("true2",true);
		list.add(xx);
		
		 xx = new Question ("false1",false);
		list.add(xx);
		
	}
	
	public ArrayList<Question> getQuestion(int n)
	{
		 ArrayList<Question>tamp = new  ArrayList<Question>();
		 
		 for (int i=0; i<n;i++)
		 {
			 tamp.add(list.get(i));
		 }
		 
		return tamp;
	}

}

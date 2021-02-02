package m13;

import java.util.ArrayList;

public class Questions 
{

	private String question;
	private ArrayList<Answers>  answersList; 
	
	
	public  Questions (String question, ArrayList<Answers> answersList )
	{
		this.question=question;
		this.answersList=answersList;
	}
	
	
	public void setQuestion (String question)
	{
		this.question=question;
	}
	
	
	public String getQuestion ()
	{
		return question;
	}
	
	public ArrayList<Answers> getAnswers()
	{
		return answersList;
	}
	
	
	
}

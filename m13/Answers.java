package m13;

public class Answers 
{
    private final boolean rightORnot;
    private final String getAnswer;
    
    
    Answers(final String getAnswer,final boolean rightORnot)
    {

        this.getAnswer = getAnswer;
        this.rightORnot = rightORnot;
    }


    public boolean rightORnot() 
    {
        return rightORnot;
    }

    public String getAnswer() 
    {
        return getAnswer;
    }
	
	
}

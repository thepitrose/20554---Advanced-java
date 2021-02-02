package b2017m923;

//public class Student implements Comparable<Student>{
public class Student {
	private String name;
	private int grade;
	
	public Student(String name,int grade)
	{
		this.name=name;
		this.grade=grade;
	}
	
	public String toString()
	{
		return name + " " + grade;
	}

}

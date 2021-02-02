package a2018m834;


public class ResourceThread extends Thread{
	
	private ResourcePool resourse;
	
	public ResourceThread(ResourcePool resourse)
	{
		this.resourse= resourse;
	}
	
	public void run()
	{
		Resource r = resourse.getResource();
		System.out.println("this id of the received resourse is " + r.getId());
		r.use();
		resourse.returnResource(r);
	}

}

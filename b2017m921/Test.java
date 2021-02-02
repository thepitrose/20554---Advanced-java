package b2017m921;

public class Test {
	 public static void details (Pet p, String name)
	 {
		 System.out.println(p);
		 
		 if(p instanceof MyPet)
		 {
			 ((MyPet) p).setName(name);
		 }
	 }
	
	
	
	public static void main(String[] args) throws Exception
	{
		Pet pet = new Pet(3,"Dog");
		Pet myPet = new MyPet(3,"Dog","Winny");
		System.out.println("pet equals myPet=" +pet.equals(myPet));
		System.out.println("myPet equals pet=" +myPet.equals(pet));
		pet=myPet;
		details(pet,"Pumpkin");
		System.out.println("pet="+pet);
	}
	
}

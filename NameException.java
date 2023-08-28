package Exception;

public class NameException {
	public static void main(String[] args)throws Name{
		String name="";
		
		try {
			if(name == null|| name =="") {
				throw new Name("NameNotFound");
			}
			else {
			System.out.println("My name is "+name);
		}
		}
		catch (Name a){
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		finally {
			System.out.println("rest of the world");
		}
		
	}

}

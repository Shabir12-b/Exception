package Exception;

public class NullpointerExample {
	public static void main(String[] args) {
		String word = null;
		try {
			System.out.println(word.toUpperCase());
		}
		catch (NullPointerException s) {
			System.out.println(s +" name is not given");
			s.printStackTrace();
		}
		finally {
			System.out.println("Exception Handle");
		}
	}

}

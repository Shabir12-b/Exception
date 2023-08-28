package Exception;

public class Numberformatexception {
	public static void main(String[] args) {
		String word ="";
		try {
			int num = Integer.parseInt(word);
			System.out.println(num);
		}
		catch (NumberFormatException g) {
			System.out.println(g+ " Exception handled");
		}
	finally {
		System.out.println("rest");
	
	}

}
}

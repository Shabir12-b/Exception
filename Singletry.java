package Exception;

public class Singletry {
	public static void main(String[] args) {
		System.out.println("welcome");
		String a = null;
		int n =20;
		
		try {
		System.out.println(a.toUpperCase());
		System.out.println(n/0);
		}
		catch (ArithmeticException f) {
			System.out.println("value is not present");
		}
		catch (NullPointerException e) {
	
			System.out.println("there is no value");
			System.out.println(e);
			e.printStackTrace();   //error position
		
		}
		catch(Exception g) {
			System.out.println("no value");
		}
		System.out.println("thankyou");
		
	}

}

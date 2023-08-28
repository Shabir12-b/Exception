package Exception;

public class Class {
	public static void main(String[] args) {
		System.out.println("WELCOME");
		int a =10;
		int b=0;
		try {                 //block
		System.out.println(a/b);
		}
		catch(ArithmeticException e){       //method block
			System.out.println(e+ " dont divide any number by zero");
			e.printStackTrace();
		}
		finally {
		System.out.println(a+b);
		}
		System.out.println("THANKYOU");
	}

}

package Exception;

public class LoginValidation {
	public static void main(String[] args) throws LoginException  {
		String name = "Shabir";
		String password = "Shabir@1234";
		
		try {
			if(name.equals("Shabir")&& password.equals("Shabir@1234")) {
				System.out.println("Login succesfull");
			}
			else {
				throw new LoginException("Login invalid");
			}
		}
		catch (LoginException a) {
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		finally {
			System.out.println("rest of the code");
		}
	}

}

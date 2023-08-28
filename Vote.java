package Exception;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args)throws Exception {
		Scanner f = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String name = f.next();
		System.out.println(name);
		System.out.println("enter your age");
		int age = f.nextInt();
		if(age>18) {
			System.out.println("eligible to vote");
		}
		else {
			throw new votesException("your not eligible");
			
		}
		System.out.println("enter your gender");
		String gender = f.next();
		System.out.println(gender);
		
	}

}

package Exception;

public class Arrayoutodbonsexception {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		try {
			int a = arr[0];
			int b = arr[1];
			int c = arr[2];
			int d = arr[3];
			System.out.println(arr);
		}
		catch (ArrayIndexOutOfBoundsException t) {
			System.out.println(t+" exception handled");
			t.printStackTrace();
		}
		finally {
			System.out.println("rest of code");
		}
		System.out.println("rest");
	}

}

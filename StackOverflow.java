package Exception;

public class StackOverflow {
	
		public void callA() {
			callB();
		}
		public void callB() {
			callA();
		}
		public static void main(String[] args) {
			StackOverflow s = new StackOverflow();
			s.callA();
	}

}

package learningpractice;

public class RecursionExample {
	
	public static void main (String[] args) {
	
		int result = sum(50);
		System.out.println("result : " +result);
	}
	
	public static int sum(int i) {
		
		if (i>0) {
			i = i+ sum(i-1);
			return i;
		} else return 0;

	}

}

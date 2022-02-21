package learningpractice;
public class PrintStarts {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			int p = 0;
			for (int j = 0; j >= p; j++) {
				System.out.print("*");
				p++;
			}
			
		}
	}
}
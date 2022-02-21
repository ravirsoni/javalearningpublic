package learningpractice;

public class EnumExample {

	enum Price {
		LOW, MEDIUM, HIGH, HIGHEST
	}

	public static void main(String[] args) {
		Price myPrice = Price.HIGHEST;

		switch (myPrice) {
		
		case LOW:
			System.out.println("Price is LOW");
			break;
			
		case MEDIUM:
			System.out.println("Price is MEDIUM");
			break;
			
		case HIGH:
			System.out.println("Price is low HIGH");
			break;
			
		case HIGHEST:
			System.out.println("Price is HIGHEST");
			break;
			
		}

	}
}

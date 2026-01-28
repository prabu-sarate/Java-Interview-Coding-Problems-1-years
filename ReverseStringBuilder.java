// Reverse String Using StringBuilder;

public class ReverseString {
  
void reversStringUseBuilder() {
		
		String st = "Ramdev";

		StringBuilder ste = new StringBuilder(st);
		ste.reverse();

		System.out.println(ste.toString());
	}

public static void main(String[] args) {
		ReverseString ster = new ReverseString();
		ster.reversStringUseBuilder();
		

	}

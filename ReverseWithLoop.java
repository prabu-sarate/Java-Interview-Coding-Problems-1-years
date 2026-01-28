public class ReverseString {

	void reverseStr() {

		// Reverse String using for loop;

		String str = "Rajveer";
		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);

	}

public static void main(String[] args) {
		ReverseString ster = new ReverseString();
		ster.reverseStr();
		

	}
}

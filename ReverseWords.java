

public class ReverseString {
// Reverse Words in String;
	void reverseWordInStr() {

		
		String str = "Java is easy";
		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

	public static void main(String[] args) {
		ReverseString ster = new ReverseString();
		ster.reverseWordInStr();
		

	}

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {

		String str = "listen";
		String str2 = "silent";

		char[] a1 = str.toCharArray();
		char[] a2 = str2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		System.out.println(Arrays.equals(a1, a2));
	}

}

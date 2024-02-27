
public class Uppercase_22_02 {

	public static void main(String[] args) {

		String inputString = "Hello, World!";

		if (!inputString.isEmpty()) {
			char firstChar = inputString.charAt(0);

			char modifiedChar = Character.isUpperCase(firstChar) ? Character.toLowerCase(firstChar)
					: Character.toUpperCase(firstChar);

			System.out.println("Original first character: " + firstChar);
			System.out.println("Modified first character: " + modifiedChar);
		} else {
			System.out.println("The input string is empty.");
		}

	}

}

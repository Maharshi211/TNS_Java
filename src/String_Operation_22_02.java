
public class String_Operation_22_02 {

	public static void main(String[] args) {
		String s1 = "maharshi";
		System.out.println(s1);

		String inputString = "hello, World!"; // Replace with your desired string

		// Check if the string is not empty
		if (!s1.isEmpty()) {
			char firstChar = s1.charAt(0); // Get the first character

			// Toggle the case (convert uppercase to lowercase and vice versa)
			char modifiedChar = Character.isUpperCase(firstChar) ? Character.toLowerCase(firstChar)
					: Character.toUpperCase(firstChar);

			System.out.println("Original first character: " + firstChar);
			System.out.println("Modified first character: " + modifiedChar);
		} else {
			System.out.println("The input string is empty.");
		}

	}

}

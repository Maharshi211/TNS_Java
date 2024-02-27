import java.util.Scanner;

public class Switch_case_find_big_threenum_20_02 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter First num: ");
		int num1 = s.nextInt();
		System.out.print("Enter Second num: ");
		int num2 = s.nextInt();
		System.out.print("Enter Third num: ");
		int num3 = s.nextInt();

		int max;

		switch (1) {
		default:
			max = Math.max(num1, Math.max(num2, num3));
			break;
		}

		System.out.println("The maximum number is: " + max);
	}
}

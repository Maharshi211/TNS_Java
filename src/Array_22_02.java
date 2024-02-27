import java.sql.Array;
import java.util.Arrays;

public class Array_22_02 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int count = 0, i = 0, k = 0;
		int[] b = new int[a.length / 2];
		System.out.println("Elements of given array: ");

		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("-".repeat(30));
		System.out.println("total even number is " + count);
		System.out.println("-".repeat(30));
		System.out.println("THis is value of Even num");

		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[k] = a[i];
				System.out.println("b[" + k + "] = " + b[k]);
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}

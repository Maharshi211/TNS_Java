import java.util.Scanner;

public class Positive_Nagative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		int a = 98;
//		int b = 20;
//		int c = 50;

//		if(a > 0) {
//			System.out.println("Number is Positive ");
//		}else {
//			System.out.println("NUmber is Negative");
//		}

		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		int j = 1;
//		do {
//			System.out.println(j);
//			j++;
//		}while(j <= 10);

//		int k = 24;
//		char String = 'l';
//		System.out.println(k);
//		System.out.println(String);
//		byte x = 127;
//		x++;
//		x++;
//			
//		System.out.println(x);

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		System.out.println("Elements of given array: ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("total even number is " + count);

	}

}

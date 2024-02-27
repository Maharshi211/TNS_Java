import java.io.*;
import java.lang.System;

public class Swap_var_19_02 {
	

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		System.out.println("a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);

	}

}

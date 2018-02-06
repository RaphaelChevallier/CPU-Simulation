package P3;

import java.util.Scanner;

public class Terminal {
	public static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("? ");
		return scan.nextInt();
	}
	public static void output(String msg) {
		System.out.print("OUTPUT: " + msg);
	}
	public static void output(int msg) {
		System.out.println("OUTPUT: " + msg);
	}
}

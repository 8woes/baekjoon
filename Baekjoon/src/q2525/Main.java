package q2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int D = B + C;
		if (D >= 60) {
			int d = D / 60;
			D = D - (60 * d);
			A += d;
			if (A >= 24) {
				int a = A / 24;
				A -= (24 * a);	
			}
		}
		System.out.println(A + " " + D);
	}
}
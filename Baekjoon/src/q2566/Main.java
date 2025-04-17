package q2566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = 0;
		int r = 0;
		int h = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] >= max) {
					max = arr[i][j];
					h = i + 1;
					r = j + 1;
				}
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(h + " " + r);
	}
}
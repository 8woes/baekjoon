package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int score;
		String grade = null;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		sc.close();
		
        if (score<=100 && score>=90) {
        	grade = "A";
        }
        else if (score<=89 && score>=80) {
        	grade = "B";
        }
        else if (score<=79 && score>=70) {
        	grade = "C";
        }
        else if (score<=69 && score>=60) {
        	grade = "D";
        }
        else {
        	grade = "F";
        }
        System.out.println(grade);
	}
}
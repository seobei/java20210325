package p99.programmers;

import java.util.Scanner;

public class p12969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자연수를 입력해주세요:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i =0; i<b; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		System.out.println(a + ", " + b);

	}

}

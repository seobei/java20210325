package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		// 최대공약수 : greatest common divisor
		// ex : 12, 18 ==> 6
		// ex :  5, 10 ==> 5
		
		int r=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("입력 받은 두 수는 " + num1 + "과" + num2);
		
		//최대공약수를 출력하는 코드
		//유클리드 호제법
		//while문으로 출력
		while(r>0) {
			r = num1 % num2;
			num1 = num2;	
			num2 = r;
		}
System.out.println("최대공약수는 :" + num1 );
		// for문으로 출력
//		for (int d = num1; d>=1; d--) {
//			if((num1 % d) == 0 && (num2 % d) ==0) {
//				System.out.println("최대공약수는 :" + d);
//				return;
//			}
//		}
		scanner.close();

	}

}

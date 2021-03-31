package p04.textbook;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
//		for(int i =1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//1~10홀수만
		for(int i = 0; i<=10; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		//1~10짝수만
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//10~1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//10~1짝수만
		for(int i=10; i>=1; i--) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//10~1홀수만
		for(int i=10; i>=1; i--) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

}

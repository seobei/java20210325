package p12;

public class A01Thread {
	//Thread : 프로그램(프로세스) 내에서 실행되는 흐름의 단위
	
	//Thread 만드는 법 :
	// 1.Thread 클래스 상속
	// 2.Runnable 인터페이스 구현
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread1 실행");
	}
}

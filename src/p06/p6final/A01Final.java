package p06.p6final;

public class A01Final {
	
	int a;
	final int b;
	
	
	A01Final(){
		this.b = 9;  //초기화되는 코드가 작성되어야한다.
	}
	
public static void main(String[] args) {
	// final 변수(지역변수, 파라미터, 필드)는
	// 값을 한 번만 할당 받을 수 있음
	
	final int i;
	int j;
	j=3;
	j=5;
	
	i=9;
//	i=10; //x
}

	static void method1(final int i) {
		System.out.println(i);
//		i=3; //x
	}
}

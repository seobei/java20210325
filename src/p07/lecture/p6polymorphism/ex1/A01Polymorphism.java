package p07.lecture.p6polymorphism.ex1;

public class A01Polymorphism {
public static void main(String[] args) {
	Cat cat1 = new Cat();
	Tiger tiger1 = new Tiger();
	
	cat1.cry();
	tiger1.cry();
	
	KindaCat k1;
	k1 = cat1;
	
	KindaCat k2;
	k2 = tiger1;
	
	
}
}

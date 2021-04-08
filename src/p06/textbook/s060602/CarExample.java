package p06.textbook.s060602;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		
		
		System.out.println("제작회사: " +myCar.company);
		System.out.println("모델명: " +myCar.model);
		System.out.println("색깔: " +myCar.color);
		System.out.println("최고속도: " +myCar.maxSpeed);
		System.out.println("현재속도: " +myCar.speed);
		
		System.out.println("=====yourCar=====");
		System.out.println("제작회사: " +yourCar.company);
		System.out.println("모델명: " +yourCar.model);
		System.out.println("색깔: " +yourCar.color);
		System.out.println("최고속도: " +yourCar.maxSpeed);
		System.out.println("현재속도: " +yourCar.speed);
		
		System.out.println("===수정 후===");
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println("수정된 속도: " + yourCar.speed);
	}
}
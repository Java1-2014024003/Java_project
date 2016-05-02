package Sample0502;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0;
	public Car(String model, String color, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
		id = ++numbers;
	}
	
	//int Car_Numbers(){ return numbers;}
	//static int Car_Numbers(){ speed + = 10; return numbers;}    //static으로 선언된 메소드는 일반 필드를 사용할 수 없다.error!!일반필드는 반드시 객체를 만들어야 사용 가능.
	static int Car_Numbers(){ return numbers;}

}

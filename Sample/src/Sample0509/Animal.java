package Sample0509;
public class Animal {
	//private double weight;
	protected double weight;                                           //자식클래스에서 사용하고 싶을 때는 protected해야 함.
	//private String picture;
	protected String picture;                                          //자식클래스에서 사용하고 싶을 때는 protected해야 함.
	
	void eat() {      System.out.println("eat()가 호출되었음");    }
	void sleep() {      System.out.println("sleep()가 호출되었음");    }
	
}

package Sample0502;

public class CarTest {
	
	//static Car c1 = new Car("1", "2", 3);               //main밖에서 static으로 객체를 생성하면
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.numbers);
		
		//c1.                                             //main안에서 객체를 생성하지 않아도 사용가능.
		//Car c1 = new Car("Prius", "Light Gray", 200);
		
		System.out.println(Car.numbers);                 //println은 정적메소드.
		
		//c1.Car_Numbers();
		Car.Car_Numbers();                               //다른 곳에서 만들어진 자동차의 만들어진 횟수를 모르지만 알고 싶을 때 Car_Numbers를 static으로 만드어주면 가능.

	}

}

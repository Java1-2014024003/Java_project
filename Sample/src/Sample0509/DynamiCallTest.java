package Sample0509;

/*class AAnimal {
	void sound() {
		System.out.println("AAnimal 클래스의 sound()");
	}
	void eat() {
		System.out.println("ani eat");
	}
}*/

abstract class AAnimal {                              //추상 클래스
	abstract void sound();                            //추상 메소드. 몸체가 없는 메소드. Cat과 Dog를 다형성을 이용하기 위해서 사용.
}

class Dog extends AAnimal {
	private int d = 11;                               //public이용하면 private이용 가능.
	@Override                                         //오버라이딩이라고 알려주는 것. 없으면 오버라이딩이 아니라 자신의 메소드. 혼동하지 않기 위해 사용.
	void sound() {                                   //추상 메소드 재정의.
		System.out.println("멍멍 " + d);
	}
}

class Cat extends AAnimal {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("야옹 " + c);
	}
}

public class DynamiCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AAnimal aanimal = new AAnimal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		AAnimal obj;
		
		//obj = aanimal;
		//obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
		
		//test(aanimal);
		test(dog); test(cat);
	}
	static void test(AAnimal temp) {temp.sound();  }              //다형성. 오버라이딩 때문에 쓸 수 있다.

}

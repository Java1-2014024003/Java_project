package Sample0509;

/*class AAnimal {
	void sound() {
		System.out.println("AAnimal Ŭ������ sound()");
	}
	void eat() {
		System.out.println("ani eat");
	}
}*/

abstract class AAnimal {                              //�߻� Ŭ����
	abstract void sound();                            //�߻� �޼ҵ�. ��ü�� ���� �޼ҵ�. Cat�� Dog�� �������� �̿��ϱ� ���ؼ� ���.
}

class Dog extends AAnimal {
	private int d = 11;                               //public�̿��ϸ� private�̿� ����.
	@Override                                         //�������̵��̶�� �˷��ִ� ��. ������ �������̵��� �ƴ϶� �ڽ��� �޼ҵ�. ȥ������ �ʱ� ���� ���.
	void sound() {                                   //�߻� �޼ҵ� ������.
		System.out.println("�۸� " + d);
	}
}

class Cat extends AAnimal {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("�߿� " + c);
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
	static void test(AAnimal temp) {temp.sound();  }              //������. �������̵� ������ �� �� �ִ�.

}

package Sample0502;

public class CarTest {
	
	//static Car c1 = new Car("1", "2", 3);               //main�ۿ��� static���� ��ü�� �����ϸ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.numbers);
		
		//c1.                                             //main�ȿ��� ��ü�� �������� �ʾƵ� ��밡��.
		//Car c1 = new Car("Prius", "Light Gray", 200);
		
		System.out.println(Car.numbers);                 //println�� �����޼ҵ�.
		
		//c1.Car_Numbers();
		Car.Car_Numbers();                               //�ٸ� ������ ������� �ڵ����� ������� Ƚ���� ������ �˰� ���� �� Car_Numbers�� static���� ������ָ� ����.

	}

}

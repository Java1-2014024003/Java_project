package Sample0509;

public class OuterClass {                                             //�ܺ�Ŭ����
	private int value = 10;
	
	class InnerClass {                                                //����Ŭ����
		public void myMethod() {
			System.out.println("�ܺ� Ŭ������ private ���� ��: " + value);
		}
	}
	
	OuterClass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
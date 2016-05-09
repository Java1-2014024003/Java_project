package Sample0509;

public class OuterClass {                                             //외부클래스
	private int value = 10;
	
	class InnerClass {                                                //내부클래스
		public void myMethod() {
			System.out.println("외부 클래스의 private 변수 값: " + value);
		}
	}
	
	OuterClass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
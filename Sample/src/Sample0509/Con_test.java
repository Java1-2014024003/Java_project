package Sample0509;

class Par {
	Par() {
		System.out.println("Par con");
	}
	Par(int x) {
		System.out.println("Par con" + x);
	}
}

class child extends Par {
	/*child() {
	                                                  //묵시적 호출. 자동호출이라고도 함. 인자가 아무것도 없는 생성자 호출.
		System.out.println("child con");
	}*/
	int xxxxx;
	public child(int y) {
		//super();                                    //명시적 호출. 안 써주어도 되지만 써주는 게 좋다. 안 써주면 자동 호출.
		super(y);                                     //명시적 호출은 주로 부모생성자 중 특정 생성자를 호출하고 싶을 때 사용.
		this.xxxxx = 999;
		System.out.println("child con");
	}
	public child() {                                  //생성자 오버로딩 했을 때 생성자 호출을 하면 인자가 없는 생성자는 소멸되기 때문에 만들어 주어야 한다!!
		System.out.println("child con nothing");
	}
}

public class Con_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child(5);                      //부모클래스의 생성자 먼저 호출되고 자식클래스의 생성자 호출.
		child c2 = new child();

	}

}

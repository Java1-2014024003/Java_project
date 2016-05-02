package Sample0502;

public class First {
	private int w, l, h, v;
	
	public First(int w, int l, int h) {
		super();
		this.w = w;
		this.l = l;
		this.h = h;
		this.v = w*l*h;
	}
	
	First method1(First obj1, First obj2, int x){
		System.out.println(obj1.h + " "+obj2.h+" "+x);
		obj1.setH(99);
		obj2.setH(99999);
		x = 123456;
		
		return obj1;
	}
	void method2(First obj1){                                     //temp를 새로 만들어서 obj1의 값을 넣어줌. temp와 obj1에 들어있는 값은 같지만 독립적인 객체.
		First temp = new First(7, 8, 9);                          //새로운 object 만드는 방식.
		temp.h = obj1.h;
		temp.l = obj1.l;
		temp.w = obj1.w;
		temp.v = obj1.v;
		
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	

}

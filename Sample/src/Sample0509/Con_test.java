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
	                                                  //������ ȣ��. �ڵ�ȣ���̶�� ��. ���ڰ� �ƹ��͵� ���� ������ ȣ��.
		System.out.println("child con");
	}*/
	int xxxxx;
	public child(int y) {
		//super();                                    //����� ȣ��. �� ���־ ������ ���ִ� �� ����. �� ���ָ� �ڵ� ȣ��.
		super(y);                                     //����� ȣ���� �ַ� �θ������ �� Ư�� �����ڸ� ȣ���ϰ� ���� �� ���.
		this.xxxxx = 999;
		System.out.println("child con");
	}
	public child() {                                  //������ �����ε� ���� �� ������ ȣ���� �ϸ� ���ڰ� ���� �����ڴ� �Ҹ�Ǳ� ������ ����� �־�� �Ѵ�!!
		System.out.println("child con nothing");
	}
}

public class Con_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child(5);                      //�θ�Ŭ������ ������ ���� ȣ��ǰ� �ڽ�Ŭ������ ������ ȣ��.
		child c2 = new child();

	}

}

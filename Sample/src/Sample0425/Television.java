package Sample0425;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨음 " + volume + "입니다.");
	}

}

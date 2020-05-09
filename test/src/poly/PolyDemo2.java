package poly;

interface I2 {
	public String A();
}

interface I3 {
	public String B();
}

class D implements I2 I3 {
	public String A() {
		return "A";
	}
}

public class PolyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
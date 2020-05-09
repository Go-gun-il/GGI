package poly;

interface I{}

class C implements I{}

public class PolyDemo {

	public static void main(String[] args) {
		I obj = new C();
	}

}

//		this.left = left;
//		this.right = right;
//	}
//	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractionableCalculator3 extends Calculator3 {
	public SubstractionableCalculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo3 {

	public static void main(String[] args) {
		/*
		 * ������ �����غ���!
		 * 1. �θ�Ŭ������ �����ڰ� �ִµ� �ڽ�Ŭ������ �����ڰ� ���� ���
		 * 2. �θ�Ŭ������ �������� ���� �ڽ�Ŭ������ �����ڰ� �ִ� ���
		 * 3. �θ�Ŭ����, �ڽ�Ŭ���� ������ �����ڰ� �ִ� ��� 
		 * 
		 * ������ �߻��Ѵٸ� -> ���� �ذ��� 
		 * ����� ����ȴٸ�, �� ������ �������� 
		 * */
	}
}
 
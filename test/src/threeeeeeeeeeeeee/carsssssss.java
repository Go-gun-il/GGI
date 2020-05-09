package threeeeeeeeeeeeee;

public class carsssssss {

	public class Car{
		static String name;
		static int number;
		public Car() {}
		public Car(String name, int number){
			this.name = name;
			this.number = number;
		}
	}
	
	class Bus extends Car {
		static int fee;
		public Bus(String name, int number,int fee){
			super(name, number);
			this.fee = fee;
		}
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus("¹ö½º", 5438, 1050);
		System.out.println(Bus.name);
		System.out.println(Bus.number);
		System.out.println(Bus.fee);
	}


	

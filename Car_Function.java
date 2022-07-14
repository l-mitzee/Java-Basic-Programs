package Basic_Java;

public interface Car_Function {

	public void engine();
	public void accelerator();
	
}
class Car implements Car_Function{
	public void engine() {
		System.out.println("Engine is working fine");
	}
	public void accelerator() {
		System.out.println("Accelerator is very high in this car");
	}
	
}
class Function{
	public static void main(String[] args) {
		Car obj = new Car();
		obj.engine();
		obj.accelerator();
	}
}


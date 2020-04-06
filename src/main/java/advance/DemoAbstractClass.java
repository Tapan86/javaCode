package advance;

public class DemoAbstractClass extends Calc{

	public static void main(String[] args) {
		DemoAbstractClass c1 = new DemoAbstractClass();
		c1.nameOfCalc("My Calc");
		c1.typeOfCalc("Advanced");

	}

	@Override
	void typeOfCalc(String calType) {
		System.out.println("Type of Calc is: "+calType);
		
	}

}

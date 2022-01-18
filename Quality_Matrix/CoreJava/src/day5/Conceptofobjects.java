package day5;



import day4.CalculatorApplication;
import repeat.Methods;

public class Conceptofobjects {
public Conceptofobjects() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methods m = new Methods();
m.printmethod();
m.printmethods("Hello");
CalculatorApplication ca = new CalculatorApplication();
ca.add(0, 0);
CalculatorApplication.sub(0, 0);;

ca.avg(0);

	}

}

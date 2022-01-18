package day7;

public class Arithmeticexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 200;
if(i > 300) {
	System.out.println("The value of i is greater than 300");
}else {
	throw new ArithmeticException("Custom excption message");
}
	}

}

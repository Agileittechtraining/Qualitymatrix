package day4;

public class UserdefinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    print(); //method call
    int value = printwithinput("hello");
    System.out.println("The value returned is "+value);
	}
    public static void print() { //method definition
    System.out.println("Printing from userdefinedmethod");	
    //body of the method
    }
    public static int printwithinput(String input) { //method with args/parameters
    	System.out.println(input);
    	return 123;
    	
    }
}

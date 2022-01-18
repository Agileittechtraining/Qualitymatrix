package day8;

public class Methods {
	public Methods(String input) {
		System.out.println(input);
	}
int gv = 10;   //non static global variable
static int sgv; //static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Methods m = new Methods("Hi"); // default constructor
boolean i = m.execute(false);
print(1.23f);
login(i);
m.gv =100;
sgv = 500;  

	}
    public static void login(boolean input) {   //method def
    	if(input == true) {
	System.out.println("Login Successful");
    	}else {//body of the method
    System.out.println("Login failed");
    	}
    	}
   public void add(int a , int b) { //methods with args
	   print(1.369f);
	   int c = a+b;
	   System.out.println(c);
   }
   public static String print(float input) {
	   System.out.println(input);
	   return "Hello";
   }
   public boolean execute(boolean input) {
	   add(1,6);
	   return input;
   }
}

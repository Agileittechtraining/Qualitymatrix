package day4;

public class CalculatorApplication {
	public static int p;  //static global variable
	public int q; //non static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c = add(3,2);
sub(3,3);
mul(2, 5);
div(1,1);
avg(c);
p =200;
q =500;
	}
public static int add(int a,int b) {
	int c = a+b;
	System.out.println("The sum of numbers is "+c);
	return c;
}
public static void sub(int a , int b) {
	int c = a-b;
	System.out.println("The sub of numbers is "+c);
}
public static void mul(int a , int b) {
	int c = a*b;
	System.out.println("The mul of numbers is "+c);
}
public static void div(int a , int b) {
	int c = a/b;
	System.out.println("The div of numbers is "+c);
}
public  void avg(int a) {
	p =300;
	q= 700;
	int c = a/2;
	System.out.println("The avg of numbers is "+c);
}
}

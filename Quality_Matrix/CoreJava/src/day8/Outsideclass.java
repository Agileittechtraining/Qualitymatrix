package day8;

public class Outsideclass {
public int sv = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outsideclass x  = new Outsideclass();
Outsideclass y  = new Outsideclass();
Outsideclass z  = new Outsideclass();
x.sv = 300;
y.sv = 500;
z.sv = 600;
x=y;
y=z;
z=x;
System.out.println(x.sv);
System.out.println(y.sv);
System.out.println(z.sv);
	}

}

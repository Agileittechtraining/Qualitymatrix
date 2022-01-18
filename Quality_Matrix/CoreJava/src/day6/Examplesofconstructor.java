package day6;

import java.io.File;

public class Examplesofconstructor {
private Examplesofconstructor(String name, int id){
	System.out.println(name);
	System.out.println(id);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Examplesofconstructor e11 =  new Examplesofconstructor("ABC",4);
Examplesofconstructor e12 =  new Examplesofconstructor("ABC",4);
	}

}

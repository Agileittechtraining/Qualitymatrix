package day3;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
int [] i = new int[2] ; 
i[0] = 24;
i[1] = 30;
i[2] = 50;

System.out.println("The size of array is" +i.length);
for(int j=i.length-1;j>=0;j--) {
System.out.println(i[j]);
}
}catch(Exception e) {
    System.out.println("There is an exception");
	}

	}	

}
// Write a character array of size 4 and print the array in reverse order
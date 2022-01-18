package day3;

public class Twodimesionalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] i = new int[2][2];
i[0][0] = 23;
i[0][1] = 24;
i[1][0] = 28;
i[1][1] = 30;
System.out.println("The row size is"+i.length);
System.out.println("The col length" +i[1].length);

for(int x=0;x<i.length;x++) { //row
	for(int y=0;y<i[x].length;y++) { //col
System.out.println(i[x][y]);

	}
	}
}
}

//define an array of size 2X3 of type float and print all the values using for loop
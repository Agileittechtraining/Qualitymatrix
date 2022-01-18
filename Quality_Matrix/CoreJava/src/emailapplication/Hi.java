package emailapplication;

public class Hi  {

	
		int i;
		int j;

		public static void main(String[] args) {

		Hi t1 = new Hi();
		Hi t2 = new Hi();

		t1.j=t2.i=5;
		t1.i=t2.j=6;

		System.out.print(t1.j++ + " " + t2.i--);

		}
		}


	

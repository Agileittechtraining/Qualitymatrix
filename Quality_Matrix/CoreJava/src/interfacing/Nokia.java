package interfacing;



public class Nokia implements Android {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
whatsapp("Input");
whatsapp(null, 0);
	}

	
	@Override
	public void message() {
		// TODO Auto-generated method stub
	System.out.println("Message implementation from Nokia");	
	}

	@Override
	public void apps() {
		// TODO Auto-generated method stub
	System.out.println("Apps implementation from Nokia");	
	}



	@Override
	public void call() {
		// TODO Auto-generated method stub
	System.out.println("Call implementation from Nokia");	
	
	}
	public static void whatsapp(String newname,int i) {
		System.out.println("Whatsapp implementation from Nokia");
	}
	public static void whatsapp(String name) {
	}
	}
}
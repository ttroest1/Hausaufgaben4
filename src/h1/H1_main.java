package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zone = 5;
		double price = 10;
			
		price = 2;
		switch(zone) {
			case 1:	
				break;
			case 2: 	price+=0.35;
				break;
			case 3:	price+=0.85;
				break;
			case 4:	price+=0.85;
				break;
			case 5:	price+=1.55;
				break;
			default: price=4;
		}
		System.out.println(price+"€ bitte!");
	}
}
package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsiusFloat = 14.2f;
		float fahrenheitFloat = 14.2f;
		double celsiusDouble = 14.2;
		double fahrenheitDouble = 14.2;
		
		fahrenheitFloat=32+celsiusFloat*9/5;
		fahrenheitDouble=32+celsiusDouble*9/5;
		
		System.out.println("mit double berechnet: "+fahrenheitDouble);
		System.out.println("mit float berechnet: "+fahrenheitFloat);


	}

}

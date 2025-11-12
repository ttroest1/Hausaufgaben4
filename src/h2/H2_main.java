package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean x = true;
			boolean y = true;
			boolean a = true;
			boolean b = true;
			boolean c = true;
			int input = 10;
			
			if(input==10||input==11) {
				x=true;
			}else {
				x=false;
			}
			if(input==1||input==11) {
				y=true;
			}else {
				y=false;
			}
			if(x&&y) {
				a=true;
			}else {
				a=false;
			}
			if(x||x!=y) {
				b=true;
			}else {
				b=false;
			}
			if(y) {
				c=false;
			}else {
				c=true;
			}
			System.out.println("x: "+x);
			System.out.println("y: "+y);
			System.out.println("a: "+a);
			System.out.println("b: "+b);
			System.out.println("c: "+c);

	}

}

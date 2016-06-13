package Bridge;

public class redCircle implements drawAPI {
	
	@Override
	public void drawCircle(int rad,int x,int y) {
		System.out.println("Now we dra a red cirle with radious="+rad+" x "+x+" y "+y);		
	}

}

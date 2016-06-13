package Bridge;
/***
 * 
 * @author Sahaban Arshad
 *
 */
public class circle extends shape

{
	private int x, y, radius;
/***
 * 
 * @param radius
 * @param x
 * @param y
 * @param drawAPI
 */
	   public circle(int radius, int x, int y, drawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }

}

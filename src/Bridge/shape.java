package Bridge;
/**
 * 
 * @author Sahaban Arshad
 *
 */
public abstract class shape{
	
		   protected drawAPI drawAPI;
		   
		   protected shape(drawAPI drawAPI){
		      this.drawAPI = drawAPI;
		   }
		   public abstract void draw();	
		}

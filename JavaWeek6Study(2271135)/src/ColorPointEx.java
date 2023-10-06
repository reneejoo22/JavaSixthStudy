//5-1 
import java.awt.Point;

class point{
	private int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint(){
		System.out.println("(" + x + "," +y+ ")");
		//System.out.println("(" + getX() + "," + getY()+ ")");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class ColorPoint extends point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p = new point();
		p.set(1,2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}

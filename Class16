package Java08;

public class Class16 {

	public static void main(String[] args) {
		CSphere cir = new CSphere();
	}

}
class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	void setLocation() {
		x = 3;
		y = 4;
		z = 5;
	}
	void setRadius() {
		radius = 1;
	}
	double surfaceArea() {
		this.setRadius();
		return Math.round((4.0*Math.PI*Math.pow(radius, 3))*100.0)/100.0;
	}
	double volume() {
		this.setRadius();
		return Math.round(4.0/3.0*Math.PI*Math.pow(radius, 3)*100.0)/100.0;
	}
	void showCenter() {
		this.setLocation();
		System.out.println("("+this.x+","+this.y+","+this.z+")");
	}
}

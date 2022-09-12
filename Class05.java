package Java08;

public class Class05 {
	public static void main(String[] args) {
		Cbox box = new Cbox();
			box.length = 1;
			box.width = 1;
			box.height = 1;
			}
}
class Cbox{
	int length;
	int width;
	int height;
	int volume(){
		return length*width*height;
	}
	int surfaceArea() {
		return length*width*2+width*height*2+length*height*2;
	}
	void showData() {
		System.out.println("length "+ length +"," + "width " + width + "," + "height " + height);
	}
	void showAll() {
		System.out.println("length "+ length +"," + "width " + width + "," + "height " + height + "," + "surfaceArea " + (length*width*2+width*height*2+length*height*2) + "," + "volume "+ length*height*width);
	}
}

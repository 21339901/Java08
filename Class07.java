package Java08;

public class Class07 {
	public static void main(String[] args) {
		
		CTest evenOrOdd = new CTest();
			evenOrOdd.x = 3;
			evenOrOdd.test();
			evenOrOdd.x = 8;
			evenOrOdd.test();
			evenOrOdd.x = 0;
			evenOrOdd.test();
			}
}
class CTest{
	int x;
	void test() {
		if (x == 0) 
			System.out.println("此數為0");
		else if (x % 2 == 0) 
			System.out.println("此數為偶數");
		else if (x % 2 == 1) 
			System.out.println("此數為奇數");
	}
}

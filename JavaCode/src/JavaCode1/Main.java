package JavaCode1;

public class Main {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		box1.height = 1;
		box1.width = 3;
		box1.depth = 2;
		int volume1 = box1.height * box1.width * box1.depth;
		System.out.println(volume1);
		
		
		Box box2 = new Box();
		box2.height = 1;
		box2.width = 23;
		box2.depth = 2;
		int volume2 = box2.height * box2.width * box2.depth;
		System.out.println(volume2);
		
		Box box3 = new Box();
		box3.height = 1;
		box3.width = 3;
		box3.depth = 23;
		int volume3 = box3.height * box3.width * box3.depth;
		System.out.println(volume3);
	}
}

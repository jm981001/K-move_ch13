package sec2;

public class BoxTest2 {


	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();
		box1.set("홍길동");
		String name = box1.get();

		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
	}
}


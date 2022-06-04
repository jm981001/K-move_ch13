package sec4;

public class BoxingMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box2<String> box2 = Util.<String>boxing("홍길동");
		String StringValue = box2.get();
	}

}

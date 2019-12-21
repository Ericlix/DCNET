package jp.dcnet.lss.chapter06;

public class Test1 {

	public static float gA(float t) {
		float y = 9.8F * t * t / 2;
		return y;
	}

	public static void main(String[] args) {
		float t = 1.0F;
		System.out.println(gA(t));

		// float y = gA(t);
		// System.out.println(y);
	}

}

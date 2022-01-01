package singletonDesignPattern;

public class SingletonDesignPattern {

	private static SingletonDesignPattern sdp = null;

	private SingletonDesignPattern() {}

	public static SingletonDesignPattern getSingletonDP() {

		if (sdp == null) {
			sdp = new SingletonDesignPattern();
		}
		return sdp;
	}
}

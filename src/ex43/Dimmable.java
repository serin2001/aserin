package ex43;

public interface Dimmable {
	int MAX_BRIGHTNESS = 100;
	void setBrightness(int level);
	default void dimToHalf() {}
	int getBrightness();
}

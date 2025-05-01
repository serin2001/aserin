package ex43;

public class Lamp implements Switchable, Dimmable {

	public boolean on;
	public int brightness;

	@Override
	public void turnOn() {
		this.on = true;
	}

	@Override
	public void turnOff() {
		this.on = false;
	}

	@Override
	public boolean isOn() {
		return this.on;
	}

	@Override
	public void setBrightness(int level) {
		if (this.on && level >= 0 && level <= MAX_BRIGHTNESS) {
			this.brightness = level;
		}
	}

	@Override
	public int getBrightness() {
		if (this.on)
			return this.brightness;
		else
			return 0;
	}

	public void dimToHalf() {
		this.setBrightness(MAX_BRIGHTNESS / 2);
	}
}

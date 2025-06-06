package ex61;

import java.util.Arrays;

public class DotProductThread extends Thread {

	private int[] v1, v2;
	private int dot;

	public DotProductThread(int[] v1, int[] v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	@Override
	public void run() {
		int temp = 0;
		if (v1.length != v2.length)
			throw new IllegalArgumentException("Arrays haben nicht die gleiche Laenge!");
		for (int i = 0; i < v1.length; i++) {
			temp += v1[i] * v2[i];
		}
		this.dot = temp;
	}
	
	public int getDot() {
		return this.dot;
	}
}

package org.junit.jupiter.my_maven_project;

public class Bruch {
	private int zaehler;
	private int nenner;

	// icomplete
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		if (nenner == 0) throw new IllegalArgumentException("Nenner darf nicht 0 sein!");
	}

	// wrong
	public void kehrwert() {
		int n = this.nenner;
		this.setNenner(this.zaehler);
		this.setZaehler(n);
	}

	// wrong
	public void multiplikation(Bruch a) {
		this.setNenner(this.nenner * a.getNenner());
		this.setZaehler(this.zaehler * a.getZaehler());
	}

	// wrong
	public void addition(Bruch a) {
		if (a.getNenner() != this.getNenner()) {
			int neuerZaehler;
			int neuerNenner = this.getNenner() * a.getNenner();
			this.setZaehler(this.getZaehler() * a.getNenner());
			neuerZaehler = a.getZaehler() * this.getNenner();
			this.setZaehler(this.getZaehler() + neuerZaehler);
			this.setNenner(neuerNenner);
		} else {
			this.setZaehler(this.getZaehler() + a.getZaehler());
		}
	}

	// wrong
	public void kuerzen() {
		int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
		this.zaehler /= ggt;
		this.nenner /= ggt;
	}

	// helper method Euklidian algorithm,
	// here are no mistakes
	private int ggt(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	@Override
	public String toString() {
		return this.getZaehler() + "/" + this.getNenner();
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}

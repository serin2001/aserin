package org.junit.jupiter.my_maven_project;

import my_maven_project.src.test.java.junit.Fraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFraction {
    @Test
    public void constructor() {
        try {
            Fraction b = new Fraction(1, 0); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage()); // Handle the exception
        }
        assertThrows(IllegalArgumentException.class, () -> new Fraction(1, 0), "Es kann nicht durch 0 geteilt werden!");
    }
    
    @Test
    public void additionGleicherNenner() {
    	Fraction a = new Fraction(1,2);
    	Fraction b = new Fraction(2,2);
    	a.addition(b);
    	assertEquals(3, a.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(2, a.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void additionVerschidenerNenner() {
    	Fraction a = new Fraction(1,2);
    	Fraction b = new Fraction(1,3);
    	a.addition(b);
    	// 1/2 + 1/3 = 3/6 + 2/6 = 5/6
    	assertEquals(5, a.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(6, a.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void kehrwertTest() {
    	Fraction b = new Fraction(5,6);
    	b.kehrwert();
    	assertEquals(6, b.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(5, b.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void multiplikationTest() {
    	Fraction a = new Fraction(2, 5);
    	Fraction b = new Fraction(2, 3);
    	b.multiplikation(a);
    	assertEquals(4, b.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(15, b.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void kuerzenTest() {
    	Fraction b = new Fraction(2,4);
    	b.kuerzen();
    	assertEquals(1, b.getZaehler(), "Falsch gekuerzt !");
    	assertEquals(2, b.getNenner(), "Falsch gekuerzt ");
    }
}

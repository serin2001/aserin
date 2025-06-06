package junit;

import ex63.Bruch;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBruch {
    @Test
    public void constructor() {
        try {
            Bruch bruch = new Bruch(1, 0); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage()); // Handle the exception
        }
        assertThrows(IllegalArgumentException.class, () -> new Bruch(1, 0), "Es kann nicht durch 0 geteilt werden!");
    }
    
    @Test
    public void additionGleicherNenner() {
    	Bruch a = new Bruch(1,2);
    	Bruch b = new Bruch(2,2);
    	a.addition(b);
    	assertEquals(3, a.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(2, a.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void additionVerschidenerNenner() {
    	Bruch a = new Bruch(1,2);
    	Bruch b = new Bruch(1,3);
    	a.addition(b);
    	// 1/2 + 1/3 = 3/6 + 2/6 = 5/6
    	assertEquals(5, a.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(6, a.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void kehrwertTest() {
    	Bruch b = new Bruch(5,6);
    	b.kehrwert();
    	assertEquals(6, b.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(5, b.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void multiplikationTest() {
    	Bruch a = new Bruch(2, 5);
    	Bruch b = new Bruch(2, 3);
    	b.multiplikation(a);
    	assertEquals(4, b.getZaehler(), "Zaehler nicht richtig berechnet!");
    	assertEquals(15, b.getNenner(), "Nenner nicht richtig berechnet!");
    }
    
    @Test
    public void kuerzenTest() {
    	Bruch b = new Bruch(2,4);
    	b.kuerzen();
    	assertEquals(1, b.getZaehler(), "Falsch gekuerzt !");
    	assertEquals(2, b.getNenner(), "Falsch gekuerzt ");
    }
}

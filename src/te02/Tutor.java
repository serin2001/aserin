package te02;

public class Tutor extends Student {
    private double gehalt = 15.11;

    @Override
    public void printInfo() {
        System.out.println("Tutor ");
    }

    public double getGehalt() {
        return this.gehalt;
    }
}

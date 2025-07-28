package p21;

class Person {
    public String getInfo() { 
        return "Generic person"; 
    }
}

class Lecturer extends Person {
    public String getInfo() { 
        return "Lecturer"; 
    }
}

public class Demo {
    public static void main(String[] args) {
        Person p = new Lecturer();
        System.out.println(p.getInfo());
    }
}


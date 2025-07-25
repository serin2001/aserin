package te05;

public class WrapperEquality {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer x = 1000;
        Integer y = 1000;
        
        System.out.println(a == b); // (A) true: For Integer values between -128 and 127, Java caches the objects. Since both a and b are assigned the value 100, they refer to the same cached object.
        System.out.println(x == y); // (B) false: 1000 is outside the cached range, so x and y are two different Integer objects. The == operator returns false.
        System.out.println(a.equals(b)); // (C) true: equals() checks for value equality. Since both a and b have the same value, it returns true
        System.out.println(x.equals(y)); // (D) true: equals() checks for value equality. Since both a and b have the same value, it returns true
    }
}


package singleton;

public class MainClass {
    public static void main(String[] args) {
    // Instantiating Singleton class with variable x
    Singleton x = Singleton.getInstance();

    // Instantiating Singleton class with variable y
    Singleton y = Singleton.getInstance();

    // Instantiating Singleton class with variable z
    Singleton z = Singleton.getInstance();

    // Now changing the value of the Singleton instance using x
    x.setNumber(x.getNumber() + y.getNumber());

    // Print and display the updated values
    System.out.println("Double from x is " + x.getNumber());
    System.out.println("Double from y is " + y.getNumber());
    System.out.println("Double from z is " + z.getNumber());
    System.out.println("-----------------------");

    // Now again changing the value using z
    z.setNumber(z.getNumber() + y.getNumber());

    // Print and display the updated values
    System.out.println("Double from x is " + x.getNumber());
    System.out.println("Double from y is " + y.getNumber());
    System.out.println("Double from z is " + z.getNumber());

    // All three variables x, y, z refer to the same Singleton instance.
    // Therefore, a change made using one variable is reflected in all others.
    }
}


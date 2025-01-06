package singleton;

public class Singleton {

    private static Singleton instance;

    // Declaring a variable of type double
    private double number;

    // Private constructor for this class
    private Singleton() {
        this.number = 42; // Initial value
    }

    // Static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Getter for number
    public double getNumber() {
        return number;
    }

    // Setter for number
    public void setNumber(double number) {
        this.number = number;
    }
}


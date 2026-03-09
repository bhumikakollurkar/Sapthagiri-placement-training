
package m5;

public class M5 {
    public static void main(String[] args) {
        public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Unchecked: ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This always runs.");
        }
    }
}
    }
    
}

class InvalidAgeException extends Exception { 
    InvalidAgeException(String msg) { super(msg); } 
}

public class AgeCheck {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Not eligible!");
        else System.out.println("Welcome!");
    }
}

class MyThread extends Thread {
    public void run() { System.out.println("Thread Class Running"); }
}

class MyRunnable implements Runnable {
    public void run() { System.out.println("Runnable Interface Running"); }
}

Thread t1 = new Thread(() -> System.out.println("Running..."));
System.out.println(t1.getState()); 
t1.start();
System.out.println(t1.getState());
